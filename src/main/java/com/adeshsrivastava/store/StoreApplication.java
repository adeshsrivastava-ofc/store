package com.adeshsrivastava.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        System.out.println("Store Application Started");

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "john@example.com", "password123", "John Doe"));
        userService.registerUser(new User(2L, "jane@example.com", "password456", "Jane Smith"));
        userService.registerUser(new User(2L, "jane@example.com", "password456", "Jane Smith"));

//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder(100);

//        context.close();

/*
        Wrong way of injecting dependencies. This is a manual way. It creates POJO [Plain Old Java Object]. It won't inject @Values.
        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder(1000);
        orderService.setPaymentService(new StripePaymentService());
        orderService.placeOrder(1000);
*/

//        var stripe = context.getBean(StripePaymentService.class);
//        orderService.setPaymentService(stripe);
//        orderService.placeOrder(30);
//
//        var paypal = context.getBean(PayPalPaymentService.class);
//        orderService.setPaymentService(paypal);
//        orderService.placeOrder(50);

//        var manager = context.getBean(NotificationManager.class);
//        manager.sendNotification("This is a test notification");
//        manager.sendNotification("Order placed successfully");

//        var heavyResource = context.getBean(HeavyResource.class);
//        var heavyResource2 = context.getBean(HeavyResource.class);



    }

}
