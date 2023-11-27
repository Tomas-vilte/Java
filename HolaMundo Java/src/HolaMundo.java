import java.util.Scanner;

// Mi clase Java
public class HolaMundo {
    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        // Cambiar valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena =  "Adios";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva cadena";
        System.out.println(miVariableCadena2);

        // Valoes permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;

        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // Se realiza la suma de numeros
        System.out.println(i + j + usuario); // Evaluacion de izquierda a derecha, realiza suma
        System.out.println(usuario + i + j); // Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); // Uso de parentesis modifican la prioridad en la evaluacion

        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        var titulo1 = consola.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo1 + " Fue escrito por " + autor);
    }
}

