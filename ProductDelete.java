import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// 商品削除の処理を担当するクラス

public class ProductDelete {
    public void DeleteProduct(ArrayList<Product> ProductList) {
        Scanner sc = new Scanner(System.in);
        try {
            // 1. 商品コードを入力して、該当する商品を検索する
            System.out.println("削除する商品コードを入力してください >>");
            String deleteId = sc.nextLine();
            String flag = null;
            // 2. 該当する商品が見つかった場合、その商品を削除する
            Iterator<Product> iterator = ProductList.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.productId.equals(deleteId)) {
                    iterator.remove();
                    System.out.println();
                    System.out.println("商品が削除されました。");
                    // 3. 商品の削除後、CSVファイルを更新する
                    new ProductCsv().saveCsv(ProductList);
                    // 4. 削除後の商品一覧を表示する
                    new ProductDisplay().ShowProductList(ProductList);
                    flag = "true";
                    break;
                }
            }
            if (flag == null) {
                System.out.println("該当する商品コードが見つかりませんでした。");
            }
        } catch (Exception e) {
            System.out.println("入力に誤りがあります。もう一度やり直してください。");
        }
    }
}
