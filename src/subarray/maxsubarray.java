package subarray;

import prefixSum.evensum;

public class maxsubarray {
    public long maxmium(long x,long y){
            return ( x>y ? x : y);
        }

        public long solve(int[] A) {
            long curMax=A[0];
            long AllMax=A[0];

            for(int i=1;i<A.length;i++){
                curMax=maxmium(A[i],curMax+A[i]);
                AllMax=maxmium(AllMax,curMax);
                if(curMax < 0)
                    curMax=0;

            }
            return AllMax;
        }

    public static void main(String args[]){

        int[] A = {16,3,3,6,7,8,17,13,7};
        //int[] output=new int[B.length];
        maxsubarray obj=new maxsubarray();
        var output=obj.solve(A);

        System.out.println(output);
    }
    }


