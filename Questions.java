/*
 *Sergio Rocha
 * CST 150 - 10 
 * FINAL EXAM
 * 12/08/2013
 */
package finalexam;
import javax.swing.JOptionPane;
import java.util.Random;

public class FinalExam 
{
     
  public static void main(String[] args) 
  {          
     userResponce(); 
     
     String input;
     int answer;
     
     input = JOptionPane.showInputDialog("Would you like to try again?\n" +
                                          "Enter 1 for Yes or 2 for No");
     answer = Integer.parseInt(input);
     answer = input.charAt(0);
     
     if (answer == '2')  
         System.exit(0);
     else
         userResponce();   
  }
  
  public static double userResponce()
  {
      
     String[] key;
     key = new String[25];     
     key[0] = "Wow your getting old!";
     key[1] = "Is that in dog years?";
     key[2] = "Well you certainly have some city miles on you.";
     key[3] = "So how was the prehistoric era?";
     key[4] = "I didnt ask how old you wish you were. ";
     key[5] = "That sucks, I would hate to be you.";
     key[6] = "Really? well how many grand children do you have?";
     key[7] = "So why did god kick you out of the garden of Eden again?";
     key[8] = "I hope you bought life insurance!";
     key[9] = "Wow so you must be the missing link!";
     key[10] = "No im being serious here.. how old are you?";
     key[11] = "How foolish do I look? Lets try this again. ";
     key[12] = "I didnt ask how old your granny is.";
     key[13] = "No im asking about your age, not your IQ.";
     key[14] = "Wow your old!";
     key[15] = "Well at least your not as old as Mr.Wright";
     key[16] = "Error Error. Does not compute. Please lie again";
     key[17] = "HAAAAA! and Im Brad Pit!";
     key[18] = "You might have gone to school with my grandmother!";
     key[19] = "Sucks to be you!";
     key[20] = "Really? Your at least 70 years old.";
     key[21] = "LIES!!! You cant be under 70";
     key[22] = "Oh so are you Adam or Eve?";
     key[23] = "Dang, well what was your favorite dino of the time?";
     key[24] = "Wow, did u get to have any pet dinosaurs?";
      
     String input;
     double answer;
     
     int index = new Random().nextInt(key.length);
     String random = (key[index]);     
     
     input = JOptionPane.showInputDialog("How old are you?");
     answer = Double.parseDouble(input);
         
     JOptionPane.showMessageDialog(null, random );
          
     String box;
     int answerz;
     
     box = JOptionPane.showInputDialog("Would you like to try again?\n" +
                                          "Enter 1 for Yes or 2 for No");
     answerz = Integer.parseInt(box);
     answerz = box.charAt(0);
     
     if (answerz == '2')  
         System.exit(0);
     else
         userResponce();
     
     return answerz;
  }    
}
