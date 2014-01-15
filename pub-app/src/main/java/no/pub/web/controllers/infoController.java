package no.pub.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import no.pub.service.InfoService;
/**
 * Created by matmoe on 15.01.14.
 */
@Controller
public class infoController {

    private final InfoService infoService;

    @Autowired
    public infoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("info/list","infoList",infoService.getAll());
    }


}
