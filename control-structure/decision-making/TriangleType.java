import java.util.Scanner;

public class TriangleType {
    public static void main(String []arg )
    {
        int side1 ,side2 ,side3;
        System.out.println("enter length of 3 sides  of triengle ");
        Scanner ip = new Scanner(System.in);
        side1 = ip.nextInt();
        side2 = ip.nextInt();
        side3 = ip.nextInt();
        ip.close();
        if(!(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2 ))
        {
            System.out.println("invalid input .");
        }
        else if  (side1 == side2 && side1 == side3)
        {
            System.out.println("on given side length the thriengle is Equilateral ");
        }
        else if (side1 == side2 || side1 ==side3 || side2 == side3 )
       {
            System.out.println("on given side length the thriengle is Isosceles ");
       }
        else {
            System.out.println("on given side length the thriengle is Scalene ");
        }
    }
}
