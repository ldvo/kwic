import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class KWIC {
    private ArrayList<String> lines;

    KWIC(ArrayList<String> lines) {
        this.lines = lines;
    }

    ArrayList<String> process() {
        TreeMap<String, String> orderedLines = new TreeMap<>();

        for (String line : this.lines) {
            String words[] = line.split("\\s");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                orderedLines.put(word, String.join(" ", Arrays.copyOfRange(words, i, words.length)) + " "
                        + String.join(" ", Arrays.copyOfRange(words, 0, i)));
            }
        }

        return new ArrayList<String>(orderedLines.values());
    }
}