package model;

public class line {
    private int invoiceNo;
    private String item;
    private double price;
    private int count;

    public line() {
    }

    public line(int invoiceNo, String item, double price, int count) {
        this.invoiceNo = invoiceNo;
        this.item = item;
        this.price = price;
        this.count = count;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double clcTotal(){
        return price * count;
    }
}
