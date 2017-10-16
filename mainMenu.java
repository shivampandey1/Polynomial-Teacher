
package u4a3main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
//importing libraries

public class mainMenu extends JFrame implements ActionListener{
JLabel addLesson, subLesson, multiLesson, test, resources;
JButton addBtn, subBtn, multiBtn, testBtn, resourcesBtn;
Container frame;
//declaring components
public mainMenu () {
//gui design
    
    super ("Main Menu"); //title @ top
    
    frame = getContentPane (); //actualbox
    frame.setLayout(null);//default layout
    
      addLesson = new JLabel ("Adding Polynomials Lesson");
    subLesson = new JLabel ("Subtracting Polynomials Lesson");
    multiLesson = new JLabel ("Multiplying Polynomials Lesson");
    test = new JLabel ("Check your Knowledge");
    resources = new JLabel ("Resources");
    //declare all JLabels
    
    
    addBtn = new JButton ("Launch Addition Lesson");
    subBtn = new JButton ("Launch Subtraction Lesson");
    multiBtn = new JButton ("Launch Multiplication Lesson");
    testBtn = new JButton ("Launch Final Test");
    resourcesBtn = new JButton ("View Resources");
    addBtn.addActionListener(this);
    subBtn.addActionListener(this);
    multiBtn.addActionListener(this);
    testBtn.addActionListener(this);
    resourcesBtn.addActionListener(this);
    //declare buttons
    
    
    addLesson.setBounds (50,0, 650,18);
    addBtn.setBounds (50, 75, 650, 50);
    subLesson.setBounds (50,150,650,40);
    subBtn.setBounds (50,225,650,40);
    multiLesson.setBounds (50, 300, 500, 50);
    multiBtn.setBounds (50,375, 650, 50);
    test.setBounds (50, 450, 650, 50);
    testBtn.setBounds (50,525, 650, 50);
    resources.setBounds (50,600,650,50);
    resourcesBtn.setBounds (50,675,650,50);
    //set sizes for all components
    
    frame.add(addLesson);
    frame.add(addBtn);
    frame.add(subLesson);
    frame.add(subBtn);
    frame.add(multiLesson);
    frame.add(multiBtn);
    frame.add(test);
    frame.add(testBtn);
    frame.add(resources);
    frame.add(resourcesBtn);
    //placed all components on frame
    
    setSize(800,800);//sets size of frame
    setVisible(true);//sets it to be visible
    setDefaultCloseOperation (EXIT_ON_CLOSE);//ends the process
}
@Override
public void actionPerformed (ActionEvent evt){
    if (evt.getSource () == addBtn)
    {
       additionLesson launcher = new additionLesson (); 
    }
    else if (evt.getSource () == subBtn)
    {
     subtractionLesson launcher = new subtractionLesson ();
    }
    else if (evt.getSource () == multiBtn)
    {
     multiLesson launcher = new multiLesson ();
    }
    else if (evt.getSource () == testBtn)
    {
     testLesson launcher = new testLesson ();
    }
    else if (evt.getSource () == resourcesBtn)
    {
     resourcesLesson launcher = new resourcesLesson ();
    }//telling java to do when each button is pressed
           
}
    public static void main(String[] args) {
     
    
        mainMenu launcher = new mainMenu ();
    }
    
}
 
