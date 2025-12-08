package udla.ibenitez.InterfacesEjercicios.imprenta.modelo;

public class Informe extends Hoja {
    /**Atributos de clase*/
    private String autor;
    private String revisor;

    /**Herencia del constructor*/
    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor=autor;
        this.revisor=revisor;
    }

    /**Herencia del metodo abstract*/
    @Override
    public String Imprimir() {
        return "Informe escrito por : " + this.autor + "\n" +
                "Revisado por: " + this.revisor + "\n" +
                this.contenido;
    }
}
