package it.unipd.mtss.model;
import it.unipd.mtss.business.*;
import it.unipd.mtss.model.EItem.itemType;




import java.util.*;

public class Cart implements Bill{
    private List<EItem> cart;
    private User user;
    private int numberOfItems = 0;
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

    public double getOrderPrice(List<EItem> itemsOrdered, User user){
        double pric=0.0;
        int i=0;
        double minProc = getLeastExpensiveProcessor(itemsOrdered);
        double minItem = getLeastExpensiveKeyboardOrMouse(itemsOrdered);
        while(i<itemsOrdered.size()){
            pric += itemsOrdered.get(i).getPrice();
            i++;
        }
        
        return pric-minProc - minItem;
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
        if(count >= 5){
             minProcessor = minProcessor /2;
        }
        else{
             minProcessor = 0;
        }
        return minProcessor;

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
