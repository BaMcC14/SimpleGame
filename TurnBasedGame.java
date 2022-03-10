package sampleGame;
import java.util.Scanner;
public class TurnBasedGame {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
		
		
	playerCreator computer = new playerCreator(1, 100.00);//create two objects from class playerCreator
	playerCreator player1 = new playerCreator(1, 100.00);
	

	
	
	
	//display current players health and level.
	System.out.println("Welcome to the Game!\n");
	System.out.println("Current Players are:");
	System.out.println( "Kn0x14 at Level " + player1.level + " Health:" + player1.health + " \n 	VS");
	System.out.println("The Computer at Level " + computer.level + " Health:" + computer.health);
	System.out.println("\n Enter 1 to begin");
	System.out.println("**********************************************");
	int startGame = scanner.nextInt();
	
	if (startGame == 1) {
		
	
	
		while(player1.health > 0 && computer.health > 0) {	
	System.out.println("\n***Choose your attack***");
	System.out.println("Press 1 for: Normal Attack");
	System.out.println("Press 2 for: Heavy Attack");
	//System.out.println("Press 9 surriender.");
	int selectedAttack = scanner.nextInt();
	
	
	if (selectedAttack == 1) {
		//System.out.println("Normal Attack!");
		double normalAttack = Math.random()* 10;
		
		System.out.println("Normal Attack hit for " + Math.round(normalAttack));
		computer.health = computer.health - Math.round(normalAttack);
		System.out.println("Computer Health: " + computer.health);
	}//end if statement
	
	if (selectedAttack == 2) {
		//System.out.println("Heavy Attack!");
		double heavyAttack = Math.random()* 20;
		Math.floor(heavyAttack);
		System.out.println("Heavy Attack hit for " + Math.round(heavyAttack));
		computer.health = computer.health - Math.round(heavyAttack);
		System.out.println("Computer Health: " + computer.health);
	}//end if statement
	else {
		double normalAttack = Math.random()* 10;
		Math.floor(normalAttack);
		System.out.println("Normal Attack hit for " + Math.round(normalAttack));
		computer.health = computer.health - Math.round(normalAttack);
		System.out.println("Computer Health: " + computer.health);
	}
	
	
	//computer attack
	System.out.println("***********************************************");
	System.out.println("\n***Computer Turn***");
	double compAttack = Math.random()* 15;
	Math.floor(compAttack);
	player1.health = player1.health - Math.round(compAttack);
	System.out.println("Computer hit for " + Math.round(compAttack));
	System.out.println("\n--->Kn0x14 Health: " + player1.health);
	System.out.println("--->Computer Health: " + computer.health);
	
	}//end while statement
	 
		if(player1.health <=0) {
			System.out.println("You Lose");
		}
		else {
			System.out.println("\nCongrats! You win");
		}
	}
	else {
		System.out.println("End Game");
		
	}

	
//	else {
//		System.out.println("End of match");
//	}
	
	
	
		
		
		
		
		
		
		
		
		
		

	}//end main method

}//end class TurnBasedGame


//class is set to be able to create characters.
class playerCreator{
	int level;
	double health;


playerCreator(int l, double h){
	level = l;
	health = h;
}


}//end class playerCreator




