package com.techlabs.Shoping;
import java.util.Date;
import java.util.List;
public class Order {
	private int id;
    private Date date;
    private List<LineItem> items;

    public Order(int id, Date date, List<LineItem> items) {
        this.id = id;
        this.date = date;
        this.items = items;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<LineItem> getItems() {
        return items;
    }
    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    // Calculate the total order price
    public double calculateOrderPrice() {
        double total = 0;
        for (LineItem item : items) {
            total += item.calculateLineItemCost();
        }
        return total;
    }

}
