package UCNC.com.Mlyn;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMlynController {

    @RequestMapping(method = RequestMethod.GET, path = "/witaj")
    public String helloMlyn() {
        return "Witaj w Młynie";
    }
}
