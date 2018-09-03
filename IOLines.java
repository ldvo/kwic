/**
* IOLines provee las funciones de lectura y despliegue para el programa KWIC.
*
* @author  Aldo Cervantes Barbosa
* @author Luis Daniel Villarreal Ortega
* @author Jesús Alejandro Galván Villarreal
* @author Alejandro Roiz Walss

* @since 2018-08-31
*/

import java.util.Scanner;
import java.util.ArrayList;

public class IOLines {
    /**
    * Metodo que lee la entrada de std input y filtra caracteres en las lineas.
    * @return ArrayList<String> que representa cada una de las lineas de entrada del usuario.
    */
    static ArrayList<String> readInput() {
        Scanner stdIn = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();
        String currentLine;

        int numLines = stdIn.nextInt();
        stdIn.nextLine();
        for (int i = 0; i < numLines; i++) {
            currentLine = stdIn.nextLine();
            currentLine = currentLine.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
            lines.add(currentLine);
        }

        stdIn.close();
        return lines;
    }

    /**
    * Metodo que imprime un arreglo de Strings.
    * @param lines Un arreglo con las lineas a imprimir
    */
    static void outputLines(ArrayList<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}