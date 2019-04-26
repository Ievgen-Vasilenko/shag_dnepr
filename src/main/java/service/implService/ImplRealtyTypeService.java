package service.implService;

import models.RealtyType;

import java.util.List;

public interface ImplRealtyTypeService {
    RealtyType findRealtyType(int id);

    void saveRealtyType(RealtyType realtyType);

    void deleteRealtyType(RealtyType realtyType);

    void updateRealtyType(RealtyType realtyType);

    List<RealtyType> findAllRealtyType();
}
