/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mzhje_000
 */
public class BuilderTest {
    
    public BuilderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of getRoom method, of class Builder.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        int i = 0;
        Builder instance = new Builder();
        Room expResult = instance.getRooms().get(i);
        Room result = instance.getRoom(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of useKey method, of class Builder.
     */
    @Test
    public void testUseKey() {
        System.out.println("useKey");
        int curRoom = 0;
        int unlockRoom = 1;
        String direction = "south";
        Builder instance = new Builder();
        instance.useKey(curRoom, unlockRoom, direction);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
