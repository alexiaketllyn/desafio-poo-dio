module com.example.desafiodiopoo {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.desafiodiopoo to javafx.fxml;
    exports com.example.desafiodiopoo;
}