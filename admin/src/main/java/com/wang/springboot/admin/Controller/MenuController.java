package com.wang.springboot.admin.Controller;

import com.wang.springboot.admin.model.service.IUserService;
import com.wang.springboot.cloudbeans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    @Resource
    private IUserService userService;

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/userManger")
    public String userManger(Model model) {
        List<User> users = userService.selectAll();
        model.addAttribute("users", users);
        return "userManger";
    }
}
