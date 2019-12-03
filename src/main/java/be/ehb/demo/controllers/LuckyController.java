package be.ehb.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class LuckyController {

    @RequestMapping(value = "/lucky", method = RequestMethod.GET)
    @ResponseBody
    public int getLucky(){
        Random r = new Random();
        return r.nextInt(10)+1;
    }
}
