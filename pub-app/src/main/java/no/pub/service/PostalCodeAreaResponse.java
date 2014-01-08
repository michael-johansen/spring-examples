package no.pub.service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Michael Johansen
 * Date: 08.01.14
 * Time: 11:19
 */
public class PostalCodeAreaResponse {
    private List<PostalCode> postal_codes = new ArrayList<>();
    private String status;

    public List<PostalCode> getPostal_codes() {
        return postal_codes;
    }

    public void setPostal_codes(List<PostalCode> postal_codes) {
        this.postal_codes = postal_codes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
