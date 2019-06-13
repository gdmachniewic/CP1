import java.util.Scanner;

public class RollTheDice {
    public static void main(String[]args) {
        
        int die1=(int)(Math.random()*6+1);
        int die2=(int)(Math.random()*6+1);
        int roll= (die1 + die2);
        System.out.println("Let's play Craps");
        System.out.println("First roll: " + roll );
        
        if (roll==7 || roll==11){
            System.out.println("You win!");
            
        }else if (roll==2 || roll==3 || roll==12){
            System.out.println("You lose!");
        }else if (roll==4 || roll==5 || roll==6 || roll==8 || roll==9 || roll==10){
            System.out.println("Keep rolling!");
            
            
            
        }
        
    }
}
