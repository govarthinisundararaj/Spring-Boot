<div>
	<form name = "employeeForm">
         <fieldset>
			<legend>Employee Form</legend>
			<div>
                  <label>Enter Id: </label>
                  <input name = "empId"  type = "text" ng-model = "ctrl.employee.empId" required>
                  <span ng-show="employeeForm.empId.$touched && employeeForm.empId.$invalid">The employee Id is required.</span>
             </div>
			<div>
               	<label>Enter name:</label>
                  <input name = "name" type = "text" ng-model = "ctrl.employee.name" required>
                  <span ng-show="employeeForm.name.$touched && employeeForm.name.$invalid">The employee name is required.</span>                     
            </div>
			<div>			 
                  <label>Enter Designation: </label>
                  <input name = "designation"  type = "text" ng-model = "ctrl.employee.designation" required>                     
                  <span ng-show="employeeForm.designation.$touched && employeeForm.designation.$invalid">The employee Designation is required.</span>
			</div>
			<div>
                  <label>Enter Salary: </label>
                  <input name = "salary"  type = "text" ng-model = "ctrl.employee.salary">
             </div>
			<div class = "buttons">
                     <input type=button value="Add New" ng-click="ctrl.submitDetails()" 
                     ng-disabled="employeeForm.$pristine || employeeForm.$invalid  ">
                     <input type="reset" ng-click="ctrl.resetDetails()" value = "Reset Details">
			</div>
            </fieldset>
         </form>

</div>
