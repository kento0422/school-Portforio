import java.util.ArrayList;
import java.util.Scanner;

// 商品追加の処理を担当するクラス

public class ProductAdd {

    public void addProduct(ArrayList<Product> ProductList) {
        // 1. 商品コード、商品名、商品カテゴリ、在庫数、最低在庫数を入力する
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("商品コードを入力してください >>");
            String productId = sc.nextLine();
            System.out.println("商品名を入力してください >>");
            String productName = sc.nextLine();
            System.out.println("商品カテゴリを入力してください >>");
            String productCategory = sc.nextLine();
            System.out.println("在庫数を入力してください >>");
            int productCount = sc.nextInt();
            System.out.println("最低在庫数を入力してください >>");
            int productMinCount = sc.nextInt();
            // 2. 商品情報を保存する
            Product p = new Product(productId, productName, productCategory, productCount, productMinCount);
            ProductList.add(p);
            System.out.println();
            System.out.println("商品が追加されました。");
            // 3. 商品の追加後、CSVファイルを更新する
            new ProductCsv().saveCsv(ProductList);
            // 4. 追加後の商品一覧を表示する
            new ProductDisplay().ShowProductList(ProductList);
        } catch (Exception e) {
            System.out.println("入力に誤りがあります。もう一度やり直してください。");
        }
    }
}
