

import java.util.Scanner;

public class DiceGame {
    
        static int rollDice() {
        
        int die1 = (int) (6 * Math.random()) + 1;        return die1; 
    }
    
        public static void main(String[] args) {
        
        int die1;  
        int die2;  
        int playerPoints = 0; 
        int pcPoints = 0; 
        int roundPoints = 0; 
        String answer;
        boolean passToCpu = false;
        boolean playerRolled = false;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("");
		System.out.println("/               Rules          ");
		System.out.println("/");
		System.out.println("/    The first player to reach 100 points wins.  ");
	   System.out.println("/    When a player rolls a 1 the turn is over and you lose your points collected in that turn.  ");	     
	   System.out.println("/    When a player rolls two 1 the turn is over and you lose all your points collected in that turn .  ");	
		System.out.println("/    The computers's turn is over when turn total reach 20 points  in a single turn.    ");
	System.out.println("");
        
        while(playerPoints < 100 && pcPoints < 100)
        {
            while(!passToCpu) {
                
                System.out.println("Please roll the dice by pressing 'y' and hitting enter");
                System.out.println("or if you want to pass enter 'n' and hit enter.");
                
                answer = input.next(); 
                
                if (answer.equalsIgnoreCase("y")){ 
                    
                    die1 = rollDice(); 
                    die2 = rollDice(); 
                    
                    System.out.println("Dice 1: " + die1);
                    System.out.println("Dice 2: " + die2);
                   
                   
                    if (die1 == 1 && die2 == 1) {
                        roundPoints = 0;
                        playerPoints = 0;
                        passToCpu = true;
                        System.out.println("You got double one and loses ALL his points.");
                        System.out.println("The round passes to the PC.");    
                        System.out.println("Players points: " + playerPoints);

                      } else if (die1 == 1 || die2 == 1) {
                       roundPoints = 0;
                       passToCpu = true;
                       System.out.println("You got a one and loses the points for this round.");
                       System.out.println("The round passes to the PC.");     
                       System.out.println("Players points: " + playerPoints);

                                        } else {                    
                        roundPoints += die1 + die2; 
                        System.out.println("Current Round Points: " + roundPoints);
                    } 
                    
                } else if (answer.equalsIgnoreCase("n")){
                    playerPoints = playerPoints + roundPoints;
                    System.out.println("Players points: " + playerPoints);
                    passToCpu = true;
                    roundPoints = 0;
                } else {
                    System.out.println("Invalid entry, please try again.");
                    
                }
            }
                
                if (passToCpu) {                
                                        int numberOfCpuRolls = (int) (6 * Math.random()) + 1;
                        
                        System.out.println("number of pc rolls: " + numberOfCpuRolls);
                        
                        int pcTurns = 0;                         
                    while(pcTurns < numberOfCpuRolls && roundPoints <= 20) { 
                        
                        die1 = rollDice(); 
                        die2 = rollDice(); 
                        
                        System.out.println("Dice 1: " + die1);
                        System.out.println("Dice 2: " + die2);
                            
                            
                            
                              if (die1 == 1 && die2 == 1) {
                            roundPoints = 0;
                            pcPoints = 0;
                            passToCpu = false;
                            System.out.println("The PC got double one and loses ALL his points.");
                            System.out.println("The round passes to the Player.");
                            
                            break;

                        
                        
                       
                        } else if (die1 == 1 || die2 == 1) {
                            roundPoints = 0;
                            passToCpu = false;
                            System.out.println("The PC got a one and loses the points for this round.");
                            System.out.println("The round passes to the Player.");
                            
                            break;
                            
                                                } else {
                            roundPoints += die1 + die2; 
                                                       System.out.println("Current round points: " + roundPoints);
                            pcTurns++; 
                        }
                    }
                    pcPoints = pcPoints + roundPoints;
                    System.out.println("PC's Points: " + pcPoints);
                    roundPoints = 0;
                    passToCpu = false; 
                }  
            }
            
            if(playerPoints >=100)
            {
        System.out.println("You won");}
        else{System.out.println("PC won");}
    } 
} 

