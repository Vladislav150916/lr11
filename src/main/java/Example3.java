import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = """
                Напишите функцию, Которая принимает на вход список
                строк и возвращает Новый список, содержащий Только те строки,
                которые Начинаются с большой буквы
                """;
        List<String> strings = List.of(str.split(" "));
        System.out.println("Строка после сплитования :");
        for (String s : strings){
            System.out.println(s);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\nСтрока после преобразования :");
        for (String s : stringsAfter){
            System.out.println(s);
        }

    }

    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream()
                .filter(str -> Character.isUpperCase(str.charAt(0)))
                .collect(Collectors.toList());
    }
}
