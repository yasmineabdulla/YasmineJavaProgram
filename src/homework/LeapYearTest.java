// get user data and tell them if that year is a loop year


package homework;
import java.util.Scanner;
public class LeapYearTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a year to check if it is a Leap Year:");

        int a = sc.nextInt();

        if (a % 4 == 0){
            System.out.println("This year is a leap year!");
        }else{
            System.out.println("This year is not a lear year.");
        }

    }
}
