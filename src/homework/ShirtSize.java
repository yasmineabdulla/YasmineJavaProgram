/* Challenge:
2.  Write a program to get T-shirt size in inches and print size based on inches
If inches is 27 to 30 Print XS
If inches is 31 to 34 Print S
If inches is 35 to 38 Print L
If inches is 39 to 42 Print XL
If inches is 45 to 50 Print XXL
 */

package homework;
import java.util.Scanner;
public class ShirtSize {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shirt size in inches:");
        int size = sc.nextInt();

        if (size >= 27 && size <= 30){
            System.out.println("XS");
        }else if (size >= 31 && size <= 34){
            System.out.println("S");
        }else if (size >= 35 && size <= 38){
            System.out.println("L");
        }else if (size >= 39 && size <= 42){
            System.out.println("XL");
        }else {
            System.out.println("XXL");
        }



    }
}
