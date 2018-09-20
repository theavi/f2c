myApp.controller('UserController', [ '$scope', 'UserService',
		function($scope, UserService) {
			$scope.anableCustomerDirective = false;

			$scope.showdiv = function() {
				$scope.anableCustomerDirective = true;
				console.log("yes");
			};
		} ]);

myApp.directive('myCustomer', function() {
	var obj = {};
	obj.restrict = 'EA';
	obj.templateUrl = 'login.html';
	return obj;
});
