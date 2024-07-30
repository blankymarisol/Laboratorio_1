package conductores;

public class Conductor {
    private String nombre;
    private String licencia;

    public Conductor (String nombre, String licencia){
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarINFO(){
        System.out.println("El nombre del conductor es: " + nombre);
        System.out.println("La licencia del conductor es: " + licencia);
    }

}
