module com.example.tpjdbcjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tpjdbcjavafx to javafx.fxml;
    exports com.example.tpjdbcjavafx;
}