package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class Cars {
    static List<Car> cars = List.of(new Car("Honda tarneo", 1998, 4500),
            new Car("Honda Fit", 2004, 6000),
            new Car("Mersedez E220", 1995, 6050),
            new Car("Toyota Camry 75", 2019, 10000),
            new Car("Hyundai Carnival", 2021, 50000));


    @GetMapping
    public String getCar(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/cars")
    public String carsCount(@RequestParam(value = "count") int count,
                            @RequestParam(value = "name", required = false) String name, Model model) {
        List<Car> carList = new ArrayList<>();
        if (count > 5) {
            model.addAttribute("cars", cars);
        } else {
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));

            }
            model.addAttribute("cars", carList);
        }
        return "cars";

    }
}
