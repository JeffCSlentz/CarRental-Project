/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental.project;

import java.util.LinkedList;

/**
 *
 * @author Jcszk9
 */
public class Controller {
    
    LinkedList<Searchable> customers = new LinkedList();
    LinkedList<Searchable> carSpecs = new LinkedList();
    LinkedList<Searchable> cars = new LinkedList();
    LinkedList<Searchable> rentals = new LinkedList();
    enum searchEnum{CUSTOMER, CARSPEC, CAR, RENTAL};
    int currentRentalIndex = 0;
    public void addCarSpec(CarSpec carSpec){
        carSpecs.add(carSpec);
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    public void addRental(Rental rental){
        rentals.add(rental);
    }
    
    public void addCar(Car car){
        cars.add(car);
    }

    public LinkedList<Searchable> getCustomers() {
        return customers;
    }

    public LinkedList<Searchable> getCarSpecs() {
        return carSpecs;
    }

    public LinkedList<Searchable> getCars() {
        return cars;
    }

    public LinkedList<Searchable> getRentals() {
        return rentals;
    }
    
    public LinkedList<Searchable> getAvailableCars(){
        LinkedList<Searchable> carsCopy = cars;
        
        for(Searchable searchableCar: cars){
            Car car = (Car) searchableCar;
            for(Searchable searchableRental: rentals){
                Rental rental = (Rental) searchableRental;  
                
                if (rental.getCar().equals(car) && rental.getStatus().equals(Rental.Status.RENTED)){
                    carsCopy.remove(car);
                }
            }
        }
        return carsCopy;
    }
    
    public void rentCar(Car car, Customer customer){
        Rental rental = new Rental( Integer.toString(currentRentalIndex++), car, customer);
        addRental(rental);
    }
    public Searchable searchFor(String find, searchEnum sE){
        LinkedList<Searchable> searchables;
        switch (sE) {
            case CAR:       searchables = cars;
                            break;
            case CARSPEC:   searchables = carSpecs;
                            break;
            case CUSTOMER:  searchables = customers;
                            break;
            case RENTAL:    searchables = rentals;
                            break;
            default:        searchables = customers;
                            break;
        }   
        for(Searchable searchable: searchables){
            if (searchable.matches(find)){
                return searchable;
            }
        }
        return null;
    }
}
