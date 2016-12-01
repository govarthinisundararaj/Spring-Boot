mainApp.controller('AddEmployeeController',[ '$scope','AddEmployeeService', function($scope, service){
	var ctrl = this;
	ctrl.employee = {empId:null,name:'',designation:'',salary:0.0};
	
		ctrl.submitDetails = function() {
			service.createEmployee(ctrl.employee).then(
				function(data){
					console.log('creating Employee successfully');
				},
                function(errResponse){
                    console.error('Error while creating Employee');
                });
                ctrl.resetDetails();
            }
			
			ctrl.resetDetails=function(){
                ctrl.employee={empId:null,name:'',designation:'',salary:0.0};
                $scope.employeeForm.$setPristine(); //reset Form 
                $scope.employeeForm.$setUntouched();
            }
									
}]);


