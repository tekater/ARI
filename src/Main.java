import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\score2.txt")));
        String[] words = string.split("[\\s]");
        String characters = String.join("", words);
        String[] sentence = string.split("\\.");

        System.out.println("Words: " + words.length);
        System.out.println("Sentence: " + sentence.length);
        System.out.println("Characters: " + characters.length());

        int ch = characters.length();
        int wo = words.length;
        int sent = sentence.length;

        //double score = 4.71 * characters.length() / words.length + 0.5 * words.length / sentence.length - 21.43;
        double score = 4.71 * ch / wo + 0.5 * wo / sent - 21.43;
        System.out.println("The score is: " + score);

        //double action = scanner.nextDouble();
        switch (score) {    // не знаю как сделать, пытается впихать Boolean
            case (score > 5 & score < 6) :
                System.out.println("Kindergarten");
                break;
            case (score > 6 & score < 7):
                System.out.println("First/Second Grade");
                break;
            case (score > 7 & score < 9):
                System.out.println("Third Grade");
                break;
            case (score > 9 & score < 10):
                System.out.println("Fourth Grade");
                break;
            case (score > 10 & score < 11) :
                System.out.println("Fifth Grade");
                break;
            case (score > 11 & score < 12):
                System.out.println("Sixth Grade");
                break;
            case (score > 12 & score < 13):
                System.out.println("Seventh Grade");
                break;
            case (score > 13 & score < 14):
                System.out.println("Eight Grade");
                break;
            case (score > 14 & score < 15) :
                System.out.println("Ninth Grade");
                break;
            case (score > 15 & score < 16):
                System.out.println("Tenth Grade");
                break;
            case (score > 16 & score < 17):
                System.out.println("Eleventh Grade");
                break;
            case (score > 17 & score < 18):
                System.out.println("Twelfth Grade");
                break;
            case (score > 18 & score < 24):
                System.out.println("College Student");
                break;
            case (score > 24):
                System.out.println("Professor");
                break;
            default:
                System.out.println("Not");
        }
    }
}
