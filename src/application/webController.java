package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class webController implements Initializable {
	@FXML
	private WebView webview;
	@FXML
	private TextField textfield;
	private WebEngine webEngine;
//	private String Homepage;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//	 WebEngine webEngine=new WebEngine();
	
//		Homepage="www.google.com";
//		textfield.setText(Homepage);
		WebView webview=new WebView();
		WebEngine webEngine =webview.getEngine();
		
		// TODO Auto-generated method stub
		
	} 
	@FXML
	public void loadpage()
	{
	  
     webEngine.load("http://www.google.com");
	}
//	public void txtEnterkey(KeyEvent event)
//	{
//		if(event.getCode()==KeyCode.ENTER) {
//			
//			loadpage();
//		}
	//}

	
	
}
