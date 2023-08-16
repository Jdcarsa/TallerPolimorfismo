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
 * @author ideapad330S
 */
public class ViajeIndividualTest {
    
    public ViajeIndividualTest() {
    }

    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        ViajeIndividual instance = new ViajeIndividual("Popayán", "San Andres", 4250000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));;
        String expResult = "Viaje para disfrutar solo";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }
    
}
