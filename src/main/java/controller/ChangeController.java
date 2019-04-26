package controller;

import models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.*;
import service.implService.*;

@RequestMapping("/change")
@Controller
public class ChangeController {

    private ImplAddService addService = new AddService();
    @RequestMapping(method = RequestMethod.GET)
    public String addInfo(Model uiModel,
                          @RequestParam(value = "id") String id
    ) {
        Add addId = addService.findAdd(Integer.parseInt(id));
        uiModel.addAttribute("addId", addId);
        ControllerSingleUtils.getInstance().getOptions(uiModel);
        return "change/change";
    }

}
