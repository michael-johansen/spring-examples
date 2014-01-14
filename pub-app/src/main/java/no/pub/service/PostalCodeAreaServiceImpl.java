package no.pub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
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
        String url = "http://adressesok.posten.no/api/v1/postal_codes.json?postal_code={code}";
        ResponseEntity<PostalCodeAreaResponse> entity = getForEntity(url, PostalCodeAreaResponse.class, postalCode);


        PostalCodeAreaResponse postalCodeAreaResponse = entity.getBody();
        if(postalCodeAreaResponse != null &&  !postalCodeAreaResponse.getPostal_codes().isEmpty()){
            return postalCodeAreaResponse.getPostal_codes().get(0).getCity();
        }
        return "N/A";
    }

    private ResponseEntity<PostalCodeAreaResponse> getForEntity(String url, Class<PostalCodeAreaResponse> responseType,
                                                                String... urlVariables) {
        try {
            return restTemplate.getForEntity(url, responseType, urlVariables);
        } catch (HttpClientErrorException e) {
            if(HttpStatus.NOT_FOUND.equals(e.getStatusCode())){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            throw e;
        }
    }
}
