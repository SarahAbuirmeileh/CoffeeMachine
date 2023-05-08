package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;
import javax.swing.JOptionPane;

public class CoffeeMachineGUI extends javax.swing.JFrame {
    
    CoffeeMachine cm;
    CoffeeMachine cm1 = new CoffeeMachine();
    LoggerDatabaise loggerDatabaise = new LoggerDatabaise();
    
    public CoffeeMachineGUI() {
        initComponents();
        cm = cm1.start();
        cm.setLogger(loggerDatabaise);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        dAmericanoRadioButton = new javax.swing.JRadioButton();
        dEspressoRadioButton = new javax.swing.JRadioButton();
        sEspressoRadioButton = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sAmericanoRadioButton = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        grindLevelSlide = new javax.swing.JSlider();
        jLabel22 = new javax.swing.JLabel();
        cleanButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        beansContanierText = new javax.swing.JTextField();
        waterContainerText = new javax.swing.JTextField();
        addBeans = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee Machine ");
        setBackground(new java.awt.Color(214, 199, 145));

        jLabel15.setBackground(new java.awt.Color(128, 97, 53));
        jLabel15.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel15.setText("  Please choose your coffee type: ");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53), 3));

        jLabel16.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel16.setText(" Americano ");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53), 2));

        buttonGroup1.add(dAmericanoRadioButton);
        dAmericanoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAmericanoRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(dEspressoRadioButton);
        dEspressoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEspressoRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(sEspressoRadioButton);
        sEspressoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sEspressoRadioButtonActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel20.setText("  Double   ");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53)));

        jLabel17.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel17.setText("  Single ");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53)));

        jLabel21.setBackground(new java.awt.Color(255, 102, 153));
        jLabel21.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel21.setText(" Espresso ");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53), 2));

        buttonGroup1.add(sAmericanoRadioButton);
        sAmericanoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sAmericanoRadioButtonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel23.setText("  Double   ");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53)));

        jLabel24.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel24.setText("  Single ");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(sEspressoRadioButton)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(dEspressoRadioButton))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel23)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(sAmericanoRadioButton)
                                .addGap(71, 71, 71)
                                .addComponent(dAmericanoRadioButton))
                            .addComponent(jLabel16))
                        .addGap(57, 57, 57))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel16))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sEspressoRadioButton)
                    .addComponent(dEspressoRadioButton)
                    .addComponent(sAmericanoRadioButton)
                    .addComponent(dAmericanoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel17))
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addGap(54, 54, 54))
        );

        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setText("Turn off");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 35), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        startButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        startButton.setText("Start");
        startButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53), 2));
        startButton.setEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        grindLevelSlide.setBackground(new java.awt.Color(128, 97, 53));
        grindLevelSlide.setMajorTickSpacing(1);
        grindLevelSlide.setMaximum(10);
        grindLevelSlide.setMinimum(1);
        grindLevelSlide.setMinorTickSpacing(1);
        grindLevelSlide.setPaintLabels(true);
        grindLevelSlide.setPaintTicks(true);
        grindLevelSlide.setValue(5);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel22.setText("  Grinde level ");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cleanButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        cleanButton.setText("clean");
        cleanButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 97, 53), 2));
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(119, 117, 94));
        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("Beans Amount");

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText("Water Container");

        waterContainerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterContainerTextActionPerformed(evt);
            }
        });

        addBeans.setBackground(new java.awt.Color(128, 97, 53));
        addBeans.setForeground(new java.awt.Color(255, 255, 255));
        addBeans.setText("Add Beans");
        addBeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBeansActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(128, 97, 53));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Water");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(beansContanierText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(waterContainerText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBeans)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(grindLevelSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grindLevelSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBeans, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beansContanierText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterContainerText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.getAccessibleContext().setAccessibleName(" ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cm.stop();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sEspressoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sEspressoRadioButtonActionPerformed
        // TODO add your handling code here:
        if (sEspressoRadioButton.isSelected())
            startButton.setEnabled(true);
    }//GEN-LAST:event_sEspressoRadioButtonActionPerformed

    private void dEspressoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEspressoRadioButtonActionPerformed
        if (dEspressoRadioButton.isSelected())
            startButton.setEnabled(true);
    }//GEN-LAST:event_dEspressoRadioButtonActionPerformed

    private void sAmericanoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sAmericanoRadioButtonActionPerformed
        if(sAmericanoRadioButton.isSelected())
            startButton.setEnabled(true);
    }//GEN-LAST:event_sAmericanoRadioButtonActionPerformed

    private void dAmericanoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAmericanoRadioButtonActionPerformed
        if(dAmericanoRadioButton.isSelected())
            startButton.setEnabled(true);
    }//GEN-LAST:event_dAmericanoRadioButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        int choice =0;
        String coffeeType = "";
        if(sEspressoRadioButton.isSelected()){
            choice = 1;
            coffeeType = "Single Espresso";
        } else if (dEspressoRadioButton.isSelected()){
            choice =2;
            coffeeType = "Double Espresso";
        }else if (sAmericanoRadioButton.isSelected()){
            choice =3;
            coffeeType = "Single Americano";
        }else if(dAmericanoRadioButton.isSelected()){
            choice = 4;
            coffeeType = "Double Americano";
        }

        try{
            cm.brewer(choice,grindLevelSlide.getValue());
        }
        catch (WastedTrayException e) {
        JOptionPane.showMessageDialog(this, """
            the wasted tray must be cleaning,
            If you want to clean it click the clean button,
            Other wise you cannot make your coffee""");
            startButton.setEnabled(false);
        } catch (OutOfBeansException e) {
            JOptionPane.showMessageDialog(this, "There is no enough beans, pleas fill it");
            startButton.setEnabled(false);
            return;
        } catch (OutOfWaterException e) {
            JOptionPane.showMessageDialog(this, "There is no enough water, pleas fill it");
            startButton.setEnabled(false);
            return;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        JOptionPane.showMessageDialog(this,
            """
            The coffee cup has been made successfully!!
             The caffeine amount in this cup in grams = """ + cm.getBeans().getCaffeine(choice));
        
        cm.getLogger().log("The" + coffeeType + "cup has been mad successfully, " 
            +"with caffeine amount " + cm.getBeans().getCaffeine(choice) );
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_startButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "You want to clean your teay?");
        startButton.setEnabled(true);
        WasteTray.level=0;
        cm.stop();
        cm.getLogger().log("The wasted tray has been cleaned");
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void addBeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBeansActionPerformed
        int beansAmount=0;
        try {
            beansAmount=Integer.parseInt(beansContanierText.getText());
            if (beansAmount < 0) {
                JOptionPane.showMessageDialog(this, "You have to enter a positave integer");
                beansContanierText.setText("");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have to enter a positave integer");
            startButton.setEnabled(false);
            return;
        }finally{
            beansContanierText.setText("");
        }
        boolean addPercentage =false;
        try {
            cm.getBeans().fill(beansAmount);
            addPercentage=true;
        } catch (BeansExceededCapacityException ex) {
            JOptionPane.showMessageDialog(this,"The beans you want to add exceeded the beans container capacity"
            + "You have to enter a positave integer not greater than " 
            + (cm.getBeans().getCapacity() - cm.getBeans().getLevel()));
            startButton.setEnabled(false);
        }
        finally{
            beansContanierText.setText("");
        }
        if (addPercentage){
            do{
               try{
                   cm.getBeans().setArabicaPercentage(Integer.parseInt(JOptionPane.showInputDialog(this,"Enter the arabica percentage% ")));
                   cm.getBeans().setRobustaPercentage(100-(int)(100*cm.getBeans().getArabicaPercentage()));
                   break;
               }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(this, "You must enter a positive integer");
               }catch (InvalidDataException e){
                   JOptionPane.showMessageDialog(this, "Enter an integer from 0 to 100");
               }
           }while(true);
        }
        cm.stop();
        cm.getLogger().log("The beans container has been added " + beansAmount + "grams of beans"
                + "\nthe arabica percantage:" + cm.getBeans().getArabicaPercentage() + " and robusta percantage :"
                + cm.getBeans().getRobustaPercentage());
        startButton.setEnabled(true);
    }//GEN-LAST:event_addBeansActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            int waterAmount=0;
        try {
            waterAmount=Integer.parseInt(waterContainerText.getText());
            if (waterAmount < 0) {
                JOptionPane.showMessageDialog(this, "You have to enter a positave integer");
                startButton.setEnabled(false); waterContainerText.setText("");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have to enter a positave integer");
            startButton.setEnabled(false);
            return;
        }
        finally{
            waterContainerText.setText("");
        }
        try {
            cm.getWater().fill(waterAmount);
        } catch (WaterExceededCapacityException ex) {
            JOptionPane.showMessageDialog(this,"The water you want to add exceeded the water container capacity"
            + "You have to enter a positave integer not greater than " 
            + (cm.getWater().getCapacity()-cm.getWater().getLevel()));
            startButton.setEnabled(false);
        }
        finally{
            waterContainerText.setText("");
        }
        cm.getLogger().log("The water container has been added " + waterAmount + "ml of water");
        startButton.setEnabled(true);
        cm.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void waterContainerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterContainerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waterContainerTextActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CoffeeMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoffeeMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoffeeMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoffeeMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeeMachineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBeans;
    private javax.swing.JTextField beansContanierText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cleanButton;
    private javax.swing.JRadioButton dAmericanoRadioButton;
    private javax.swing.JRadioButton dEspressoRadioButton;
    private javax.swing.JSlider grindLevelSlide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton sAmericanoRadioButton;
    private javax.swing.JRadioButton sEspressoRadioButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField waterContainerText;
    // End of variables declaration//GEN-END:variables
}