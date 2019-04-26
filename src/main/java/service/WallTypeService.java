package service;

import dao.WallTypeDao;
import models.WallType;
import org.springframework.stereotype.Service;
import service.implService.ImplWallTypeService;

import java.util.List;

@Service("ImplWallTypeService")
public class WallTypeService implements ImplWallTypeService {

    private WallTypeDao wallTypeDao = new WallTypeDao();
    private WallType wallType = new WallType();

    public WallTypeService() {
    }

    @Override
    public WallType findWallType(int id) {
        return wallTypeDao.findById(id, wallType);
    }

    @Override
    public void saveWallType(WallType wallType) {
        wallTypeDao.save(wallType);
    }

    @Override
    public void deleteWallType(WallType wallType) {
        wallTypeDao.delete(wallType);
    }

    @Override
    public void updateWallType(WallType wallType) {
        wallTypeDao.update(wallType);
    }

    @Override
    public List<WallType> findAllWallTypes() {
        return wallTypeDao.findAll(wallType);
    }
}
