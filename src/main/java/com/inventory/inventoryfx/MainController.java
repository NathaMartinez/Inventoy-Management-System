package com.inventory.inventoryfx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {  // Used when you need to modify
    @FXML
    private TableView<Part> tableView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
