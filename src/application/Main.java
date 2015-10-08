package application;

import java.lang.Thread.State;
import java.net.URL;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Main extends Application {
	// @Override
	// public void start(Stage primaryStage) {
	// try {
	// BorderPane root = new BorderPane();
	// Scene scene = new Scene(root,400,400);
	// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	// primaryStage.setScene(scene);
	// primaryStage.show();
	// } catch(Exception e) {
	// e.printStackTrace();
	// }
	// }
	//
	// public static void main(String[] args) {
	// launch(args);
	// }

	public static void main(String[] args) {
		launch(args);
	}
	@Override
    public void start(Stage stage) throws Exception {
        WebView webView = new WebView();
        stage.setScene(new Scene(webView, 1040, 160));
        WebEngine engine = webView.getEngine();
        stage.titleProperty().bind(engine.titleProperty());
        stage.show();
 
        // （１）ローカルフォルダのHTMLを指定
//        String url = "file:///c:/Temp/javafxtest.html";
        String url = "file:///Applications/eclipse4.4/workspace/javaFX/res/javafxtest.html";
        engine.load(url);
//        engine.executeScript("(function(F,i,r,e,b,u,g,L,I,T,E){if(F.getElementById(b))return;E=F[i+'NS']&&F.documentElement.namespaceURI;E=E?F[i+'NS'](E,'script'):F[i]('script');E[r]('id',b);E[r]('src',I+g+T);E[r](b,u);(F[e]('head')[0]||F[e]('body')[0]).appendChild(E);E=new Image;E[r]('src',I+L);})(document,'createElement','setAttribute','getElementsByTagName','FirebugLite','4','firebug-lite.js','releases/lite/latest/skin/xp/sprite.png','https://getfirebug.com/','#startOpened');");
    }
	
}
