/**
 *  Build with <3 in JAVA
 *  https://github.com/wuiler/java-art 
 **/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;

public class WallpaperIsTheCode extends Application {
	@Override
	public void start( Stage myApp ) {
		String awesomeImageUrl = "https://raw.githubusercontent.com/wuiler/java-art/master/wallpapers/WallpaperIsTheCode.jpg";

		String ourAwesomeImageUrl = java.util.Optional.ofNullable( getParameters().getNamed().get("url") ).orElse(awesomeImageUrl);

		javafx.scene.control.ContextMenu contextMenu = new javafx.scene.control.ContextMenu();

		MenuItem menuDownload = new MenuItem( "Download" );
		menuDownload.setOnAction( e -> {
			getHostServices().showDocument( ourAwesomeImageUrl ); 
		});

		MenuItem menuExit = new MenuItem( "Exit" );
		menuExit.setOnAction(e -> { 
			javafx.application.Platform.exit(); 
		});

		contextMenu.getItems().addAll( menuDownload , menuExit );

		javafx.scene.image.ImageView imageView = new javafx.scene.image.ImageView( new javafx.scene.image.Image( ourAwesomeImageUrl ) );
		imageView.setOnContextMenuRequested( e -> contextMenu.show( imageView, e.getScreenX(), e.getScreenY() ) );

		javafx.scene.layout.VBox box = new javafx.scene.layout.VBox( imageView );
		box.setAlignment( javafx.geometry.Pos.CENTER );

		Scene masterScene = new Scene( box );
		myApp.setTitle( "Enjoy www.java.net.ar !" );
		myApp.setMaximized( true );
		myApp.setScene( masterScene );
		myApp.show();
	}
	public static void main( String args[] ) {
		launch( args );
	}
}


