package controller;

import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;
import service.implService.ImplUserService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/autorisation")
@Controller
public class AutorisationController {

    private ImplUserService userService = new UserService();

    @RequestMapping(method = RequestMethod.GET)
    public String registration() {
        return "autorisation/autorisation";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String clientsWorks(HttpSession session,
                               HttpServletResponse response,
                               @RequestParam(value = "login") String login,
                               @RequestParam(value = "password") String password
    ) {

        User user = new User();
        List users = userService.findUderLogin(login);

        if(users.size()>0){
            user = (User) users.get(0);
            if (user.getPassword().equals(password)) {
                session.setAttribute("login", user.getLogin());
                session.setAttribute("name", user.getUsername());
                session.setAttribute("id", String.valueOf(user.getId()));
                Cookie cookie = new Cookie("SSID", session.getId());
                response.addCookie(cookie);
                user.setCookies(cookie.getValue());
                userService.updateUser(user);
                return "redirect:/home";
            }
        } else {
            return "redirect:/autorisation";
        }

        return "redirect:/home";
    }


}
