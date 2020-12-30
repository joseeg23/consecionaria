package concesionaria;

import concesionaria.Entity.Concesionario;
import concesionaria.Entity.Vehiculo;
import concesionaria.service.ConcesionarioService;
import java.util.ArrayList;

public class Concesionaria {

    public static void main(String[] args) {
        // TODO code application logic here

        ConcesionarioService service = new ConcesionarioService();
        Concesionario c = new Concesionario();
        ArrayList<Vehiculo> lista = new ArrayList();

        Vehiculo moto1 = service.altaVehiculos("Honda", "Titan", 60000.00, "125cc", 0);
        lista.add(moto1);

        Vehiculo moto2 = service.altaVehiculos("Yamaha", "YMR", 80500.00, "160cc", 0);
        lista.add(moto2);
        
         Vehiculo auto1 = service.altaVehiculos("Peugeot", "206", 200000.00, "0", 4);
        lista.add(auto1);
        
         Vehiculo auto2 = service.altaVehiculos("Peugeot", "208", 250000.00, "0", 5);
        lista.add(auto2);

        c.setVehiculos(lista);
        service.listar(c);
        System.out.println("================================");
        service.caro(c);
        service.barato(c);
        service.letra(c);
        System.out.println("=================================");
        service.ordenamiento(c);

    }

}
