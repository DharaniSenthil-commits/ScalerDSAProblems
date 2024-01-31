package prefixSum;

public class prefixSumBasic {

        public long[] rangeSum(int[] A, int[][] B) {
            long[] prefixSum=new long[A.length];
            long[] output=new long[B.length];
            prefixSum[0]=A[0];
            for (int i=1;i<A.length;i++){
                prefixSum[i]=prefixSum[i-1]+A[i];

            }

            for (int i=0;i<B.length;i++){
                output[i]=prefixSum[B[i][1]] - (B[i][0] > 0 ? prefixSum[B[i][0]-1] : 0);

            }
            return output;
        }

        public static void main(String args[]){
            int[] A={1,2,3,4,5};
            int[][] B={{0,3},{1,2}};
            prefixSumBasic obj=new prefixSumBasic();
            var output=obj.rangeSum(A,B);
            for(int i=0;i<output.length;i++)
                System.out.println(output[i]);
        }
    }


