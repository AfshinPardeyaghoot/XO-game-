/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class GameModeFrame extends javax.swing.JFrame {

    /**
     * Creates new form GameModeFrame
     */
    public GameModeFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        cpuBTN = new javax.swing.JButton();
        multiplayerBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "XO GAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 0, 102))); // NOI18N

        cpuBTN.setBackground(new java.awt.Color(204, 102, 255));
        cpuBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpuBTN.setForeground(new java.awt.Color(255, 255, 255));
        cpuBTN.setText("PLAY WITH CPU");
        cpuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuBTNActionPerformed(evt);
            }
        });

        multiplayerBTN.setBackground(new java.awt.Color(204, 102, 255));
        multiplayerBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        multiplayerBTN.setForeground(new java.awt.Color(255, 255, 255));
        multiplayerBTN.setText("PLAY WITH YOUR FRIEND");
        multiplayerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerBTNActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(cpuBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(multiplayerBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap(110, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cpuBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(multiplayerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                                .addGap(110, 110, 110))
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(cpuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(multiplayerBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void cpuBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new SingleFrame().setVisible(true);
    }

    private void multiplayerBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new MultiplayerFrame().setVisible(true);
    }



    // Variables declaration - do not modify                     
    private javax.swing.JButton cpuBTN;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton multiplayerBTN;
    // End of variables declaration                   
}
