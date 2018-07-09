package com.dyheart.giflib.controller;

import com.dyheart.giflib.domain.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping(value = "/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping(value = "/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler-bot", LocalDate.now(), "Minh Ly", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}
