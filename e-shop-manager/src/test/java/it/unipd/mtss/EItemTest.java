package it.unipd.mtss;
import it.unipd.mtss.model.EItem;
import it.unipd.mtss.model.EItem.itemType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EItemTest {
    
    @Test
    public void createStandardEItem(){
        EItem e=new EItem();
        assertEquals(itemType.Processor,e.getType());
        assertEquals("Potato CPU",e.getName());
        assertEquals(0,e.getPrice(),0);
    }

    @Test
    public void createCustomEItem(){
        EItem e=new EItem("Mouse","Mouse Lidl",50.0);
        assertEquals(itemType.Mouse,e.getType());
        assertEquals("Mouse Lidl",e.getName());
        assertEquals(50.0,e.getPrice(),0);
    }

    @Test
    public void shoudSetNewPrice(){
        EItem e=new EItem();
        e.setPrice(12.20);
        assertEquals(12.20,e.getPrice(),0);
    }

    @Test
    public void shoudSetNewName(){
        EItem e=new EItem("Mouse","Mouse Lidl",50.0);
        e.setName("Pollo al gusto di mouse");
        assertEquals("Pollo al gusto di mouse",e.getName());
    }

    @Test
    public void shoudSetNewType(){
        EItem e=new EItem();
        e.setType(itemType.Motherboard);
        assertEquals(itemType.Motherboard,e.getType());
    }

    @Test
    public void shouldGetTheRightName(){
        EItem e=new EItem("Mouse","Mouse Lidl",50.0);
        assertEquals(itemType.Mouse,e.getType());
        assertEquals("Mouse Lidl",e.getName());
        assertEquals(50.0,e.getPrice(),0);
    }
}
