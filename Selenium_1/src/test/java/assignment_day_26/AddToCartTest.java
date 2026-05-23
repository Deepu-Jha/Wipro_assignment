package assignment_day_26;

import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass {

    @Test
    public void cartTest() throws Exception {

        setup();

        CartPage cp = new CartPage(driver);

 
        cp.searchProduct("iPhone");
        Thread.sleep(2000);
        cp.addProduct(0);

        cp.searchProduct("MacBook");
        Thread.sleep(2000);
        cp.addProduct(0);

    
        cp.searchProduct("Samsung");
        Thread.sleep(2000);
        cp.addProduct(0);


       
        Thread.sleep(3000);

        cp.clickCart();

        Thread.sleep(3000);

        cp.clickCheckout();

        Thread.sleep(5000);

     
        cp.guestCheckout();

        Thread.sleep(5000);

        cp.billingDetails();

        System.out.println("Products Added And Payment Details Filled");

        Thread.sleep(5000);

        closeBrowser();
    }
}