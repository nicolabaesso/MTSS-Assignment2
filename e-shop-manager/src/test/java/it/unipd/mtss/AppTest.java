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
        assertEquals(169.00,total,0);
    }
    @Test
    public void leastExpensiveProcessorShouldBeHalf(){
        EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc2=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc3=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc4=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc5=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc6=new EItem("Processor", "Intel Potato but better", 80.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        cart.addElement(proc5);
        cart.addElement(proc6);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
      
        assertEquals(1092.00,total,0);
    }

    @Test
    public void leastExpensiveMouseShouldBeFree(){
        EItem proc = new EItem("Mouse", "Gigino il topolino", 22.00);
        EItem proc2=new EItem("Mouse", "Mouse Lidl Deluxe", 38.00);
        EItem proc3=new EItem("Mouse", "Mouse Lavico", 120.00);
        EItem proc4=new EItem("Mouse", "Mouse verde vecchio", 15.00);
        EItem proc5=new EItem("Mouse", "Mouse standard", 12.00);
        EItem proc6= new EItem("Mouse", "Mini Mouse", 5.00);
        EItem proc7=new EItem("Mouse", "Mini Mouse Apple", 50.00);
        EItem proc8=new EItem("Mouse", "Mouse Apple", 150.00);
        EItem proc9=new EItem("Mouse", "Mouse leggermente usurato", 7.00);
        EItem proc10=new EItem("Mouse", "Mouse Apple distrutto", 55.00);
        EItem proc11 = new EItem("Mouse", "Mouse Asusanna", 12.00);
        EItem proc12=new EItem("Mouse", "Mouse rosa", 10.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        cart.addElement(proc5);
        cart.addElement(proc6);
        cart.addElement(proc7);
        cart.addElement(proc8);
        cart.addElement(proc9);
        cart.addElement(proc10);
        cart.addElement(proc11);
        cart.addElement(proc12);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        assertEquals(491.00,total,0);
    }

    @Test
    public void sameNumberOfKeyboardAndMouse(){
        EItem proc = new EItem("Keyboard", "Fnatic ministreak", 100.00);
        EItem proc2=new EItem("Mouse", "Asus strix", 25.00);
        EItem proc3=new EItem("Keyboard", "Roccat ax1", 69.00);
        EItem proc4=new EItem("Mouse", "Msi Optoix", 55.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
      
        assertEquals(224.00,total,0);
    }

    @Test
    public void shouldGetADiscountIfAmountTooHigh(){
        EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc2=new EItem("Motherboard", "MSI X453G", 300.00);
        EItem proc3=new EItem("Mouse", "Mouse Gaming Apple", 200.00);
        EItem proc4=new EItem("Keyboard", "Tastiera Apple Luccicosa", 500.00);
        EItem proc5=new EItem("Processor", "Intel i9-9900k", 75.00);
        EItem proc6= new EItem("Motherboard", "ASUS TUF 2565D", 300.00);
        EItem proc7=new EItem("Mouse", "Mouse Lidl", 38.00);
        EItem proc8=new EItem("Processor", "Intel Xeon 1231-v3", 50.00);
        EItem proc9=new EItem("Motherboard", "ASusanna non distrutta", 75.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        cart.addElement(proc5);
        cart.addElement(proc6);
        cart.addElement(proc7);
        cart.addElement(proc8);
        cart.addElement(proc9);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        assertEquals(1564.20,total,0);
    }

    @Test
    public void tooMuchItemsOnCart(){
        EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc2=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc3=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc4=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc5=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc6= new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc7=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc8=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc9=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc10=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc11 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc12=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc13=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc14=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc15=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc16 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc17=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc18=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc19=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc20=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc21 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc22=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc23=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc24=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc25=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc26 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc27=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc28=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc29=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc30=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc31= new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc32=new EItem("Processor", "Intel i5 1035G1", 300.00);
        
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        cart.addElement(proc5);
        cart.addElement(proc6);
        cart.addElement(proc7);
        cart.addElement(proc8);
        cart.addElement(proc9);
        cart.addElement(proc10);
        cart.addElement(proc11);
        cart.addElement(proc12);
        cart.addElement(proc13);
        cart.addElement(proc14);
        cart.addElement(proc15);
        cart.addElement(proc16);
        cart.addElement(proc17);
        cart.addElement(proc18);
        cart.addElement(proc19);
        cart.addElement(proc20);
        cart.addElement(proc21);
        cart.addElement(proc22);
        cart.addElement(proc23);
        cart.addElement(proc24);
        cart.addElement(proc25);
        cart.addElement(proc26);
        cart.addElement(proc27);
        cart.addElement(proc28);
        cart.addElement(proc29);
        cart.addElement(proc30);
        cart.addElement(proc31);
        cart.addElement(proc32);
        
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        int numberOfElements = cart.getNumberOfElements(cart.getCart());
        assertEquals(32,numberOfElements,0);
    }

    @Test
    public void shouldIncreaseTheAmountIfTooLow(){
        EItem proc= new EItem("Mouse", "Mouse nucleare", 5.00);
        EItem proc2= new EItem("Tastiera", "Tastiera putrida", 4.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        assertEquals(11,total,0);
    }
}
