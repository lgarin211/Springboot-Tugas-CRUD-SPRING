package com.example12.demo1221.Controller;

import com.example12.demo1221.Model.img_model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class img_controller {
    @RequestMapping("/dork")
    public List<img_model> dork() {
        return List.of(
                new img_model(
                        1L, "limas", "modes"
                )
        );
    }

    @RequestMapping("/dos")
    @ResponseBody
    public List<String> Dos() {
        return List.of("as", "asssasdw");
    }

    @RequestMapping("/Moasl")
    public String Moasl(@RequestParam(value = "Kas") String Kas, Model SJ) {
        SJ.addAttribute("Kas", Kas);
        return "kos";


    }
}
