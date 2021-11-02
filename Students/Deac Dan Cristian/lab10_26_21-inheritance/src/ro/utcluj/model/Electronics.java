package ro.utcluj.model;

public class Electronics extends Product{
    private String brand;
    private int yearOfManufacturing;

    public Electronics(){

    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }
    public int getWarrantyExp(){
        return this.yearOfManufacturing + 5;
    }
    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
