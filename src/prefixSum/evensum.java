package prefixSum;

public class evensum {
        public int[] solve(int[] A, int[][] B) {
            int[] prefixSum = new int[A.length];
            int[] output=new int[B.length];

            prefixSum[0]=A[0];
            for(int i=1;i<A.length;i++){
                if(i%2 == 0)
                    prefixSum[i]=prefixSum[i-1]+A[i];
                else
                    prefixSum[i]=prefixSum[i-1];
            }
            for (int i=0;i<prefixSum.length;i++){
                System.out.println(prefixSum[i]);
            }
            for(int i=0;i< B.length;i++)
                output[i]=(B[i][0] == 0 ? prefixSum[B[i][1]] : prefixSum[B[i][1]]-prefixSum[B[i][0]]);

            return output;

        }

        public static void main(String args[]){

            int[] A = {16,3,3,6,7,8,17,13,7};
            int[][] B = {{2,6},{4,7},{6,7} };
            //int[] output=new int[B.length];
            evensum obj=new evensum();
            var output=obj.solve(A,B);

            for (int i=0;i<output.length;i++){
                System.out.println(output[i]);
            }
        }
    }


