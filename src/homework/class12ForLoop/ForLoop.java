//============= homework ===============
//Find out the result of the below series
//1 *  2 * 3 * 4 * 5
package homework.class12ForLoop;
public class ForLoop {

    public static void main(String[] args) {

        int sum = 1;
        for(int i = 1; i<=5; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
