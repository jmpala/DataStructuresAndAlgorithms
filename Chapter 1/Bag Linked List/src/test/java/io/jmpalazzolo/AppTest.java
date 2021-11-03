package io.jmpalazzolo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void TestAddElementToBag() {
        //Given
        Bag<String> bag = new Bag<>();

        //When
        bag.add("Item1");

        //Then
        for (String s: bag) {
            Assertions.assertEquals("Item1", s);
        }
    }

}
