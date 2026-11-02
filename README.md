# JAVA GUESSER

## CS121


## Guesser Class
```
import scanner and random objects

public class Guesser
  create instances of the imported class

```

## public static void main(String[] args)
```
  create a Guesser class obj
  call the starting menu

```

## Guesser(){}
```
initialize the random and scanner imports
```

## public void menu(){}
```
print the given menu
  "0) Exit
   1) Human Guesser
   2) computer Guesser

   Please enter 0-2"
```

## public void run(){}
```
call the menu method

craet an integer value representing the users choice

create a loop
  filter through user input from menu
close the input scanner
```

## private void humanGuesser(){}
```
declare random number variable
declare integer value valraible for attempts

while loop
  increments attemtps by 1
  
  prompt user to enter a number and accept it

  if guessNum = -1 or guesNum < 1 or guessNum > 50
    continue the game

  if the random number is guessed, notify the user and print the attempts
  else if the number is too low, print too low
  else if the number is too high, pritn too high
    
```

## private void computer guesser(){}
```
  initialize the needed variables

  while comparing wheather the fake num low <= high variables
    force the inputed character to be a lowercase
    
    if the input is 'c'
      print the amount of attempts
    else if input is 'h'
      decrease the guess by 1
    else if input is 'l'
      increase the guess by 1
    else if invalid input
      tell user to enter only desired input
```
