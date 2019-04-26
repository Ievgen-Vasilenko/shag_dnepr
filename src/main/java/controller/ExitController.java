package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@RequestMapping("/exit")
@Controller
public class ExitController {
    @RequestMapping(method = RequestMethod.GET)
    public String addInfo(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/home";
    }
}
