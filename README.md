# Scala-FlipACoin

A simple coin toss game played in the terminal, written in scala. 

# Running the Game (in your terminal)

Download the files and navigate to the parent folder. Run ```sbt``` to start the scala build tool, then enter ```run``` and the game will begin!

# How the Game Works

When the program starts, the user is prompted to guess "Heads" or "Tails." 

Upon receiving the user input, the game will generate a random coin toss by generating a random number from the set \[0, 2).

The game will then evaluate the coin toss result vs. user input and print an outcome to the console including the number of games played, number of correct guesses, and the overall success rate of the current user 

The game is structured to use a recursive call to keep the game in play until the base case (user enters "q") is reached. At this point the game prints the final result and terminates.
