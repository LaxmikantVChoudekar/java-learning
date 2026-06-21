import java.util.Scanner;

public class TriangleType {
    public static void main(String []arg )
    {
        int side1 ,side2 ,side3;
        System.out.print("enter length of 3 sides  of triengle ");
        Scanner ip = new Scanner(System.in);
        side1 = ip.nextInt();
        side2 = ip.nextInt();
        side3 = ip.nextInt();
        if  (side1 == side2 && side1 == side3)
        {
            System.out.print("on given side length the thriengle is Equlaterl ");
        }
        else if (side1 == side2 || side1 ==side3 || side2 == side3 )
       {
            System.out.print("on given side length the thriengle is Isosceles ");
       }
        else {
            System.out.print("on given side length the thriengle is Scalene ");
        }
    }
}
