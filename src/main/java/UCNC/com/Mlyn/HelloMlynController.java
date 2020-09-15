package UCNC.com.Mlyn;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMlynController {

    @RequestMapping(method = RequestMethod.GET, path = "/witaj/{name}")
    public String helloMlyn(@PathVariable String name) {
        return String.format("Witaj %s",name);
    }
}
