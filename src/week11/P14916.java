package week11;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (n<=0) {
                break;
            }
            if (n==1) {
                cnt=-1;
                break;
            }
            if (n%5==0) {
                n-=5;
                cnt++;
            } else {
                n-=2;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
