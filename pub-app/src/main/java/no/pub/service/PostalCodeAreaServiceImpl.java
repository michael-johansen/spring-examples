package no.pub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * User: Michael Johansen
 * Date: 08.01.14
 * Time: 11:09
 */
@Service
public class PostalCodeAreaServiceImpl implements PostalCodeAreaService {
    private final RestTemplate restTemplate;

    @Autowired
    public PostalCodeAreaServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String findByPostalCode(String postalCode) {
        ResponseEntity<PostalCodeAreaResponse> forEntity = restTemplate.getForEntity("http://adressesok.posten.no/api/v1/postal_codes.json?postal_code={code}",
                PostalCodeAreaResponse.class, postalCode);
        PostalCodeAreaResponse postalCodeAreaResponse = forEntity.getBody();
        if(!postalCodeAreaResponse.getPostal_codes().isEmpty()){
            return postalCodeAreaResponse.getPostal_codes().get(0).getCity();
        }
        return "N/A";
    }
}
