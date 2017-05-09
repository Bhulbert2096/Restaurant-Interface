/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class NumberOfGuests extends Application {

    private final VBox secondPane = new VBox();
    private final Label lNumberOfGuests = new Label();
    private final TextField txNumberOfGuests = new TextField();
    private final Button bGo = new Button("Submit Changes");
    private int nNumberOfGuests;
    private int nMinimum;
    private int nMaximum;
    private final Label lListLabel = new Label("Select a name for the party");
    private ListView<String> list = new ListView<>();
    private Button mainPaneButton = new Button();
    

    public void setMainPaneButton(Button mainButton) {
        this.mainPaneButton = mainButton;
    }

    
    public int getNumberOfGuests() {
        return nNumberOfGuests;
    }

    public NumberOfGuests(ListView<String> listview) {
        this.list = listview;
    }
 
    public void ButtonAction(Stage stage) {
        bGo.setOnAction(event -> {
           
            String sNumberOfGuests = txNumberOfGuests.getText();
            if (sNumberOfGuests == null || "".equals(sNumberOfGuests)) {
                txNumberOfGuests.setText("");
            }
            else {
                nNumberOfGuests = Integer.parseInt(sNumberOfGuests);

                Stage secondStage = new Stage();
                if (nNumberOfGuests <= 0 || nNumberOfGuests > nMaximum) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Too many guests at this table");
                    alert.setContentText("Please enter the number of guests again between " + nMinimum + " and " + nMaximum);
                    Optional<ButtonType> result = alert.showAndWait();
                    txNumberOfGuests.setText("");
                }

                else {
                    System.out.println("IN NUMBER CLASS" + nNumberOfGuests);
                    //this will take the item that is selected and remove it from the list
                    
                    mainPaneButton.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
                    
                    stage.close();
                    
                }
            }
        });
    }

    
    public void GuestNumberRange(int nMin, int nMax) {
        nMinimum = nMin;
        nMaximum = nMax;

    }

    @Override
    public void start(Stage secondStage) throws Exception {

        ButtonAction(secondStage);
        bGo.setPrefSize(300, 100);
        lNumberOfGuests.setText("Max Number of Guests " + nMaximum);
        lListLabel.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT)));
        lNumberOfGuests.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT)));
        secondPane.setAlignment(Pos.CENTER);
        secondPane.getChildren().add(lListLabel);
        secondPane.setAlignment(Pos.CENTER);
        secondPane.getChildren().add(lNumberOfGuests);
        secondPane.setPadding(new Insets(10, 10, 10, 10));
        secondPane.getChildren().add(txNumberOfGuests);
        secondPane.getChildren().add(bGo);

        Scene secondScene = new Scene(secondPane, 300, 200);
        secondStage.setScene(secondScene);
        secondStage.show();
        
    }

}
