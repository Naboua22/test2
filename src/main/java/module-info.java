module com.example.stock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stock to javafx.fxml;
    exports com.example.stock;
}