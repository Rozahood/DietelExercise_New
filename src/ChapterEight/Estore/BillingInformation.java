package ChapterEight.Estore;

public class BillingInformation {
    private String receiversPhoneNumber;
    private String receiversName;
    private String deliveryAddress;
    private CreditCardInformation creditCardInformation;

    public BillingInformation(String receiversPhoneNumber, String receiversName, String deliveryAddress, CreditCardInformation creditCardInformation) {
        this.receiversPhoneNumber = receiversPhoneNumber;
        this.receiversName = receiversName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformation = creditCardInformation;
    }

    public String getReceiversPhoneNumber() {
        return receiversPhoneNumber;
    }

    public String getReceiversName() {
        return receiversName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }
}
