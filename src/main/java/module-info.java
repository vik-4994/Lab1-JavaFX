module org.example.lab1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab1javafx to javafx.fxml;
    exports org.example.lab1javafx;
}