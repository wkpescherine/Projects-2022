package v1;

import java.awt.*;
import javax.swing.*;

public class CharacterPanel{
    JPanel character = new JPanel();
    CharSlotHandler charSlot = new CharSlotHandler();

    CharacterPanel(){
        for(int a = 0; a<charSlot.characters.size(); a++){
            slotBuilder(charSlot.characters.get(a), a);
        }
        slotBuilder("New Game", 0);

        character.setLayout(null);
        character.setPreferredSize(new Dimension(780,570));
        character.setBackground(Color.BLACK);
        character.setVisible(false);
    }

    public void slotBuilder(String name, int index){
        for(int a = 0; a<charSlot.characters.size(); a++){
            slotBuilder(charSlot.characters.get(a), a);
        }
        //int start = charSlot.characters.size();
        int start = 78;
        JPanel jpanel[] = new JPanel[start];
        JButton jbutton[] = new JButton[start];
        JButton jbtnpage[] = new JButton[start];
        JLabel jlabel[] = new JLabel[start];

        jpanel[index] = new JPanel();
        jbutton[index] = new JButton("Play");
        jlabel[index] = new JLabel(name);
        JPanel slot = jpanel[index];
        JButton Play = jbutton[index];
        JLabel nameLabel = jlabel[index];
        slot.setLayout(new FlowLayout());
        slot.setPreferredSize(new Dimension (100,50));
        slot.add(nameLabel);
        slot.add(Play);
        character.add(slot);
    }
}