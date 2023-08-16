/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tallerpolimorfismo.Modelo;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INGESIS
 */
public class ViajeTest {
    
    public ViajeTest() {
    }

    @Test
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Viaje instance = null;
        String expResult = "";
        String result = instance.getOrigen();
        assertEquals(expResult, result);
        fail("Test getOrigen fail");
    }

    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String origen = "";
        Viaje instance = null;
        instance.setOrigen(origen);
        fail("Test setOrigen fail");
    }

    @Test
    public void testGetDestino() {
        System.out.println("getDestino");
        Viaje instance = null;
        String expResult = "";
        String result = instance.getDestino();
        assertEquals(expResult, result);
        fail("Test getDestino fail");
    }

    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Viaje instance = null;
        instance.setDestino(destino);
        fail("Test setDestino fail");
    }

    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Viaje instance = null;
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result);
        fail("Test getCosto fail");
    }

    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Viaje instance = null;
        instance.setCosto(costo);
        fail("Test setCosto fail");
    }

    @Test
    public void testGetFechaSalida() {
        System.out.println("getFechaSalida");
        Viaje instance = null;
        Date expResult = null;
        Date result = instance.getFechaSalida();
        assertEquals(expResult, result);
        fail("Test getFechaSalida fail");
    }

    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        Date fechaSalida = null;
        Viaje instance = null;
        instance.setFechaSalida(fechaSalida);
        fail("Test setFechaSalida fail");
    }

    @Test
    public void testGetFechaLlegada() {
        System.out.println("getFechaLlegada");
        Viaje instance = null;
        Date expResult = null;
        Date result = instance.getFechaLlegada();
        assertEquals(expResult, result);
        fail("Test getFechaLlegada fail");
    }

    @Test
    public void testSetFechaLlegada() {
        System.out.println("setFechaLlegada");
        Date fechaLlegada = null;
        Viaje instance = null;
        instance.setFechaLlegada(fechaLlegada);
        fail("Test setFechaLlegada fail");
    }

    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        Viaje instance = null;
        String expResult = "";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        fail("Test description fail");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Viaje instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("Test toString fail.");
    }

    @Test
    public void testCualquierMetodo() {
        System.out.println("cualquierMetodo");
        Viaje instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo();
        assertEquals(expResult, result);
        fail("Test cualquierMetodo fail");
    }

    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        Viaje instance = null;
        String expResult = "";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        fail("Test cualquierMetodo2 fail");
    }

    public class ViajeImpl extends Viaje {

        public ViajeImpl() {
            super("", "", 0, null, null);
        }

        public String descripcion() {
            return "";
        }
    }
    
}
