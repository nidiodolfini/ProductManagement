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

    public static void main(String[] args) {

        ProductManager pm = new ProductManager(Locale.getDefault());
        
        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pm.printProductReport(101);
        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea");
//        pm.printProductReport(p1);
        pm.reviewProduct(101, Rating.THREE_STAR, "Nice tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "Nice drink");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice cup of tea");
        pm.printProductReport(101);
        
        
        pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), Rating.NOT_RATED);
//        pm.printProductReport(p2);
        pm.reviewProduct(102, Rating.FOUR_STAR, "Nice hot cup of coffee");
//        pm.printProductReport(p2);
        pm.reviewProduct(102, Rating.THREE_STAR, "Nice coffee");
        pm.reviewProduct(102, Rating.TWO_STAR, "Nice drink");
        pm.reviewProduct(102, Rating.FOUR_STAR, "Nice cup of coffee");
        pm.printProductReport(102);
        System.out.println(pm.findProduct(101));

    }

}
