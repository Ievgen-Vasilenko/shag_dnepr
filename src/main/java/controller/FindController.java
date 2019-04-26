package controller;

import models.Add;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.AddService;
import service.implService.ImplAddService;

import java.util.List;

@RequestMapping("/find")
@Controller
public class FindController {

    private ImplAddService addService = new AddService();

    @RequestMapping(method = RequestMethod.GET)
    public String addInfo(Model uiModel,
                          @RequestParam(value = "city") String city,
                          @RequestParam(value = "realtyType") String realtyType,
                          @RequestParam(value = "rooms") String rooms,
                          @RequestParam(value = "totalArea") String totalArea
    ) {

        List<Add> addsFind = addService.findOptions(strToInt(city, 0), strToInt(city, 1),
                strToInt(realtyType, 0), strToInt(realtyType, 1),
                strToInt(rooms, 0), strToInt(rooms, 1),
                strToInt(totalArea, 0), strToInt(totalArea, 1));
        uiModel.addAttribute("addsFind", addsFind);
        return "find/find";
    }

    private int strToInt(String str, int num) {
        String[] strMas = str.split("[ ]");
        int[] chisla = new int[2];
        for (int i = 0; i < strMas.length; i++) chisla[i] = Integer.parseInt(strMas[i]);
        return chisla[num];
    }


}
