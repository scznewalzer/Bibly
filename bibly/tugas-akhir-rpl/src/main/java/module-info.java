module bibly {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;

    opens id.ac.ukdw.fti.rpl.bibly to javafx.fxml;
    exports id.ac.ukdw.fti.rpl.bibly;
    exports id.ac.ukdw.fti.rpl.bibly.modal;
}
