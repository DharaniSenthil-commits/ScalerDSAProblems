package subarray;
import java.lang.*;
import java.util.*;

public class printsumsubarray {

    public class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[] inputArray=new int[N];
            for(int i=0;i<N;i++){
                inputArray[i]=sc.nextInt();
            }

            for(int i=0;i<N;i++){
                int sum=0;
                for(int j=i;j<N;j++){
                    sum+=inputArray[j];
                    System.out.print(sum);
                    System.out.print(" ");

                }




            }


        }
    }

}
