import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//商品登録とCSVファイルへの保存を担当するクラス

public class ProductAdd {

    public static void AddProduct(ArrayList<Product> ProductList) {
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
            SaveCsv(ProductList);
        } catch (Exception e) {
            System.out.println("入力に誤りがあります。もう一度やり直してください。");
        }
    }

    public static void SaveCsv(ArrayList<Product> ProductList) {
        // CSVファイルへの保存処理を実装する
        try (FileWriter writer = new FileWriter("products.csv")) {
            for (Product p : ProductList) {
                String line = p.ProductId + "," + p.ProductName + "," + p.ProductCategory + "," + p.ProductCount + ","
                        + p.ProductMinCount;
                writer.write(line + "\n");
            }
            System.out.println("CSVファイルへの保存が完了しました。");
        } catch (IOException e) {
            System.out.println("CSVファイルへの保存に失敗しました。");
        }
    }
}
