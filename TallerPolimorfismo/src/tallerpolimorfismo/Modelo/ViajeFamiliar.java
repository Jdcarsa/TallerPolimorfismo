/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpolimorfismo.Modelo;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeFamiliar extends Viaje{
    
    private int familia;

    public ViajeFamiliar(int familia, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    
    @Override
    public String cualquierMetodo2(){
        return "metodo viajeFamiliar";
    }
}
