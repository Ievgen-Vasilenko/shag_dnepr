package service.implService;

import models.WallType;

import java.util.List;

public interface ImplWallTypeService {
    WallType findWallType(int id);

    void saveWallType(WallType wallType);

    void deleteWallType(WallType wallType);

    void updateWallType(WallType wallType);

    List<WallType> findAllWallTypes();
}
