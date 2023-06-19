package com.techlabs.Shoping;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "Product 1", 10.0, 2.0);
        Product product2 = new Product(2, "Product 2", 20.0, 5.0);
        Product product3 = new Product(3, "Product 3", 15.0, 3.0);
        // Create line items
        LineItem item1 = new LineItem(1, 2, product1);
        LineItem item2 = new LineItem(2, 3, product2);
        LineItem item3 = new LineItem(3, 1, product3);
     // Create order
        List<LineItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Order order = new Order(1, new Date(), items);
        // Create customer
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        Customer customer = new Customer(1, "Rakesh Verma", orders);
        double orderPrice = order.calculateOrderPrice();
        //System.out.println("Order Price: $" + orderPrice);

        // Calculate line item costs
        double item1Cost = item1.calculateLineItemCost();
        double item2Cost = item2.calculateLineItemCost();
        double item3Cost = item3.calculateLineItemCost();

        System.out.println("Line Item 1 Cost: $" + item1Cost);
        System.out.println("Line Item 2 Cost: $" + item2Cost);
        System.out.println("Line Item 3 Cost: $" + item3Cost);
        
     // Calculate discounted prices
        double product1DiscountedPrice = product1.calculateDiscountedPrice();
        double product2DiscountedPrice = product2.calculateDiscountedPrice();
        double product3DiscountedPrice = product3.calculateDiscountedPrice();

        System.out.println("Product 1 Discounted Price: $" + product1DiscountedPrice);
        System.out.println("Product 2 Discounted Price: $" + product2DiscountedPrice);
        System.out.println("Product 3 Discounted Price: $" + product3DiscountedPrice);
        // Create shopping cart
        ShoppingCart cart = new ShoppingCart(1, "Shopping Cart 1", 3, 10.0, 30.0);

        // Display shopping cart details
        System.out.println("Shopping Cart ID: " + cart.getId());
        System.out.println("Shopping Cart Name: " + cart.getName());
        System.out.println("Quantity: " + cart.getQuantity());
        System.out.println("Unit Price: $" + cart.getUnitPrice());
        System.out.println("Total Price: $" + cart.getTotalPrice());


	}

}
