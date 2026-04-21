package timus;

import java.util.Scanner;

public class timus_1370 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }

        while (M >= array.length){
            M -= array.length;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++){
            if (M < array.length){
                result.append(array[M]);
            } else {
                M = 0;
                result.append(array[M]);
            }
            M++;
        }
        System.out.println(result);
        in.close();
    }
}