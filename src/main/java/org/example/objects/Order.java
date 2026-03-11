package org.example.objects;

import java.time.LocalDate;

public class Order {

    private long orderId;
    private LocalDate orderDate ;
    private String[] products ;
    private String customerName;
    private double price;

    public Order(long orderId, LocalDate orderDate, String[] products, String customerName, double price) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.products = products;
        this.customerName = customerName;
        this.price = price;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

