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
    //I've added these so I can work with some of the customer names
    LinkedList<Customer> Customer = new LinkedList();
    LinkedList<Car> availableCars= new LinkedList();
    private String selectedCustomerName= "";
    
    public void addCarSpec(CarSpec carSpec){
        carSpecs.add(carSpec);
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
        Customer.add(customer);//Jose
    }
    
    public void addAvailableCar(Car car){
        availableCars.add(car);
    }

    public LinkedList<Customer> getCustomer() {
        return Customer;
    }

    public void setCustomer(LinkedList<Customer> Customer) {
        this.Customer = Customer;
    }

    public String getSelectedCustomerName() {
        return selectedCustomerName;
    }

    public void setSelectedCustomerName(String selectedCustomerName) {
        this.selectedCustomerName = selectedCustomerName;
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
    
    public LinkedList<Customer>returnCustomer(){
        return Customer;
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
    
    public String getCustomerName(String customerName){
        //for(LinkedList<Customer> name: this.customers){
           return ""; 
        }
}
    

