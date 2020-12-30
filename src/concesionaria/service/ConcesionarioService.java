package concesionaria.service;

import concesionaria.Entity.Concesionario;
import concesionaria.Entity.Vehiculo;
import java.util.Collections;
import java.util.List;

public class ConcesionarioService {

    public Vehiculo altaVehiculos(String marca, String modelo, double precio, String cilindrada, int puertas) {

        Vehiculo v = new Vehiculo(marca, modelo, precio);
        if (puertas > 0) {
            v.setPuertas(puertas);
        } else {
            v.setCilindrada(cilindrada);
        }

        return v;

    }

    public void listar(Concesionario c) {
        //vehiculos lista
        for (int i = 0; i < c.getVehiculos().size(); i++) {
            if (c.getVehiculos().get(i).getPuertas() > 0) {
                System.out.println(" Marca " + c.getVehiculos().get(i).getMarca() + " // Modelo "
                        + c.getVehiculos().get(i).getModelo() + " // Puertas "
                        + c.getVehiculos().get(i).getPuertas() + " //precio "
                        + c.getVehiculos().get(i).getPrecio());

            } else {
                System.out.println(" Marca: " + c.getVehiculos().get(i).getMarca() + " // Modelo "
                        + c.getVehiculos().get(i).getModelo() + " // Cilindrada "
                        + c.getVehiculos().get(i).getCilindrada() + " // Precio "
                        + c.getVehiculos().get(i).getPrecio());
            }
        }

    }

    public void caro(Concesionario c) {
        //buscar el mas caro
        Vehiculo a = new Vehiculo();
        for (int i = 0; i < c.getVehiculos().size(); i++) {

            double max = c.getVehiculos().get(0).getPrecio();

            if (c.getVehiculos().get(i).getPrecio() > max) {
                a = c.getVehiculos().get(i);

            }
        }
        System.out.println("Vehiculo mas caro: " + a.getMarca() + " "
                + a.getModelo());

    }

    public void barato(Concesionario c) {
        //buscar el mas barato
        Vehiculo a = new Vehiculo();
        for (int i = 0; i < c.getVehiculos().size(); i++) {

            double min = c.getVehiculos().get(0).getPrecio();

            if (c.getVehiculos().get(i).getPrecio() <= min) {
                a = c.getVehiculos().get(i);
            }
        }
        System.out.println("Vehiculo mas  barato: " + a.getMarca() + " "
                + a.getModelo());

    }

    public void letra(Concesionario c) {
        for (int i = 0; i < c.getVehiculos().size(); i++) {
            //buscar por letra
            if (c.getVehiculos().get(i).getModelo().contains("Y")) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + c.getVehiculos().get(i).getMarca() + " "
                        + c.getVehiculos().get(i).getModelo() + " $ " + c.getVehiculos().get(i).getPrecio());
                break;
            }
        }
    }

    public void ordenamiento(Concesionario c) {
        Collections.sort((List) c.getVehiculos(), Vehiculo.comparar);
        
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
         for (int i = 0; i < c.getVehiculos().size(); i++) {
            if (c.getVehiculos().get(i).getPuertas() > 0) {
                System.out.println( c.getVehiculos().get(i).getMarca() + " "
                        + c.getVehiculos().get(i).getModelo());

            } else {
           System.out.println( c.getVehiculos().get(i).getMarca() + " "
                        + c.getVehiculos().get(i).getModelo());
            }
        }
        

    }

}
