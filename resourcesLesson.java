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
public class resourcesLesson extends JFrame implements ActionListener{
JTextArea information;
JButton launchBtn;
Container frame;
//declaring gui elements
public resourcesLesson () {

    super("Learning Polynomials");
    frame = getContentPane ();
    frame.setLayout(null);
    information = new JTextArea (" Resources: \n People: Anubhav Pandey, Chandan Tripathy \n Textbooks: McGraw Hill Grade 9 Math Workbook \n Online Resources: Math is Fun, IXL Grade 9 Math");
    //setting up gui elemnts
    launchBtn = new JButton ("Exit");
    launchBtn.addActionListener(this);
    //telling program to check if button has been clicked
    information.setBounds(25,15,500,85);
    launchBtn.setBounds (25,150,500,50);
    //setting bounds
    frame.add (information);
    frame.add (launchBtn);
    //adding to frame
     setSize(575,400);//sets size of frame
    setVisible(true);//sets it to be visible
    setDefaultCloseOperation (EXIT_ON_CLOSE);//ends the process
}
@Override
public void actionPerformed (ActionEvent evt){
    if (evt.getSource () == launchBtn)
    {   
        mainMenu launcher = new mainMenu();
//launches main menu when exiting
launcher.setVisible(true);
this.dispose();
    }

     
}
    public static void main(String[] args) {
       
        
        resourcesLesson launcher = new resourcesLesson();
    }//launcher
    
}

