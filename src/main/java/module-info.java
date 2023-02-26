module com.inventory.inventoryfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.inventory.inventoryfx to javafx.fxml;
    exports com.inventory.inventoryfx;
}