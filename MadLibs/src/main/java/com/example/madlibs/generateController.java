package com.example.madlibs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

public class generateController {

    @FXML
    private Button createButton;

    @FXML
    private TextField enterWords;

    @FXML
    private TextArea libText;

    @FXML
    private ListView<?> listWords;

    @FXML
    private Button nextWordButton;

    @FXML
    private TitledPane titlePane;

    private String madLibName;  // Store the MadLib name

    // This method will be called by the selectController to set the MadLib name
    public void setMadLibName(String madLibName) {
        this.madLibName = madLibName;
        // Assuming the titled pane's title or some other element needs to be updated
        titlePane.setText("Selected MadLib: " + madLibName);
        // Further initialization can be done here based on madLibName
    }

    @FXML
    void nextWord(ActionEvent event) {
        // Implementation for next word logic
    }

    @FXML
    void printLib(ActionEvent event) {
        // Implementation for printing the MadLib
    }
}

