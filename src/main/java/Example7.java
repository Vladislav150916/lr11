import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = """
                Водитель Повар Строитель 
                Фотограф Учитель Врач Спасатель Программист 
                Писатель Дизайнер""";

        List<String> strings = List.of(str.split("[ \n]"));

        System.out.println("Список строк:");
        for (String s : strings){
            System.out.println(s);
        }
        System.out.println("\nВведите длину строки, по которой нужно отфильтровать:");
        int length = in.nextInt();

        List<String> result = filter(strings, length);
        System.out.println("Строки после фильтрации:\n");
        for (String s : result){
            System.out.println(s);
        }
    }

    public static List<String> filter(List<String> list, int length){
        System.out.println("Отфильтруем строки длиннее " + length);
        return list.stream()
                .filter(str -> str.length() > length)
                .collect(Collectors.toList());
    }
}
