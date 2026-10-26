module org.example.miniwaze {

    requires javafx.controls;
    requires javafx.fxml;

    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;

    opens org.example.miniwaze.model to org.hibernate.orm.core;
    opens org.example.miniwaze to javafx.fxml;

    exports org.example.miniwaze;
}
