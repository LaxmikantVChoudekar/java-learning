import java.util.Scanner;
public class checkNumber {
    public static void main (String []arg){
        int number;
        System.out.print("enter any number = ");
        Scanner ip = new Scanner(System.in);
        number = ip.nextInt();
        ip.close();
        if(number < 0)
        {
            System.out.print("given number are negative .");
        }
        else if(number > 0)
        {
            System.out.print("given number are positive .");
        }
        else {
            System.out.print("given number are zero .");
        }
    }
}
