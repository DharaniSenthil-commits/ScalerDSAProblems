package prefixSum;

public class oddsum {
           public int[] solve(int[] A, int[][] B) {
            int[] prefixSum=new int[A.length];
            int[] output = new int[B.length];

            prefixSum[0]=0;
            for (int i=1;i<A.length;i++){
                if(i%2 != 0 )
                    prefixSum[i]=prefixSum[i-1]+A[i];
                else
                    prefixSum[i]=prefixSum[i-1];
            }

            for(int i=0;i<B.length;i++){
                output[i]=(B[i][0] == 0 ? prefixSum[B[i][1]] : prefixSum[B[i][1]]-prefixSum[B[i][0]-1]);
            }
            return output;
        }

        public static void main(String args[]){
               int[] A={1, 2, 3, 4, 5};
               int[][] B={{0,2},{1,4}};
               oddsum obj=new oddsum();
               var output=obj.solve(A,B);
               for(int i=0;i< output.length;i++) {
                   System.out.println(output[i]);
               }
        }
    }


