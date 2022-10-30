module com.example.mukemmelsay {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mukemmelsay to javafx.fxml;
    exports com.example.mukemmelsay;
}