module com.example.dasistes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dasistes to javafx.fxml;
    exports com.example.dasistes;
}