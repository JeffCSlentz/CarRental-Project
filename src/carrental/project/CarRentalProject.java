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
        
        //Customers
        Customer customer1 = new Customer("Mr. Bean", "123-684-1023", "1023 Silly Lane, UK");
        Customer customer2 = new Customer("Skelebro", "666-666-6667", "666 Spook Street, USA");
        Customer customer3 = new Customer("Captain America", "816-227-8246", "872 Patrio Avenue, USA");
        
        for(int i = 0; i > 3; i++){
            
        }
        
        MainFrame mainFrame = new MainFrame(controller);
        mainFrame.setVisible(true);
    }
    
}
