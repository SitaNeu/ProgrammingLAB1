module com.example.lab1sita {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.lab1sita to javafx.fxml;
    exports com.example.lab1sita;
}