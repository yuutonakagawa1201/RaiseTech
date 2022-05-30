import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, String> companyHistoryByName = new HashMap<>();
        companyHistoryByName.put("クボタ", "創業者：久保田権四郎 設立：１８９０年");
        companyHistoryByName.put("ヤンマー", "創業者：山岡孫吉 設立：１９１２年");
        companyHistoryByName.put("イセキ", "創業者：井関邦三郎 設立：１９２６年");


        for(Map.Entry<String, String> entry : companyHistoryByName.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }


        companyHistoryByName.forEach((k , v) -> {
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

        List<String> makers = new ArrayList<>();
        makers.add("共立");
        makers.add("丸山");
        makers.add("昭信");

        for(i =0; i <makers.size(); i++) {
            System.out.println("防除機メーカーは" + makers.get(i) + "です。");
        }
    }
}




