package service.implService;

import models.Add;

import java.util.List;

public interface ImplAddService {
    Add findAdd(int id);

    void saveAdd(Add add);

    void deleteAdd(Add add);

    void updateAdd(Add add);

    List<Add> findAllAdds(Add add);

    List<Add> findTen();

    List<Add> findOptions(int totalAreaOT, int totalAreaDO,
                          int roomsOT, int roomsDO,
                          int realtyTypeOT, int realtyTypeDO,
                          int cityOT, int cityDO);

    List<Add> findUserAdd(int userId);
}




