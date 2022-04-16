package homework;
import java.util.Scanner;
public class CheckIfVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase letter to check if it's a constanant or vowelk");
        String letter = sc.next();

        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("You have entered a vowel");
                break;
            default:
                System.out.println("You have entered a constanant");
                break;
        }
    }
}
