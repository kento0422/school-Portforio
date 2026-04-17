import java.util.ArrayList;

public class ProductList {
    public void ShowProductList() {
        ArrayList<Product> ProductList = ProductCsv.LoadCsv(new String[] { "products.csv" });
        System.out.println("【商品一覧】");
        System.out.printf("%-8s %-10s %-10s %-8s %-10s%n",
                "コード", "商品名", "カテゴリ", "在庫数", "最低在庫数");
        System.out.println("--------------------------------------------------");
        for (Product p : ProductList) {
            System.out.printf("%-8s %-10s %-10s %-8d %-10d%n",
                    p.ProductId, p.ProductName, p.ProductCategory, p.ProductCount, p.ProductMinCount);
        }
    }
}