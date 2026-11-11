package ejercicio3;

public class FirmaIncorrecta extends Base {

    @Override
    public void saludar(int veces) {
        System.out.println("Hola x" + veces);
    }

    @Override
    public int obtenerCodigo() {
        return 1;
    }
}
