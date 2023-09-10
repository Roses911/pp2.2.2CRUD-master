package myWebApp.service;

import myWebApp.models.Car;

import java.util.List;

public interface CarServiceIntf {
    public List<Car> index();
    public List<Car> getCountCars(int count);
}
