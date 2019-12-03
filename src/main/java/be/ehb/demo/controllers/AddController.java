package be.ehb.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public int add(@RequestParam(name = "a") int a , @RequestParam(name = "b") int b){
        return a + b;
    }
}
