////////////////////////////////////////////////////////////////////
// [Andrea] [Veronese] [1225411]
// [Nicola] [Baesso] [2011877]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss.model;

import it.unipd.mtss.business.exception.BillException;
import it.unipd.mtss.business.Bill;
import it.unipd.mtss.model.EItem.itemType;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Cart implements Bill{
    private List<EItem> cart;
    private User user;
    private int numberOfItems = 0;
    private int timeOrder = 1830;
    private int orderNumber = 0;
    private boolean isGifted = false;


    public boolean checkTime(){
        if(timeOrder <= 2359 && timeOrder >= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkGiftTime(){
        if(timeOrder >= 1800 && timeOrder <= 1859 || timeOrder == 1900){
            return true;
        }
        else{
            return false;
        }
    }
   
    public boolean isGifted() {
        return isGifted;
    }

    public void setGifted(boolean isGifted) {
        this.isGifted = isGifted;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(int timeOrder) {
        this.timeOrder = timeOrder;
    }

    public Cart(){
        cart = new ArrayList<EItem>();
        User u=new User();
        user=u;
    }

    public Cart(List<EItem> c,User u){
        cart = new ArrayList<EItem>();
        cart=c;
        user=u;
        numberOfItems = cart.size();
    }

    public List<EItem> getCart() {
        return cart;
    }

    public void setCart(List<EItem> cart) {
        this.cart = cart;
    }

    public void addElement(EItem e) {
        cart.add(e);
        numberOfItems++;
    }
    public int getNumberOfElements(List<EItem> itemsOrdered){
        if(numberOfItems > 30){
            System.out.print("Too many elements on Cart!");
        }
        return  numberOfItems;
    }
   

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getOrderPrice(List<EItem> itemsOrdered, User user){
        double price=0.0;
        int i=0;
        double minProc = getLeastExpensiveProcessor(itemsOrdered);
        double minMouse = getLeastExpensiveMouse(itemsOrdered);
        double minItem = getLeastExpensiveKeyboardOrMouse(itemsOrdered);
        double discount = minProc+minMouse+minItem;
        while(i<itemsOrdered.size()){
            price += itemsOrdered.get(i).getPrice();
            i++;
        }
        if(price > 1000.0){
         price = price-(price*0.10);
        }
        else{
            if(price < 10.0){
                price += 2;
            }
        }
        return price-discount;
    }

    public double getLeastExpensiveProcessor(List<EItem> itemsOrdered){
        int count = 0;
        int i =0;
        double minProcessor = 9000;
        while(i<itemsOrdered.size()){
            if(itemsOrdered.get(i).getType() == itemType.Processor){
                count++;
                if(itemsOrdered.get(i).getPrice() < minProcessor){
                    minProcessor = itemsOrdered.get(i).getPrice();
                }
               
            }
            i++;
        }
        if(count > 5){
             minProcessor = minProcessor /2;
        }
        else{
             minProcessor = 0;
        }
        return minProcessor;

    }

    public double getLeastExpensiveMouse(List<EItem> itemsOrdered){
        int count = 0;
        int i =0;
        double minPriceMouse = 90000;
        while(i<itemsOrdered.size()){
            if(itemsOrdered.get(i).getType() == itemType.Mouse){
                count++;
                if(itemsOrdered.get(i).getPrice() < minPriceMouse){
                    minPriceMouse = itemsOrdered.get(i).getPrice();
                }
               
            }
            i++;
        }
        if(count > 10){
            return minPriceMouse;
        }
        else{
            return 0;
        }
    }

    public double getLeastExpensiveKeyboardOrMouse(List<EItem> itemsOrdered){
        int countMouse = 0;
        int countKeyboard = 0;
        int i =0;
        double minItem = 9000;
        while(i<itemsOrdered.size()){
            if(itemsOrdered.get(i).getType() == itemType.Keyboard){
                countKeyboard++;
                if(itemsOrdered.get(i).getPrice() < minItem){
                minItem = itemsOrdered.get(i).getPrice();
                }
            }
            if(itemsOrdered.get(i).getType() == itemType.Mouse){
                countMouse++;
                if(itemsOrdered.get(i).getPrice() < minItem){
                    minItem = itemsOrdered.get(i).getPrice();
             }
            }
            i++;
        }
        if(countMouse == countKeyboard && countMouse != 0 && countKeyboard != 0){
            return minItem;
        }
        else{
            return 0;
        }

    }
}
