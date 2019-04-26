package service;

import dao.CityDao;
import models.City;
import org.springframework.stereotype.Service;
import service.implService.ImplCityService;

import java.util.List;

@Service("ImplCityService")
public class CityService implements ImplCityService {

    private CityDao cityDao = new CityDao();
    private City city = new City();

    public CityService() {
    }

    @Override
    public City findCity(int id) {
        return cityDao.findById(id, city);
    }

    @Override
    public void saveCity(City city) {
        cityDao.save(city);
    }

    @Override
    public void deleteCity(City city) {
        cityDao.delete(city);
    }

    @Override
    public void updateCity(City city) {
        cityDao.update(city);
    }

    @Override
    public List<City> findAllCities() {
        return cityDao.findAll(city);
    }
}
