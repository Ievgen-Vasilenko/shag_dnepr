package controller;

import models.Add;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.AddService;
import service.implService.ImplAddService;

@RequestMapping("/info")
@Controller
public class InfoController {

    private ImplAddService addService = new AddService();

    @RequestMapping(method = RequestMethod.GET)
    public String addInfo(Model uiModel,
                          @RequestParam(value = "id") String id
    ) {
        Add addId;
        addId = addService.findAdd(Integer.parseInt(id));
        uiModel.addAttribute("addId", addId);
        return "info/info";
    }

}
