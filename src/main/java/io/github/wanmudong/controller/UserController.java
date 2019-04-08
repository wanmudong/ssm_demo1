package io.github.wanmudong.controller;

import io.github.wanmudong.pojo.User;
import io.github.wanmudong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wanmudong
 * @date 13:48 2019/4/8
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public String getAllUser(Model model) throws Exception{

        List<User> userList = userService.getAll();
        model.addAttribute("userList",userList);
        return "userList";

    }
    @RequestMapping("/")
    public String index() throws Exception{

        return "index";

    }

}
