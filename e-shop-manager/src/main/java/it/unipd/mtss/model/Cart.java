package it.unipd.mtss.model;
import it.unipd.mtss.business.*;
import java.util.*;

public class Cart implements Bill{
    private List<EItem> cart;
    private User user;

    public Cart(){
        cart = new ArrayList<EItem>();
        EItem e=new EItem("Processor","Intel Pentium G3420",10.60);
        cart.add(0,e);
        User u=new User();
        user=u;
    }

    public Cart(List<EItem> c,User u){
        cart = new ArrayList<EItem>();
        cart=c;
        user=u;
    }

    public List<EItem> getCart() {
        return cart;
    }

    public void setCart(List<EItem> cart) {
        this.cart = cart;
    }

    public void addElement(EItem e) {
        cart.add(e);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getOrderPrice(List<EItem> itemsOrdered, User user){
        double pric=0.0;
        int i=0;
        while(i<itemsOrdered.size()){
            pric += itemsOrdered.get(i).getPrice();
            i++;
        }
        return pric;
    }
}
