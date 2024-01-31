//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CountFactors {
    public int solution(int N) {
        int count = 0;
        for (int i = 1; i * i < N; i++) {
            if (N % i == 0) {
                if (i == N / i) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        CountFactors obj = new CountFactors();
        System.out.print(obj.solution(10));
    }
}


