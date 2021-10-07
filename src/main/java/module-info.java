module com.example.javafxlearn {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxlearn to javafx.fxml;
    exports com.example.javafxlearn;
}