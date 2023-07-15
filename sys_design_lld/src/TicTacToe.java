public class TicTacToe{
	TicTacToeBoard ticTacaToeBoard;
	Player [] player;
	Player currentPlayer;
	List<Moves> moves;
	GameStatus gamestatus;

	public boolean playerMove(CellPosition cellPosition , Piece piece)
 	public boolean endGame();
 	public void changeTurn();
}

public class Player{
 	Account account;
 	Piece piece;
 	Time timeleft;
 }

public class Account{
 	String userName;
 	String password;
 	String name;
 	String emailId;
 	String phoneNumber;
 }

 public class Piece{
 	PieceType pieceType;
 	Player turn; // which player is playing which PieceType
 	HashMap<PiecePosition,PieceType> position;// To contain all positions of a piece "X", to calculate at any point who is winner , ny checking all rows, columns and diagonals
 
 	public boolean setPieceType(PiecePosition position);
 	public List<PiecePosition> possiblePiecePostions (PiecePosition position); //checks all the available positions for a partiular piece X, O that is empty still currenly.
 	public boolean validate(PiecePosition position);
 }

 public enum PieceType{
 	X , O
 }

 public class Time{
 	int mins;
 	int secs;
 }

 public enum GameStatus{

 	ABANDONED, X_WON, O_WON , ACTIVE , PAUSED;
 }

 public class TicTacToeBoard{
 	List<List<Cell>> board; // We take list<list> to make sure we can change something easily afterwards instead of using matrix.

 	public void resetBoard();
 	public void updateBoard(Move move); // This will also be internally called by playerMove method
 }

 public class Cell{
 	Piece piece;
 	PiecePosition position;
 }

 public class PiecePosition{
 	char ch;
 	int i;
 }

public class Move{
 	Player turn; //which player has played this move basically (P1/P2)
 	Piece piece;
 	CellPosition cellPosition;
 }















