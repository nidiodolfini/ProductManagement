/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 *
 * @author nidio
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductManager pm = new ProductManager(Locale.getDefault());
        
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport();
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        pm.printProductReport();
        p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Nice tea");
        p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Nice drink");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice cup of tea");
        pm.printProductReport();
//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
////        Product p4 = new Product();
//        //Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FOUR_STAR);
//        Product p7 = pm.createProduct(105, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(0));
//        System.out.println(p6.equals(p7));
////        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStars());
////        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStars());
////        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRating().getStars());
////        p3 = ((Food)p3).applyRating(Rating.THREE_STAR);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        //System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
    }

}
