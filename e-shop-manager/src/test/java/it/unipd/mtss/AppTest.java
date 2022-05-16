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
        EItem mother=new EItem("Motherboard", "ASusanna Potente X45T", 126.00);
        EItem mouse=new EItem("Mouse", "Mouse Lidl", 30.00);
        EItem key=new EItem("Keyboard", "Hello Kitty Keyboard", 43.00);
        Cart cart=new Cart();
        cart.addElement(mother);
        cart.addElement(mouse);
        cart.addElement(key);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        assertEquals(199.00,total,0);
    }
    @Test
    public void leastExpensiveProcessorShouldBeHalf(){
        EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc2=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc3=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc4=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc5=new EItem("Processor", "Intel i5-750", 75.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        cart.addElement(proc5);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
      
        assertEquals(1137.50,total,0);
    }
}
