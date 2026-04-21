package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timus_1510 {
    static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int nominal = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(reader.readLine());
            if (count == 0) {
                nominal = K;
                count = 1;
            } else if (K == nominal) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(nominal);
        reader.close();
    }
}