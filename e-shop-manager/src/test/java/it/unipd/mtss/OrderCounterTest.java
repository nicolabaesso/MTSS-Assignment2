package it.unipd.mtss;
import it.unipd.mtss.model.Cart;
import it.unipd.mtss.model.EItem;
import it.unipd.mtss.model.OrderCounter;
import it.unipd.mtss.model.User;
import it.unipd.mtss.model.EItem.itemType;

import java.lang.Math;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OrderCounterTest {
@Test
public void shouldGetCorrectConstructor(){
Cart c = new Cart();
assertEquals(0, c.getNumberOfItems());
assertEquals("AAAA",c.getUser().getFC());
assertEquals("John",c.getUser().getName());
assertEquals("Maven",c.getUser().getSurname());
assertEquals(16,c.getUser().getAge());
}
@Test
public void shouldGetListCart(){
EItem proc = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
Cart c = new Cart();
EItem proc2 = new EItem("Processor", "Amd Ryzen 5 3600", 195.00);
Cart c2 = new Cart();
c.addElement(proc);
c2.addElement(proc2);
Cart[] carts = {c,c2};
OrderCounter ohyes = new OrderCounter(carts);
ohyes.getListCart();
assertEquals("Processor", proc.getType().toString());
assertEquals("Amd Ryzen 5 3600", proc.getName());
assertEquals(200, proc.getPrice(),0);
assertEquals("Processor", proc2.getType().toString());
assertEquals("Amd Ryzen 5 3600", proc2.getName());
assertEquals(195, proc2.getPrice(),0);
}
@Test
public void setListCart(){
EItem list = new EItem("Processor", "Amd Ryzen 5 3600", 200.00);
Cart c = new Cart();
Cart[] carts = {c};
OrderCounter ohyes = new OrderCounter(carts);
ohyes.setListCart(carts);
list.setType(itemType.Motherboard);
list.setName("MSI B450 Tomahawk max");
list.setPrice(200.00);
assertEquals("Motherboard", list.getType().toString());
assertEquals("MSI B450 Tomahawk max", list.getName());
assertEquals(200, list.getPrice(),0);

}
}
