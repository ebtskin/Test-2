
// Dice Class
import java.util.Scanner;

public class Dice {
	
	private static int dice = 0;
	private static int roll = 0;
	public static int LL, LH, HL, HH;
	public static int userPick;
	public static int play = 1;
	public static String playAgain;
	public static String playYes;
	public static int numberDices;
	public static int lowNumWin =0;
	public static int highNumWin =0;
	public static int varDoWhile = 0;
	public static int totalwin;
	public static int firstConstructor;
	public static int playHold;
	public static int diceHold;
	Scanner input =  new Scanner(System.in);
	
	public Dice (int play) // Constructor play again or stop
	{
		
		firstConstructor = play;
		
		if (firstConstructor >=3)
    	{
    		do {
    		System.out.print("\nOnly enter 1 for Yes or 2 for No \nEnter:	");
    		firstConstructor = input.nextInt();
    		
    		} while (firstConstructor >=3);
    		
    	}
    	if (firstConstructor == 2)
    	{
    		System.out.print("\nGame over. Thank You for playing");
    		System.out.print("\nGame Results"+"\nTotal Low Number Points: "+lowNumWin+"\nTotal High Number Points: "+highNumWin); // Game Results When user stop playing.
    		
    	}
	}
	
	public static void userPick (int userGuesses)
	{
		userPick = userGuesses;
	}

	
	public static void numDicePick (int numberDices1)
	{
	
	numberDices = numberDices1;
	HH = numberDices *6;
	LL = HH/6;
	LH = HH/2;
	HL = LH + 1;
	}
	
	public static void randomNum ()
	{
	while (play <= numberDices){
		
		dice = 1 + (int)(Math.random()*6);
		roll = roll + dice; // keep track of total score
		System.out.print("Game #: "+play+"    Dice Number: "+dice+"	"+	"Total Roll: "+roll+"\n");
		
		play++;	// keep track of game played
	
	}
	
	}
	
	public static int winLossCal ()
	
	{
		
	if ((userPick >= LL) && (userPick <= LH))
	{
		
		System.out.print("\nYou picked: "+userPick+"\nYour Result: Winner!"+"\nLow Number Parameter Winner: "+ LL + " - " + LH);
		lowNumWin++; // keep track of win
		highNumWin--; // keep track of losses
	}
	else if ((userPick >=HL) && (userPick <= HH))
	{
		
		System.out.print("\nYou picked: "+userPick+"\nYour Result: Winner!"+"\nHigh Number Parameter Winner: "+ HL + " - " + HH);
		highNumWin++; // keep track of wins
		lowNumWin--; // keep track of losses
	}
	totalwin = lowNumWin + highNumWin;
	System.out.print("\n----------------------------------\nLow Number Score: "+lowNumWin+"\nHigh Number Score: "+highNumWin);
	
	return highNumWin;
	
	}
	
	

}

