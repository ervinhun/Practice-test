/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;

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
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }
    
    /**
     * Gets the total value of all cars for sale.
     * @return the total value of all cars for sale.
     */
    public double getTotalCarValues()
    {
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }
    
    /**
     * Gets the cheapest car from the list ov cars for sale.
     * @return the cheapest car from the list ov cars for sale.
     */
    public Car getCheapestCar()
    {
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }
    
    /**
     * Sells the car in the parameter.
     * @param car The car to be sold.
     */
    public void sellCar(Car car)
    {
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }

    /**
     * Nothing to do here
     * @return 
     */
    public List<Car> getCarsForSale()
    {
        //TODO Implement this method
        return carsForSale;
    }
        
    /**
    * Sort the list of cars for sale in order from cheapest to most expensive
    */    
    public void sortCarsByPrice()
    {
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }
    
    /**
    * Sort the list of cars for sale in order from slowest to fastest.
    */    
    public void sortCarsByMaxSpeed()
    {
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }
    
    /**
     * Get a random car for sale.
     * @return a randomly selected car for sale.
     */
    public Car presentRandomCarToCustomer()
    {
        //TODO Implement this method
        throw new UnsupportedOperationException();
    }

}