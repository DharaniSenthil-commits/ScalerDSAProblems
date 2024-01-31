package prefixSum;

public class evencount {

        public int[] solve(int[] A, int[][] B) {
            int[] prefixSum=new int[A.length];
            int[] output=new int[B.length];

            prefixSum[0]=(A[0]%2 == 0 ? 1 : 0 );
            //System.out.println(prefixSum[0]);
            for(int i=1;i<A.length;i++)
            {
                if (A[i]%2 == 0) {
                    prefixSum[i] = prefixSum[i - 1] + 1;
                    //System.out.println("even");
                }
                else {
                    prefixSum[i] = prefixSum[i - 1];
                    //System.out.println("odd");
                }


            }

            for (int i=0;i<prefixSum.length;i++){
                System.out.println(prefixSum[i]);
            }
            for(int i=0;i<B.length;i++)
            {
                output[i]= (B[i][0] == 0 ? prefixSum[B[i][1]] : prefixSum[B[i][1]]-prefixSum[B[i][0] - 1]);
            }

            return output;
        }

        public static  void main(String args[]){
            int[] A = {2, 1, 8, 3, 9, 6};
            int[][] B = { {0, 3}, {3, 5}, {1, 3}, {2, 4} };
            //int[] output=new int[B.length];
            evencount obj=new evencount();
            var output=obj.solve(A,B);

            for (int i=0;i<output.length;i++){
                System.out.println(output[i]);
            }
        }
    }


