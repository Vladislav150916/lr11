package timus;

import java.util.Scanner;

public class timus_1925 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();

        int sumB = k;
        int sumG = 0;
        int correctAnswer = k - 2;
        for(int i = 0; i < n; i++){
            String str = in.nextLine();
            Scanner sc = new Scanner(str);
            int b = sc.nextInt();
            int g = sc.nextInt();
            sumB += b;
            sumG += g;
            correctAnswer += b - 2;
        }

        if (sumG < correctAnswer){
            System.out.println(correctAnswer - sumG);
        } else {
            System.out.println("Big Bang!");
        }
        in.close();
    }
}