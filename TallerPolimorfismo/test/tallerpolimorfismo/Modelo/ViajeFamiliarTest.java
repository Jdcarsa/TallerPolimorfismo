/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tallerpolimorfismo.Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public void testGetFamilia() throws ParseException {
        System.out.println("getFamilia");
        ViajeFamiliar instance = new ViajeFamiliar(5,"Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
        int expResult = 5;
        int result = instance.getFamilia();
        assertEquals(expResult, result,0.001);
    }

    @Test
    public void testSetFamilia() throws ParseException {
        System.out.println("setFamilia");
        int familia = 0;
               ViajeFamiliar instance = new ViajeFamiliar(5,"Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
        instance.setFamilia(familia);
    }

    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
          ViajeFamiliar instance = new ViajeFamiliar(5,"Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));;
        String expResult = "Viaje para disfrutar con toda tu familia";
        String result = instance.descripcion();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testCualquierMetodo2() throws ParseException {
        System.out.println("cualquierMetodo2");
                ViajeFamiliar instance = new ViajeFamiliar(5,"Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
        String expResult = "metodo viajeFamiliar";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
       
    }
    
}
