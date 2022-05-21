import java.util.List;

public class Main {

    public static <list> void main(String[] args) {

        Machine kubota = new Machine("クボタ", "６条コンバイン", 20935200);
        Machine yanmar = new Machine("ヤンマー", "６条コンバイン", 15750000);
        Machine iseki = new Machine("イセキ", "６条コンバイン", 15650000);


        System.out.println(kubota.getName() + kubota.getType() + "の価格は" + kubota.getPrice() + "円です。");
        kubota.setType("８条田植機");
        kubota.getPrice(5232500);

        System.out.println(yanmar.getName() + yanmar.getType() + "の価格は" + yanmar.getPrice() + "円です。");
        yanmar.setType("８条田植機");
        yanmar.getPrice(5120500);

        System.out.println(iseki.getName() + iseki.getType() + "の価格は" + iseki.getPrice() + "円です。");
        iseki.setType("７条田植機");
        iseki.getPrice(3036000);


        System.out.println(kubota.getName() + kubota.getType() + "の価格は" + kubota.getPrice() + "円です。");
        System.out.println(yanmar.getName() + yanmar.getType() + "の価格は" + yanmar.getPrice() + "円です。");
        System.out.println(iseki.getName() + iseki.getType() + "の価格は" + iseki.getPrice() + "円です。");


        if (kubota.getName().equals("クボタ")) {
            System.out.println("国内シェア率１位です。");
        }else if(kubota.getName().equals("ヤンマー")){
            System.out.println("国内シェア率２位です。");
        } else if (kubota.getType().equals("イセキ")) {
            System.out.println("国内シェア率３位です。");
        }else {
            System.out.println("TOP３に入っていません。");
        }


        List<Machine> machinelist =List.of(
                new Machine("クボタ", "オレンジ",1),
                new Machine("ヤンマー", "アカ",2),
                new Machine("イセキ", "アオ", 3));
        for (Machine machine : machinelist){
            System.out.println("農機具メーカー " + machine.getName());
            System.out.println("特徴的な色 " + machine.getType());
        }




    }
}