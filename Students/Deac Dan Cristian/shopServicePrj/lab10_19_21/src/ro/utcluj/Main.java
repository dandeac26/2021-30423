package ro.utcluj;

import ro.utcluj.model.Product;
import ro.utcluj.model.Category;
import ro.utcluj.model.ShopService;

/**
* Shop having categories and products
 *
 * Category:
 *      -name
 *  product:
 *      -name
 *      -quantity
 *      -category
 *      -price
 *  shopService:
 *      // hold 2 arrays for categs & products
 *      // display all the products from a specific category
 *      // search a product by name
 *
 *   IN THE END DRAW THE UML DIAGRAM
 * (this is not mandatory)
 *  categoryService: (static)
 *  // hold all available categories
 *  // add/remove methods ...
 *
*
 */

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product("Glass table for dining area, 2m length, 1 m wi", 2, "Furniture", 500);

        Category c1 = new Category();
        c1.setName("Electronics");


        p1.setName("Asus ROG PC i5 gen 7, 1050 ti 2GB, 16 GB memory, 500gb ssd");
        p1.setCategory("Electronics");
        p1.setPrice(1700.00);
        p1.setQuantity(10);

        p2.setName("Samsung Smart TV ultra wide");
        p2.setCategory("Electronics");
        p2.setPrice(2500.00);
        p2.setQuantity(6);

        p3.setName("Alienware pc i7 skylake, 2060 super 4gb, 1 tb hdd, 500gb ssd, 16 gb memory");
        p3.setCategory("Electronics");
        p3.setPrice(3500.00);
        p3.setQuantity(5);


        //System.out.println(p1.getCategory());

        ShopService shopSV = new ShopService();

        shopSV.addProduct(p1);
        shopSV.addProduct(p2);
        shopSV.addProduct(p3);
        shopSV.addProduct(p4);

        shopSV.addCategory(c1);

        shopSV.searchProduct("pc");

        System.out.println("\nProducts from electronics: ");
        shopSV.showProductsFrom("Electronics");


    }
}
