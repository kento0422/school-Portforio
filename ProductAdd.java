import java.util.ArrayList;
import java.util.Scanner;

// 商品追加の処理を担当するクラス

public class ProductAdd {

    public void AddProduct(ArrayList<Product> ProductList) {
        // 1. 商品コード、商品名、商品カテゴリ、在庫数、最低在庫数を入力する
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("商品コードを入力してください >>");
            String ProductId = sc.nextLine();
            System.out.println("商品名を入力してください >>");
            String ProductName = sc.nextLine();
            System.out.println("商品カテゴリを入力してください >>");
            String ProductCategory = sc.nextLine();
            System.out.println("在庫数を入力してください >>");
            int ProductCount = sc.nextInt();
            System.out.println("最低在庫数を入力してください >>");
            int ProductMinCount = sc.nextInt();
            // 2. 商品情報を保存する
            Product p = new Product(ProductId, ProductName, ProductCategory, ProductCount, ProductMinCount);
            ProductList.add(p);
            System.out.println();
            System.out.println("商品が追加されました。");
            // 3. 商品の追加後、CSVファイルを更新する
            new ProductCsv().SaveCsv(ProductList);
            // 4. 追加後の商品一覧を表示する
            new ProductList().ShowProductList(ProductList);
        } catch (Exception e) {
            System.out.println("入力に誤りがあります。もう一度やり直してください。");
        }
    }
}
