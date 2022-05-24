package com.zemoso.springboot.demo.controller;


import com.zemoso.springboot.demo.entity.Car;
import com.zemoso.springboot.demo.exceptionHandlers.ProductNotFoundException;
import com.zemoso.springboot.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ComponentScan("com.zemoso.springboot.demo.service")
@RequestMapping("/carApi")
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService=carService;
    }

    @GetMapping("/")
    public String home(){
        return "redirect:cars";
    }


    @GetMapping("/addCar")
    public String addFunc(Model model){
        Car b = new Car();
        model.addAttribute("cars",b);
        return "add-a-car";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateFunc(@PathVariable(value="id") int id, Model model){
        Car b = carService.findById(id);
        model.addAttribute("cars",b);
        return "update-a-car";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable(value="id") int id,Model model){
        Car b = carService.findById(id);

        if(b == null){
            throw new ProductNotFoundException("Product Id not found- "+id);
        }
        carService.deleteById(id);
        return "redirect:/carApi/cars";
    }

    @GetMapping("/cars")
    public String findAll(Model model){
        model.addAttribute("cars",carService.findAll());
        return "listcars";
    }

    @GetMapping("/cars/{carId}")
    public Car getCar(@PathVariable int carId){

        Car b = carService.findById(carId);
        if(b == null){
            throw new ProductNotFoundException("Product Id not found- "+carId);
        }
        return b;
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute Car b){
        carService.save(b);
        return "redirect:cars";
    }

    @GetMapping("/carsView")
    public String carsViewForUser(Model model){
        model.addAttribute("cars",carService.findAll());
        return "list-of-cars-for-user";
    }

}
