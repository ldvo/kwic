import java.util.Scanner;
import java.util.ArrayList;

public class IOLines {
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

    static void outputLines(ArrayList<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}