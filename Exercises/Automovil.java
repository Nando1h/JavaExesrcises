package Exercises;

public class Automovil extends Vehiculo {
    private final int puertas;

    public Automovil(String marca, String modelo, int puertas) {
        super(marca, modelo);
        if (puertas <= 0) {
            throw new IllegalArgumentException("El número de puertas es inválido");
        }
        this.puertas = puertas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " - Puertas: " + puertas;
    }
}
