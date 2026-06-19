import java.util.Scanner;


public class ElectricityBillCla {
    public static void main(String[] args) {
    int unit, bill=0;
    System.out.print("enter electricity unit ");
    Scanner ip = new Scanner(System.in);
    unit = ip.nextInt();
    ip.close();
      if (unit < 0 ) {
        System.out.println("electricity unit can not be negative " );
      }
     //up to 100 unit rate 5 rupee   
    else if(unit <=100){
        bill = unit * 5;
    }
      //next  100 unit rate 7 rupee   
    else if (unit > 100 && unit<=200)
    {
        bill = (100 * 5) + ( unit -100 ) *7;
    }
        // next unit rate 10 ruoee
    else {
        bill = (100 * 5) + ( 100 * 7) + (unit -200) *10;
    }
     System.out.println("Electricity Bill: ₹" + bill);
  }
} 
