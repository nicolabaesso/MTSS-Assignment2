////////////////////////////////////////////////////////////////////
// [Andrea] [Veronese] [1225411]
// [Nicola] [Baesso] [2011877]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss.model;
public class EItem {
    public enum itemType {Processor, Motherboard, Mouse, Keyboard};
    itemType type;
    private String name;
    private double price;

    public EItem() {
        type=itemType.Processor;
        name="Potato CPU";
        price=0;
    }

    public EItem(String t, String n, double p) {
        switch(t) {
            case "Processor":
                type=itemType.Processor;
                break;
            case "Motherboard":
                type=itemType.Motherboard;
                break;
            case "Mouse":
                type=itemType.Mouse;
                break;
            case "Keyboard":
                type=itemType.Keyboard;
        }
        name=n;
        price=p;
    }

    public itemType getType() {
        return type;
    }

    public void setType(itemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name=="Default"){
            switch(this.type) {
                case Processor:
                    this.name = "Generic CPU";                    
                break;
                case Motherboard:
                    this.name = "Generic Motherboard";
                    break;
                case Mouse:
                    this.name = "Generic Mouse";
                    break;
                case Keyboard:
                    this.name = "Generic Keyboard";
                    default:
            }
        }
        else{
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0.0){
            this.price=0.0;
        }
        else{
            this.price = price;
        }
    }
}
