package it.unipd.mtss;
import it.unipd.mtss.*;
import it.unipd.mtss.model.Cart;
import it.unipd.mtss.model.EItem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldGetTheCorrectAmount(){
        EItem mother=new EItem("Motherboard", "ASusanna Potente X45T", 125.30);
        EItem mouse=new EItem("Mouse", "Mouse Lidl", 29.99);
        EItem key=new EItem("Keyboard", "Hello Kitty Keyboard", 43.29);
        Cart cart=new Cart();
        cart.addElement(mother);
        cart.addElement(mouse);
        cart.addElement(key);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        assertEquals(209.18,total,0);
    }
}
