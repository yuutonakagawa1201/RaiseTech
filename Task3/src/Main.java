
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String > userMap = new HashMap<>();
        userMap.put("クボタ","創業者：久保田権四郎 設立：１８９０年");
        userMap.put("ヤンマー","創業者：山岡孫吉 設立：１９１２年");
        userMap.put("イセキ","創業者：井関邦三郎 設立：１９２６年");

        System.out.println(userMap.get("クボタ"));
        System.out.println(userMap.get("ヤンマー"));
        System.out.println(userMap.get("イセキ"));

        String [] name = {"共立", "丸山", "昭信"};

        int string = 0;
        try{
            System.out.println(name[string] + "は防除機メーカーです。");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(string + "番目は農業機械メーカーではありません。");
        } finally {
            System.out.println("最終処理です");
        }
    }
}




