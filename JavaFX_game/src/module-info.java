module JavaFX_game {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
