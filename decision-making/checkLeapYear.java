import java.util.Scanner;

public class checkLeapYear {
    public static void main (String [] arg )
    {
        int year;
        boolean isLeapYear = false;
        System.out.print("enter year = ");
        Scanner ip = new Scanner(System.in);
        year = ip.nextInt();
        if(year%4==0)
        {
            isLeapYear = true;
            if(year%100==0)
            {
                isLeapYear = false;
                if(year%400==0)
                {
                    isLeapYear = true;
                }
            }
        }

      if (isLeapYear)
      {
          System.out.print("Yes , "+ year + " is leap year. ");
      }
      else {
          System.out.print("No , "+ year + " is not leap year. ");
      }
    }
}
