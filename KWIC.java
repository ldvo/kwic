/**
* KWIC procesa un arreglo de lineas para ordenarlas de acuerdo al algoritmo KeyWord-In-Context (KWIC).
*
* @author  Aldo Cervantes Barbosa
* @author Luis Daniel Villarreal Ortega
* @author Jesús Alejandro Galván Villarreal
* @author Alejandro Roiz Walss

* @since 2018-08-31
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class KWIC {
    private ArrayList<String> lines;
    
    KWIC(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
    * Metodo que procesa y ordena las lineas de entrada.
    * @return ArrayList<String> las lineas rotadas por cada palabra y ordenadas alfabeticamente.
    */
    ArrayList<String> process() {
        ArrayList<String> orderedLines = new ArrayList<String>();

        for (String line : this.lines) {
            String words[] = line.split("\\s");
            for (int i = 0; i < words.length; i++) {
                orderedLines.add(String.join(" ", Arrays.copyOfRange(words, i, words.length)) + " "
                        + String.join(" ", Arrays.copyOfRange(words, 0, i)));
            }
        }

        orderedLines.sort(String::compareTo);

        return orderedLines;
    }
}