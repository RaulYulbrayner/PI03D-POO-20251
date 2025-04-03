module co.edu.uniquindio.poo.empresajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.empresajfx to javafx.fxml;
    exports co.edu.uniquindio.poo.empresajfx;
    exports co.edu.uniquindio.poo.empresajfx.viewController;
    opens co.edu.uniquindio.poo.empresajfx.viewController to javafx.fxml;

}