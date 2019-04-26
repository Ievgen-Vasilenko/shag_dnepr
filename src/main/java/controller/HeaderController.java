package controller;

import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;
import service.implService.ImplUserService;

import javax.servlet.http.HttpSession;

@RequestMapping("/header")
@Controller
public class HeaderController {

    private ImplUserService userService = new UserService();

    @RequestMapping(method = RequestMethod.GET)
    public String addInfo(Model uiModel, HttpSession session) {
        String id = (String) session.getAttribute("id");
        if(id!=null) {
            User user = userService.findUser(Integer.parseInt(id));
            uiModel.addAttribute("user", user);
        } else {
            uiModel.addAttribute("user", null);
        }
        return "header/header";
    }

}
