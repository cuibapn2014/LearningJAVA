package com.tuan1.lab1;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book() {
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Name: " + this.name + ", Price:" + this.price
                + ", Stock: " + this.qtyInStock;
    }
}
