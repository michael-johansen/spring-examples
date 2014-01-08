package no.pub.service;
/**
 * User: Michael Johansen
 * Date: 08.01.14
 * Time: 11:20
 */
public class PostalCode {
    private String city;
    private String category;
    private String postal_code;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
}
