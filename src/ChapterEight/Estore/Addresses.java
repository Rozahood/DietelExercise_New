package ChapterEight.Estore;

public class Addresses {
    private String cityName;
    private String countryName;
    private int houseNumber;
    private String street;
    private String state;

    public Addresses(String cityName, String countryName, int houseNumber,
                     String street, String state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getState() {
        return state;
    }
}
