

mainApp.controller('ViewEmployeeController',[ '$scope','ViewEmployeeService', function($scope, service){
	var view = this;
	view.employees = [];
	
	fetchAllEmployees();
	
	 function fetchAllEmployees(){
		 service.fetchAllEmployees().then(
         function(data) {
        	 view.employees = data;
         },
         function(errResp){
             console.error('Error while fetching Employees');
         }
     );
    }
	 
	 view.edit = function(id,emp){
		 service.setData(emp);
	 }
	 
	 view.removeDetails = function(emp) {
		 service.deleteEmployee(emp).then(
			function(data){
				view.employees = data;
				console.log('delete Employee successfully');
			},
         function(errResponse){
             console.error('Error while deleting Employee');
         });
         
     }
}]);


