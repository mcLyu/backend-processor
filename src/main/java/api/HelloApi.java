package api;

import beans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mill on 7/14/2018.
 */
@Controller
@RequestMapping
public class HelloApi {
    @Autowired
    private TestBean testBean;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return testBean.hello();
    }

}
