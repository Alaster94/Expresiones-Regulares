package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private static Persona[] listaPersonas = {
            new Persona("David","Delcid",21),
            new Persona("Alaster","Erazo",24),
            new Persona("Juan","Velis",22),
            new Persona("Josue","Cordoba",20),
            new Persona("Yarince","Padilla",27),
            new Persona("Oscar","Diaz",25),
            new Persona("Orlando","Calix",22),

    };

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static String buscarPorPosicion(String nombre) {
        int i = 0;
        String texto = "";
        while (i < listaPersonas.length){
            Pattern pattern = Pattern.compile(nombre);
            Matcher matcher = pattern.matcher(listaPersonas[i].nombre);
            if (matcher.find()) {
                texto = texto + listaPersonas[i].nombre + " " + listaPersonas[i].apellido + " " + listaPersonas[i].edad;
            }
            i++;
        }
        return texto;
    }

}
