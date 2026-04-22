
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// CSVファイルの読み込みと保存を担当するクラス

public class ProductCsv {
    public ArrayList<Product> loadCsv() {
        ArrayList<Product> productsList = new ArrayList<>();
        // CSVファイルから商品データを読み込む
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("products.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 5) {
                    String productId = fields[0];
                    String productName = fields[1];
                    String productCategory = fields[2];
                    int productCount = Integer.parseInt(fields[3]);
                    int productMinCount = Integer.parseInt(fields[4]);
                    Product p = new Product(productId, productName, productCategory, productCount, productMinCount);
                    productsList.add(p);
                }
            }
            return productsList;
        } catch (IOException e) {
            System.out.println("CSVファイルの読み込みに失敗しました。");
            return productsList;
        }
    }

    public void saveCsv(ArrayList<Product> productsList) {
        // CSVファイルへの保存処理を実装する
        try (FileWriter writer = new FileWriter("products.csv", false)) {
            for (Product p : productsList) {
                String line = p.getProductId() + "," + p.getProductName() + "," + p.getProductCategory() + ","
                        + p.getProductCount() + ","
                        + p.getProductMinCount();
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