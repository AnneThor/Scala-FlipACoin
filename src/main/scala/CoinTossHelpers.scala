package CoinToss.v1

import scala.util.Random
import scala.io.StdIn.readLine

object CoinTossHelpers {

  def showPrompt(): Unit = print("\n Pick a side, any side!\n (h)eads, (t)ails, or (q)uit: ")

  def getUserInput(): String = readLine.trim.toUpperCase

  def printableFlipResult(flip: String): String = flip match {
    case "H" => "Heads"
    case "T" => "Tails"
  }

  def printGameState(printableFlipResult: String, gameState: GameState): Unit = {
    print(s"Flip was $printableFlipResult. ")
    printGameState(gameState)
  }

  def printGameState(gameState: GameState): Unit = {
    println(s"#Flips: ${gameState.numFlips}0\n#Correct: ${gameState.numCorrectGuesses}\nSuccess Rate: ${gameState.numCorrectGuesses}/${gameState.numFlips}")
  }

  def printGameOver: Unit = println("\n=== GAME OVER! ===")

  def coinToss(r: Random) = {
    val i = r.nextInt(2); // means it will return a random number between 0-2 (not inclusive), so 0 or 1
    i match {
      case 0 => "H"
      case 1 => "T"
    }
  }

}
