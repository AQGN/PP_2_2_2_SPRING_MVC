package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("Honda", 2000, 200));
        cars.add(new Car("Toyota", 1984, 150));
        cars.add(new Car("BWM", 1995, 220));
        cars.add(new Car("Mitsubishi", 2020, 190));
        cars.add(new Car("Lexus", 2023, 250));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
