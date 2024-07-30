package conductores;

public class ConductorDeCoche extends Conductor{
    private int experienciaAnios;

    public ConductorDeCoche(String nombre, String licencia, int experienciaAnios) {
        super(nombre, licencia);
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarINFO() {
        super.mostrarINFO();
        System.out.println("La experiencia en años es: " + experienciaAnios);
    }
}