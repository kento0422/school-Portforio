import java.util.ArrayList;

// 商品一覧の表示を担当するクラス

public class ProductList {
    public void ShowProductList(ArrayList<Product> ProductList) {
        System.out.println("【商品一覧】");
        System.out.printf("%-8s %-15s %-12s %-8s %-10s%n",
                "Code", "Name", "Category", "Stock", "Min-Stock");
        System.out.println("--------------------------------------------------");
        for (Product p : ProductList) {
            System.out.printf("%-8s %-15s %-12s %-8d %-10d%n",
                    p.ProductId, p.ProductName, p.ProductCategory, p.ProductCount, p.ProductMinCount);
        }
        System.out.println();
    }
}