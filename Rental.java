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
    public Searchable Search(String find) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Status {RENTED, RETURNED};
    
    Car car;
    Customer customer;
    Calendar rentDate;
    Calendar returnDate;
    Status status;
    

    public Rental(Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
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
