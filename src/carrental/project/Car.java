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
public class Car implements Searchable {
    String ID;
    CarSpec carSpec;
    
    public Car(String ID, CarSpec carSpec) {
        this.ID = ID;
        this.carSpec = carSpec;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public CarSpec getCarSpec() {
        return carSpec;
    }

    public void setCarSpec(CarSpec carSpec) {
        this.carSpec = carSpec;
    }
    
    
    @Override
    public boolean matches(String find) {
        return ID.equals(find);
    }

    @Override
    public boolean includes(String item) {
        String make = this.carSpec.getMake();
        String model = this.carSpec.getModel();
        String year = String.valueOf(this.carSpec.getYear());
        return (ID.contains(item) || make.contains(item) || model.contains(item) || year.contains(item));
    }
   
}
