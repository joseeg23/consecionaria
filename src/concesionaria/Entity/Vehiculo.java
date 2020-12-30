package concesionaria.Entity;

import java.util.Comparator;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double precio;
    private int puertas;
    private String cilindrada;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cilindrada= "0";
        this.puertas = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static Comparator<Vehiculo> comparar = (Vehiculo o1, Vehiculo o2) -> {
        if (o1.getPrecio() > o2.getPrecio()) {
            return -1;
        } else if (o1.getPrecio() < o2.getPrecio()) {
            return 0;
        } else {
            return 1;
        }
    };
}
