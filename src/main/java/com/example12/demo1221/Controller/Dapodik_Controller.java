package com.example12.demo1221.Controller;

import com.example12.demo1221.Service.SER_Dapodik;
import com.example12.demo1221.migration.MIG_Dapodik;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class Dapodik_Controller {
private final SER_Dapodik ser_dapodik;

    public Dapodik_Controller(SER_Dapodik ser_dapodik) {
        this.ser_dapodik = ser_dapodik;
    }

    @RequestMapping("/Dapodik")
//    @ResponseBody
    public String Sas(Model L){
        L.addAttribute("ard",ser_dapodik.AllSiswa());
        return "Dapodik";
    }
    PostMapping
    public String Masl(@RequestBody MIG_Dapodik as){
        ser_dapodik.newDapodik(as);
        return "redirect:/Dapodik";
    }


}
