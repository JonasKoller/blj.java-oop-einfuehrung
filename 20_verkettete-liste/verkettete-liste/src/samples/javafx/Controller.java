package samples.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import samples.javafx.enums.SortOrder;

public class Controller {

    Zahlenspeicher zahlenspeicher = new Zahlenspeicher();

    @FXML
    private TextField textFieldAdd;
    @FXML
    private TextField textFieldGet;
    @FXML
    private RadioButton radioButtonAsc;
    @FXML
    private RadioButton radioButtonDesc;

    @FXML
    private void onButtonAddClick() {
        zahlenspeicher.add(Integer.parseInt(textFieldAdd.getText()));
        textFieldAdd.clear();
        textFieldAdd.requestFocus();
    }

    @FXML
    private void onButtonContainsClick() {
        if (textFieldAdd.getText() != "") {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Info");
            if (zahlenspeicher.contains(Integer.parseInt(textFieldAdd.getText())))
                alert.setHeaderText("Zahl gefunden!");
            else
                alert.setHeaderText("Zahl nicht gefunden!");

            alert.setContentText("Zahl: " + textFieldAdd.getText());
            alert.showAndWait();
        }
    }

    @FXML
    private void onButtonGetClick() {
        SortOrder sortOrder = SortOrder.ASCENDING;

        if (radioButtonDesc.isSelected())
            sortOrder = SortOrder.DESCENDING;

        textFieldGet.setText(zahlenspeicher.get(sortOrder));
    }

    @FXML
    private void onButtonClearClick() {
        zahlenspeicher.clear();
        textFieldGet.clear();
    }




}
