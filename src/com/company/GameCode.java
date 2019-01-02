package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.InputEvent;
//import java.awt.Button;
//This is how you would specifically implement the two needed

public class GameCode {

public boolean gamerunning = true;
public int buttoninput;
JButton button1 = new JButton(" 1 ");
JButton button2 = new JButton(" 2 ");
JButton button3 = new JButton(" 3 ");
JButton button4 = new JButton(" 4 ");
//replace text with Icon icon to make picture buttons

button1.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            buttoninput = 1;
        }
    };

public void gamerun()
    {
        System.out.println("Welcome to SIMON SAYS! All you can do here is click buttons to match the patterns, so do it.");
        while (gamerunning)
        {
            on buttonClick
            {
                BackEnd.checkAnswer(buttoninput);
            }
        }
    }
}
