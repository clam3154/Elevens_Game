package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ElevensGUIRunner {

    /**
     * Plays the GUI version of Elevens.
     * @param args is not used.
     */
    public static void main(String[] args) {
        Board board = new ElevensBoard();
        CardGameGUI gui = new CardGameGUI(board);
        gui.displayGame();
    }
}
