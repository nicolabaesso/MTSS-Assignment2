package it.unipd.mtss.model;

import it.unipd.mtss.business.*;
import it.unipd.mtss.model.EItem.itemType;
import java.util.*;
import java.lang.Math;
import it.unipd.mtss.model.Cart;

public class OrderCounter{
private Cart[] listCart;

public Cart[] getListCart() {
    return listCart;
}

public void setListCart(Cart[] listCart) {
    this.listCart = listCart;
}

public OrderCounter(Cart[] list){
    listCart = list;
}

public int giftOrders(){
    int range = listCart.length-1;
    Random rand = new Random();
    int random = rand.nextInt(range);
    return random;
}
}