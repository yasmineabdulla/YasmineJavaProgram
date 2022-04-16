/*Write a program to take username and password from user and print appropriate message
based on below conditions
    1. If username correct and password correct ---> Login successful
	2. If username correct and password incorrect --> Invalid password
	3. If username incorrect and password correct --> Invalid username
	2. If username incorrect and password incorrect --> Login unsuccessful
*/

package homework;
import java.util.Scanner;
public class UsernameAndPassword {

    public static void main(String[] args) {

        String userName = "Username";
        String passWord = "Password";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username:");
        String inputUser = sc.next();
        System.out.println("Enter Password:");
        String inputPass = sc.next();

        if (userName.equals(inputUser)){
            if (passWord.equals(inputPass)){
                System.out.println("Login Successful");
            }else{
                System.out.println("Invalid Password");
            }
        }else {
            if (passWord.equals(inputPass)){
                System.out.println("Invalid username");
            }else {
                System.out.println("Login Unsuccessful");
            }
        }

        }
    }

