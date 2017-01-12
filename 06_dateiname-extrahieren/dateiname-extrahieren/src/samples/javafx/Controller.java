package samples.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import java.io.File;

public class Controller {
    @FXML
    private TextField textFieldPath;
    @FXML
    private TextField textFieldResult;

    @FXML
    private void onButtonClick() {
        if (textFieldPath.getText().equals(("")))
            return;

        textFieldResult.setText(this.getFileNameWithoutExtenstion(textFieldPath.getText()));
    }

    private String getFileNameWithoutExtenstion (String path) {
        if (path.endsWith("\\") || path.endsWith("/"))
            // we assume it's not a file, so good bye.
            return "";

        String file = new File(path).getName();
        int pos = file.lastIndexOf(".");
        if (pos > 0) {
            file = file.substring(0, pos);
        }

        return file;
    }
}
