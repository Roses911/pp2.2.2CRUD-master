package myWebApp.dao;

import myWebApp.models.Car;

import java.util.List;

public interface CarDAOIntf {
    public List<Car> index();
    public List<Car> getCountCars(int count);

}

