
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductCsv {
    public static ArrayList<Product> LoadCsv(String[] args) {
        ArrayList<Product> ProductList = new ArrayList<>();
        // CSVファイルから商品データを読み込む
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("products.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                for (String data1 : data) {
                    System.out.println(data1 + " ");
                }
                System.out.println();
            }
            reader.close();
            return ProductList;
        } catch (IOException e) {
            System.out.println("CSVファイルの読み込みに失敗しました。");
            return ProductList;
        }
    }

}
