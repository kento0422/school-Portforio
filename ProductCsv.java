
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// CSVファイルの読み込みと保存を担当するクラス

public class ProductCsv {
    public ArrayList<Product> LoadCsv() {
        ArrayList<Product> ProductList = new ArrayList<>();
        // CSVファイルから商品データを読み込む
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("products.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 5) {
                    String ProductId = fields[0];
                    String ProductName = fields[1];
                    String ProductCategory = fields[2];
                    int ProductCount = Integer.parseInt(fields[3]);
                    int ProductMinCount = Integer.parseInt(fields[4]);
                    Product p = new Product(ProductId, ProductName, ProductCategory, ProductCount, ProductMinCount);
                    ProductList.add(p);
                }
            }
            return ProductList;
        } catch (IOException e) {
            System.out.println("CSVファイルの読み込みに失敗しました。");
            return ProductList;
        }
    }

    public void SaveCsv(ArrayList<Product> ProductList) {
        // CSVファイルへの保存処理を実装する
        try (FileWriter writer = new FileWriter("products.csv", false)) {
            for (Product p : ProductList) {
                String line = p.ProductId + "," + p.ProductName + "," + p.ProductCategory + "," + p.ProductCount + ","
                        + p.ProductMinCount;
                writer.write(line + "\n");
            }
            System.out.println();
            System.out.println("CSVファイルへの保存が完了しました。");
        } catch (IOException e) {
            System.out.println();
            System.out.println("CSVファイルへの保存に失敗しました。");
        }
        System.out.println();
    }
}