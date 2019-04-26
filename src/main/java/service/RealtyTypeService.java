package service;

import dao.RealtyTypeDao;
import models.RealtyType;
import org.springframework.stereotype.Service;
import service.implService.ImplRealtyTypeService;

import java.util.List;

@Service("ImplRealtyType")
public class RealtyTypeService implements ImplRealtyTypeService {

    private RealtyTypeDao realtyTypeDao = new RealtyTypeDao();
    private RealtyType realtyType = new RealtyType();

    public RealtyTypeService() {
    }

    @Override
    public RealtyType findRealtyType(int id) {
        return realtyTypeDao.findById(id,realtyType);
    }

    @Override
    public void saveRealtyType(RealtyType realtyType) {
        realtyTypeDao.save(realtyType);
    }

    @Override
    public void deleteRealtyType(RealtyType realtyType) {
        realtyTypeDao.delete(realtyType);
    }

    @Override
    public void updateRealtyType(RealtyType realtyType) {
        realtyTypeDao.update(realtyType);
    }

    @Override
    public List<RealtyType> findAllRealtyType() {
        return realtyTypeDao.findAll(realtyType);
    }
}
