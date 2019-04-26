package controller;

import models.Add;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.AddService;
import service.implService.ImplAddService;

import java.util.List;

@RequestMapping("/home")
@Controller
public class HomeController {

    private ImplAddService addService = new AddService();

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        ControllerSingleUtils.getInstance().getOptions(uiModel);
        List<Add> adds = addService.findTen();
        uiModel.addAttribute("adds", adds);
        return "home/home";
    }
}
