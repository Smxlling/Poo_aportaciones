package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	@FXML
    private Button btnBalance;

    @FXML
    private Button btnER;

    @FXML
    private Button btnbanlaza;

    @FXML
    private Button btnCrearPartida;

    @FXML
    private Button btnPd;
	
	
	
	
	
	public void verBalanceGeneral() {
		Stage stage=new Stage();
		URL location = getClass().getResource("/vista/BalanceGeneral.fxml");
		FXMLLoader loader=new FXMLLoader(location);
		try {
			AnchorPane root=(AnchorPane)loader.load(location);
			Scene scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void cargarCrearPartida() {
		Stage stage=new Stage();
		URL location = getClass().getResource("/vista/CrearPartida.fxml");
		FXMLLoader loader=new FXMLLoader(location);
		try {
			AnchorPane root=(AnchorPane)loader.load(location);
			Scene scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void verPartida() {
		Stage stage=new Stage();
		URL location = getClass().getResource("/vista/PartidaDoble.fxml");
		FXMLLoader loader=new FXMLLoader(location);
		try {
			AnchorPane root=(AnchorPane)loader.load(location);
			Scene scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void verEstadoDeResultados() {
		Stage stage=new Stage();
		URL location = getClass().getResource("/vista/EstadoDeResultados.fxml");
		FXMLLoader loader=new FXMLLoader(location);
		try {
			AnchorPane root=(AnchorPane)loader.load(location);
			Scene scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void cargarBalanza() {
		Stage stage=new Stage();
		URL location = getClass().getResource("/vista/BalanzaDeComprobacion.fxml");
		FXMLLoader loader=new FXMLLoader(location);
		try {
			AnchorPane root=(AnchorPane)loader.load(location);
			Scene scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	










	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
