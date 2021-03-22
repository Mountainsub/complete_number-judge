import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n[];
        n = new int[1000];
        for(int i = 0;i < num;i++){
            n[i] = sc.nextInt();           //入力した数の個数分、数値を代入する
            }
        for(int j = 0;j < num;j++){
            if(isPerfectNumber(n[j])){   //メソッドに代入して、完全数⇒perfectと出力
            System.out.println("perfect");
        } else{
            System.out.println("no");  //完全数でない⇒noと出力
        }
        }
    }
    //呼び出し元のメソッド、完全数かどうか判定
    static boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1; i<= n /2;i++){ //それ自体を除き約数はn/2以下
            if(n % i ==0){           //剰余算で約数かどうかを判定
                sum += i;           //約数⇒sumに代入
            }
        }
        if(sum == n){           //sumがnなら完全数
            return true;
        } else {
            return false;
        }
    }
}
