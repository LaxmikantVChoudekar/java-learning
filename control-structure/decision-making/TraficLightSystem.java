import java.util.Scanner;
public class TraficLightSystem {
    public static void main(String[]arg ) {
        String traficColor ;
        System.out.print("enter trafic light collor ");
        Scanner ip =new Scanner(System.in);
        traficColor = ip.next();
        ip.close();
        switch (traficColor){
            case  "Red":
                System.out.println("Stop");
                break;
            case "Yellow" :
                System.out.println("Prepare to stop");
                break;
            case "Green" :
                System.out.println("Go");
                break;
            default:
                System.out.println("Ivalid input ");
        }
    }
}
