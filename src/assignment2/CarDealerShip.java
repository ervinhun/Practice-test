/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.*;

/**
 *
 * @author pgn
 */
public class CarDealerShip
{

    private List<Car> carsForSale = new ArrayList<>();

    
    
    /**
     * Adds another car for sale but only if the value is not null, and only if
     * the car has a price greater than zero.
     *
     * @param car The car to add to list of cars for sale.
     */
    public void addCarForSale(Car car)
    {
        if (car != null && car.getPrice() > 0)
            carsForSale.add(car);
    }
    
    /**
     * Gets the total value of all cars for sale.
     * @return the total value of all cars for sale.
     */
    public double getTotalCarValues()
    {
        double price = 0;
        for (Car car : carsForSale)
            price += car.getPrice();
        return price;
    }
    
    /**
     * Gets the cheapest car from the list ov cars for sale.
     * @return the cheapest car from the list ov cars for sale.
     */
    public Car getCheapestCar()
    {
        double cheapestPrice = -1;
        Car carToReturn = null;
        for (Car car : carsForSale) {
            if (cheapestPrice == -1){
                cheapestPrice = car.getPrice();
                carToReturn = car;
            }
            else if (car.getPrice() < cheapestPrice) {
                cheapestPrice = car.getPrice();
                carToReturn = car;
            }
        }
        return carToReturn;
    }
    
    /**
     * Sells the car in the parameter.
     * @param car The car to be sold.
     */
    public void sellCar(Car car)
    {
        carsForSale.remove(car);
    }

    /**
     * Nothing to do here
     * @return 
     */
    public List<Car> getCarsForSale()
    {
        return carsForSale;
    }
        
    /**
    * Sort the list of cars for sale in order from cheapest to most expensive
    */    
    public void sortCarsByPrice()
    {
        /**List<Double> prices = new ArrayList<>();
        for (Car car : carsForSale)
            prices.add(car.getPrice());
        List<Car> carsOrderedByPrice = new ArrayList<>();

        Collections.sort(prices);
        for (int i = 0; i < prices.size(); i++)
            for (Car car : carsForSale)
                if (car.getPrice() == prices.get(i))
                    carsOrderedByPrice.add(car);
        if (carsOrderedByPrice.size() == carsForSale.size())
            carsForSale = carsOrderedByPrice;*/

        carsForSale.sort((o1, o2) -> (int)(o1.getPrice()-o2.getPrice()));
    }
    
    /**
    * Sort the list of cars for sale in order from slowest to fastest.
    */    
    public void sortCarsByMaxSpeed()
    {
       /** List<Integer> speed = new ArrayList<>();
        for (Car car : carsForSale)
            speed.add(car.getMaxKilometersPerHour());
        List<Car> carsOrderedBySpeed = new ArrayList<>();

        Collections.sort(speed);
        for (int i = 0; i < speed.size(); i++)
            for (Car car : carsForSale)
                if (car.getMaxKilometersPerHour() == speed.get(i))
                    carsOrderedBySpeed.add(car);
        if (carsOrderedBySpeed.size() == carsForSale.size())
            carsForSale = carsOrderedBySpeed;*/

        carsForSale.sort(Comparator.comparing(Car::getMaxKilometersPerHour));
    }
    
    /**
     * Get a random car for sale.
     * @return a randomly selected car for sale.
     */
    public Car presentRandomCarToCustomer()
    {
        Random random = new Random();
        return carsForSale.get(random.nextInt(carsForSale.size()));
    }

}