module com.example.miniuber {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.miniuber to javafx.fxml;
    exports com.example.miniuber;
    exports com.example.miniuber.Controller;
    opens com.example.miniuber.Controller to javafx.fxml;
}