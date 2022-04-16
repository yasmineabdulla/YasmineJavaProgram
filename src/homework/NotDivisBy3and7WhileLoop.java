// 3. Write a program to print numbers that are not divisible by 3 and divisible by 7 1-50

package homework;
public class NotDivisBy3and7WhileLoop {

    public static void main(String[] args) {

        int a = 1;

        while(a <= 50){
            if( a%3 != 0 && a%7 == 0 ) {
                System.out.println(a);
                a++;
            }else{
                a++;
            }
            }

        }

    }



