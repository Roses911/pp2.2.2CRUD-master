package myWebApp.dao;

import org.springframework.stereotype.Component;
import myWebApp.models.Car;

import java.util.List;

@Component
public class CarDAO implements CarDAOIntf{
    private List<Car> auto;


    @Override
    public List<Car> index() {
        return auto;
    }
    @Override
    public List<Car> getCountCars(int count) {
        return auto.subList(0, count);

    }
}
