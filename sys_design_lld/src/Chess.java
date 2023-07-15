 
 // Chess Game

 public class Chess {
 	Chessboard chessBoard;
 	Player [] player;
 	Player currentPlayer;
 	List <Moves> movesList;
 	GameStatus gmaestatus;
 
 	public boolean playerMove(CellPosition fromPosition, CellPosition toPosition , Piece piece)
 	public boolean endGame();
 	public void changeTurn(); // This will be internally called by PlayerMove method

 }

 public class Player{
 	Account account;
 	Color color;
 	Time timeleft;
 }

 public class Account{
 	String userName;
 	String password;
 	String name;
 	String emailId;
 	String phoneNumber;
 }

 public enum Color{
 	WHITE , BLACK;
 }

 public class Time{
 	int mins;
 	int secs;
 }

 public enum GameStatus{

 	ABANDONED, WHITE_WON, BLACK_WON , ACTIVE , PAUSED;
 }

 public class Chessboard{
 	List<List<Cell>> board; // We take list<list> to make sure we can change something easily afterwards instead of using matrix.

 	public void resetBoard();
 	public void updateBoard(Move move); // This will also be internally called by playerMove method
 }

 public class Cell{
 	Color color;
 	Piece piece;
 	CellPosition position;
 }

 public class CellPosition{
 	Char ch;
 	int i;
 }

 public class Move{
 	Player turn; //which player has played this move basically (P1/P2)
 	Piece piece;
 	Piece killedPiece;
 	CellPosition startPosition;
 	CellPosition endPosition;
 }

 public abstract class Piece{

 	Color color;

 	public boolean move(CellPosition fromPosition , CellPosition toPosition);
 	public List<CellPosition> possibleMoves (CellPosition fromPosition);
 	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
 }

 // Now since all pieces are subject to movement and can have a ist of possible moves at every step(as each peice moves diffrently) , hence we need to make sure all 
 // pieces overide the Piece class.

 public class Knight extends Piece{

 	public boolean move(CellPosition fromPosition , CellPosition toPosition);
 	public List<CellPosition> possibleMoves (CellPosition fromPosition);
 	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
 }

 public class Pawn extends Piece{
 	public boolean move(CellPosition fromPosition , CellPosition toPosition);
 	public List<CellPosition> possibleMoves (CellPosition fromPosition);
 	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
 }

 public class Bishop extends Piece{

 	public boolean move(CellPosition fromPosition , CellPosition toPosition);
 	public List<CellPosition> possibleMoves (CellPosition fromPosition);
 	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
 }

 public class Queen extends Piece{

 	public boolean move(CellPosition fromPosition , CellPosition toPosition);
 	public List<CellPosition> possibleMoves (CellPosition fromPosition);
 	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
 }

 public class Rook extends Piece{

 	public boolean move(CellPosition fromPosition , CellPosition toPosition);
 	public List<CellPosition> possibleMoves (CellPosition fromPosition);
 	public boolean validate(CellPosition fromPosition , CellPosition toPosition);
 }