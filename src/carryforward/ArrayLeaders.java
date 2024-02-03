package carryforward;

import java.util.Arrays;

public class ArrayLeaders {
        public int[] solve(int[] A) {
            int[] leaders=new int[A.length];
            int max=A[A.length-1];
            int count=0;
            leaders[count++]=A[A.length-1];

            for(int i=A.length-2;i>0;i--){
                if(A[i]>max){
                    max=A[i];
                    leaders[count++]=A[i];

                }

            }
            int[] leads=new int[count];
            for(int i=0;i<count;i++)
                leads[i]=leaders[i];

            return leads;

        }

        public static void main(String args[]){
            int[] A=new int[]{16, 17, 4, 3, 5, 2};
            ArrayLeaders obj= new ArrayLeaders();
            var arr=obj.solve(A);
            System.out.println(Arrays.toString(arr));
        }
    }



