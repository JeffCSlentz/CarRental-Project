/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental.project;

/**
 *
 * @author Jcszk9
 */
public class CarSpec {
    private enum Size{SMALL, MEDIUM, LARGE};
    
    String make;
    String model;
    int year;
    Size size;

    public CarSpec(String make, String model, int year, Size size) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    
    
}
