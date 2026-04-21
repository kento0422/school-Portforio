import java.util.ArrayList;

// 在庫不足の商品を表示するクラス

public class LowStockDisplay {
    public void showLowStockList(ArrayList<Product> ProductList) {
        System.out.println("【在庫不足一覧】");
        System.out.printf("%-8s %-15s %-12s %-8s %-10s%n",
                "Code", "Name", "Category", "Stock", "Min-Stock");
        System.out.println("--------------------------------------------------");
        for (Product p : ProductList) {
            if (p.productCount < p.productMinCount) {
                System.out.printf("%-8s %-15s %-12s %-8d %-10d%n",
                        p.productId, p.productName, p.productCategory, p.productCount, p.productMinCount);
            }
        }
        System.out.println();
    }
}
