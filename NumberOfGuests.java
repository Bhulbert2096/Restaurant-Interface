/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class NumberOfGuests extends Application {
    private final VBox secondPane = new VBox();
    private final Label lNumberOfGuests = new Label("Number of Guests");
    private final TextField txNumberOfGuests = new TextField();
    private final Button bGo = new Button();
    private int nNumberOfGuests;

    public int getNumberOfGuests() {
        return nNumberOfGuests;
    }
    
    public void ButtonAction(){
        bGo.setOnAction(event -> {
            String sNumberOfGuests = txNumberOfGuests.getText();
            nNumberOfGuests = Integer.parseInt(sNumberOfGuests);
            System.out.println("IN NUMBER CLASS"+nNumberOfGuests);
            
        });
    }
    
    @Override
    public void start(Stage secondStage) throws Exception {

        
        ButtonAction();
        secondPane.getChildren().add(lNumberOfGuests);
        secondPane.setPadding(new Insets(10,10,10,10));
        secondPane.getChildren().add(txNumberOfGuests);
        secondPane.getChildren().add(bGo);
        
        
        Scene secondScene = new Scene(secondPane,200,200);
        secondStage.setScene(secondScene);
        secondStage.show();
    }
    
}
