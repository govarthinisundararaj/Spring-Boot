
<div>
<h2>Employee Details</h2>
<table id="empDetails">
			<thead>
				<tr>
					<th> Emp ID </th>
					<th> Name </th>
					<th> Designation </th>
					<th> Salary </th>
					<th> </th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="emp in view.employees | orderBy:emp.empId">
					<td>{{emp.empId}}</td>
					<td>{{emp.name}}</td>
					<td>{{emp.designation}}</td>
					<td>{{emp.salary}}</td>
					<td><button  ng-click="view.removeDetails(emp)">Remove</button>&nbsp;&nbsp;<button  ng-click="view.edit(emp.empId,emp)"><a href="#modifyEmployee">Modify</a></button></td>
				</tr>
			</tbody>
		</table>

</div>