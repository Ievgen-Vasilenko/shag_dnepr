package controller;

import models.Add;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.AddService;
import service.implService.ImplAddService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/cabinet")
@Controller
public class CabinetController {

    private ImplAddService addService = new AddService();

    @RequestMapping(method = RequestMethod.GET)
    public String registration(HttpSession session, Model uiModel) {
        List<Add> addsFind = addService.findUserAdd(Integer.parseInt((String) session.getAttribute("id")));
        uiModel.addAttribute("addsFind", addsFind);
        return "cabinet/cabinet";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addInfo(@RequestParam(value = "id") String id) {
        Add add = new Add();
        add = addService.findAdd(Integer.parseInt(id));
        addService.deleteAdd(add);
        return "redirect:/cabinet";
    }

}
