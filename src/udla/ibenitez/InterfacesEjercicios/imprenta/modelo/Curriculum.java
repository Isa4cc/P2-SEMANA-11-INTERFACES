package udla.ibenitez.InterfacesEjercicios.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{
    /**Declaración de atributos de clase Curriculum*/
    private String persona;
    private String carreraPersona;
    private List<String> experienciaPersona;

    /**Importar clase abstract*/
    @Override
    public String Imprimir() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Nombre: ").append(this.persona).append("\n")
                .append("Profesión: ").append(this.carreraPersona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("\n");
        for(String  exp : this.experienciaPersona){
            sbuilder.append("- ").append(exp).append("\n");
        }
        return sbuilder.toString();
    }

    /**Importar constructor de la clase abstract*/
    public Curriculum(String persona, String carreraPersona,String contenido) {
        super(contenido);
        this.persona=persona;
        this.carreraPersona=carreraPersona;
        this.experienciaPersona=new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        experienciaPersona.add(experiencia);
        return this;
    }
}
