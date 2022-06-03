import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("kyouritu", "maruyama", "syoushin", "kubota", "yannma", "iseki",
                "mitubisi", "takakita", "konnma", "isii", "satake", "yamamoto", "suta-", "nipuro", "kobasi");
//        Ｍが含まれる名前は？
        List<String> result = names.stream().filter(name -> name.contains("m")).toList();
        System.out.println(result);

//        Mから始まる名前の件数は？
        long count = names.stream().filter(name -> name.startsWith("m")).count();
        System.out.println(count);

//        kyourituと含まれる名前はあるのか？　true か falseで返す
        boolean hasKyouritu = names.stream().anyMatch(name -> name.equals("kyouritu"));
        System.out.println(hasKyouritu);

//        nameを大文字にして出力する
//        names.stream().map(name -> name.toUpperCase(Locale.ROOT)).forEach(name -> System.out.println(name));
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
