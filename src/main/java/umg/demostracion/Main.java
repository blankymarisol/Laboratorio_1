package umg.demostracion;

import conductores.Conductor;
import conductores.ConductorDeCoche;
import conductores.ConductorDeMoto;

public class Main {
    public static void main(String[]args){
        Conductor conductor = new Conductor("Alejandro", "C5448544");
        ConductorDeCoche conductordecoche = new ConductorDeCoche("Estuardo", "C45122", 2);
        ConductorDeMoto conductordemoto = new ConductorDeMoto("Marisol", "M452214" , true);

        System.out.println("Informacion del Conductor:");
        conductor.mostrarINFO();
        System.out.println("\nInformacion del conductor de coche:");
        conductordecoche.mostrarINFO();
        System.out.println("\nInformacion del conductor de moto:");
        conductordemoto.mostrarINFO();
    }
}