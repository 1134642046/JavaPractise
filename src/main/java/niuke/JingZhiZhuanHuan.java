package niuke;

import java.util.Scanner;

public class JingZhiZhuanHuan {

    public static int[] countWays(long n, int k){
        int[] result = new int[65];
        int count = 0;
        while (n!=0){
            int a = (int)(n%k);
            result[++count] = a;
            n/=k;
        }
        result[0] = count;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int k = in.nextInt();
        int[] result = countWays(n,k);
        if (result[0] == 0){
            System.out.print(0);
        }else {
            for (int i = result[0]; i > 0; i--) {
                System.out.print(result[i]);
            }
        }
    }
}
