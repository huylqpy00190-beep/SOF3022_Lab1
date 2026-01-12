package com.example.Lab1.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login/form")
    public String form() {
        return "login"; // Trả về file login.html
    }

    @RequestMapping("/login/check")
    public String login(Model model) {
        // Đọc dữ liệu từ request
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // Kiểm tra logic
        if ("poly".equals(user) && "123".equals(pass)) {
            model.addAttribute("message", "Đăng nhập thành công!");
        } else {
            model.addAttribute("message", "Đăng nhập thất bại!");
        }

        return "login"; // Quay lại trang login để hiển thị thông báo
    }
}
