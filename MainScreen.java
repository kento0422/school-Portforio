
import java.util.ArrayList;
import java.util.Scanner;

/*
メイン画面
・商品一覧の表示
・在庫不足一覧の表示
・次の作業の選択
　　-商品追加の処理を実行する
　　-在庫管理の処理を実行する
　　-商品削除の処理を実行する
 */

public class MainScreen {
    public static void main(String[] args) {
        System.out.println("在庫管理システムへようこそ！");
        // 商品一覧の表示
        ArrayList<Product> productsList = new ProductCsv().loadCsv();
        new ProductDisplay().showProductList(productsList);
        // 在庫不足一覧の表示
        new LowStockDisplay().showLowStockList(productsList);
        // 次の作業の選択
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("次の作業を選択してください:");
                System.out.println("商品追加 >> 1");
                System.out.println("在庫管理 >> 2");
                System.out.println("商品削除 >> 3");
                System.out.println("作業終了 >> 0");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        // 商品追加の処理を実行する
                        new ProductAdd().addProduct(productsList);
                    }
                    case 2 -> {
                        // 在庫管理の処理を実行する
                        new ProductUpdate().updateProduct(productsList);
                    }
                    case 3 -> {
                        // 商品削除の処理を実行する
                        new ProductDelete().deleteProduct(productsList);
                    }
                    case 0 -> {
                        // 作業終了の処理を実行する
                        System.out.println("作業を終了します。");
                        return;
                    }
                    default -> System.out.println("正しい数値を入力してください。");
                }
            }
        }
    }
}
