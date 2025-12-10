package udla.ibenitez.InterfacesEjercicios.imprenta;

import udla.ibenitez.InterfacesEjercicios.imprenta.modelo.Curriculum;
import udla.ibenitez.InterfacesEjercicios.imprenta.modelo.Hoja;
import udla.ibenitez.InterfacesEjercicios.imprenta.modelo.Informe;

import java.util.Scanner;

public class EjemploImprenta {
    public static void main (String[] args){
        /**Declaración de objects*/
        Curriculum cv = new Curriculum("JJ", "Ingeniería de Software",
                "Resumen laboral:");
        cv.addExperiencia("Java");
        cv.addExperiencia("Python");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Fullstack Developer");
        cv.addExperiencia("Angular");
        cv.addExperiencia("Flutter");
        Informe informe = new Informe("JJ", "SC", "Estudio de Hoja de vida");
        Scanner sc = new Scanner(System.in);
        /**Metodo que invoca al abstract*/
        imprimir(cv);
        imprimir(informe);

    }
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.Imprimir());
    }
}

