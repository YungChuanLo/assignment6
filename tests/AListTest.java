import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AListTest {

    AList L = new AList();


    @Test
    public void emptySize(){
        assertEquals(0, L.size());

    }



    @Test
    public void testAddLast() {

        int i = 0;
        while(i < 101)
        {
            L.addLast(i);
            i++;
        }

        assertEquals(101, L.size());
        assertEquals(100, L.getLast());

    }


    @Test
    public void testGetLast() {
        L.addLast(10);
        assertEquals(10,L.getLast());
        L.addLast(20);
        assertEquals(20, L.getLast());
    }

    @Test
    public void size() {

        //Case 1: empty array
        assertEquals(0, L.size());
        //Case 2: After addLast()
        L.addLast(10);
        L.addLast(10);
        L.addLast(10);
        assertEquals(3, L.size());


    }

    @Test
    public void testRemove(){
        L.addLast(10);
        L.addLast(20);
        assertEquals(20,L.removeLast());
        assertEquals(10,L.getLast());
    }




    @Test
    public void testRemoveLast() {
        L.addLast(10);
        L.addLast(20);

        assertEquals(20,L.removeLast());
        assertEquals(1, L.size());
        assertEquals(10,L.getLast());

    }
}