import java.util.ArrayList;
import java.util.Scanner;

// 在庫数の更新を担当するクラス

public class ProductUpdate {
    public void UpdateProduct(ArrayList<Product> ProductList) {
        // 在庫数の更新処理を実装する
        System.out.println("在庫数を更新する商品コードを入力してください >>");
        Scanner sc = new Scanner(System.in);
        // 1. 商品コードを入力して、該当する商品を検索する
        try {
            String UpdateId = sc.nextLine();
            String flag = null;
            for (Product product : ProductList) {
                if (product.ProductId.equals(UpdateId)) {
                    flag = "true";
                    // 2. 更新する在庫数を入力する
                    System.out.println("更新する在庫数を入力してください >>");
                    int newCount = sc.nextInt();
                    // 3. 商品の在庫数を更新・保存する
                    product.ProductCount = newCount;
                    System.out.println();
                    System.out.println("在庫数が更新されました。");
                    new ProductCsv().SaveCsv(ProductList);
                    // 4. 更新後の在庫数を表示する
                    new ProductList().ShowProductList(ProductList);
                    new StockZeroList().showZeroList(ProductList);
                    break;
                }
            }
            if (flag == null) {
                System.out.println("該当する商品コードが見つかりませんでした。");
            }
        } catch (Exception e) {
            System.out.println("入力に誤りがあります。もう一度やり直してください。");
        }
    }
}