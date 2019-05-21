package meng.provider.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.ThreadPoolExecutor;

@RestController("hello")
public class FirstCloudWebController {
    @RequestMapping("cloud")
    public String helloCloud(){
        return "hello cloud";
    }
}
