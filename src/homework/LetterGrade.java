/* challenge:
Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
If marks are from 90 to 100 Print A
If marks are from 80 to 89 Print B
If marks are from 70 to 79 Print C
If marks are from 60 to 69 Print D
If marks are from 50 to 59 Print E
If marks are from 0 to 49 Print Fail
 */
package homework;
import java.util.Scanner;
public class LetterGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numerical grade:");
        int grade = sc.nextInt();

        if (grade >= 0 && grade <= 49){
            System.out.println("You failed");
        }else if (grade >= 50 && grade <= 59){
            System.out.println("E");
        }else if (grade >= 60 && grade <= 69){
            System.out.println("D");
        }else if (grade >= 70 && grade <= 79){
            System.out.println("C");
        }else if (grade >= 80 && grade <= 89){
            System.out.println("B");
        }else {
            System.out.println("A");
        }

    }
}
