
mainApp.service('AddEmployeeService', ['$http', '$q' , function($http,$q){
			 
    this.createEmployee = function (employee) {
        var deferred = $q.defer();
        $http.post('addEmployee', employee)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResp){
                console.error('Error while creating Employee');
                deferred.reject(errResp);
            }
        );
        return deferred.promise;
    }
	           
}]);



