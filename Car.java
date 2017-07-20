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
public class Car implements Searchable {
    String ID;
    CarSpec carSpec;
    
    public Car(String ID, CarSpec carSpec) {
        this.ID = ID;
        this.carSpec = carSpec;
    }

    @Override
    public Searchable Search(String find) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
