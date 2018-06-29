package nl.yacht.molvenorestaurant.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value="/")
public class HomeController {

    @RequestMapping(method= RequestMethod.GET)
    public String home(Map<String, Object> model){
        return "index";
    }

    @RequestMapping(value="/postget", method= RequestMethod.GET)
    public String jqueryPostGet(Map<String, Object> model){
        return "jquery-post-get";
    }

    @RequestMapping(value="/bootstrap", method= RequestMethod.GET)
    public String bootstrap(Map<String, Object> model){
        return "bootstrap-progress";
    }

    @RequestMapping(value="/jquery-demo", method= RequestMethod.GET)
    public String jQueryDemo(Map<String, Object> model){
        return "jquery-demo";
    }

    @RequestMapping(value="/bootstrap2", method= RequestMethod.GET)
    public String bootstrap2(Map<String, Object> model){
        return "bootstrap2";
    }
}
