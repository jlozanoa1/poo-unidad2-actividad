package ejercicio2;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Bicicleta b = new Bicicleta();
        Vehiculo ref = new Bicicleta();

        v.moverse();
        b.moverse();
        ref.moverse();
    }
}
