package udla.ibenitez.InterfacesEjercicios.imprenta.modelo;

public abstract class Hoja {
    /**Declaración de métodos*/
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }
    /**Métodos abstract*/
    public abstract String Imprimir();
}
