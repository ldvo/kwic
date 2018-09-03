import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inputLines = IOLines.readInput();
        KWIC kwic = new KWIC(inputLines);
        ArrayList<String> outputLines = kwic.process();
        IOLines.outputLines(outputLines);
    }
}