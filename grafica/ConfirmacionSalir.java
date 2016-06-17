package grafica;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmacionSalir {

	static boolean resp;
	public static boolean display(){
		Stage stage= new Stage();

		Button si= new Button("Si");
		si.setOnAction(e->{
			resp=true;
			stage.close();
		});

		Button no= new Button("No");
		no.setOnAction((e->{
			resp=false;
			stage.close();
		}));

		Label label= new Label("¿Desea guardar la partida antes de salir?");
		VBox vBox= new VBox(20);
		HBox hBox= new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		vBox.setAlignment(Pos.CENTER);

		hBox.getChildren().addAll(si,no);
		vBox.getChildren().addAll(label,hBox);
		stage.setHeight(100);
		stage.setWidth(400);
		Scene scene= new Scene(vBox);
		//scene.getStylesheets().add("../assets/application.css");

		stage.setScene(scene);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setResizable(false);
		stage.showAndWait();

		return resp;


	}
}