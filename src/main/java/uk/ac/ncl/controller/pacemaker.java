package uk.ac.ncl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Yang
 * @date 2022/2/10
 */
@RestController
public class pacemaker {

    //run the page localhost:8080
    //it will auto skip to index.html
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView pacemakerSimulater(){
        return new ModelAndView("index");
    }

}
