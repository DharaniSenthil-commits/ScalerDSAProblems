package carryforward;

public class subsequenceAG {
        public long solve(String A) {
            long a_count=0;
            long g_count=0;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i) == 'A')
                    a_count++;
                if(A.charAt(i) == 'G')
                    g_count = g_count+a_count;

            }
            return g_count;

        }
        public static void main(String args[]){
            String A="AGAAAAGGG";
            subsequenceAG obj=new subsequenceAG();
            System.out.println(obj.solve(A));
        }
    }


