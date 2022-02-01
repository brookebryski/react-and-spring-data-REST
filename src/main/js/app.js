
// Variables
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

var root = '/api';

// App
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {employees: []};
	}

	loadFromServer(pageSize) {
    	follow(client, root, [
    		{rel: 'employees', params: {size: pageSize}}]
    	).then(employeeCollection => {
    		return client({
    			method: 'GET',
    			path: employeeCollection.entity._links.profile.href,
    			headers: {'Accept': 'application/schema+json'}
    		}).then(schema => {
    			this.schema = schema.entity;
    			return employeeCollection;
    		});
    	}).done(employeeCollection => {
    		this.setState({
    			employees: employeeCollection.entity._embedded.employees,
    			attributes: Object.keys(this.schema.properties),
    			pageSize: pageSize,
    			links: employeeCollection.entity._links});
    	});
    }

	componentDidMount() {
    	this.loadFromServer(this.state.pageSize);
        }
	}

	render() {
		return (
			<EmployeeList employees={this.state.employees}/>
		)
	}
}

// Employee List
class EmployeeList extends React.Component{
	render() {
		const employees = this.props.employees.map(employee =>
			<Employee key={employee._links.self.href} employee={employee}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Description</th>
					</tr>
					{employees}
				</tbody>
			</table>
		)
	}
}

// Employee
class Employee extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.employee.firstName}</td>
				<td>{this.props.employee.lastName}</td>
				<td>{this.props.employee.description}</td>
			</tr>
		)
	}
}

// Render
ReactDOM.render(
	<App />,
	document.getElementById('react')
)