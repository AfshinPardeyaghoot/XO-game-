import javax.swing.*;

public class SingleFrame extends javax.swing.JFrame {


    public SingleFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        startGroup = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        player1NameTXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        playBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));

        player1NameTXT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        player1NameTXT.setForeground(new java.awt.Color(102, 0, 102));
        player1NameTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUR NAME");

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

        jRadioButton1.setBackground(new java.awt.Color(153, 153, 255));
        startGroup.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("CPU");

        jRadioButton2.setBackground(new java.awt.Color(153, 153, 255));
        startGroup.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("PLAYER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("who start ?");

        jDesktopPane1.setLayer(player1NameTXT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(playBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(backBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(backBTN)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap(53, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton1)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(player1NameTXT)
                                                .addComponent(playBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                                .addGap(77, 77, 77))
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(player1NameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
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
    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new GameModeFrame().setVisible(true);
    }

    private void playBTNActionPerformed(java.awt.event.ActionEvent evt) {
        if(player1NameTXT.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"PLEASE ENTER PLAYER NAME");
        }else {
            boolean isCpu = false;
            if (jRadioButton1.isSelected()) {
                isCpu = true;
            }
            char[][] board = new char[3][3];
            Player player = new Player(player1NameTXT.getText(), 'x');
            Player cpu = new Player("cpu", 'o');
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '_';
                }
            }
            dispose();
            SingleBoardFrame singleBoardFrame2
                    = new SingleBoardFrame(board, player, cpu);
            singleBoardFrame2.setVisible(true);
            if (isCpu) {
                singleBoardFrame2.cpuButtion();
            }
        }

    }



    private javax.swing.JButton backBTN;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton playBTN;
    private javax.swing.JTextField player1NameTXT;
    private javax.swing.ButtonGroup startGroup;

}

