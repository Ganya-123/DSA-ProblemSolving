package com.example.demo.car;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * CarService class contains the business logic for filtering cars based on various criteria.
 */
@Service
public class CarService {

    private List<Car> carList;

    public CarService() {
        carList = List.of(
                new Car(1, 5000, "Toyota", "Corolla", 40, 4.5),
                new Car(2, 7000, "Honda", "Civic", 30, 4.7),
                new Car(3, 15000, "Ford", "Mustang", 50, 4.8),
                new Car(4, 10000, "BMW", "X5", 20, 4.9),
                new Car(5, 8000, "Toyota", "Camry", 25, 4.6)
        );
    }

    /**
     * Best Case (O(1)): If the first car in the list matches the price range and we stop early. However, we still need to iterate through the entire list, so the best case will still be O(n).
     * Average/Worst Case (O(n)): The loop runs for every car in the list, so the time complexity is O(n), where n is the number of cars in carList.
     * Space Complexity:
     * O(n): The space complexity depends on how many cars match the price range. In the worst case, if all cars match the range, the result list will grow to the size of n (all cars).
     */
    public List<Car> findCarsByPriceRange(double minPrice, double maxPrice) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {
                result.add(car);
            }
        }
        return result;
    }

    /**
     * Time Complexity:
     * Best Case (O(1)): If the first car matches the brand, but again, the entire list needs to be checked, so the best case remains O(n).
     * Average/Worst Case (O(n)): The loop runs over the entire car list, so the time complexity is O(n).
     * Space Complexity:
     * O(n): In the worst case, where all cars have the same brand, the result list will grow to the size of n (all cars). If none of the cars match, the result list will be empty (O(1)).
     */
    public List<Car> findCarsByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                result.add(car);
            }
        }
        return result;
    }


    /**
     * Time Complexity:
     * Best Case (O(1)): If the first car matches the mileage, the best case is still O(n) because we iterate through all cars.
     * Average/Worst Case (O(n)): The loop iterates over every car in the list to check the mileage, making it O(n).
     * Space Complexity:
     * O(n): In the worst case, if all cars have mileage greater than or equal to minMileage, the result list will store all cars, resulting in space complexity of O(n).
     */
    public List<Car> findCarsByMileage(double minMileage) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getMileageInKM() >= minMileage) {
                result.add(car);
            }
        }
        return result;
    }


    /**
     * Time Complexity:
     * Best Case (O(1)): Even if the first car matches the rating, we still need to iterate over the entire list, so best case remains O(n).
     * Average/Worst Case (O(n)): The loop goes through each car in the list to check if the rating is greater than or equal to minRating, resulting in time complexity O(n).
     * Space Complexity:
     * O(n): In the worst case, if all cars have a rating greater than or equal to minRating, the result list will hold all cars, making the space complexity O(n).
     */
    public List<Car> findCarsByRating(double minRating) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getRating() >= minRating) {
                result.add(car);
            }
        }
        return result;
    }

}
