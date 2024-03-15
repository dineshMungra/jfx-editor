module nl.dva.jfxdemo.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens nl.dva.jfxdemo.demofx to javafx.fxml;
    exports nl.dva.jfxdemo.demofx;
}