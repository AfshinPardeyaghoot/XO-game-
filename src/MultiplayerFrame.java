/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;


public class MultiplayerFrame extends javax.swing.JFrame {


    public MultiplayerFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        player1NameTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        player2NameTXT = new javax.swing.JTextField();
        playBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));

        player1NameTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        player1NameTXT.setForeground(new java.awt.Color(102, 0, 102));
        player1NameTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YOUR FRIEND NAME");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUR NAME");

        player2NameTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        player2NameTXT.setForeground(new java.awt.Color(102, 0, 102));
        player2NameTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        playBTN.setBackground(new java.awt.Color(204, 102, 255));
        playBTN.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        playBTN.setForeground(new java.awt.Color(255, 255, 255));
        playBTN.setText("LET ' S PLAY ");
        playBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBTNActionPerformed(evt);
            }
        });

        backBTN.setBackground(new java.awt.Color(204, 102, 255));
        backBTN.setForeground(new java.awt.Color(255, 255, 255));
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(player1NameTXT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(player2NameTXT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(playBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(backBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap(53, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(player1NameTXT)
                                        .addComponent(player2NameTXT)
                                        .addComponent(playBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                .addGap(77, 77, 77))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(backBTN)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(player1NameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(player2NameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(playBTN)
                                .addGap(26, 26, 26)
                                .addComponent(backBTN)
                                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new GameModeFrame().setVisible(true);
    }

    private void playBTNActionPerformed(java.awt.event.ActionEvent evt) {

        if (player1NameTXT.getText().isEmpty() || player2NameTXT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " PLEASE ENTER NAMES ! ");
        } else {
            dispose();
            char[] board = new char[9];
            for (int i = 0; i < 9; i++) {
                board[i] = '-';
            }
            Player player1 = new Player(player1NameTXT.getText(), 'x', true);
            Player player2 = new Player(player2NameTXT.getText(), 'o', false);
            new MultiplayerBoardFrame(board, player1, player2).setVisible(true);
        }

    }


    private javax.swing.JButton backBTN;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton playBTN;
    private javax.swing.JTextField player1NameTXT;
    private javax.swing.JTextField player2NameTXT;

}
