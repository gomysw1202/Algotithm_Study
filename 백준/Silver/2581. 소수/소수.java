import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = N;
        label : for (int i = M; i <= N; i++) {
            if(i==1){
                continue;
            }
            for(int j=2; j<i; j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            sum += i;
            if(min>i) {
                min = i;
            }
        }

        if( sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum+"\n"+min);
    }
}