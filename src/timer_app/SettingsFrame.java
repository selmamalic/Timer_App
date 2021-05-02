package timer_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class SettingsFrame extends javax.swing.JFrame {

    public SettingsFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ColorFrame = new javax.swing.JFrame();
        onTimeButton = new javax.swing.JRadioButton();
        countdownButton = new javax.swing.JRadioButton();
        chooseColorButton = new javax.swing.JButton();
        colorLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        speedLabel = new javax.swing.JLabel();
        onTimeTextField = new javax.swing.JFormattedTextField();
        countdownTextField = new javax.swing.JFormattedTextField();
        speedSpinner = new javax.swing.JSpinner();
        mylabel = new javax.swing.JLabel();

        ColorFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        ColorFrame.setTitle("Color blinking frame");
        ColorFrame.setLocation(new java.awt.Point(800, 250));
        ColorFrame.setSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout ColorFrameLayout = new javax.swing.GroupLayout(ColorFrame.getContentPane());
        ColorFrame.getContentPane().setLayout(ColorFrameLayout);
        ColorFrameLayout.setHorizontalGroup(
            ColorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ColorFrameLayout.setVerticalGroup(
            ColorFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setForeground(java.awt.Color.red);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 320));

        buttonGroup1.add(onTimeButton);
        onTimeButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        onTimeButton.setForeground(new java.awt.Color(255, 0, 0));
        onTimeButton.setText("on time :");
        onTimeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        buttonGroup1.add(countdownButton);
        countdownButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        countdownButton.setForeground(new java.awt.Color(255, 0, 0));
        countdownButton.setText("countdown (mins) :");

        chooseColorButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chooseColorButton.setForeground(new java.awt.Color(255, 0, 0));
        chooseColorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timer_app/colorImg.png"))); // NOI18N
        chooseColorButton.setText("Choose color");
        chooseColorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chooseColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorButtonActionPerformed(evt);
            }
        });

        colorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(255, 0, 0));
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        colorLabel.setLabelFor(chooseColorButton);
        colorLabel.setText("No color selected");
        colorLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        startButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        startButton.setForeground(new java.awt.Color(255, 0, 0));
        startButton.setText("Start");
        startButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        stopButton.setForeground(new java.awt.Color(255, 0, 0));
        stopButton.setText("Stop");
        stopButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        speedLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        speedLabel.setForeground(new java.awt.Color(255, 0, 0));
        speedLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        speedLabel.setLabelFor(speedSpinner);
        speedLabel.setText("Speed");
        speedLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        speedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        onTimeTextField.setForeground(new java.awt.Color(255, 0, 0));
        onTimeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm:ss"))));
        onTimeTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        onTimeTextField.setText("00:00:00");

        countdownTextField.setForeground(new java.awt.Color(255, 0, 0));
        countdownTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("mm"))));
        countdownTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        countdownTextField.setText("0");

        speedSpinner.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        speedSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        speedSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                speedSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chooseColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(countdownButton, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(onTimeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(countdownTextField)
                                    .addComponent(onTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(speedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(speedSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onTimeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(countdownButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(countdownTextField))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chooseColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedLabel)
                    .addComponent(mylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(speedSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stopButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorButtonActionPerformed
        JColorChooser jcc = new JColorChooser();
        JDialog dialog = JColorChooser.createDialog(jcc, "Choose color", true, jcc, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Color color = jcc.getColor();
                colorLabel.setText("Color is selected");
                colorLabel.setFont(new Font("Arial", 1, 15));
                colorLabel.setBackground(color);
                colorLabel.setOpaque(true);
            }
        }, null);
        dialog.setVisible(true);
    }//GEN-LAST:event_chooseColorButtonActionPerformed

    Timer timer;
    JSpinner spinner;

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        timer = new Timer();
        int speed = (int) spinner.getValue() * 1000;

        if (onTimeButton.isSelected()) {
            DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
            String onTime = onTimeTextField.getText();
            LocalTime time1 = LocalTime.parse(onTime, dtf);
            LocalTime time2 = LocalTime.now();
            Duration duration = Duration.between(time2, time1);
            int i = (int) duration.getSeconds() * 1000;
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    ColorFrame.setVisible(true);
                    ColorFrame.getContentPane().setBackground(colorLabel.getBackground());
                    TimerTask task2 = new TimerTask() {
                        @Override
                        public void run() {
                            ColorFrame.getContentPane().setBackground(Color.WHITE);
                        }
                    };
                    timer.schedule(task2, speed);
                }
            };
            timer.schedule(task, i, speed);
        } else if (countdownButton.isSelected()) {
            String countDown = countdownTextField.getText();
            int countdown = (Integer.parseInt(countDown) * 60000);
            TimerTask task1 = new TimerTask() {
                @Override
                public void run() {
                    ColorFrame.setVisible(true);
                    ColorFrame.getContentPane().setBackground(colorLabel.getBackground());
                    TimerTask task2 = new TimerTask() {
                        @Override
                        public void run() {
                            ColorFrame.getContentPane().setBackground(Color.WHITE);
                        }
                    };
                    timer.schedule(task2, speed);
                }
            };
            timer.schedule(task1, countdown, speed);
        } else {
            JOptionPane.showMessageDialog(this, "No checkbox selected!");
        }

        onTimeButton.setEnabled(false);
        onTimeTextField.setEnabled(false);
        countdownButton.setEnabled(false);
        countdownTextField.setEnabled(false);
        chooseColorButton.setEnabled(false);
        colorLabel.setEnabled(false);
        speedSpinner.setEnabled(false);
        speedLabel.setEnabled(false);
        speedSpinner.setEnabled(false);
        startButton.setEnabled(false);

    }//GEN-LAST:event_startButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed

        timer.cancel();
        onTimeButton.setEnabled(true);
        onTimeTextField.setEnabled(true);
        onTimeTextField.setText("12:20:03");
        countdownButton.setEnabled(true);
        countdownTextField.setEnabled(true);
        countdownTextField.setText("0");
        chooseColorButton.setEnabled(true);
        colorLabel.setEnabled(true);
        colorLabel.setText("No color selected");
        colorLabel.setFont(new Font("Arial", 1, 12));
        colorLabel.setBackground(null);
        speedSpinner.setEnabled(true);
        speedLabel.setEnabled(true);
        speedSpinner.setEnabled(true);
        startButton.setEnabled(true);
        ColorFrame.dispose();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void speedSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_speedSpinnerStateChanged
        spinner = (JSpinner)evt.getSource();
    }//GEN-LAST:event_speedSpinnerStateChanged

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
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ColorFrame;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JRadioButton countdownButton;
    private javax.swing.JFormattedTextField countdownTextField;
    private javax.swing.JLabel mylabel;
    private javax.swing.JRadioButton onTimeButton;
    private javax.swing.JFormattedTextField onTimeTextField;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JSpinner speedSpinner;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
