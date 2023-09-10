package myWebApp.service;

import org.springframework.stereotype.Component;
import myWebApp.dao.CarDAO;
import myWebApp.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarService implements  CarServiceIntf{
    final CarDAO carDAO;
    private List<Car> auto;

    {
        auto = new ArrayList<>();

        auto.add(new Car("Red", "BMW", 5));
        auto.add(new Car("Black", "Opel", 3));
        auto.add(new Car("White", "VW", 6));
        auto.add(new Car("Yellow", "Ford", 2));
        auto.add(new Car("Blue", "Audi", 8));
    }

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> index() {
        return carDAO.index();
    }

    @Override
    public List<Car> getCountCars(int count) {
        return carDAO.getCountCars(count);
    }

}
