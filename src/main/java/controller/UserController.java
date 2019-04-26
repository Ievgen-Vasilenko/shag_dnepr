package controller;


import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;
import service.implService.ImplUserService;

@RequestMapping("/registration")
@Controller
public class UserController {

    private ImplUserService userService = new UserService();

    @RequestMapping(method = RequestMethod.GET)
    public String registration() {
        return "registration/registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String clientsWorks(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "login") String login,
            @RequestParam(value = "password") String password
    ) {

        User user = new User();
        user.setUsername(name);
        user.setLogin(login);
        user.setPassword(password);
        userService.saveUser(user);
        return "redirect:/home";
    }

}
