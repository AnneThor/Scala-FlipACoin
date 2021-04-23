package CoinToss.v1

import CoinTossHelpers._
import scala.util.Random
import scala.annotation.tailrec

case class GameState(numFlips: Int, numCorrectGuesses: Int);

object coinTossGame extends App {

  val currState = GameState(0,0)
  val randomizer = Random
  mainLoop(currState, randomizer)

  @tailrec
  def mainLoop(gameState: GameState, random: Random) {

    showPrompt();
    val userInput = getUserInput;

    userInput match {
      case "H" | "T" => {
        // flip the coin
        val coinTossResult = coinToss(random)
        val newNumFlips = gameState.numFlips + 1

        // compare to user input
        if (userInput == coinTossResult) {
          val newNumCorrect = gameState.numCorrectGuesses + 1
          val newGameState = gameState.copy(numFlips = newNumFlips, numCorrectGuesses = newNumCorrect)
          printGameState(printableFlipResult(coinTossResult), newGameState)
          mainLoop(newGameState, random);
        } else {
          val newGameState = gameState.copy(numFlips = newNumFlips)
          printGameState(printableFlipResult(coinTossResult), newGameState)
          mainLoop(newGameState, random);
        }
      }
      case _   => {
        printGameOver
        printGameState(gameState);
        // return from recursion
      }
    }
  }
}
