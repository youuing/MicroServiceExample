package demo.ms.msinit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: LiBingHui
 * @Create: 2019/1/28 14:16
 **/

@RestController
public class MSController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello(){
        return "Hello";
    }
}
