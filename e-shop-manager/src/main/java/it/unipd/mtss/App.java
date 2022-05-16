package it.unipd.mtss;
import it.unipd.mtss.business.*;
import it.unipd.mtss.business.Bill;
import it.unipd.mtss.model.*;

public class App{
    public static void main(String[] args) {
        Cart c=new Cart();
        double total=c.getOrderPrice(c.getCart(), c.getUser());
        System.out.println(total);
    }
}