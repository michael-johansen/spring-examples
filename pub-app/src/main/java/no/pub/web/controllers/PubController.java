package no.pub.web.controllers;

import no.pub.model.Pub;
import no.pub.service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:29
 */
@Controller
public class PubController {

    private final PubService pubService;

    @Autowired
    public PubController(PubService pubService) {
        this.pubService = pubService;
    }

    @RequestMapping(value = "pub", method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("pub/list");
    }

    @RequestMapping(value = "pub/new", method = RequestMethod.GET)
    public ModelAndView createNewPubForm() {
        return new ModelAndView("pub/edit", "pub", new Pub());
    }

    @RequestMapping(value = "pub/new", method = RequestMethod.POST)
    public ModelAndView createNewPub() {

        return new ModelAndView(new RedirectView(""));
    }

}
