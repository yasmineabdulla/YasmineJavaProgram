/*3. Write a program to take number from user and check if it's divisible by 5 or 3 */

package homework;
import java.util.Scanner;
public class DivisibleBy5or3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();

        if(a%5 == 0 || a%3 == 0){
            System.out.println("Divisible by either 5 or 3");
        }else {
            System.out.println("Not divisible by 3 or 5");
        }
    }

}
