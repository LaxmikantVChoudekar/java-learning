import java.util.Scanner;

public class ArrayAnalyzer {
    int[] array ;
    int inPutSize, sum  ,largestNum ;
    ArrayAnalyzer(int size){
        inPutSize = size;
        array =new int[inPutSize];
        System.out.println("enter numbers ");
        Scanner sc1 =new Scanner(System.in);
        for (int i= 0 ; i<inPutSize; i++){
            array[i]=sc1.nextInt();
        }
    }

    int smollestNum(){
        int smollNum =array[0];
        for (int i = 1 ; i < array.length ; i++){
            if (array[i]<smollNum) {
                smollNum = array[i];
            }
        }
        return smollNum;
     }

     int largestNum(){
        largestNum = array[0];
        for (int item : array){
            if(largestNum < item)
            {
                largestNum =item;
            }
        }
        return largestNum;
     }

     int secondLargNum(){
        int secondLargNum =-99999999;
        for(int item : array){
            if (item >secondLargNum && item != largestNum){
                secondLargNum =item;
            }
        }
        return secondLargNum;
     }

     int sum (){
        sum=0;
       for(int item : array){
           sum += item;
       }
        return sum;
     }

     float ave(){
        return (float) sum/ array.length;
     }

     boolean isAssending() {
         boolean isAssending =true;
         for (int i=0 ; i<array.length-1; i++){
             if(array[i]>array[i+1] && array[i]!=array[i+1]){
                 isAssending = false;
                 break;
             }
         }
         return isAssending;
     }
    int  larOccurs (){
        int i =0;
        for (int item : array){
            if (item == largestNum){
                i++;
            }
        }
        return  i;
    }

    public static void main(String[] args) {
      int inPutSize ;
      System.out.println("enter size of input ");
      Scanner sc =new Scanner(System.in);
      inPutSize = sc.nextInt();
      while (inPutSize<=0){
          System.out.println("  \twrong input  \n\t reenter  ");
          inPutSize = sc.nextInt();
      }
      ArrayAnalyzer arrayAn = new ArrayAnalyzer(inPutSize);

      int smollestNUm = arrayAn.smollestNum();
      int largestNum = arrayAn.largestNum();
      int secondLargNum = arrayAn.secondLargNum();
      int sum = arrayAn.sum();
      boolean isAssending = arrayAn.isAssending();
      float ave = arrayAn.ave();
      int larOcccurs = arrayAn.larOccurs();
      System.out.println("largest = " + largestNum);
      System.out.println("smallest = " + smollestNUm);
      System.out.println("second largest = "+ secondLargNum );
      System.out.println("largest occurs = "+ larOcccurs +" times");
      System.out.println("sum = "+ sum);
      System.out.println("average = "+ave);
      System.out.println("sorted ascending = " +isAssending);
    }
}
