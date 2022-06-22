package model;

import java.util.ArrayList;
import java.util.Date;

public class invoice {
    private int invoiceNumber;
    private Date date;
    private String customer;

    private ArrayList<line> linesArray = new ArrayList<>();

    public invoice() {

    }

    public invoice(int invoiceNumber, Date date, String customer) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.customer = customer;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<line> getLinesArray() {
        return linesArray;
    }

    public void setLinesArray(ArrayList<line> linesArray) {
        this.linesArray = linesArray;
    }

    public double clcInvoiceTotal(){
        double total = 0.0;
        for (line line : linesArray){
            total += line.clcTotal();
        }
        return total;
    }
}
