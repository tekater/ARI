import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {

        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\text.txt")));
        Scanner scanner = new Scanner(string);
        String[] Words = string.split("");

        }
    }
