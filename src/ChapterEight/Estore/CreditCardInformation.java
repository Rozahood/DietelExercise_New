package ChapterEight.Estore;

public class CreditCardInformation {
    private String cardCvv;
    private int cardExpirationYear;
    private String month;
    private int creditCardNumber;
    private String nameOnCard;
    private CardType cardType;

    public CreditCardInformation(String cardCvv, int cardExpirationYear, String month,
                                 int creditCardNumber, String nameOnCard, CardType cardType) {
        this.cardCvv = cardCvv;
        this.cardExpirationYear = cardExpirationYear;
        this.month = month;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public int getCardExpirationYear() {
        return cardExpirationYear;
    }

    public String getMonth() {
        return month;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public CardType getCardType() {
        return cardType;
    }
}
