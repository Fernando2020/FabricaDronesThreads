package FabricaDrones;

public class Interface extends javax.swing.JFrame {
    public Interface() {
        initComponents();
        setTitle("FABRICA DE DRONES - by Fernando Geraldo Nogueira");
        progressaoBateria.setStringPainted(true);
        progressaoFrame.setStringPainted(true);
        progressaoHelice.setStringPainted(true);
        progressaoMotor.setStringPainted(true);
        progressaoProducao.setStringPainted(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFabrica = new javax.swing.JPanel();
        lbBateria = new javax.swing.JLabel();
        progressaoBateria = new javax.swing.JProgressBar();
        armazemBateria = new javax.swing.JTextField();
        lbFrame = new javax.swing.JLabel();
        progressaoFrame = new javax.swing.JProgressBar();
        armazemFrame = new javax.swing.JTextField();
        lbHelice = new javax.swing.JLabel();
        progressaoHelice = new javax.swing.JProgressBar();
        lbMotor = new javax.swing.JLabel();
        lbPlacaControladora = new javax.swing.JLabel();
        progressaoProducao = new javax.swing.JProgressBar();
        progressaoMotor = new javax.swing.JProgressBar();
        armazemMotor = new javax.swing.JTextField();
        armazemPlacaControladora = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        lbArmazem = new javax.swing.JLabel();
        lbProducao = new javax.swing.JLabel();
        progressaoPlacaControladora = new javax.swing.JProgressBar();
        producao = new javax.swing.JTextField();
        lbDrone = new javax.swing.JLabel();
        lbProducaoHora = new javax.swing.JLabel();
        producaoHora = new javax.swing.JTextField();
        armazemHelice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        caixasFechadasTx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUDI");
        setResizable(false);

        lbBateria.setText("Baterias");

        progressaoBateria.setStringPainted(true);

        armazemBateria.setEditable(false);
        armazemBateria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbFrame.setText("Frames");

        progressaoFrame.setStringPainted(true);

        armazemFrame.setEditable(false);
        armazemFrame.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbHelice.setText("Hélices");

        progressaoHelice.setStringPainted(true);

        lbMotor.setText("Motores");

        lbPlacaControladora.setText("Placas Controladoras");

        progressaoProducao.setStringPainted(true);

        progressaoMotor.setStringPainted(true);

        armazemMotor.setEditable(false);
        armazemMotor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        armazemPlacaControladora.setEditable(false);
        armazemPlacaControladora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        lbArmazem.setText("Armazem");

        lbProducao.setText("Produção");

        progressaoPlacaControladora.setStringPainted(true);

        producao.setEditable(false);
        producao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbDrone.setText("Drone");

        lbProducaoHora.setText("Produção/Hora Un");

        producaoHora.setEditable(false);
        producaoHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        armazemHelice.setEditable(false);
        armazemHelice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Caixas Fechadas");

        caixasFechadasTx.setEditable(false);
        caixasFechadasTx.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Controle de Produção de Drones");

        javax.swing.GroupLayout panelFabricaLayout = new javax.swing.GroupLayout(panelFabrica);
        panelFabrica.setLayout(panelFabricaLayout);
        panelFabricaLayout.setHorizontalGroup(
            panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFabricaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFabricaLayout.createSequentialGroup()
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFabricaLayout.createSequentialGroup()
                                .addComponent(progressaoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(armazemMotor, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFabricaLayout.createSequentialGroup()
                                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(progressaoHelice, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMotor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(armazemHelice))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFabricaLayout.createSequentialGroup()
                                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(progressaoFrame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(progressaoBateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbFrame, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbBateria, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lbHelice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbArmazem)
                                    .addComponent(armazemBateria, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(armazemFrame)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFabricaLayout.createSequentialGroup()
                                .addComponent(progressaoPlacaControladora, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(armazemPlacaControladora)))
                        .addGap(18, 18, 18)
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFabricaLayout.createSequentialGroup()
                                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDrone)
                                    .addComponent(progressaoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caixasFechadasTx)
                                    .addComponent(producao)
                                    .addComponent(producaoHora, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelFabricaLayout.createSequentialGroup()
                                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(lbProducaoHora)
                                            .addComponent(lbProducao))
                                        .addGap(0, 33, Short.MAX_VALUE))))
                            .addGroup(panelFabricaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(panelFabricaLayout.createSequentialGroup()
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPlacaControladora)
                            .addGroup(panelFabricaLayout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelFabricaLayout.setVerticalGroup(
            panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFabricaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFabricaLayout.createSequentialGroup()
                        .addComponent(lbProducao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lbProducaoHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producaoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caixasFechadasTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(panelFabricaLayout.createSequentialGroup()
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBateria)
                            .addComponent(lbArmazem)
                            .addComponent(lbDrone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(progressaoBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(armazemBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(progressaoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFrame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(progressaoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(armazemFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHelice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(progressaoHelice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(armazemHelice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(lbMotor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(progressaoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(armazemMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(lbPlacaControladora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progressaoPlacaControladora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(armazemPlacaControladora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFabrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFabrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        new Thread(new Bateria(this)).start();
        new Thread(new Frame(this)).start();
        new Thread(new Helice(this)).start();
        new Thread(new Motor(this)).start();
        new Thread(new PlacaControladora(this)).start();
        new Thread(new Producao()).start();
    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
   
    public void setProgressoBateria(int progresso){
        this.progressaoBateria.setValue(progresso);
    }
    public void setArmazemBateria(String contador){
        this.armazemBateria.setText("");
        this.armazemBateria.setText(contador);
    }
    
    public void setProgressoFrame(double progresso){
        this.progressaoFrame.setValue((int)progresso);
    }
    public void setArmazemFrame(String contador){
        this.armazemFrame.setText("");
        this.armazemFrame.setText(contador);
    }
    
    public void setProgressoHelice(int progresso){
        this.progressaoHelice.setValue(progresso);
    }
    public void setArmazemHelice(String contador){
        this.armazemHelice.setText("");
        this.armazemHelice.setText(contador);
    }
    
    public void setProgressoMotor(int progresso){
        this.progressaoMotor.setValue(progresso);
    }
    public void setArmazemMotor(String contador){
        this.armazemMotor.setText("");
        this.armazemMotor.setText(contador);
    }
    
    public void setProgressoPlacaControladora(int progresso){
        this.progressaoPlacaControladora.setValue(progresso);
    }
    public void setArmazemPlacaControladora(String contador){
        this.armazemPlacaControladora.setText("");
        this.armazemPlacaControladora.setText(contador);
    }
    
    private void producaoHoraCalculo(float tempoMedio){
        if(producaoHora.getText().equals("Calculando...")){
            producaoHora.setText(""+(int)(3600/(tempoMedio/1000)));
        }
    }

    private void limparCampos(){
        this.armazemBateria.setText("");
        this.armazemFrame.setText("");
        this.armazemHelice.setText("");
        this.armazemMotor.setText("");
        this.armazemPlacaControladora.setText("");
    }
    
    private void consumirRecursos(){
        Bateria.contador = Bateria.contador-2;
        Frame.contador = Frame.contador-1;
        Helice.contador = Helice.contador-4;
        Motor.contador = Motor.contador-4;
        PlacaControladora.contador = PlacaControladora.contador-1;
        Bateria.progresso = Bateria.contador*5;
        Frame.progresso = Frame.contador*10;
        Helice.progresso = Helice.contador*1.25;
        Motor.progresso = Motor.contador*6.25;
        PlacaControladora.progresso = PlacaControladora.contador*12.5;
        limparCampos();
        this.armazemBateria.setText(""+Bateria.contador);
        this.armazemFrame.setText(""+Frame.contador);
        this.armazemHelice.setText(""+Helice.contador);
        this.armazemMotor.setText(""+Motor.contador);
        this.armazemPlacaControladora.setText(""+PlacaControladora.contador);
        this.progressaoBateria.setValue((int)Bateria.progresso);
        this.progressaoFrame.setValue((int)Frame.progresso);
        this.progressaoHelice.setValue((int)Helice.progresso);
        this.progressaoMotor.setValue((int)Motor.progresso);
        this.progressaoPlacaControladora.setValue((int)PlacaControladora.progresso);
    }
    
    public class Producao implements Runnable{
            public void run(){
                producaoHora.setText("Calculando...");
                long tempoInicial = System.currentTimeMillis();
                int pro = 0;
                int caixa = 0;
                producao.setText(""+pro);
                caixasFechadasTx.setText(""+caixa);
               while(true){  
                try{
                    Thread.sleep(1);
                }catch(Exception e){}
                if(
                  Bateria.contador >= 2 &&
                  Frame.contador >= 1 &&
                  Helice.contador >= 4 &&
                  Motor.contador >= 4 &&
                  PlacaControladora.contador >= 1
                  ){
                     consumirRecursos();
                     for(int i = 0; i<=100; i++){
                         progressaoProducao.setValue(i);
                         try{
                             Thread.sleep(50);
                         }catch(Exception e){}
                     }
                     progressaoProducao.setValue(0);
                     ++pro;
                     producao.setText(""+pro);
                     if(pro > 7){
                         pro = 0;caixa++;
                         producao.setText(""+pro);
                         caixasFechadasTx.setText(""+caixa);
                     }
                     producaoHoraCalculo(System.currentTimeMillis() - tempoInicial);
                 }
               }               
            }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField armazemBateria;
    private javax.swing.JTextField armazemFrame;
    private javax.swing.JTextField armazemHelice;
    private javax.swing.JTextField armazemMotor;
    private javax.swing.JTextField armazemPlacaControladora;
    private javax.swing.JTextField caixasFechadasTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbArmazem;
    private javax.swing.JLabel lbBateria;
    private javax.swing.JLabel lbDrone;
    private javax.swing.JLabel lbFrame;
    private javax.swing.JLabel lbHelice;
    private javax.swing.JLabel lbMotor;
    private javax.swing.JLabel lbPlacaControladora;
    private javax.swing.JLabel lbProducao;
    private javax.swing.JLabel lbProducaoHora;
    private javax.swing.JPanel panelFabrica;
    private javax.swing.JTextField producao;
    private javax.swing.JTextField producaoHora;
    private javax.swing.JProgressBar progressaoBateria;
    private javax.swing.JProgressBar progressaoFrame;
    private javax.swing.JProgressBar progressaoHelice;
    private javax.swing.JProgressBar progressaoMotor;
    private javax.swing.JProgressBar progressaoPlacaControladora;
    private javax.swing.JProgressBar progressaoProducao;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
