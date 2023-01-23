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

       //Integer action = Integer.parseInt(String.valueOf(score));
        double action = Math.ceil(score);
        // javac .\Main.java
        // java Main
        switch ((int)action) {    // Math.ceil(a) | Math.floor(a)
            case 5:
                System.out.println("This text should be understood by 5-6 year-olds." + " " + "For Kindergarten");
                break;
            case 6:
                System.out.println("This text should be understood by 6-7 year-olds." + " " + "For First/Secind Grade");
                break;
            case 7:
                System.out.println("This text should be understood by 7-9 year-olds." + " " + "For Third Grade");
                break;
            case 9:
                System.out.println("This text should be understood by 9-10 year-olds." + " " + "For Fourth Grade");
                break;
            case 10:
                System.out.println("This text should be understood by 10-11 year-olds." + " " + "For Fifth Grade");
                break;
            case 11:
                System.out.println("This text should be understood by 11-12 year-olds." + " " + "For Sixth Grade");
                break;
            case 12:
                System.out.println("This text should be understood by 12-13 year-olds." + " " + "For Seventh Grade");
                break;
            case 13:
                System.out.println("This text should be understood by 13-14 year-olds." + " " + "For Eighth Grade");
                break;
            case 14:
                System.out.println("This text should be understood by 14-15 year-olds." + " " + "For Ninth Grade");
                break;
            case 15:
                System.out.println("This text should be understood by 15-16 year-olds." + " " + "For Tenth Grade");
                break;
            case 16:
                System.out.println("This text should be understood by 16-17 year-olds." + " " + "For Eleventh Grade");
                break;
            case 17:
                System.out.println("This text should be understood by 17-18 year-olds." + " " + "For Twelfth Grade");
                break;
            case 18:
                System.out.println("This text should be understood by 18-24 year-olds." + " " + "For College Student");
                break;
            case 19:
                System.out.println("This text should be understood by 18-24 year-olds." + " " +  "For College Student");
                break;
            case 20:
                System.out.println("This text should be understood by 18-24 year-olds." +  " " + "For College Student");
                break;
            case 21:
                System.out.println("This text should be understood by 18-24 year-olds." + " " +  "For College Student");
                break;
            case 22:
                System.out.println("This text should be understood by 18-24 year-olds." + " " +  "For College Student");
                break;
            case 23:
                System.out.println("This text should be understood by 18-24 year-olds." + " " +  "For College Student");
                break;
            case 24:
                System.out.println("This text should be understood by 24+ year-olds." + " " +  "For Professor");
                break;
            default:
                System.out.println("Not statement");
        }
    }
}


            /*case (score > 5 & score < 6):
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
                System.out.println("Not");*/
