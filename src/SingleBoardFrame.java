import javax.swing.*;

public class SingleBoardFrame extends javax.swing.JFrame {

    private Player player , cpu ;
    private int counter = 0 ;
    char[][] board ;
    public SingleBoardFrame(char[][] board , Player player , Player cpu) {
        this.board = board ;
        this.cpu = cpu ;
        this.player = player ;
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        player1NameLBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        winnerLBL = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jDesktopPane2.setBackground(new java.awt.Color(153, 153, 255));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 255, 102));
        btn1.setText("  ");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        player1NameLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        player1NameLBL.setForeground(new java.awt.Color(102, 0, 102));
        player1NameLBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PLAYER  :");

        winnerLBL.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        winnerLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        backBTN.setBackground(new java.awt.Color(204, 102, 255));
        backBTN.setForeground(new java.awt.Color(255, 255, 255));
        backBTN.setText("back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(btn2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(player1NameLBL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(winnerLBL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(backBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
                jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(player1NameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(winnerLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(backBTN)))
                                .addContainerGap(150, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
                jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(player1NameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(winnerLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(backBTN)
                                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane2)
        );
        player1NameLBL.setText(player.getName());
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn1,0,0);
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn2,0,1);
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn4,1,0);
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn5,1,1);
    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn6,1,2);
    }

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        new GameModeFrame().setVisible(true);
    }

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn7,2,0);
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn8,2,1);
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn9,2,2);
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        buttonPressed(btn3,0,2);
    }

    public void buttonPressed(JButton button , int i , int j  ){

        button.setText("X");
        board[i][j] = 'x' ;
        BestMove bestMove = new BestMove();
        int win = bestMove.evaluate(board);
        if ( win == -10 ){
            finishGame();
            winnerLBL.setText(player.getName()+"IS WINNER ");
        }
        counter++ ;
        if(counter == 5 ){
            winnerLBL.setText("THE GAME IS EQUAL ");
        }
        else {

            Move move = bestMove.findBestMove(board) ;
            board[move.getRow()][move.getCol()] = 'o' ;
            win = bestMove.evaluate(board) ;
            if (win == 10) {
                finishGame();
                winnerLBL.setText(" CPU WIN !");
            }
            button.setEnabled(false);
            findCpuButton(move.getRow(),move.getCol());

        }

    }

    public void findCpuButton(int i , int j){
        JButton button = null;

        if ( i == 0 && j == 0 )
            button = btn1 ;

        else if( i == 0 && j == 1)
            button = btn2 ;

        else if( i == 0 && j == 2)
            button = btn3 ;

        else if( i == 1 && j == 0)
            button = btn4 ;

        else if( i == 1 && j == 1)
            button = btn5 ;

        else if( i == 1 && j == 2)
            button = btn6 ;

        else if( i == 2 && j == 0)
            button = btn7 ;

        else if( i == 2 && j == 1)
            button = btn8 ;

        else if( i == 2 && j == 2)
            button = btn9 ;

        button.setText("O");
        button.setEnabled(false);
    }

    public void finishGame(){

        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    public boolean isEqual(){

        boolean isEqual = true ;
        for (int i=0 ; i<3 ; i++){
            for ( int j=0 ; j<3 ; j++ ){
                if (board[i][j] == '_'){
                    isEqual = false ;
                    break;
                }
            }
        }
        return isEqual ;
    }


    private javax.swing.JButton backBTN;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel player1NameLBL;
    private javax.swing.JLabel winnerLBL;
    // End of variables declaration                   
}
