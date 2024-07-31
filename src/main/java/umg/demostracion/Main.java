package umg.demostracion;

import conductores.Conductor;
import conductores.ConductorDeCoche;
import conductores.ConductorDeMoto;
import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Main {
    public static void main(String[]args){
        Conductor conductor = new Conductor("Alejandro", "C5448544");
        ConductorDeCoche conductordecoche = new ConductorDeCoche("Estuardo", "C45122", 2);
        ConductorDeMoto conductordemoto = new ConductorDeMoto("Marisol", "M452214" , true);
        Vehiculo vehiculo = new Vehiculo ("Volkswagen", "Volkswagen Golf", 2017);
        Moto moto = new Moto("Honda", "Honda CBR600RR",2020, true);
        Coche coche = new Coche("Volkswagen", "Volkswagen Golf", 2017, 2);

        System.out.println("Informacion del Conductor:");
        conductor.mostrarINFO();
        System.out.println("\nInformacion del conductor de coche:");
        conductordecoche.mostrarINFO();
        System.out.println("\nInformacion del conductor de moto:");
        conductordemoto.mostrarINFO();
        System.out.println("\nInformacion del vehiculo:");
        vehiculo.mostrarDetalles();
        System.out.println("\nInformacion del conductor de la moto");
        moto.mostrarDetalles();
        System.out.println("\nInformacion completa del coche:");
        coche.mostrarDetalles();
    }
}