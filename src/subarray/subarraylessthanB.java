package subarray;

public class subarraylessthanB {

        public int solve(int[] A, int B) {

            int SubArray=0;

            for(int i=0;i<A.length;i++){
                int sum=0;
                for(int j=i;j<A.length;j++){
                    sum+=A[j];
                    if (sum < B)
                        SubArray++;


                }
            }
            return SubArray;
        }

    public static void main(String args[]){

        int[] A = {16,3,3,6,7,8,17,13,7};
        int B=10;
        //int[] output=new int[B.length];
        subarraylessthanB obj=new subarraylessthanB();
        var output=obj.solve(A,B);

        System.out.println(output);
    }
    }


