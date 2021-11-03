package io.jmpalazzolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void TestAddElementToStack() {
        //Given
        Stack<String> stack = new Stack<>();

        //When
        stack.push("Item1");

        //Then
        Assertions.assertEquals("Item1", stack.pop());
    }

    @Test
    public void TestSizeOfStack() {
        //Given
        Stack<String> stack = new Stack<>();

        //When
        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");

        //Then
        Assertions.assertEquals(3, stack.size());
    }

    @Test
    public void TestRemoveFromStack() {
        //Given
        Stack<String> stack = new Stack<>();
        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");

        //When
        stack.pop();

        //Then
        Assertions.assertEquals(2, stack.size());
        Assertions.assertEquals("Item2", stack.pop());
    }

    @Test
    public void TestWhenEmpty() {
        //Given
        Stack<String> stack = new Stack<>();

        //When


        //Then
        Assertions.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void TestWhenNotEmpty() {
        //Given
        Stack<String> stack = new Stack<>();

        //When
        stack.push("Item1");

        //Then
        Assertions.assertEquals(false, stack.isEmpty());
    }
}
