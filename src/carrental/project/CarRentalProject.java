/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jcszk9
 */
public class CarRentalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        
        //CarSpecs
        CarSpec carspec1 = new CarSpec("Toyota", "Highlander", 2005, CarSpec.Size.LARGE);
        CarSpec carspec2 = new CarSpec("Bugatti", "Veyron", 2017, CarSpec.Size.SMALL);
        CarSpec carspec3 = new CarSpec("Dacia", "Denem", 1981, CarSpec.Size.MEDIUM);
        CarSpec carspec4 = new CarSpec("US Army", "M1 Abrams", 1995, CarSpec.Size.HUGE);
        
        controller.addCarSpec(carspec1);
        controller.addCarSpec(carspec2);
        controller.addCarSpec(carspec3);
        controller.addCarSpec(carspec4);
        
        //Customers
        Customer customer1 = new Customer("Mr. Bean", "123-684-1023", "1023 Silly Lane, UK");
        Customer customer2 = new Customer("Skelebro", "666-666-6667", "666 Spook Street, USA");
        Customer customer3 = new Customer("Captain America", "816-227-8246", "872 Patriot Avenue, USA");
        
        controller.addCustomer(customer1);
        controller.addCustomer(customer2);
        controller.addCustomer(customer3);
        
        //Cars
        Car car1 = new Car("0", carspec1);
        Car car2 = new Car("1", carspec1);
        
        Car car3 = new Car("2", carspec2);
        
        Car car4 = new Car("3", carspec3);
        Car car5 = new Car("4", carspec3);
        
        Car car6 = new Car("5", carspec4);
        
        controller.addCar(car1);
        controller.addCar(car2);
        controller.addCar(car3);
        controller.addCar(car4);
        controller.addCar(car5);
        controller.addCar(car6);
        
        MainFrame mainFrame = new MainFrame(controller);
        mainFrame.setVisible(true);
        
        String url = "jdbc:mysql://KC-SCE-APPDB01:3306/jcszk9?zeroDateTimeBehavior=convertToNull";
        String username = "jcszk9";
        String password = "qWf3DexVlWe8n5Nd1";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
}
    }
    
}
