package com.o;

public class Invoice implements BookPersistance {
    private Book book;
    private int quantity;
    private int totalCost;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        this.totalCost = book.price * quantity;
    }

    public void printInvoice() {
        System.out.println("Book: " + book.name);
        System.out.println("Year: " + book.year);
        System.out.println("Price per book: " + book.price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    @Override
    public void save(Invoice invoice) {
        System.out.println("Invoice saved for book: " + invoice.book.name);
    }

    public static void main(String[] args) {
        Book book = new Book("HarryPotter", 1997, 350);
        Invoice invoice = new Invoice(book, 3);
        invoice.printInvoice();
        invoice.save(invoice);
    }
}