package service.implService;

import models.City;

import java.util.List;

public interface ImplCityService {

    City findCity(int id);

    void saveCity(City city);

    void deleteCity(City city);

    void updateCity(City city);

    List<City> findAllCities();
}
