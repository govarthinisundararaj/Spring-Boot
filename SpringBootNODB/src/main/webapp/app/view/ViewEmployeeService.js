
mainApp.service('ViewEmployeeService', ['$http', '$q' , function($http,$q){
		
	var data = [];
	
	this.setData = function (content) {
		data=content;		
	}	
	
	this.getData = function () {
		return data;		
	}	
	
	this.fetchAllEmployees = function () {
        var deferred = $q.defer();
        $http.get('allEmployees').then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResp){
                console.error('Error while fetching Employees');
                deferred.reject(errResp);
            }
        );
        return deferred.promise;
    }
     
    this.deleteEmployee = function (emp){
    	var deferred = $q.defer();
        $http.delete('deleteEmployee/'+emp.empId).then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResp){
                console.error('Error while deleting Employee');
                deferred.reject(errResp);
            }
        );
        return deferred.promise;
    }
           
}]);