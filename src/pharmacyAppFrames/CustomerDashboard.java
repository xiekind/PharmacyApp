/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyAppFrames;

import API.CustomerTransaction;
import Db.customerOperation;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author laurentera_sd2022
 */
public class CustomerDashboard extends javax.swing.JFrame {

    customerOperation co = new customerOperation();
    CustomerTransaction ct = new CustomerTransaction();
//    int ecoin;

    /**
     * Creates new form CustomerDashboard
     */
    public CustomerDashboard() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        medNav.setSelectedItem("Medicine For Cough");
    }

//    public void setEcoin(int ecoin) {
//        this.ecoin = ecoin;
//    }
//
//    public int getEcoin() {
//        return this.ecoin;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OuterContainer = new javax.swing.JPanel();
        medNav = new javax.swing.JComboBox<>();
        purchaseBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        myEcoin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Purchase = new javax.swing.JMenu();
        ViewHistory = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rangie Drug Store");

        OuterContainer.setBackground(new java.awt.Color(255, 153, 204));

        medNav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine For Cough", "Medicine For Headache", "Medicine For Body pain", "Medicine For Allergies" }));
        medNav.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                medNavComponentShown(evt);
            }
        });
        medNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNavActionPerformed(evt);
            }
        });

        purchaseBtn.setText("Purchase");
        purchaseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseBtnMouseClicked(evt);
            }
        });

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Brand name", "Generic name", "Price", "Type", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tableCustomer);

        myEcoin.setText("emoney");

        javax.swing.GroupLayout OuterContainerLayout = new javax.swing.GroupLayout(OuterContainer);
        OuterContainer.setLayout(OuterContainerLayout);
        OuterContainerLayout.setHorizontalGroup(
            OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuterContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OuterContainerLayout.createSequentialGroup()
                        .addComponent(purchaseBtn)
                        .addGap(28, 28, 28)
                        .addComponent(myEcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OuterContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OuterContainerLayout.setVerticalGroup(
            OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OuterContainerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseBtn)
                    .addComponent(myEcoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Purchase.setText("Purchase");
        jMenuBar1.add(Purchase);

        ViewHistory.setText("View History");
        ViewHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewHistoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(ViewHistory);

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OuterContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewHistoryMouseClicked
        ViewHistory view = new ViewHistory();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewHistoryMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Login login = new Login();
        int input = JOptionPane.showConfirmDialog(null, "Do you want to logout?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void medNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNavActionPerformed
        Object selected = medNav.getSelectedItem();

        if (selected.equals("Medicine For Headache")) {
            tableCustomer.setModel(ct.tableHeadache());
        } else if (selected.equals("Medicine For Cough")) {
            tableCustomer.setModel(ct.tableCough());
        } else if (selected.equals("Medicine For Allergies")) {
            tableCustomer.setModel(ct.tableAllergies());
        } else if (selected.equals("Medicine For Body pain")) {
            tableCustomer.setModel(ct.tableBodyPain());
        }
    }//GEN-LAST:event_medNavActionPerformed

    private void medNavComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_medNavComponentShown

    }//GEN-LAST:event_medNavComponentShown

    private void purchaseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseBtnMouseClicked
        CustomerTransaction ct = new CustomerTransaction();

        JTextField Brandname = new JTextField();
        JTextField Genericname = new JTextField();
        JTextField Type = new JTextField();
        JTextField Quantity = new JTextField();
        Object[] message = {
            "Brand name:", Brandname,
            "Generic name:", Genericname,
            "Type:", Type,
            "Quantity:", Quantity
        };

        JOptionPane.showConfirmDialog(null, message, "Purchase Medicine", JOptionPane.OK_CANCEL_OPTION);

        String brandname = Brandname.getText();
        String genericname = Genericname.getText();
        String quantity = Quantity.getText();
        String type = Type.getText();

        if (medNav.getSelectedItem().equals("Medicine For Cough")) {
            ct.purchaseMedicineForCough(brandname, genericname, type, quantity);
            medNav.setSelectedItem("Medicine For Cough");
        } else if (medNav.getSelectedItem().equals("Medicine For Headache")) {
            ct.purchaseMedicineForHeadache(brandname, genericname, type, quantity);
            medNav.setSelectedItem("Medicine For Headache");
        } else if (medNav.getSelectedItem().equals("Medicine For Body pain")) {
            ct.purchaseMedicineForBodyPain(brandname, genericname, type, quantity);
            medNav.setSelectedItem("Medicine For Headache");
        } else if (medNav.getSelectedItem().equals("Medicine For Allergies")) {
            ct.purchaseMedicineForAllergies(brandname, genericname, type, quantity);
            medNav.setSelectedItem("Medicine For Allergies");
        }
    }//GEN-LAST:event_purchaseBtnMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerDashboard().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Logout;
    private javax.swing.JPanel OuterContainer;
    private javax.swing.JMenu Purchase;
    private javax.swing.JMenu ViewHistory;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medNav;
    private javax.swing.JLabel myEcoin;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
}
