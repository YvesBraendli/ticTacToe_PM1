import java.util.ArrayList;
/**
 * This class implements the console outputs for a game of TicTacToe in english and german.
 * The class has the following functionalities:
 *      Print a welcome message.
 *      Print the board.
 *      Print a request for a language change.
 *      Print a messsage if a language change has been made.
 *      Print a request for a player to make a move.
 *      Print a message for the winning or draw conditions.
 *      Print a message in case of a wrong move.
 *           
 * @author Yves Brändli, Nadine Moser, Robin Meier
 * @version 1.0
 */


public class GameOutput
{
    private LanguageController languageController;
    private ArrayList<Character> fieldsymbol;
    /**
     * Constructor for the GameOutput class.
     * Sets the default field symbols to "-".
     * 
     * @param languageController        to set the default language.
     */
    public GameOutput(LanguageController languageController)
    {
        fieldsymbol = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            fieldsymbol.add('-');
        }
        this.languageController = languageController;
    }

    /**
     * Prints out a welcome message.
     * 
     * @param player        to set the player, who is making a move.
     */    
    public void printWelcome(int player)
    {
        String currentPlayer = languageController.translatePlayerText(player);
        System.out.println("***************************************************************");
        System.out.println(languageController.translateWelcomeText(currentPlayer));
        System.out.println("***************************************************************");
    }

    /**
     * Prints the board after every turn.
     * 
     * @param fields        to get the informations about which player has already made a move on which field.
     */    
    public void printBoard(ArrayList<Integer> fields)
    {
        for(int i = 0; i < 9; i++){
            if (fields.get(i) == 1)
            {
                fieldsymbol.set(i, 'X');   
            }  else if (fields.get(i) == 2)
            {
                fieldsymbol.set(i, 'O');
            }
        }
        System.out.println(fieldsymbol.get(0) + " | " + fieldsymbol.get(1) + " | " + fieldsymbol.get(2));
        System.out.println("---------");
        System.out.println(fieldsymbol.get(3) + " | " + fieldsymbol.get(4) + " | " + fieldsymbol.get(5));
        System.out.println("---------");
        System.out.println(fieldsymbol.get(6) + " | " + fieldsymbol.get(7) + " | " + fieldsymbol.get(8));
        System.out.println();
    }

    /**
     * Prints out a request message for the language change functionality.
     */    
    public void printLanguageChangeRequest()
    {
        System.out.println(languageController.translateLanguageChangeRequestText());
    }

    /**
     * Prints out a message if the language change was completed.
     */
    public void printLanguageChange()
    {
        System.out.println(languageController.translateLanguageChangeText());
    }

    /**
     * Prints out a request for a player to make a move.
     */    
    public void printMoveRequest(int player)
    {
        String currentPlayer = languageController.translatePlayerText(player);
        System.out.println(languageController.translateMoveRequestText(currentPlayer));
    }

    /**
     * Prints out a message if a winning condition has been met or the game ended in a draw.
     */    
    public void printGameState(int currentGameState)
    {
        System.out.println(languageController.translateCurrentGameStateText(currentGameState));       
    }

    /**
     * Prints out a message if a player made a wrong move.
     */
    public void printWrongMove()
    {
        System.out.println(languageController.translateWrongMoveText());
    }
}
