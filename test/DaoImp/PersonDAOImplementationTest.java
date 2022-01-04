/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import java.util.List;
import model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PersonDAOImplementationTest {
    
    public PersonDAOImplementationTest() {
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
     * Test of create method, of class PersonDAOImplementation.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        
        PersonDAOImplementation instance = new PersonDAOImplementation();
    //    instance.create(person);
        assertEquals(instance.findById(30).getName(),"test30");
    }

    /**
     * Test of findById method, of class PersonDAOImplementation.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        PersonDAOImplementation instance = new PersonDAOImplementation();
        Person expResult = null;
        Person result = instance.findById(id);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class PersonDAOImplementation.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        PersonDAOImplementation instance = new PersonDAOImplementation();
        List<Person> expResult = null;
        List<Person> result = instance.findAll();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PersonDAOImplementation.
     */
    

    /**
     * Test of delete method, of class PersonDAOImplementation.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        PersonDAOImplementation instance = new PersonDAOImplementation();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
