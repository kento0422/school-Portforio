import java.util.ArrayList;

// 在庫不足の商品を表示するクラス

public class StockZeroList {
    public void showZeroList(ArrayList<Product> ProductList) {
        System.out.println("【在庫不足一覧】");
        System.out.printf("%-8s %-15s %-12s %-8s %-10s%n",
                "Code", "Name", "Category", "Stock", "Min-Stock");
        System.out.println("--------------------------------------------------");
        for (Product p : ProductList) {
            if (p.ProductCount < p.ProductMinCount) {
                System.out.printf("%-8s %-15s %-12s %-8d %-10d%n",
                        p.ProductId, p.ProductName, p.ProductCategory, p.ProductCount, p.ProductMinCount);
            }
        }
        System.out.println();
    }
}
