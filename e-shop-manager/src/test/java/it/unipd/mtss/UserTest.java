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
public class UserTest {
    
@Test
public void shouldConstuctUser(){
User u = new User();
assertEquals("AAAA",u.getFC());
assertEquals("John",u.getName());
assertEquals("Maven",u.getSurname());
assertEquals(16,u.getAge());
}

@Test
public void shouldConstructUserWithParameters(){
    User u = new User("CCC","Allelle", "Brazof",17);
    assertEquals("CCC",u.getFC());
    assertEquals("Allelle",u.getName());
    assertEquals("Brazof",u.getSurname());
    assertEquals(17,u.getAge());
}

@Test
public void shouldGetFC(){
    User u = new User();
    String FC = u.getFC();
    assertEquals("AAAA", u.getFC());
}
@Test
public void shouldGetFCCustom(){
    User u = new User("MRGALC","Alice", "Morgagni", 23);
    String FC = u.getFC();
    assertEquals("MRGALC", u.getFC());
}

@Test
public void shouldSetTheCorrectFC(){
    User u = new User();
    u.setFC("ACCCCC");
    assertEquals("ACCCCC", u.getFC());
}

@Test
public void shouldSetTheCorrectCustom(){
    User u = new User("GNALC","Alice", "Gina",19);
    u.setFC("ACCCCC");
    assertEquals("ACCCCC", u.getFC());
}
@Test
public void shouldGetName(){
    User u = new User();
    String name = u.getName();
    assertEquals("John", u.getName());
}

@Test
public void shouldGetNameCustom(){
    User u = new User("TTTT", "Marco", "Oliva", 27);
    String name = u.getName();
    assertEquals("Marco", u.getName());
}


@Test
public void shouldSetTheCorrectName(){
    User u = new User();
    u.setName("Melvin");
    assertEquals("Melvin", u.getName());
}

@Test
public void shouldSetTheCorrectNameCustom(){
    User u = new User("YYYY", "Giovanni", "Tenche", 90);
    u.setName("Melvin");
    assertEquals("Melvin", u.getName());
}
@Test
public void shouldGetSurname(){
    User u = new User();
    String surname = u.getSurname();
    assertEquals("Maven", u.getSurname());
}
@Test
public void shouldGetSurnameCustom(){
    User u = new User("IIII", "Giovanni", "Favaron", 26);
    String surname = u.getSurname();
    assertEquals("Favaron", u.getSurname());
}

@Test
public void shouldSetTheCorrectSurname(){
    User u = new User();
    u.setSurname("Hopkins");
    assertEquals("Hopkins", u.getSurname());
}
@Test
public void shouldSetTheCorrectSurnameCustom(){
    User u = new User("WWWW", "Alice", "Mastellaro", 38);
    u.setSurname("Hopkins");
    assertEquals("Hopkins", u.getSurname());
}


@Test
public void shouldGetAge(){
    User u = new User();
    int age = u.getAge();
    assertEquals(16, u.getAge());
}

@Test
public void shouldGetAgeCustom(){
    User u = new User("EEEE", "Nicola", "Miotti", 22);
    int age = u.getAge();
    assertEquals(22, u.getAge());
}
@Test
public void shouldSetTheCorrectAge(){
    User u = new User();
    u.setAge(99);
    assertEquals(99, u.getAge());
}

@Test
public void shouldSetTheCorrectAgeCustom(){
    User u = new User("UUUU", "Marco", "Perazzolo", 25);
    u.setAge(99);
    assertEquals(99, u.getAge());
}
}
