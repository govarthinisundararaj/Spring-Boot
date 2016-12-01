
mainApp.service('ModifyEmployeeService', ['$http', '$q' , function($http,$q){
		
	var data = [];
	
	this.setData = function (content) {
		data=content;		
	}	
	
	this.getData = function () {
		return data;		
	}	
	
	
    this.updateEmployee = function (emp, id){
    	var deferred = $q.defer();
        $http.put('modifyEmployee/'+id, emp).then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResp){
                console.error('Error while editing Employee');
                deferred.reject(errResp);
            }
        );
        return deferred.promise;
    }
    
    
}]);