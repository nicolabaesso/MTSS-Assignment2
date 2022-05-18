////////////////////////////////////////////////////////////////////
// [Andrea] [Veronese] [1225411]
// [Nicola] [Baesso] [2011877]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import it.unipd.mtss.model.Cart;


public class App{
    public static void main(String[] args) {
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
        System.out.println(total);
    }
}