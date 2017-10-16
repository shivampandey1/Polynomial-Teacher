//
//
//
//
package u4a3main;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
//imported libaries
public class additionTest extends JFrame implements ActionListener{
JLabel question1, answerlbl, question2, answerlbl2, question3,answerlbl3;
JTextField question1Field, question2Field, question3Field;
JButton checkbtn;
Container frame;
String questions [], answer1 [], answer2 [], answer3 [], answer4 []; 
int questionCount = 1, livesCount = 3, random1, random2, random3, randomHolder [];
Color c;

//declare all variables

public additionTest () {
//gui design
    
    super ("Addition Test"); //question1 @ top
    
    frame = getContentPane (); //actualbox
    frame.setLayout(null);//default layout
    
     try {
                     FileReader fileR = new FileReader ("additionQuestions.txt");
                     BufferedReader input = new BufferedReader(fileR);
                        
                     FileReader fileR1 = new FileReader ("additionOption1.txt");
                     BufferedReader input1 = new BufferedReader(fileR1);
                     
                     
                     questions = new String [10];
                     answer1 = new String [10];
                        
                     
                    for (int i = 0; i < questions.length; i++)
                        {
                                questions [i] = input.readLine();
                                answer1 [i] = input1.readLine();

                        }
                    
                      fileR.close();
                      fileR1.close();
//pulls the files from the computer for the arrays
     }
     catch (IOException error)
     {
          JOptionPane.showMessageDialog(null, "Error, file corrupted");
         
     }//checks file integrity
    
    random1 = (int)(Math.random() * 10 + 0);
    question1 = new JLabel (questions[random1]);
    answerlbl = new JLabel (" ");
    
   random2 = (int)(Math.random() * 10 + 0);
    question2 = new JLabel (questions[random2]);
    answerlbl2 = new JLabel (" ");

   random3 = (int)(Math.random() * 10 + 0);
    question3 = new JLabel (questions[random3]);//each instance of this code chooses a random value from the question array to be in the test
    answerlbl3 = new JLabel (" ");
    
              System.out.println(random1);
          System.out.println(random2);
          System.out.println(random3);
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
    answerlbl2.setBounds (10, 315, 650, 50);
    question3.setBounds (10,380, 650, 50);
    question3Field.setBounds (10, 445, 650, 50);
    answerlbl3.setBounds (10,510,650,50);
    checkbtn.setBounds(10,575,650,50);
    //set sizes and position for all components
    
    frame.add(question1);
    frame.add (answerlbl);
    frame.add(question1Field);
    frame.add(question2);
    frame.add(question2Field);
    frame.add(answerlbl2);
    frame.add(question3Field);
    frame.add(checkbtn);
    frame.add(question3);
    frame.add(answerlbl3);
    //placed all components on frame
    
    setSize(700,700);//sets size of frame
    setVisible(true);//sets it to be visible
    setDefaultCloseOperation (EXIT_ON_CLOSE);//ends the process
}


@Override
public void actionPerformed (ActionEvent evt){
    if (evt.getSource () == checkbtn)
//explains what to do if button pressed
    {
        String input, input2, input3;
        input = question1Field.getText();
         input2 = question2Field.getText();
          input3 = question3Field.getText();
          
        if (input.equalsIgnoreCase(answer1[random1]))
        {
            answerlbl.setText("Correct");
        }
        else 
        {
        answerlbl.setText("Incorrect");
        }
         if (input2.equalsIgnoreCase(answer1[random2]))
        {
            answerlbl2.setText("Correct");
        }
        else 
         {
        answerlbl2.setText("Incorrect");
        } 
         if (input3.equalsIgnoreCase(answer1[random3]))
        {
            answerlbl3.setText("Correct");
        }
        else {
        answerlbl2.setText("Incorrect");
        }//checks if user input matches answers that correspond to the correct answer set in the answer array. tells them if they are correct
        
    }
  
    
           
}
    public static void main(String[] args) {
     
    
        additionTest launcher = new additionTest ();
    }//launcher
    
}//final
 