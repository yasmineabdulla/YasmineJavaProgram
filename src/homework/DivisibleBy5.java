//write a code to see if user input data is divisible by 5.

package homework;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see if it is divisible by 5:");
        int a = sc.nextInt();

        if(a % 5 == 0){
            System.out.println("This number is divisible by 5.");
        }else{
            System.out.println("This number is not divisible by 5");
        }
    }
}
