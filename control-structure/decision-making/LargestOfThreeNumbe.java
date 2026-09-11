import java.util.Scanner;

public class LargestOfThreeNumbe {
    public  static void main(String []arg)
    {
        int number1 , number2 , number3 , largestInt;
        System.out.print("enter any three numbers = ");
        Scanner ip = new Scanner(System.in);
        number1=ip.nextInt();
        number2=ip.nextInt();
        number3=ip.nextInt();
        if(number1>number2 && number1>number3){
            largestInt = number1;
        }
        else if(number2> number3)
        {
            largestInt = number2;
        }
        else {
            largestInt = number3;
        }

    }
}
