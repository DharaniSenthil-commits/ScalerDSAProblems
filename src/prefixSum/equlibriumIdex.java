package prefixSum;

public class equlibriumIdex {

        public int solve(int[] A) {
            int[] prefixSum=new int[A.length];
            prefixSum[0]=A[0];
            for (int i=1;i<A.length;i++){
                prefixSum[i]=prefixSum[i-1]+A[i];
            }

            int left,right;
            for(int i=0;i<A.length;i++){
                right=(i == A.length-1 ? 0 : prefixSum[A.length-1] - prefixSum[i]);
                left=(i == 0 ? 0 : prefixSum[i-1]);
                System.out.println(left);
                System.out.println(right);
                if (left == right)
                {
                   return i;
                }

            }
            return -1;
        }

        public static void main(String args[]){
            int[] A={-7, 1, 5, 2, -4, 3, 0};
            equlibriumIdex obj=new equlibriumIdex();
            System.out.println(obj.solve(A));

        }

    }



