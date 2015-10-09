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
public class EnemyTest {
    Enemy instance = new Enemy("Skeleton", "Tiny", 17, 21, 40);
    public EnemyTest() {
        
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
     * Test of getName method, of class Enemy.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        String expResult = "Skeleton";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Enemy.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Tiny";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDmgMin method, of class Enemy.
     */
    @Test
    public void testGetDmgMin() {
        System.out.println("getDmgMin");
        int expResult = 17;
        int result = instance.getDmgMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDmgMax method, of class Enemy.
     */
    @Test
    public void testGetDmgMax() {
        System.out.println("getDmgMax");
        int expResult = 21;
        int result = instance.getDmgMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHP method, of class Enemy.
     */
    @Test
    public void testGetHP() {
        System.out.println("getHP");
        int expResult = 40;
        int result = instance.getHP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHP method, of class Enemy.
     */
    @Test
    public void testSetHP() {
        System.out.println("setHP");
        int hp = 100;
        instance.setHP(hp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDmgActual method, of class Enemy.
     */
    @Test
    public void testGetDmgActual() {
        System.out.println("getDmgActual");
        int result = instance.getDmgActual();
        assertTrue("Return: " + result, 17 <= result && result <= 21);

    }
    
}
