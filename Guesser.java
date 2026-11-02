import java.util.Random;
import java.util.Scanner;

public class Guesser {
  // instances of the imported classes
  private Scanner input;
  private Random rd;

  public static void main(String[] args){
    Guesser game = new Guesser(); // guesser class obj
    game.run();
  } // end main

  // no peramiter constructor
  public  Guesser (){
    input = new Scanner(System.in); 
    rd = new Random();
  } // end constructor

  public void menu(){
    System.out.println("0) Exit"); 
    System.out.println("1) Human Guesser");
    System.out.println("2) Computer Guesser");
    System.out.println();
    System.out.println("Please enter 0-2: ");
  } // end menu method

  public void run(){
    menu();
    int choice = input.nextInt();
    boolean keepGoing = true;

    while(keepGoing) {
      // if user input is a certain value, a method will be called
      if(choice == 1) {
        humanGuesser();
      } else if(choice == 2) {
          computerGuesser();
      } else if(choice == 0){
          System.out.println("ToodlDoo!!");
	  keepGoing = false;
      } // end if else statement;
      System.out.println();
    } // end while loop
    input.close(); // closing scanner
  } // end run

  private void humanGuesser(){
    System.out.println("\nhuman guesser");

    int randNum = rd.nextInt(50) + 1;
    int attempts = 0;
    boolean guessed = true;

    while(guessed) {
      attempts ++;
      System.out.print("Enter a number: ");
      int guess = input.nextInt();
      
      // if the entered number is no the desired input
      if(guess == -1 || guess < 1 || guess > 50) {
        System.out.println("Guess the number from 1 to 50.");
	continue;
      } // end if statement

      if(guess == randNum) {
        System.out.println("Correct!\n" + "Attempts: " + attempts);
	guessed = false;
	run();
      } else if(guess < randNum) {
          System.out.println("too low..");
      } else {
          System.out.println("too high...");
      } // end if & else if statements
    } // end while loop
  } // end humanGuesser

  private void computerGuesser(){
    System.out.println("\ncomputer guesser");

    int low = 1;
    int high = 50;
    int attempts = 0;
    char response;

    while(low <= high) {
      attempts ++;
      int guess = (low + high) / 2;

      System.out.println((attempts) + ") I guess " + guess);
      System.out.println("Too (H)igh, too (L)ow, or (C)orrect? ");
      // forces character input to lower case
      // charAt() collects the first character of the word just incase user enters the full word
      response = Character.toLowerCase(input.next().charAt(0));
      input.nextLine();

      if(response == 'c') {
        System.out.println("Attempts: " + attempts);
	run();
      } else if(response == 'h') {
          high = guess - 1;
      } else if (response == 'l') {
          low = guess + 1;
      } else {
          System.out.println("Please enter H, L, or C");
	  attempts --;
      } // end if & if else statements
    } // end while loop

    System.out.println("Invalid input");
  } // end computerGuesser
} // end Guesser class
