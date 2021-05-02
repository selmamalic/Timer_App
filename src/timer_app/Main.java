package timer_app;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
      int optionPanel = JOptionPane.showOptionDialog(null, "Choose option ", "Option ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Settings" , "Close"}, null);         
                switch(optionPanel)
                        {
                              case JOptionPane.YES_OPTION:
                                       SettingsFrame frame = new SettingsFrame();
                                       frame.setVisible(true);
                              break;
                              case JOptionPane.NO_OPTION:
                                       System.exit(0);
                              break;
                        }
    }

}
