package ChapterEight.Estore;

public class Product {
    private int productId;
    private String name;
    private int price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(int productId, String name, int price, String productDescription, ProductCategory productCategory) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}