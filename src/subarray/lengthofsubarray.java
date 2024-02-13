package subarray;

import java.util.Arrays;

public class lengthofsubarray {

        public int[] solve(int[] A, int B, int C) {
            int SubArrayLength=C-B+1;
            int[] SubArray=new int[SubArrayLength];
            for(int i=B,j=0;i<=C;i++,j++){
                SubArray[j]=A[i];
            }
            return SubArray;
        }

        public static  void main(String args[]){
            int[] A={1,2,3,4,5,6};
            int B=0;
            int C=4;
            lengthofsubarray obj=new lengthofsubarray();
            int[] output=obj.solve(A,B,C);
            System.out.println(Arrays.toString(output));
        }
    }


