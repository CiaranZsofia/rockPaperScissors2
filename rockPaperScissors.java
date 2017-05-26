package game;
import javax.swing.*; 
import java.util.Random; 

public class rockPaperScissors {
    public static void main(String args[]) {
        int rps = Integer.parseInt(JOptionPane.showInputDialog("Rock(1) OR Paper(2) OR Scissors(3) OR Stop(0)"));
        Random rps2 = new Random();
        int compNum; 
        String compChoise;
        while(!(rps==0)){
            compNum = rps2.nextInt(3)+1; 
        if(compNum==1) {
            compChoise = "rock";     
        } else 
        if(compNum==2) {
            compChoise = "Papper";   
        } else
        if(compNum==3) {
            compChoise = "Scissors";  
        } 
        if(rps==compNum) {
            JOptionPane.showMessageDialog(null, "Draw"); 
        } else 
        if(rps==1&&compNum==2 || rps==2&&compNum==3 || rps==3&&compNum==1) {
            JOptionPane.showMessageDialog(null, "You loose");
        } else 
        if(rps==1&&compNum==3 || rps==2&&compNum==1 || rps==3&&compNum==2) {
           JOptionPane.showMessageDialog(null, "You win");         
        }        
       rps = Integer.parseInt(JOptionPane.showInputDialog("Rock(1)OR Paper(2) OR Scissors(3)"));
        }
    }
}
