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
    
}
