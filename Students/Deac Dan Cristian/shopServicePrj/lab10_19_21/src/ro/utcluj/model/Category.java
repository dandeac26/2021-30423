package ro.utcluj.model;

public class Category {
    private String name = "";
    // maybe list products in category

    public Category(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
