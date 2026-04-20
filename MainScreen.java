
import java.util.ArrayList;
import java.util.Scanner;

/*
メイン画面
・商品一覧の表示
・在庫不足一覧の表示
 */

public class MainScreen {
    public static void main() {
        System.out.println("在庫管理システムへようこそ！");
        // 商品一覧の表示
        System.out.println("【商品一覧】");
        new ProductList().ShowProductList();
        System.out.println("次の作業を選択してください:");
        System.out.println("商品追加 >> 1");
        System.out.println("在庫管理 >> 2");
        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();
            switch (choice) {
                // 商品追加の処理を実行する
                case 1 -> new ProductAdd().AddProduct(new ArrayList<>());
                // 在庫管理の処理を実行する
                case 2 -> new ProductUpdate().UpdateProduct(new ArrayList<>());
                default -> System.out.println("無効な選択です。");
            }
        }
    }

}
