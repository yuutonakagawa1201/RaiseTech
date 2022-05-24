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
        int index = 3;
        try{
            System.out.println(name[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("配列の範囲を超えています。");
        }
    }
}




