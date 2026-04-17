/* 
商品情報を管理する
・コード ProductId
・商品名 ProductName
・商品カテゴリ ProductCategory
・在庫数 ProductCount
・最低在庫数 ProductMinCount
*/

public class Product {
    String ProductId;
    String ProductName;
    String ProductCategory;
    int ProductCount;
    int ProductMinCount;

    public Product(String ProductId, String ProductName, String ProductCategory, int ProductCount,
            int ProductMinCount) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.ProductCategory = ProductCategory;
        this.ProductCount = ProductCount;
        this.ProductMinCount = ProductMinCount;
    }
}
