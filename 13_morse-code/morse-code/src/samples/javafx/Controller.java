package samples.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    MorseCode morseCode = new MorseCode();

    @FXML
    private TextField textFieldInput;
    @FXML
    private TextArea textAreaOutput;

    @FXML
    private void onButtonMorseClick() {
        String text = textFieldInput.getText();
        if (text != "") {
            String code = morseCode.getMorseCode(text);
            textAreaOutput.setText(code);
        }
    }

}
