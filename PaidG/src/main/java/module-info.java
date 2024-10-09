module com.example.paidg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paidg to javafx.fxml;
    exports com.example.paidg;
}