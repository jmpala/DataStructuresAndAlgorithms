package io.jmpalazzolo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void TestAddElementToQueue() {
        //Given
        Queue<String> q = new Queue<>();

        //When
        q.enqueue("Item1");

        //Then
        Assertions.assertEquals("Item1", q.dequeue());
    }

    @Test
    public void TestRemoteElementFromQueue() {
        //Given
        Queue<String> q = new Queue<>();
        q.enqueue("Item1");
        q.enqueue("Item2");

        //When
        q.dequeue();

        //Then
        Assertions.assertEquals(1, q.size());
        Assertions.assertEquals("Item2", q.dequeue());
    }

    @Test
    public void TestSizeOfQueue() {
        //Given
        Queue<String> q = new Queue<>();
        q.enqueue("Item1");
        q.enqueue("Item2");

        //When

        //Then
        Assertions.assertEquals(2, q.size());
    }

    @Test
    public void TestWhenQueueIsEmpty() {
        //Given
        Queue<String> q = new Queue<>();

        //When

        //Then
        Assertions.assertEquals(true, q.isEmpty());
    }

    @Test
    public void TestWhenQueueIsNotEmpty() {
        //Given
        Queue<String> q = new Queue<>();

        //When
        q.enqueue("Item1");

        //Then
        Assertions.assertEquals(false, q.isEmpty());
    }
}
