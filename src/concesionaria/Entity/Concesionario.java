package concesionaria.Entity;

import java.util.ArrayList;


public class Concesionario {
    
    private ArrayList<Vehiculo> vehiculos;

    public Concesionario() {
    }

    public Concesionario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    
}
