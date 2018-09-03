/**
* Programa de consola que aplica el algoritmo de procesamiento KeyWord-In-Context (KWIC) a un set de lineas de entrada.
*
* @author  Aldo Cervantes Barbosa
* @author Luis Daniel Villarreal Ortega
* @author Jesús Alejandro Galván Villarreal
* @author Alejandro Roiz Walss

* @since 2018-08-31
*/


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inputLines = IOLines.readInput();
        KWIC kwic = new KWIC(inputLines);
        ArrayList<String> outputLines = kwic.process();
        IOLines.outputLines(outputLines);
    }
}