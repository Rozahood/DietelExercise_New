package ChapterEight.Estore;

public class Customers extends Users {
    private BillingInformation billingInformation;
    private ShoppingCart shoppingCart;
    public Customers(int age, String emailAddress, Addresses homeAddress, String name, String password,
                     String phone, BillingInformation billingInformation, ShoppingCart shoppingCart) {
        super(age, emailAddress, homeAddress, name, password, phone);
        this.billingInformation = billingInformation;
        this.shoppingCart = shoppingCart;
    }

    public BillingInformation getBillingInformation() {
        return billingInformation;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
