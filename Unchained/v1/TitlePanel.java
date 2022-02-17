package v1;

import java.awt.*;
import javax.swing.*;

public class TitlePanel{
    JPanel title = new JPanel();
    JButton enterGame = new JButton("Click to enter");

    TitlePanel(){
        title.setLayout(null);
        title.setPreferredSize(new Dimension(780,570));
        title.setBackground(Color.BLACK);
        enterGame.setBounds(340,290,100,20);
        title.add(enterGame);
        title.setVisible(true);
    }
}