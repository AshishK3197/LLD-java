// Dice - > minValue, maxValue, currentValue
// Player ->  name, position, won
// Board ->  size, start , end
// Snake - > head tail
// Ladder -> start , end



// Snake&LadderGame

public class SnakeAndLadderGame{
	SnakeAndLadderBoard snakeAndLadderBoard;
	Player [] player;
	Player currentPlayer;
	GameStatus gamestatus;

// Also addPlayers to game()
	// startGame() 
	public boolean playerMove(CellPosition fromPosition, CellPosition toPosition , GotiObject object)
 	public boolean endGame();
 	public void changeTurn();
}

public class Player{
 	Account account;
 	CellPosition cellPosition;
 	Time timeleft;
 }

 public class Account{
 	String userName;
 	String password;
 	String name;
 	String emailId;
 	String phoneNumber;
 }

 public class Time{
 	int mins;
 	int secs;
 }

 public enum GameStatus{

 	ABANDONED, P1_WON, P2_WON , ACTIVE , PAUSED;
 }

 public class SnakeAndLadderBoard{
 	List<List<Cell>> board; // We take list<list> to make sure we can change something easily afterwards instead of using matrix.
 	Snake snake;
 	Ladder ladder;
 	Dice dice;

 	public void resetBoard();
 	public void addSnakeAndLadder(Snake snake, Ladder ladder)
 	public void updateBoard(Move move); // This will also be internally called by playerMove method
 }

 public class Cell{
 	GotiObject gotiObject;
 	CellPosition cellPosition;
 }

 public class CellPosition{
 	Char ch ; //Name of goti
 	int i;//Position of goti
 }

 public class Snake{
 	int head;
 	int tail;
 }

 public class Ladder{
 	int start;
 	int end;
 }

public class Dice{
	int maxValue;
	int minValue;
	int currentValue;
}

public class Move{
	Player turn; //which player has played this move basically (P1/P2)
	GotiObject gotiObject;
 	CellPosition startPosition; //move your goti from one position to another
 	CellPosition endPosition;
}

class GotiObject{

	String gotiName;
	public boolean move(CellPosition fromPosition , CellPosition toPosition);
	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
}

