package ChapterEight.Estore;

public class Items {
    private int quantityOfProduct;
    private Product products;

    public Items(int quantityOfProduct, Product products) {
        this.quantityOfProduct = quantityOfProduct;
        this.products = products;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public Product getProducts() {
        return products;
    }
}
