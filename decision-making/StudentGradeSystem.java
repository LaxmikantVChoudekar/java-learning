import java.util.Scanner;

public class StudentGradeSystem {
    public  static  void main(String []arg){
        int marks; char grade='F';
        System.out.print("enter marks of student = ");
        Scanner ip=new Scanner(System.in);
        marks = ip.nextInt();
        ip.close();
        // cheching input are valid or not
        if (marks < 0 || marks > 100){
            System.out.print(" invalid input ");
        }
        else {
            if(marks >= 90){
                grade = 'A';
            }
            else if(marks >= 80){
                grade = 'B';
            }
            else if(marks >= 70){
                grade = 'C';
            }
            else if(marks >= 60){
                grade = 'D';
            }
            System.out.print("grade of student are = '"+grade+"'");
        }
    }
}
