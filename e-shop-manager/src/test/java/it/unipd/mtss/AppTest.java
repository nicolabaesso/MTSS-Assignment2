package it.unipd.mtss;
import it.unipd.mtss.model.Cart;
import it.unipd.mtss.model.EItem;
import it.unipd.mtss.model.OrderCounter;
import it.unipd.mtss.model.User;
import java.lang.Math;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void createApp(){
        App a=new App();
        assertEquals("it.unipd.mtss.App",a.getAppName());
    }

    @Test
    public void testMain(){
        App a=new App();
        String[] args={""};
        a.main(args);
        assertEquals("it.unipd.mtss.App",a.getAppName());
    }
}
