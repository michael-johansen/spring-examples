package no.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Michael Johansen
 * Date: 10.01.14
 * Time: 12:44
 */
@Controller
public class HomeController {
    @Autowired
    @Qualifier("requestCounter")
    private Counter request;
    @Autowired
    @Qualifier("sesionCounter")
    private Counter session;
    @Autowired
    @Qualifier("singletonCounter")
    private Counter singleton;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(ModelMap model) {
        request.increment();
        singleton.increment();
        session.increment();
        model.addAttribute("requestCount", request.getCount());
        model.addAttribute("sessionCount", session.getCount());
        model.addAttribute("singletonCount", singleton.getCount());
        return new ModelAndView("home", model);
    }
}
