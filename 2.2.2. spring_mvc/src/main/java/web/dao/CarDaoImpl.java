package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Пассажирский", "Ауди С8", 2020));
        cars.add(new Car("Пассажирский", "Мерседес-Бенз Ситан", 2020));
        cars.add(new Car("Пассажирский", "БМВ 7", 2019));
        cars.add(new Car("Пассажирский", "Тесла Модель С", 2021));
        cars.add(new Car("Пассажирский", "Феррари Ф8 Трибуто", 2018));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
