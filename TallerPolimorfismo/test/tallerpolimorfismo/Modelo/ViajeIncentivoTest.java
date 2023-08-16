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
public class ViajeIncentivoTest {
    
    public ViajeIncentivoTest() {
    }

    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("descripcion");
        ViajeIncentivo instance = new ViajeIncentivo("Emtel","Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"),
                    new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));;
        String expResult = "Viaje icentivo por parte de la empresa";
        String result = instance.descripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmpresa() throws ParseException {
        System.out.println("getEmpresa");
        ViajeIncentivo instance =new ViajeIncentivo("Emtel","Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"),
                    new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));;
        String expResult = "Emtel";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEmpresa() throws ParseException {
        System.out.println("setEmpresa");
        String empresa = "Emtel";
        ViajeIncentivo instance = new ViajeIncentivo("Emtel","Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"),
                    new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        instance.setEmpresa(empresa);
    }

    @Test
    public void testCualquierMetodo2() throws ParseException {
        System.out.println("cualquierMetodo2");
        ViajeIncentivo instance = new ViajeIncentivo("Emtel","Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"),
                    new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));;
        String expResult = "metodo viajeIcentivo";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
    }
    
}
