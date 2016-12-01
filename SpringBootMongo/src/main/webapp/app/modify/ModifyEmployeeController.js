mainApp.controller('ModifyEmployeeController',[ '$scope','ModifyEmployeeService','ViewEmployeeService', function($scope, service, viewService){
	var ctrl = this;
	ctrl.employee = {empId:null,name:'',designation:'',salary:0.0};
	
	fetchModifyData();			
			
		function fetchModifyData(){
			var data = viewService.getData();
			ctrl.employee.empId = data.empId;
			ctrl.employee.name = data.name;
			ctrl.employee.designation = data.designation;
			ctrl.employee.salary = data.salary;
		}
		
		ctrl.updateDetails = function() {
			service.updateEmployee(ctrl.employee,ctrl.employee.empId).then(
			function(data){
				console.log('updating Employee successfully');
			},
            function(errResponse){
                console.error('Error while updating Employee');
            });
        	ctrl.employee={empId:null,name:'',designation:'',salary:0.0};
            $scope.employeeForm.$setPristine();
        }
}]);