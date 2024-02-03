package prefixSum;

import java.util.Arrays;

//Implement a class in Java
// that supports updating individual elements of an array
// and calculating the sum of elements within a specified range efficiently using prefix sums
public class prefixSumTest {
    private int[] prefixSum;
    private int[] output;

    public int[] solution(int[] A,int[][] B){
        prefixSum=new int[A.length];
        output=new int[B.length];

        prefixSum[0]=A[0];
        for(int i=1;i<A.length;i++){
            prefixSum[i]=prefixSum[i-1]+A[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        for(int i=0;i<B.length;i++)
            output[i]=(B[i][0] == 0 ? prefixSum[B[i][1]] : prefixSum[B[i][1]]-prefixSum[B[i][0]-1]);

        return output;
    }

    public int[] updatePrefixArray(int index,int value){
       int diff = value - prefixSum[index];
       for(int i=index;i<prefixSum.length;i++){
           prefixSum[i]=prefixSum[i]+diff;
       }
       return prefixSum;
    }
    public static void main(String args[]){
        int[] A={1,2,3,4,5,6,7,8};
        int[][] B={{1,2},{0,3},{3,6}};
        prefixSumTest obj=new prefixSumTest();
        var result=obj.solution(A,B);
        var update=obj.updatePrefixArray(0,2);
        System.out.println(Arrays.toString(update));
        System.out.println(Arrays.toString(result));


    }
}
