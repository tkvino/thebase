package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello Falcorpian, SpringBoot on Wildfly");
    }

    @RequestMapping("manage-customer")
    public String manageCustomer () {
        return ("| Manage Customer Service | Implementation Here Please");
    }
}