<div>
	<form name = "employeeForm">
         <fieldset>
			<legend>Employee Update Form</legend>
			<div>
                  <label>Enter Id: </label>
                  <input class="input3" name = "id"  type = "text" ng-model = "modify.employee.empId" ng-readonly = "true" >
             </div>
			<div>
               	<label>Enter Name:</label>
                  <input class="input1" name = "name" type = "text" ng-model = "modify.employee.name" >                     
            </div>
			<div>			 
                  <label>Enter Designation: </label>
                  <input class="input2" name = "age"  type = "text" ng-model = "modify.employee.designation" >                     
			</div>
			<div>
                  <label>Enter Salary: </label>
                  <input class="input3" name = "id"  type = "text" ng-model = "modify.employee.salary" >
             </div>
			<div class = "buttons">
                     <input type=button value="Update" ng-click="modify.updateDetails()">
                    
                 </div>
			</fieldset>
         </form>

</div>