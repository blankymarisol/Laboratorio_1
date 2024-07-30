package conductores;

public class ConductorDeMoto extends Conductor {
    private boolean tieneLicenciaMoto;

    public ConductorDeMoto(String nombre, String licencia, boolean tieneLicenciaMoto) {
        super(nombre, licencia);
        this.tieneLicenciaMoto = tieneLicenciaMoto;
    }

    @Override
    public void mostrarINFO() {
        super.mostrarINFO();
        System.out.println("El conductor tiene licencia de moto: " + (tieneLicenciaMoto ? "Sí" : "No"));
    }

}