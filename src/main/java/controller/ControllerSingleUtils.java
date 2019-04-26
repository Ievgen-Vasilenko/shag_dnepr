package controller;

import models.City;
import models.RealtyType;
import models.WallType;
import org.springframework.ui.Model;
import service.CityService;
import service.RealtyTypeService;
import service.WallTypeService;
import service.implService.ImplCityService;
import service.implService.ImplRealtyTypeService;
import service.implService.ImplWallTypeService;

import java.util.List;

class ControllerSingleUtils {

    private ImplWallTypeService wallTypeService = new WallTypeService();
    private ImplRealtyTypeService realtyTypeService = new RealtyTypeService();
    private ImplCityService cityService = new CityService();
    private static ControllerSingleUtils controllerSingleUtils;

    private ControllerSingleUtils() {
    }

    static ControllerSingleUtils getInstance() {
        if (controllerSingleUtils == null) {
            controllerSingleUtils = new ControllerSingleUtils();
        }
        return controllerSingleUtils;
    }

    void getOptions(Model uiModel) {
        List<City> cities = cityService.findAllCities();
        uiModel.addAttribute("cities", cities);
        List<RealtyType> realtyTypes = realtyTypeService.findAllRealtyType();
        uiModel.addAttribute("realtyTypes", realtyTypes);
        List<WallType> wallTypes = wallTypeService.findAllWallTypes();
        uiModel.addAttribute("wallTypes", wallTypes);
    }
}
