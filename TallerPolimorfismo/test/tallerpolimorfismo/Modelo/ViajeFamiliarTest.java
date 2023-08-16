/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tallerpolimorfismo.Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INGESIS
 */
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }

    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        ViajeFamiliar instance = null;
        int expResult = 0;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int familia = 0;
        ViajeFamiliar instance = null;
        instance.setFamilia(familia);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeFamiliar instance = null;
        String expResult = "";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
