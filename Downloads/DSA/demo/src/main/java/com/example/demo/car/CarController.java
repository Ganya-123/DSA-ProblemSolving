package com.example.demo.car;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * CarController class exposes API endpoints to retrieve filtered car results.
 */
@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    /**
     * API to get cars within a specific price range.
     *
     * @param minPrice Minimum price (optional)
     * @param maxPrice Maximum price (optional)
     * @return List of cars within the specified price range
     */
    @GetMapping("/cars/price-range")
    public List<Car> getCarsByPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice) {
        return carService.findCarsByPriceRange(minPrice, maxPrice);
    }

    /**
     * API to get cars by brand.
     *
     * @param brand The car brand
     * @return List of cars matching the given brand
     */
    @GetMapping("/cars/brand")
    public List<Car> getCarsByBrand(@RequestParam String brand) {
        return carService.findCarsByBrand(brand);
    }

    /**
     * API to get cars by mileage.
     *
     * @param maxMileage Maximum mileage
     * @return List of cars within the specified mileage
     */
    @GetMapping("/cars/mileage")
    public List<Car> getCarsByMileage(@RequestParam double maxMileage) {
        return carService.findCarsByMileage(maxMileage);
    }

    /**
     * API to get cars by rating.
     *
     * @param minRating Minimum rating
     * @return List of cars with rating greater than or equal to the specified rating
     */
    @GetMapping("/cars/rating")
    public List<Car> getCarsByRating(@RequestParam double minRating) {
        return carService.findCarsByRating(minRating);
    }
}
