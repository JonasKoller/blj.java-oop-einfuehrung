package samples.javafx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    @FXML
    private TextField textFieldGuessedNumber;
    @FXML
    private TextField textFieldMessage;
    @FXML
    private Label labelNumberOfTryouts;
    /**
     * This ist the number which the user must guess. It is initialized by random
     * within the constructor of this controller class.
     */
    private int randomNumber;
    private int countOfTryOuts = 0;
    private LinkedList<Integer> guessed = new LinkedList<Integer>();

    /**
     * Constructor.
     */
    public Controller(){
        // Zufallszahl ermitteln
        randomNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);
    }

    @FXML
    private void onGuessClick() {
        int guess = Integer.parseInt(textFieldGuessedNumber.getText());

        if (!isGuessed(guess)) {

            countOfTryOuts++;

            if (guess > randomNumber) {
                textFieldMessage.setText("Zahl zu gross!");
            } else if (guess < this.randomNumber) {
                textFieldMessage.setText("Zahl zu klein!");
            } else if (guess == this.randomNumber) {
                textFieldMessage.setText("Zahl stimmt!");
                labelNumberOfTryouts.setText("Anzahl Versuche: " + String.valueOf(countOfTryOuts));
                labelNumberOfTryouts.setVisible(true);
            }
        }
        else {
            textFieldMessage.clear();
        }

        // Fokus zurück auf Eingabe + dort Text markieren
        // -> das erlaubt dem Benutzer eine schnelle neue Eingabe zu machen
        textFieldGuessedNumber.requestFocus();
        textFieldGuessedNumber.selectAll();
    }

    private boolean isGuessed(int guess) {

        if (guessed.contains(guess)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Wiederholte Eingabe");
            alert.setHeaderText("Du hast diese Zahl bereits einmal eingegeben.");
            alert.setContentText("");
            alert.showAndWait();

            return true;
        }
        else {
            guessed.add(guess);
            return false;
        }
    }

    @FXML
    private void onExitClick() {

        Platform.exit();
    }

    @FXML
    private  void initialize() {
        labelNumberOfTryouts.setVisible(false);
    }
}
