//input user data: gmail, whatsapp, youtube, skype, hangouts, outlook
// and tell them what company owns that: google, facebook, microsoft

package homework;
import java.util.Scanner;
public class FindCompany {

    public static void main(String[] args) {

        System.out.println("Enter one of the following products and i'll tell you what company it is with: gmail, whatsapp, youtube, skype, hangouts, outlook");

        Scanner sc = new Scanner(System.in);

        String prod = sc.next();

        switch (prod) {
            case "youtube":
            case "hangouts":
            case "gmail":
                System.out.println("Google");
                break;
            case "whatsapp":
                System.out.println("FaceBook");
                break;
            case "Outlook":
            case "skype":
                System.out.println("microsoft");
                break;
            default:
                System.out.println("Try again. Enter one of the products.");
                break;


        }
    }
}

