package no.pub.web.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 12:07
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("WEB-INF/pages/index.jsp");
    }
}
