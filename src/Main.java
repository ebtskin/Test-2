
//Main Game
import java.util.Scanner;


public class Main
{
	
	
    public static void main(String[] args)
    {
    
    	
    	int userThrows;
    	int playAgain;
    	int totalGame = 0;
    	int userGuess;
    	
    	Scanner input =  new Scanner(System.in);
    	
    	do {
    	
    	totalGame++; // Total number of game played counter
    
    	System.out.print("How many dices do you want to play with? \nEnter:   \n");
    	userThrows = input.nextInt();
    	Dice.numDicePick(userThrows);
    	
    	System.out.println("You want to play with "+Dice.numberDices+" dices \n"+"Please choose a number between "+Dice.LL+" - "+Dice.HH+"\n\nEnter:	");
    	userGuess = input.nextInt();
    	Dice.userPick(userGuess);
    	
    	Dice.randomNum();
    	Dice.winLossCal();
    	
    	System.out.print("\nTotal Game Played: "+totalGame); // Total Number Game Played
    	
    	System.out.print("\n\nWant to play again? Enter 1 Yes or 2 No below: \nEnter:	");
    	playAgain = input.nextInt();
    	
    	Dice constructor = new Dice (playAgain); // Constructor to ask Play again or Stop?
    	
    	System.out.print(constructor);
    	
    	} while (playAgain == 1);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

    	
    	
    	
    	
    	
    	
    	
   
    	
    	
    }  	
    }