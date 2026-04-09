import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String str = """
                1Водитель Повар? Строитель. 
                Фотограф Учитель! Врач Спасатель2 Программист 
                Писатель, Дизайнер3""";

        List<String> strings = List.of(str.split("[ \n]"));

        System.out.println("Список строк:");
        for (String s : strings){
            System.out.println(s);
        }

        List<String> result = filter(strings);
        System.out.println("Строки после фильтрации:");
        for (String s : result){
            System.out.println(s);
        }
    }

    public static List<String> filter(List<String> list){
        System.out.println("Отфильтруем строки без цифр и символов");
        return list.stream()
                .filter(str -> str.matches("\\p{L}+"))
                .collect(Collectors.toList());
    }
}
