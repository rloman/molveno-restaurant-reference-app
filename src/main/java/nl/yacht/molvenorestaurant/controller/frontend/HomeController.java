package nl.yacht.molvenorestaurant.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value="/")
public class HomeController {

    @RequestMapping(value="", method= RequestMethod.GET)
    public String home(Map<String, Object> model){
        return "index";
    }

    
}
