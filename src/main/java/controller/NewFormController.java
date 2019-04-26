package controller;

import models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import service.*;
import service.implService.*;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RequestMapping("/add")
@Controller
public class NewFormController {

    private ImplAddService addService = new AddService();
    private ImplWallTypeService wallTypeService = new WallTypeService();
    private ImplRealtyTypeService realtyTypeService = new RealtyTypeService();
    private ImplCityService cityService = new CityService();
    private ImplUserService userService = new UserService();

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        ControllerSingleUtils.getInstance().getOptions(uiModel);
        return "add/add";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String clientsWorks(
            HttpSession session,
            @RequestParam(value = "city") String city,
            @RequestParam(value = "realtyType") String realtyType,
            @RequestParam(value = "wallType") String wallType,
            @RequestParam(value = "rooms") String rooms,
            @RequestParam(value = "totalArea") String totalArea,
            @RequestParam(value = "livingSpace") String livingSpace,
            @RequestParam(value = "kitchen") String kitchen,
            @RequestParam(value = "floor") String floor,
            @RequestParam(value = "numberFloors") String numberFloors,
            @RequestParam(value = "yearBuilt") String yearBuilt,
            @RequestParam(value = "price") String price,
            @RequestParam(value = "photo1") MultipartFile photo1,
            @RequestParam(value = "photo2") MultipartFile photo2,
            @RequestParam(value = "photo3") MultipartFile photo3,
            @RequestParam(value = "photo4") MultipartFile photo4,
            @RequestParam(value = "photo5") MultipartFile photo5,
            @RequestParam(value = "photo6") MultipartFile photo6,
            @RequestParam(value = "photo7") MultipartFile photo7,
            @RequestParam(value = "announcementText") String announcementText,
            @RequestParam(value = "contactPhone") String contactPhone,
            @RequestParam(value = "contactName") String contactName
    ) {
        String folderName = String.valueOf(System.currentTimeMillis());
        File folder = new File("C:/Users/Wasel/IdeaProjects/diplom/target/diplom/resources/images/" + folderName);
        folder.mkdir();
        Add add = new Add();
        City cities;
        RealtyType realtyTypes;
        WallType wallTypes;
        cities = cityService.findCity(Integer.parseInt(city));
        add.setCity(cities);
        realtyTypes = realtyTypeService.findRealtyType(Integer.parseInt(realtyType));
        add.setRealtyType(realtyTypes);
        wallTypes = wallTypeService.findWallType(Integer.parseInt(wallType));
        add.setWallType(wallTypes);
        add.setRooms(Integer.parseInt(rooms));
        add.setTotalArea(Float.parseFloat(totalArea));
        add.setLivingSpace(Float.parseFloat(livingSpace));
        add.setKitchen(Float.parseFloat(kitchen));
        add.setFloor(Integer.parseInt(floor));
        add.setNumberFloors(Integer.parseInt(numberFloors));
        add.setYearBuilt(Integer.parseInt(yearBuilt));
        add.setPrice(Integer.parseInt(price));
        add.setFolder(folderName);
        add.setPhoto1(addImage(photo1, folderName));
        add.setPhoto2(addImage(photo2, folderName));
        add.setPhoto3(addImage(photo3, folderName));
        add.setPhoto4(addImage(photo4, folderName));
        add.setPhoto5(addImage(photo5, folderName));
        add.setPhoto6(addImage(photo6, folderName));
        add.setPhoto7(addImage(photo7, folderName));
        add.setAnnouncementText(announcementText);
        add.setContactPhone(contactPhone);
        add.setContactName(contactName);
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        add.setAddDate(ts);
        User user = new User();
        String id = (String) session.getAttribute("id");
        user = userService.findUser(Integer.parseInt(id));
        add.setUser(user);
        addService.saveAdd(add);
        return "redirect:/home";
    }

    private String addImage(MultipartFile file, String folder) {
        if (!file.isEmpty()) {
            String name = "";
            if (!file.isEmpty()) {
                byte[] bytes = new byte[0];
                try {
                    bytes = file.getBytes();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                name = file.getOriginalFilename();
                File image = new File("C:/Users/Wasel/IdeaProjects/diplom/target/diplom/resources/images/" + folder + "/", name);
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(image);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    assert fos != null;
                    fos.write(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return "resources/images/" + folder + "/" + name;
        } else {
            return null;
        }
    }
}
