var mainApp = angular.module('mainApp',['ngRoute']);

mainApp.config(['$routeProvider', function($routeProvider){
	$routeProvider.
		when('/addEmployee', {
			templateUrl : 'app/add/addEmployee.jsp',
			controller : 'AddEmployeeController',
			controllerAs : 'ctrl'
		}).
		when('/viewEmployee', {
			templateUrl : 'app/view/viewEmployee.jsp',
			controller : 'ViewEmployeeController',
			controllerAs : 'view'
		}).
		when('/modifyEmployee', {
			templateUrl : 'app/modify/modifyEmployee.jsp',
			controller : 'ModifyEmployeeController',
			controllerAs : 'modify'
		});
}]);

