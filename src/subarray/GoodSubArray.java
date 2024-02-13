package subarray;

//Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
//        1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
//2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
//Your task is to find the count of good subarrays in A.


public class GoodSubArray {


        public int solve(int[] A, int B) {
            int GoodArray=0;
            int oevalue=0;
            for(int i=0;i<A.length;i++){
                int sum=0;
                for(int j=i;j<A.length;j++){

                    oevalue=i-j+1;
                    sum+=A[j];
                    if ((oevalue % 2 ==0 && sum < B) || (oevalue %2 !=0 && sum > B)){
                        GoodArray++;

                    }


                }
            }
            return GoodArray;
        }
    public static void main(String args[]){

        int[] A = {16,3,3,6,7,8,17,13,7};
        int B=10;
        //int[] output=new int[B.length];
        GoodSubArray obj=new GoodSubArray();
        var output=obj.solve(A,B);

        System.out.println(output);
    }
    }


