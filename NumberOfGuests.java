/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;


import java.util.Optional;
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
    

    //this will set the mainpane button that was pressed.
    public void setMainPaneButton(Button mainButton) {
        this.mainPaneButton = mainButton;
    }

    //this method will check if the number that was parsed is not a character but truly is a number
    public boolean CheckNumberParsing(){
        
        boolean parseSuccessful = true;
        try{
             nNumberOfGuests = Integer.parseInt(txNumberOfGuests.getText());
            }catch(NumberFormatException e){
                parseSuccessful = false;
                //this will display an error message to the console 
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("NonInteger value entered");
            alert.show();
            }
        //this return value will prevent an error from being thrown 
        return parseSuccessful;
    }
 
    public void ButtonAction(Stage stage) {
        //this is where the go button for the secondary window is pressed and what is 
        //done after it has been pressed.  
        bGo.setOnAction(event -> {
           //this will get the text that was entered into the textfield.
            String sNumberOfGuests = txNumberOfGuests.getText();
            boolean parseSuccessful = CheckNumberParsing();
            //this will determine if the parsing was successful or not.  If it was not
            //then the program will not continue.  
            if(parseSuccessful == true){
                //this will check if there is nothing in the test field and the user just hit enter.
            if (sNumberOfGuests == null || "".equals(sNumberOfGuests)) {
                txNumberOfGuests.setText("");
            }
            
                Stage secondStage = new Stage();
                //this will check if the number that the user entered was acceptable or not.
                //if it is not then the program will display an error message below.
                if (nNumberOfGuests <= 0 || nNumberOfGuests > nMaximum) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Too many guests at this table");
                    alert.setContentText("Please enter the number of guests again between " + nMinimum + " and " + nMaximum);
                    Optional<ButtonType> result = alert.showAndWait();
                    txNumberOfGuests.setText("");
                }

                //if all checks have passed then the button that was selected will change color to red and close the secondary stage.
                else {
                    
                    mainPaneButton.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
                    
                    stage.close();
                    
                }
            }
            
        });
    }

    //this will get the desired range for the number of guests at the table
    public void GuestNumberRange(int nMin, int nMax) {
        nMinimum = nMin;
        nMaximum = nMax;

    }

    @Override
    public void start(Stage secondStage) throws Exception {

        ButtonAction(secondStage);
        bGo.setPrefSize(300, 100);
        lNumberOfGuests.setText("Max Number of Guests " + nMaximum);
        //this will set a border around the labels
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
