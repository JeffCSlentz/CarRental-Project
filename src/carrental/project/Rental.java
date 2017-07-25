/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental.project;

import java.util.Calendar;

/**
 *
 * @author Jcszk9
 */
public class Rental implements Searchable {

    @Override
    public boolean matches(String find) {
        return ID.equals(find);
    }

    @Override
    public boolean includes(String item) {
        return ID.contains(item);
    }
    public enum Status {RENTED, RETURNED};
    
    String ID;
    Car car;
    Customer customer;
    Calendar rentDate;
    Calendar returnDate;
    Status status;
    

    public Rental(String ID, Car car, Customer customer) {
        this.ID = ID;
        this.car = car;
        this.customer = customer;
        this.status = Status.RENTED;
        this.rentDate = Calendar.getInstance();
    }

    public Car getCar(){
        return car;
    }
    public Calendar getRentDate() {
        return rentDate;
    }

    public void setRentDate(Calendar rentDate) {
        this.rentDate = rentDate;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
