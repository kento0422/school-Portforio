/* 
商品情報を管理する
・コード ProductId
・商品名 ProductName
・商品カテゴリ ProductCategory
・在庫数 ProductCount
・最低在庫数 ProductMinCount
*/

public class Product {
    private String productId;
    private String productName;
    private String productCategory;
    private int productCount;
    private int productMinCount;

    public Product(String productId, String productName, String productCategory, int productCount,
            int productMinCount) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productCount = productCount;
        this.productMinCount = productMinCount;
    }

    // Getterメソッド
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductCount() {
        return productCount;
    }

    public int getProductMinCount() {
        return productMinCount;
    }

}
