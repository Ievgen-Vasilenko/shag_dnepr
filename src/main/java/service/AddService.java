package service;

import dao.AddDao;
import models.Add;
import org.springframework.stereotype.Service;
import service.implService.ImplAddService;

import java.util.List;

@Service("ImplAddService")
public class AddService implements ImplAddService {

    private AddDao addDao = new AddDao();
    private Add add = new Add();

    public AddService() {
    }

    @Override
    public Add findAdd(int id) {
        return addDao.findById(id, add);
    }

    @Override
    public void saveAdd(Add add) {
        addDao.save(add);
    }

    @Override
    public void deleteAdd(Add add) {
        addDao.delete(add);
    }

    @Override
    public void updateAdd(Add add) {
        addDao.update(add);
    }

    @Override
    public List<Add> findAllAdds(Add add) {
        return addDao.findAll(add);
    }

    @Override
    public List<Add> findTen() {
        return addDao.findTen();
    }

    @Override
    public List<Add> findOptions(int totalAreaOT, int totalAreaDO,
                                 int roomsOT, int roomsDO,
                                 int realtyTypeOT, int realtyTypeDO,
                                 int cityOT, int cityDO) {
        return addDao.findOptions(totalAreaOT, totalAreaDO,
                roomsOT, roomsDO,
                realtyTypeOT, realtyTypeDO,
                cityOT, cityDO);
    }

    @Override
    public List<Add> findUserAdd(int userId) {
        return addDao.findUserAdd(userId);
    }
}

