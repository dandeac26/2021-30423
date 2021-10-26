package ro.utcluj.model;

import java.util.Locale;

public class ShopService {
    private Category[] categoryList = new Category[100];
    private Product[] productList = new Product[100];
    private int cIndex = 0;
    private int pIndex = 0;

    public ShopService(){

    }
    public void showProductsFrom(String cName){
        for(int i = 1; i <= pIndex; i++){
            if(productList[i].getCategory().equals(cName)){
                System.out.println(productList[i].getName());
            }
        }
    }

    public void searchProduct(String pName){
        String prodName = "";

        for(int i = 1; i <= pIndex; i++){
            prodName = productList[i].getName();

            if(prodName.toLowerCase().contains(pName.toLowerCase())){
                System.out.println("\nFound " + prodName + ":");
                System.out.println("      Category: " + productList[i].getCategory());
                System.out.println("      Price: " + productList[i].getPrice());
                System.out.println("      quantity(currently in stock): " + productList[i].getQuantity());
            }
        }
    }
    public void addCategory(Category cat){
        categoryList[++cIndex] = cat;
    }
    public void addProduct(Product prod){
        productList[++pIndex] = prod;
    }
}
