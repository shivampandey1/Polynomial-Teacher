/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4a3main;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
//importing libraries
public class U4A3Main extends JFrame implements ActionListener{
JTextArea information;
JButton launchBtn;
Container frame;
//declaring gui elements
public U4A3Main () {

    super("Learning Polynomials");
    frame = getContentPane ();
    frame.setLayout(null);
    information = new JTextArea ("Welcome to this Polynomial Lesson, where you will learn to add, subtract, and multiply polynomials. \n This program consists of 4 main compnents: the Addition, Subtraction, and Multiplication lessons, followed by a final test. \n For further instructions, please reference the 'user guide' included with this application. \n During testing, please do not include spaces in your answers, \n and use computer formatting for your exponents.");
    //setting up gui elemnts
    launchBtn = new JButton ("Launch program");
    launchBtn.addActionListener(this);
    //telling program to check if button has been clicked
    information.setBounds(0,15,700,85);
    launchBtn.setBounds (0,100,500,50);
    //setting bounds
    frame.add (information);
    frame.add (launchBtn);
    //adding to frame
     setSize(700,600);//sets size of frame
    setVisible(true);//sets it to be visible
    setDefaultCloseOperation (EXIT_ON_CLOSE);//ends the process
}
@Override
public void actionPerformed (ActionEvent evt){
    if (evt.getSource () == launchBtn)
    {   
        mainMenu launcher = new mainMenu();

launcher.setVisible(true);
this.dispose();
    }//teling java what to do when launch button is pressed (launch main menu)

     
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        U4A3Main launcher = new U4A3Main();
    }//launcher
    
}

