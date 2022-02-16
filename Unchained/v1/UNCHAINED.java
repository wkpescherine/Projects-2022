package v1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UNCHAINED{
    JFrame window = new JFrame("Unchained 0.1");

    UNCHAINED(){
        window.setLayout(new FlowLayout());
	    window.setSize(800, 600);
		window.getContentPane().setBackground(Color.BLACK);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }
    public static void main(String args[]){
        UNCHAINED unchained = new UNCHAINED();
    }   
}