import java.io.*;
import java.util.Scanner;
class StudentMarksAnalizer {
    public static void main(String[] arg) {
        int numOfStudent;
        final int totalSub = 5;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number of students ");
            numOfStudent = sc.nextInt();
            if (numOfStudent <= 0) {
                System.out.println("xxxxxxx      Wrong input     xxxxxxxxxx\n");
            }
        } while (numOfStudent <= 0);

        String sub[] = new String[totalSub];
        System.out.println("Enter subject names ");
        for (int i = 0; i < totalSub; i++) {
            sub[i] = sc.next();
        }
        System.out.println();

        char grade[] = new char[numOfStudent];
        int classdata[][] = new int[numOfStudent][totalSub];
        System.out.print("Enter student marks \n");
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("Roll No. " + (i + 1));
            for (int j = 0; j < totalSub; j++) {
                System.out.print(sub[j] + " = ");
                classdata[i][j] = sc.nextInt();
                if (classdata[i][j] < 35) {
                    grade[i] = 'F';
                }
            }
            System.out.println();
        }

        int totalMarks[] = new int[numOfStudent];
        float percentage[] = new float[numOfStudent];

        for (int i = 0; i < numOfStudent; i++) {
            for (int j = 0; j < totalSub; j++) {
                totalMarks[i] += classdata[i][j];
            }
            percentage[i] = (float) totalMarks[i] / totalSub;
        }

        for (int i = 0; i < numOfStudent; i++) {
            if (grade[i] != '\u0000') {
                continue;
            }
            if (percentage[i] > 80) {
                grade[i] = 'O';
            } else if (percentage[i] > 60) {
                grade[i] = 'A';
            } else if (percentage[i] >= 35) {
                grade[i] = 'P';
            }
        }

        int numOfPass = 0, numOfFail = 0;
        float highestPer = percentage[0];
        float lowestPer = percentage[0];
        float classAve = 0;
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("Roll No. " + (i + 1) + ", Total = " + totalMarks[i] + ", Percentage = " + percentage[i] + "% , Grade = " + grade[i]);
            classAve += percentage[i];
            if (percentage[i] > highestPer) {
                highestPer = percentage[i];
            } else if (percentage[i] < lowestPer) {
                lowestPer = percentage[i];
            }
            if (grade[i] == 'F') {
                numOfFail++;
            } else {
                numOfPass++;
            }
        }
        System.out.println();
        classAve = classAve / numOfStudent;
        System.out.println("Class average = " + classAve);
        System.out.println("Class highest percentage = " + highestPer + "%");
        System.out.println("Class lowest percentage = " + lowestPer + "%");
        System.out.println("Number of passed students = " + numOfPass);
        System.out.println("Number of failed students = " + numOfFail);
    }
}
