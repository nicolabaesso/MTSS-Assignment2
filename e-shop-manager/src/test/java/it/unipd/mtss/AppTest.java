package it.unipd.mtss;
import it.unipd.mtss.model.Cart;
import it.unipd.mtss.model.EItem;
import it.unipd.mtss.model.OrderCounter;
import it.unipd.mtss.model.User;
import java.lang.Math;
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
    public void leastExpensiveProcessorShouldBeHalf2(){
    EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 0.00);
    EItem proc2=new EItem("Processor", "Intel i5 1035G1", 0.00);
    EItem proc3=new EItem("Processor", "Amd FX-8350", 0.00);
    EItem proc4=new EItem("Processor", "Intel i9-9900k", 0.00);
    EItem proc5=new EItem("Processor", "Intel i5-750", 0.00);
    EItem proc6=new EItem("Processor", "Intel Potato but better", 0.00);
    Cart cart=new Cart();
    cart.addElement(proc);
    cart.addElement(proc2);
    cart.addElement(proc3);
    cart.addElement(proc4);
    cart.addElement(proc5);
    cart.addElement(proc6);
    double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
  
    assertEquals(2.00,total,0);
}

@Test
    public void leastExpensiveProcessorShouldBeHalf3(){
    EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 10.00);
    EItem proc2=new EItem("Processor", "Intel i5 1035G1", 10.00);
    EItem proc3=new EItem("Processor", "Amd FX-8350", 10.00);
    EItem proc4=new EItem("Processor", "Intel i9-9900k", 10.00);
    EItem proc5=new EItem("Processor", "Intel i5-750", 10.00);
    EItem proc6=new EItem("Processor", "Intel Potato but better", 10.00);
    Cart cart=new Cart();
    cart.addElement(proc);
    cart.addElement(proc2);
    cart.addElement(proc3);
    cart.addElement(proc4);
    cart.addElement(proc5);
    cart.addElement(proc6);
    double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
  
    assertEquals(55.00,total,0);
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
    public void sameNumberOfKeyboardAndMouse2(){
        EItem proc = new EItem("Keyboard", "Fnatic ministreak", 100.00);
        EItem proc2=new EItem("Mouse", "Asus strix", 25.00);
        EItem proc3=new EItem("Keyboard", "Roccat ax1", 69.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
      
        assertEquals(194.00,total,0);
    }
    @Test
    public void sameNumberOfKeyboardAndMouse3(){
        EItem proc = new EItem("Keyboard", "Fnatic ministreak", 0.00);
        EItem proc2=new EItem("Mouse", "Asus strix", 0.00);
        EItem proc3=new EItem("Keyboard", "Roccat ax1", 0.00);
        EItem proc4=new EItem("Mouse", "Msi Optoix", 0.00);
        Cart cart=new Cart();
        cart.addElement(proc);
        cart.addElement(proc2);
        cart.addElement(proc3);
        cart.addElement(proc4);
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
      
        assertEquals(2.00,total,0);
    }

    @Test
    public void sameNumberOfKeyboardAndMouse4(){
        EItem proc = new EItem("Keyboard", "Fnatic ministreak", 10.00);
        EItem proc2 = new EItem("Keyboard", "Fnatic ministreak", 20.00);
        EItem proc3 = new EItem("Keyboard", "Fnatic ministreak", 30.00);
        EItem proc4 = new EItem("Keyboard", "Fnatic ministreak", 40.00);
        EItem proc5 = new EItem("Keyboard", "Fnatic ministreak", 50.00);
        EItem proc6 = new EItem("Keyboard", "Fnatic ministreak", 60.00);
        EItem proc7= new EItem("Keyboard", "Fnatic ministreak", 70.00);
        EItem proc8=new EItem("Mouse", "Asus strix", 80.00);
        EItem proc9=new EItem("Keyboard", "Roccat ax1", 90.00);
        EItem proc10=new EItem("Mouse", "Msi Optoix", 100.00);
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
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
      
        assertEquals(550.00,total,0);
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
    public void tooMuchItemsOnCart2(){
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

        
        double total=cart.getOrderPrice(cart.getCart(), cart.getUser());
        int numberOfElements = cart.getNumberOfElements(cart.getCart());
        assertEquals(30,numberOfElements,0);
        assertEquals(6307.50,total,0);
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

    @Test
    public void shouldget10FreeRandomOrdersIfMinorenne(){
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
        EItem proc12 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc13=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc14=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc15=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc16=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc17= new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc18=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc19=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc20=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc21=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc22 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        User u = new User("A","Alberto", "Bigioggero", 10);
        User u2 = new User("B","Giovanni", "Paolo", 8);
        User u3 = new User("C","Paolino", "Filè", 12);
        User u4 = new User("D","Gilberto", "Marchiori", 10);
        User u5 = new User("E","Nicola", "Miotti", 14);
        User u6 = new User("F","Alberto", "Fontolon", 16);
        User u7 = new User("G","Sara", "Filaretti", 17);
        User u8 = new User("H","Marta", "Greggio", 9);
        User u9 = new User("I","Maria", "Pia", 10);
        User u10 = new User("J","Franco", "Stefanini", 12);
        User u11 = new User("K","Matteo", "Marangon", 15);
        User u12 = new User("A","Alberto", "Bigioggero", 10);
        User u13 = new User("B","Giovanni", "Paolo", 8);
        User u14 = new User("C","Paolino", "Filè", 12);
        User u15 = new User("D","Gilberto", "Marchiori", 10);
        User u16 = new User("E","Nicola", "Miotti", 14);
        User u17 = new User("F","Alberto", "Fontolon", 16);
        User u18 = new User("G","Sara", "Filaretti", 17);
        User u19 = new User("H","Marta", "Greggio", 9);
        User u20 = new User("I","Maria", "Pia", 10);
        User u21 = new User("J","Franco", "Stefanini", 12);
        User u22 = new User("K","Matteo", "Marangon", 15);
        Cart cart=new Cart();
        Cart cart2=new Cart();
        Cart cart3=new Cart();
        Cart cart4=new Cart();
        Cart cart5=new Cart();
        Cart cart6=new Cart();
        Cart cart7=new Cart();
        Cart cart8=new Cart();
        Cart cart9=new Cart();
        Cart cart10=new Cart();
        Cart cart11=new Cart();
        Cart cart12=new Cart();
        Cart cart13=new Cart();
        Cart cart14=new Cart();
        Cart cart15=new Cart();
        Cart cart16=new Cart();
        Cart cart17=new Cart();
        Cart cart18=new Cart();
        Cart cart19=new Cart();
        Cart cart20=new Cart();
        Cart cart21=new Cart();
        Cart cart22=new Cart();
        cart.addElement(proc);
        cart2.addElement(proc2);
        cart3.addElement(proc3);
        cart4.addElement(proc4);
        cart5.addElement(proc5);
        cart6.addElement(proc6);
        cart7.addElement(proc7);
        cart8.addElement(proc8);
        cart9.addElement(proc9);
        cart10.addElement(proc10);
        cart11.addElement(proc11);
        cart12.addElement(proc12);
        cart13.addElement(proc13);
        cart14.addElement(proc14);
        cart15.addElement(proc15);
        cart16.addElement(proc16);
        cart17.addElement(proc17);
        cart18.addElement(proc18);
        cart19.addElement(proc19);
        cart20.addElement(proc20);
        cart21.addElement(proc21);
        cart22.addElement(proc22);

        int time1 = 1859;
        int time2 = 1833;
        int time3 = 1843;

        cart.setTimeOrder(time1);
        cart3.setTimeOrder(time2);
        cart7.setTimeOrder(time3);
    
        cart.setUser(u);
        cart2.setUser(u2);
        cart3.setUser(u3);
        cart4.setUser(u4);
        cart5.setUser(u5);
        cart6.setUser(u6);
        cart7.setUser(u7);
        cart8.setUser(u8);
        cart9.setUser(u9);
        cart10.setUser(u10);
        cart11.setUser(u11);
        cart12.setUser(u12);
        cart13.setUser(u13);
        cart14.setUser(u14);
        cart15.setUser(u15);
        cart16.setUser(u16);
        cart17.setUser(u17);
        cart18.setUser(u18);
        cart19.setUser(u19);
        cart20.setUser(u20);
        cart21.setUser(u21);
        cart22.setUser(u22);

        

        Cart[] carts = {cart,cart2,cart3,cart4,cart5,cart6,cart7,cart8,cart9,cart10,cart11,cart12,cart13,cart14,cart15,cart16,cart17,cart18,cart19,cart20,cart21,cart22};
        OrderCounter ohyes = new OrderCounter(carts);

        int count = 0;
        for(int i = 0; i < 22 && count < 10; i++){
            int numberOfOrder = ohyes.giftOrders();
            boolean test = false;
            for(int j = 0; j < 22 && !test && count < 10; j++){
                if(j == numberOfOrder){
                    if(!carts[j].isGifted() && carts[j].checkGiftTime()){
                    count++;
                    carts[j].setGifted(true);
                    test = true;
                }
            }
        }
    }

        
        assertEquals(10,count,0);
        
    }

    @Test
    public void shouldget10FreeRandomOrdersIfMinorenne2(){
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
        EItem proc12 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc13=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc14=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc15=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc16=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc17= new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        EItem proc18=new EItem("Processor", "Intel i5 1035G1", 300.00);
        EItem proc19=new EItem("Processor", "Amd FX-8350", 100.00);
        EItem proc20=new EItem("Processor", "Intel i9-9900k", 500.00);
        EItem proc21=new EItem("Processor", "Intel i5-750", 75.00);
        EItem proc22 = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
        User u = new User("A","Alberto", "Bigioggero", 10);
        User u2 = new User("B","Giovanni", "Paolo", 8);
        User u3 = new User("C","Paolino", "Filè", 12);
        User u4 = new User("D","Gilberto", "Marchiori", 10);
        User u5 = new User("E","Nicola", "Miotti", 14);
        User u6 = new User("F","Alberto", "Fontolon", 16);
        User u7 = new User("G","Sara", "Filaretti", 17);
        User u8 = new User("H","Marta", "Greggio", 9);
        User u9 = new User("I","Maria", "Pia", 10);
        User u10 = new User("J","Franco", "Stefanini", 12);
        User u11 = new User("K","Matteo", "Marangon", 15);
        User u12 = new User("A","Alberto", "Bigioggero", 10);
        User u13 = new User("B","Giovanni", "Paolo", 8);
        User u14 = new User("C","Paolino", "Filè", 12);
        User u15 = new User("D","Gilberto", "Marchiori", 10);
        User u16 = new User("E","Nicola", "Miotti", 14);
        User u17 = new User("F","Alberto", "Fontolon", 16);
        User u18 = new User("G","Sara", "Filaretti", 17);
        User u19 = new User("H","Marta", "Greggio", 9);
        User u20 = new User("I","Maria", "Pia", 10);
        User u21 = new User("J","Franco", "Stefanini", 12);
        User u22 = new User("K","Matteo", "Marangon", 15);
        Cart cart=new Cart();
        Cart cart2=new Cart();
        Cart cart3=new Cart();
        Cart cart4=new Cart();
        Cart cart5=new Cart();
        Cart cart6=new Cart();
        Cart cart7=new Cart();
        Cart cart8=new Cart();
        Cart cart9=new Cart();
        Cart cart10=new Cart();
        Cart cart11=new Cart();
        Cart cart12=new Cart();
        Cart cart13=new Cart();
        Cart cart14=new Cart();
        Cart cart15=new Cart();
        Cart cart16=new Cart();
        Cart cart17=new Cart();
        Cart cart18=new Cart();
        Cart cart19=new Cart();
        Cart cart20=new Cart();
        Cart cart21=new Cart();
        Cart cart22=new Cart();
        cart.addElement(proc);
        cart2.addElement(proc2);
        cart3.addElement(proc3);
        cart4.addElement(proc4);
        cart5.addElement(proc5);
        cart6.addElement(proc6);
        cart7.addElement(proc7);
        cart8.addElement(proc8);
        cart9.addElement(proc9);
        cart10.addElement(proc10);
        cart11.addElement(proc11);
        cart12.addElement(proc12);
        cart13.addElement(proc13);
        cart14.addElement(proc14);
        cart15.addElement(proc15);
        cart16.addElement(proc16);
        cart17.addElement(proc17);
        cart18.addElement(proc18);
        cart19.addElement(proc19);
        cart20.addElement(proc20);
        cart21.addElement(proc21);
        cart22.addElement(proc22);

       int time1 = 1901;
       int time2 = 1902;
       int time3 = 1903;
       int time4 = 1904;
       int time5 = 1905;
       int time6 = 1906;
       int time7 = 1907;
       int time8 = 1908;
       int time9 = 1909;
       int time10 = 1910;
       int time11 = 1911;
       int time12 = 1912;
       int time13 = 1913;
       int time14 = 1914;
       int time15 = 1915;
       int time16 = 1916;
       int time17 = 1917;
       int time18 = 1918;
       int time19 = 1919;
       int time20 = 1920;
       int time21 = 1921;
       int time22 = 1922;


        cart.setTimeOrder(time1);
        cart2.setTimeOrder(time2);
        cart3.setTimeOrder(time3);
        cart4.setTimeOrder(time4);
        cart5.setTimeOrder(time5);
        cart6.setTimeOrder(time6);
        cart7.setTimeOrder(time7);
        cart8.setTimeOrder(time8);
        cart9.setTimeOrder(time9);
        cart10.setTimeOrder(time10);
        cart11.setTimeOrder(time11);
        cart12.setTimeOrder(time12);
        cart13.setTimeOrder(time12);
        cart14.setTimeOrder(time14);
        cart15.setTimeOrder(time15);
        cart16.setTimeOrder(time16);
        cart17.setTimeOrder(time17);
        cart18.setTimeOrder(time18);
        cart19.setTimeOrder(time19);
        cart20.setTimeOrder(time20);
        cart21.setTimeOrder(time21);
        cart22.setTimeOrder(time22);
    
        cart.setUser(u);
        cart2.setUser(u2);
        cart3.setUser(u3);
        cart4.setUser(u4);
        cart5.setUser(u5);
        cart6.setUser(u6);
        cart7.setUser(u7);
        cart8.setUser(u8);
        cart9.setUser(u9);
        cart10.setUser(u10);
        cart11.setUser(u11);
        cart12.setUser(u12);
        cart13.setUser(u13);
        cart14.setUser(u14);
        cart15.setUser(u15);
        cart16.setUser(u16);
        cart17.setUser(u17);
        cart18.setUser(u18);
        cart19.setUser(u19);
        cart20.setUser(u20);
        cart21.setUser(u21);
        cart22.setUser(u22);

        

        Cart[] carts = {cart,cart2,cart3,cart4,cart5,cart6,cart7,cart8,cart9,cart10,cart11,cart12,cart13,cart14,cart15,cart16,cart17,cart18,cart19,cart20,cart21,cart22};
        OrderCounter ohyes = new OrderCounter(carts);

        int count = 0;
        for(int i = 0; i < 22 && count < 10; i++){
            int numberOfOrder = ohyes.giftOrders();
            boolean test = false;
            for(int j = 0; j < 22 && !test && count < 10; j++){
                if(j == numberOfOrder){
                    if(!carts[j].isGifted() && carts[j].checkGiftTime()){
                    count++;
                    carts[j].setGifted(true);
                    test = true;
                }
            }
        }
    }

        
        assertEquals(0,count,0);
}

}
