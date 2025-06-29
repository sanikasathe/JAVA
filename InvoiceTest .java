
package com.dkte;

import java.util.Scanner;

class Invoice {
    // fields
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // parameterized ctor
    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    // getter fun & setter function
    // get part number
    public String getPartNumber() {
        return partNumber;
    }

    // set part number
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    // get part description
    public String getPartDescription() {
        return partDescription;
    }

    // set part description
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    // get quantity
    public int getQuantity() {
        return quantity;
    }

    // set quantity
    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    // get price per item
    public double getPricePerItem() {
        return pricePerItem;
    }

    // set price per item
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    // calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // display invoice
    void displayInvoice() {
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + pricePerItem);
        System.out.println("Invoice Amount: " + getInvoiceAmount());
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter part number: ");
        String partNumber = sc.nextLine();
        System.out.print("Enter part description: ");
        String partDescription = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price per item: ");
        double pricePerItem = sc.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        
        System.out.println("\nOriginal Invoice:");
        invoice.displayInvoice();

         
      //try to set invalid values
		
      		invoice.setQuantity(-12);
      		invoice.setPricePerItem(-10);
      		System.out.println("\n\nAfter invalid values:");
      		
      		invoice.displayInvoice();
    }
}
