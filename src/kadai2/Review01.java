package kadai2;

public class Review01 {

    public static void main(String[] args) {
        int b = 1500; //購入金額
        int tax = tax(b); //消費税
        int sum = b + tax;
        System.out.println(b + "円の商品の税込価格は" + sum +"円（消費税は" + tax + "円)です。");
    }

    public static int tax(int a) {
        double result = (double)a * 0.1;
        return (int)result;
    }
    

}
