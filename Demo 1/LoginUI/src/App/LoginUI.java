/**
 *  - LoginUI - 
 * This application is a login screen. Currently, no action is performed
 * when the user clicks a button but this will change in the future. 
 * @author JerJohn15
 */
package App;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class LoginUI extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
      //Set the location of the FXML file then load it in the root pane.
        FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("/FXML/LoginUI.fxml"));
      
        Parent root = loader.load();
        Scene login = new Scene(root);
       //set the title and scene before showing the stage.
        primaryStage.setTitle("Login");
        primaryStage.setScene(login);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     * @output - Launches the program.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
