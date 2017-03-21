package Branching;

import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Jonathan McDevitt on 2017-03-20.
 */
public class LinkedListTest {
    private LinkedList<String> names;

    @Before
    public void setUp() {
        names = new LinkedList<>();
    }
    @org.junit.Test
    public void size() throws Exception {
        assertEquals(0, names.size());
    }

    @org.junit.Test
    public void remove() throws Exception {
        names.add("Tracy");
        int preSize = names.size();
        assertEquals("Tracy", names.remove("Tracy"));
        assertEquals(preSize-1, names.size());
    }

    @org.junit.Test
    public void add() throws Exception {
        int size = names.size();
        names.add("Tracy");
        assertEquals(size+1, names.size());
    }

}