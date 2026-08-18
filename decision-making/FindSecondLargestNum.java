import java.util.Scanner;
class  FindSecondLargestNum
{
    public static  void main (String[] arg ){
        int num1 , num2, num3 ,secondMax;
        System.out.println("enter 3 different number = ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sc.close();
        if(num1 > num2 && num1 > num3){
           if(num2 > num3){
               secondMax = num2 ;
           }
           else {
               secondMax = num3 ;
           }
       }
       else if(num2 > num3 && num2 > num1){
           if(num1 > num3){
               secondMax = num1 ;
           }
           else {
               secondMax = num3 ;
           }
       }
       else {
               if(num1 > num2){
                   secondMax = num1;
               }
               else {
                   secondMax = num2;
               }
       }
       System.out.println("2nd largest number is = "+ secondMax );
    }
}