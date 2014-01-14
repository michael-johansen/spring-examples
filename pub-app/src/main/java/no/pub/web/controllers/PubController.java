package no.pub.web.controllers;

import no.pub.model.Pub;
import no.pub.service.PostalCodeAreaService;
import no.pub.service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:29
 */
@Controller
public class PubController {

    private final PubService pubService;
    private final PostalCodeAreaService postalCodeAreaService;

    @Autowired
    public PubController(PubService pubService, PostalCodeAreaService postalCodeAreaService) {
        this.pubService = pubService;
        this.postalCodeAreaService = postalCodeAreaService;
    }

    @RequestMapping(value = "pub", method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("pub/list", "pubList", pubService.getAll());
    }

    @RequestMapping(value = "pub/new", method = RequestMethod.GET)
    public ModelAndView createNewPubForm(Pub pub) {
        return pubForm(pub);
    }

    @RequestMapping(value = "pub/{id}", method = RequestMethod.GET)
    public ModelAndView editPubForm(@PathVariable("id") Long id) {
        return pubForm(pubService.getById(id));
    }

    @RequestMapping(value = {"pub/new", "pub/{id}"}, method = RequestMethod.POST)
    public ModelAndView savePub(@Valid Pub pub, Errors errors) {
        if (!errors.hasErrors()) {
            pubService.save(pub);
            return new ModelAndView(new RedirectView(""));
        }
        return pubForm(pub);
    }

    @RequestMapping(value = "pub/{id}", method = RequestMethod.DELETE)
    public ModelAndView deletePub(@PathVariable("id") Long id){
        pubService.delete(id);
        return new ModelAndView(new RedirectView(""));
    }

    private ModelAndView pubForm(Pub pub) {
        Map<String, Object> model = new HashMap<>();
        model.put( "pub", pub);
        if(StringUtils.hasText(pub.getPostalCode())){
            model.put("postalCodeArea", postalCodeAreaService.findByPostalCode(pub.getPostalCode()));
        }
        return new ModelAndView("pub/edit", model);
    }


}
