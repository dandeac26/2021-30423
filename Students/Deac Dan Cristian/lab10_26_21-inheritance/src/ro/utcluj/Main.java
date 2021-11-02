package ro.utcluj;

import ro.utcluj.model.*;

public class Main {
    /**
     * Create a hierarchy of products with some classes having
     * two levels of inheritance.
     *
     * - create some products of different types and add
     *   them to the same array
     * - create a method which returns the products of a
     *   specific type from the list of all products
     * - implement some overriden & overloaded methods
     * - try out equals on different classes
     * - draw the UML diagram for your classes
     */

    public static void getVideoGameNames(Product[] prodArr, int size){
        for(int i = 1; i<= size; i++) {
            if(prodArr[i] instanceof VideoGame && !(prodArr[i] instanceof Movie))
                System.out.println(prodArr[i].getName());
        }
    }

    public static void main(String[] args) {
	// write your code here
        Product[] productArray = new Product[100];

        laptop l1 = new laptop();
        l1.setDisplaySize(16.5);
        l1.setGraphicsCard("Nvidia GTX 1050ti");
        l1.setProcessor("intel i5 7th gen");
        l1.setBrand("Asus");
        l1.setName("Asus ROG GL552V");
        l1.setPrice(3500.0);
        l1.setYearOfManufacturing(2016);
        l1.setDescription("Gaming laptop");


        laptop l2 = new laptop();
        l2.setDisplaySize(13.3);
        l2.setGraphicsCard("macbookgraphics");
        l2.setProcessor("macbookprocessor");
        l2.setBrand("Apple");
        l2.setName("MacBook");
        l2.setPrice(4000.0);
        l2.setYearOfManufacturing(2015);
        l2.setDescription("Macbook Pro");

        VideoGame vg1 = new VideoGame();
        vg1.setGenre("RPG open world");
        vg1.setRating(10.00);
        vg1.setName("The Witcher 3 Wild Hunt");
        vg1.setPrice(20.0);
        vg1.setDescription("The Witcher 3: Wild Hunt is an action role-playing game with a third-person perspective." +
                " Players control Geralt of Rivia, a monster slayer known as a Witcher.");

        VideoGame vg2 = new VideoGame();
        vg2.setGenre("First person Shooter");
        vg2.setRating(8.5);
        vg2.setPrice(0.0);
        vg2.setName("Counter-Strike Global Offensive");
        vg2.setDescription("Counter-Strike: Global Offensive (CS:GO) is a multiplayer first-person shooter developed by Valve");

        Movie m1 = new Movie();
        m1.setName("Halloween");
        m1.setRating(6.0);
        m1.setGenre("Slasher");
        m1.setDescription("Halloween's plot follows a post-traumatic Laurie Strode who prepares to face Michael Myers in a final showdown on Halloween night");

        productArray[1] = l1;
        productArray[2] = l2;
        productArray[3] = vg1;
        productArray[4] = vg2;
        productArray[5] = m1;

        int arrSize = 5;
        /*
        for(int i = 1; i<= arrSize; i++){
            System.out.println(productArray[i].getName());
        }
        */
        System.out.println(l1.getName() + "'s warranty ends in "+ l1.getWarrantyExp());

        System.out.println("\nVideo games from product list:");
        getVideoGameNames(productArray, arrSize);
    }


}
