package ro.utcluj.model;

public class Product {
    private String name = "";
    private int quantity = 0;
    private String category = "";
    private double price = 0;

    public Product(){

    }

    public Product(String name, int quantity, String category, double price){
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }

    // setters:
    public void setName(String name){
        this.name = name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(double price){
        this.price = price;
    }

    // getters:

    public String getName(){
        return this.name;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getCategory(){
        return this.category;
    }
    public double getPrice(){
        return this.price;
    }
}
