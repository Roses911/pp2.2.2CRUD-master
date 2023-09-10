package myWebApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import myWebApp.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if ( count != null && count <= 5 && count >= 0) {
            model.addAttribute("car", carService.getCountCars(count));
            return "auto/cars";
        }

        model.addAttribute("car", carService.index());
        return "auto/cars";
    }
}
