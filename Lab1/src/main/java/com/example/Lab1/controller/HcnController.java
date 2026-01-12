package com.example.Lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HcnController {

    @GetMapping("/hcn/form")
    public String form() {
        return "hcn";
    }

    @PostMapping("/hcn/tinh")
    public String tinh(Model model,
                       @RequestParam("dai") double dai,
                       @RequestParam("rong") double rong) {

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;

        // Gửi dữ liệu sang view
        model.addAttribute("dai", dai);
        model.addAttribute("rong", rong);
        model.addAttribute("perimeter", chuVi);
        model.addAttribute("area", dienTich);

        return "hcn";
    }
}
