////////////////////////////////////////////////////////////////////
// [Andrea] [Veronese] [1225411]
// [Nicola] [Baesso] [2011877]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss.model;

import it.unipd.mtss.business.exception.BillException;
import it.unipd.mtss.model.EItem.itemType;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Random;
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