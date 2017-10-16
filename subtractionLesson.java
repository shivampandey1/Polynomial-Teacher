
package u4a3main;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
//importing libraries
public class subtractionLesson extends JFrame implements ActionListener{
JLabel lesson, ready;
JButton startBtn;
Container frame;
//declaring gui elements
public subtractionLesson () {

    super("Learning to Add Polynomials");
    frame = getContentPane ();
    frame.setLayout(null);
    lesson = new JLabel (new ImageIcon ("subLesson.jpg"));
    ready = new JLabel ("Ready to be tested? Launch the test below!");
    //setting up gui elemnts
    startBtn = new JButton ("Launch test");
    startBtn.addActionListener(this);
    //telling program to check if button has been clicked
    lesson.setBounds(35,0,700,700);
    startBtn.setBounds (120,750,500,50);
    ready.setBounds (260, 675, 500, 50);
    //setting bounds
    frame.add (lesson);
    frame.add (startBtn);
    frame.add (ready);
    //adding to frame
     setSize(800,875);//sets size of frame
    setVisible(true);//sets it to be visible
    setDefaultCloseOperation (EXIT_ON_CLOSE);//ends the process
}
@Override
public void actionPerformed (ActionEvent evt){
    if (evt.getSource () == startBtn)
    {   
        subtractionTest launcher = new subtractionTest();//launches test

launcher.setVisible(true);
this.dispose();
    }

     
}
    public static void main(String[] args) {
     
        
        subtractionLesson launcher = new subtractionLesson();
    }//launcher
    
}
