//
//
//
//
package u4a3main;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
//importing libraries
public class testLesson extends JFrame implements ActionListener{
JLabel question1, answerlbl, question2, question3, answerlbl2, answerlbl3;
JTextField question1Field, question2Field, question3Field;
JButton checkbtn;
static Color c;
Container frame;
//declare all variables

public testLesson () {
//gui design
    
    super ("Final Test"); //question1 @ top
    
    frame = getContentPane (); //actualbox
    frame.setLayout(null);//default layout
    
    
    question1 = new JLabel ("(4x+1)+(x+1)");
    answerlbl = new JLabel (" ");
    question2 = new JLabel ("(4x-1)-(x+1)");

    question3 = new JLabel ("(2x)*(2x)");

    //declare all JLabels)
    
    question1Field = new JTextField ();
    question2Field = new JTextField ();
    question3Field = new JTextField ();
    //declare all text fields
    
    checkbtn = new JButton ("Check");
    checkbtn.addActionListener(this);
    //declare buttons
    
    
    
    question1.setBounds (10,0, 650,50);
    question1Field.setBounds (10,65, 650, 50);
    answerlbl.setBounds (10,130,650,50);
    question2.setBounds (10,195,650,50);
    question2Field.setBounds (10,250, 650, 50);
    question3.setBounds (10,380, 650, 50);
    question3Field.setBounds (10, 445, 650, 50);
    checkbtn.setBounds(10,575,650,50);
    //set sizes and position for all components
    
    frame.add(question1);
    frame.add(answerlbl);
    frame.add(question1Field);
    frame.add(question2);
    frame.add(question2Field);
    frame.add(question3Field);
    frame.add(checkbtn);
    frame.add(question3);
    //placed all components on frame
    
    setSize(700,700);//sets size of frame
    setVisible(true);//sets it to be visible
    setDefaultCloseOperation (EXIT_ON_CLOSE);//ends the process
}


@Override
public void actionPerformed (ActionEvent evt){
    
      
        String q1Str, q2Str, q3Str, score;
        int count = 0;
        q1Str = question1Field.getText(); 
        q2Str = question2Field.getText();
        q3Str = question3Field.getText();
        
        if (q1Str.equalsIgnoreCase("5x+2"))
          {
               count = count +1; 
               
                 if (q2Str.equalsIgnoreCase("3x-2"))//ignores case of entry to prevent enter errors
                {
               count = count +1; 
                
                 if (q3Str.equalsIgnoreCase("4x^2"))
                    {
                        count = count +1; //this method adds 1 point to the value of count everytime there is a correct answer, to dtermine your level
                    }
                }
          }
        System.out.println(count);
       
       score = levels2(count);
       
        answerlbl.setText(score);
        
        answerlbl.setFont(new Font("Arial", Font.BOLD, 15));

//explains what to do if button pressed
   
    
//converting strings to double that java can read          
}

public static String levels2 (int score)
        {
            String levels = ""; 
            
                if (score == 1)
                {
                    levels = "You got 1/3 correct";
                    
                }
                else if (score == 2)
                {
                    levels = "You got 2/3 correct and 1 incorrect";
                    
                }
                else if (score == 3)
                {
                    levels = "You got 3/3 Correct, +10 INT ";
                }
                else 
                {
                    levels = "Do this again stupid, P.S Read the notes this time";
                }//based on value of score, this method gives you your level

            return levels;
        }
   

    public static void main(String[] args) {
     
    
        testLesson launcher = new testLesson ();
    }//launcher
    
}//final
 