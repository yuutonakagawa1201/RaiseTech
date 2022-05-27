import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, String> founding = new HashMap<>();
        founding.put("クボタ", "創業者：久保田権四郎 設立：１８９０年");
        founding.put("ヤンマー", "創業者：山岡孫吉 設立：１９１２年");
        founding.put("イセキ", "創業者：井関邦三郎 設立：１９２６年");

//        System.out.println(founding.get("クボタ"));
//        System.out.println(founding.get("ヤンマー"));
//        System.out.println(founding.get("イセキ"));

        for(Map.Entry<String, String> entry : founding.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }


        founding.forEach((k , v) -> {
            System.out.println(k + v);
        });


        String [] name = {"共立", "丸山", "昭信"};

        int i = 3;
        try{
            System.out.println(name[i] + "は防除機メーカーです。");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(i + "番目は農業機械メーカーではありません。");
        } finally {
            System.out.println("最終処理です");
        }

        List<String> maker = new ArrayList<>();
        maker.add("共立");
        maker.add("丸山");
        maker.add("昭信");

    }
}




