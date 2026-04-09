import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        Random r = new Random();
        System.out.println("Массив до фильтрации:");
        for (int i = 0; i < size; i++){
            integers.add(r.nextInt(200));
            System.out.println(integers.get(i));
        }

        System.out.println("Введите число, на которое будем делить без остатка");
        int num = in.nextInt();
        List<Integer> result = filter(integers, num);

        System.out.printf("Числа, которые делятся на %d без остатка:\n", num);
        for (Integer i : result){
            System.out.println(i);
        }
        if (result.isEmpty()){
            System.out.println("Нет таких чисел");
        }
    }

    public static List<Integer> filter(List<Integer> list, int num){
        return list.stream()
                .filter(i -> i % num == 0)
                .collect(Collectors.toList());
    }
}
