package samples.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    //region constants
    private static final int DURCHSCHNITTLICHE_ENTFERNUNG_MOND = 385000;
    //endregion

    //region fields
    @FXML
    private TextField textFieldKmh;
    @FXML
    private TextField textFieldResultat;
    @FXML
    private RadioButton radioButtonDays;
    @FXML
    private RadioButton radioButtonHours;

    //endregion

    //region methods
    @FXML
    private void onCalculateButtonClick(){
        double speedKmh = this.convertToDouble(textFieldKmh.getText());
        double result = 0.0;

        if (radioButtonDays.isSelected()) {
            result = calculateDays(speedKmh);
        }
        else {
            result = calculateHours(speedKmh);
        }

        // Resultat auf 2 Nachkommastellen gerundet ausgeben
        textFieldResultat.setText(String.format("%.2f", result));
    }

    /**
     * Berechnet die Dauer der Reise zum Mond in Tagen (d)
     * @param kmh Geschwindigkeit in km/h
     * @return Dauer der Reise zum Mond in Tagen (d)
     */
    private double calculateDays(double kmh) {
        return this.calculateHours(kmh) / 24;
    }

    /**
     * Berechnet die Dauer der Reise zum Mond in Stunden (h)
     * @param kmh Geschwindigkeit in km/h
     * @return Dauer der Reise zum Mond in Stunden (h)
     */
    private double calculateHours(double kmh) {
        return DURCHSCHNITTLICHE_ENTFERNUNG_MOND / kmh;
    }

    /**
     * Konvertiert einen String in einen Double-Wert. Falls das nicht möglich ist, wird eine Fehlermeldung ausgegeben.
     * @param value Der String
     * @return Konvertierter Wert als Double
     */
    private double convertToDouble(String value) {
        try {
            double result = Double.parseDouble(value);

            return result;
        }
        catch(NumberFormatException ex) {
            showExceptionMessageBox("Bitte geben Sie eine Zahl ein.");
            return 0;
        }
    }

    private void showExceptionMessageBox(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Fehler");
        alert.setHeaderText("Es gab einen Fehler.");
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Initializes the controller class.
     * This method is automatically called after the fxml file has been loaded. At this time,
     * all the FXML fields should have been initialized already.
     */
    @FXML
    private void initialize() {
        // set focus to suit user's needs
        textFieldKmh.isFocused();
    }

    //endregion
}


