import java.util.Scanner;

public class LoginValidation {
    public static void main(String []arg)
    {
        String userName , password;
        System.out.println("set your userName and password");
        System.out.print("userName = ");
        Scanner ip = new Scanner(System.in);
        userName = ip.nextLine();
        System.out.print("\npassword = ");
        password = ip.nextLine();
        System.out.println("\n    longin account ");
        System.out.print("userName = ");
        String userName1 , password1 ;
        userName1 = ip.nextLine();
        System.out.print("\nenter password = ");
        password1 = ip.nextLine();
        if (userName.compareTo(userName1) == 0 && password.compareTo(password1) == 0)
        {
            System.out.println("login sucessfully :");
        }
        else{
            System.out.println("login fail :");
        }
    }
}
