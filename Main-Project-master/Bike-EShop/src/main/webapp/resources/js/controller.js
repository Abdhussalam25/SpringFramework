var app=angular.module("app",[])
app.controller("ProductController",function($scope,$http){
	$scope.addToCart=function(id){// the id which is specified here is the productid as I changed this in CartItemController here also im changing
		$http.put('http://localhost:8080/Bike-EShop/addCartItem/'+id).success(function(){
			alert("Product successfully added to the cart")
		})
	}
	
	$scope.getCart=function(cartId){
		$scope.cartId=cartId;
		console.log("Cart id is "+cartId)
		$http.get('http://localhost:8080/Bike-EShop/cart/getCart/'+cartId).success(function(data){
			$scope.cart=data
					
		})
		
		$scope.removeFromCart=function(cartItemId){
			console.log('CartItem to be removed is ' +cartItemId);
			$http.put('http://localhost:8080/Bike-EShop/cart/removeCartItem/' +cartItemId).success(function(){
				$scope.getCart($scope.cartId)
				})
				
		}
		
		$scope.clearCart=function(){
			
			$http.put('http://localhost:8080/Bike-EShop/cart/removeAllCartItems/'+$scope.cartId).success(function(){
				$scope.getCart($scope.cartId)
			})
		}
		
		$scope.calculateGrandTotal=function(){
			var grandTotal=0.0;
			for(var i=0;i<$scope.cart.cartItems.length;i++){
				grandTotal=grandTotal+$scope.cart.cartItems[i].totalPrice;
				
			}
			return grandTotal;
			
		}
		
	
	}

})