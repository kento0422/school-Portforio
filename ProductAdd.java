import java.util.ArrayList;
import java.util.Scanner;

// 商品追加の処理を担当するクラス

public class ProductAdd {

    public void AddProduct(ArrayList<Product> ProductList) {
        try (Scanner sc = new Scanner(System.in)) {
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

            Product p = new Product(ProductId, ProductName, ProductCategory, ProductCount, ProductMinCount);
            ProductList.add(p);
            ProductCsv.SaveCsv(ProductList);
            System.out.println("商品が追加されました。");
            new ProductList().ShowProductList();
        } catch (Exception e) {
            System.out.println("入力に誤りがあります。もう一度やり直してください。");
        }
    }
}
