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
public class ViajeTodoIncluidoTest {

    public ViajeTodoIncluidoTest() {
    }

    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        ViajeTodoIncluido instance = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000,
                new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        String expResult = "Viaje todo incluido";
        String result = instance.descripcion();
        assertEquals(expResult, result);

    }

}
