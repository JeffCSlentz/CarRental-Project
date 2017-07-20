/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental.project;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jcszk9
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    Controller controller;
    public MainFrame(Controller controller) {
        this.controller = controller;
        initComponents();
        initCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        rentCarButton = new javax.swing.JButton();
        rentedCarsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("Search");

        rentCarButton.setText("Rent Car");
        rentCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarButtonActionPerformed(evt);
            }
        });

        rentedCarsButton.setText("Rented Cars");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Telephone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rentCarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rentedCarsButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentCarButton)
                    .addComponent(rentedCarsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarButtonActionPerformed
        int o = this.customerTable.getSelectedRow();
        String name = (String) this.customerTable.getValueAt(o, 0);
        controller.setSelectedCustomerName(name);
        AccountFrame accountFrame= new AccountFrame(controller);
        accountFrame.setVisible(true);
    }//GEN-LAST:event_rentCarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton rentCarButton;
    private javax.swing.JButton rentedCarsButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables

    private void initCustomers() {
        DefaultTableModel model = (DefaultTableModel) this.customerTable.getModel();
        LinkedList<Searchable> customers = controller.getCustomers();
        LinkedList<Customer> Customer= controller.returnCustomer();
        for(Customer searchable: Customer){
            Object[] data= new Object[]{searchable.name, searchable.phone, searchable.address};
            model.addRow(data);
            //model.addRow(new Object[]{searchable.toString(), customer.getPhone(), customer.getAddress()});
        }
        
        this.customerTable.setModel(model);
    }
}
