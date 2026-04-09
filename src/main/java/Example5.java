import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        String str = """
                Водитель Повар Строитель 
                Фотограф Учитель Врач Спасатель Программист 
                Писатель Дизайнер""";

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
        System.out.println("Отфильтруем профессии с \"итель\"");
        return list.stream()
                .filter(str -> str.contains("итель"))
                .collect(Collectors.toList());
    }
}
