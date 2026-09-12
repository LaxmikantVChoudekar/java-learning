import java.io.*;
import java.util.Scanner;
class StudentMarksAnalizer{
    static void  main(String []arg)
    {
        int numOfStudent ;
        final int totalSub =5;
        String sub[]= new String[totalSub];
        System.out.println("enter number of students ");
        
        Scanner sc = new Scanner(System.in);
        numOfStudent = sc.nextInt();

        int classdata [][] = new int[numOfStudent] [totalSub];

        System.out.println("enter sub names ");
        for (int i = 0 ; i <totalSub ; i++){
            sub[i] = sc.next();
        }

        System.out.print("enter sudents marks ");
        for (int i=0 ; i<numOfStudent; i++)
        {
            System.out.println("roll no. "+(i+1));
            for(int j=0 ; j<totalSub ; j++  ){
                System.out.println(sub[j] +" = " );
                classdata[i][j] = sc.nextInt();
            }
        }

        int totalMarks[] = new int[numOfStudent];
        float percentage[]= new float[numOfStudent];

        for (int i = 0; i <numOfStudent; i++){
            for(int j =0 ; j<totalSub; j++){
                totalMarks[i]+= classdata[i][j]; 
            }
            percentage[i]= totalMarks[i]/totalSub;
        }

         char grade[] = new char [numOfStudent];
         for(int i = 0 ; i<numOfStudent; i++ ){
           if(percentage[i] >80){
            grade[i] = 'O';
           }
           else if(percentage[i] > 60){
            grade[i] =  'A';
           }
           else if(percentage[i] >= 35){
            grade[i] = 'P';
           }
           else {
            grade[i]= 'f';
           }
        } 
    
    }
}