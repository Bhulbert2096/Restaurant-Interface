/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.LinkedList;
import java.util.Queue;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Restaurant extends Application{
    private final GridPane GridPane = new GridPane();
    private final Button b1 = new Button("Table for 2");
    //private final Button b2 = new Button("Table for 2");
    private final Button b2 = new Button("Table for 4");
    private final Button b3 = new Button("Table for 4");
    private final Button b4 = new Button("Table for 4");
    private final Button b5 = new Button("Table for 4");
    private final Button b6 = new Button("Table for 6");
    private final Button b7 = new Button("Table for 6");
    private final Button b8 = new Button("Table for 8");
    private final Button b9 = new Button("Table for 8");
    private final HBox HPane = new HBox();
    private final ObservableList<String> oList = FXCollections.observableArrayList();
    private final ListView<String> list = new ListView<>();
    private Queue<String> waitingList = new LinkedList<>();
    private final Label listLabel = new Label("SEATING AVAILABILITY");
    private BorderPane mainPane = new BorderPane();
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    public void setButtonSize(){
        //tables for 4 people
       
        b2.setPrefSize(250, 250);
        b2.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b3.setPrefSize(250, 250);
        b3.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b4.setPrefSize(250, 250);
        b4.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b5.setPrefSize(250, 250);
        b5.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        //tables for 2 people
        b1.setPrefSize(200, 200);
        b1.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        //b2.setPrefSize(200, 200);
        //b2.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        //tables for 6 people
        b6.setPrefSize(200, 300);
        b6.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b7.setPrefSize(200, 300);
        b7.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        //tables for 8 people
        b9.setPrefSize(200, 350);
        b9.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b8.setPrefSize(350, 200);
        b8.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        
    }
    public void setButtonPosition(){
       // mainPane.getChildren().add(listLabel);
        //mainPane.setPadding(new Insets(50, 0, 0, 0));
        list.setItems(oList);
       
        
        list.setPrefSize(400, 100);
        GridPane.setPadding(new Insets(20, 20, 20, 20));
        GridPane.setVgap(75);
        GridPane.setHgap(100);
        GridPane.add(b2, 0, 0);
        GridPane.add(b3,0,1);
        GridPane.add(b9,0,2);
        GridPane.add(b8,1,0);
        GridPane.add(b4,1,1);
        GridPane.add(b5,1,2);
        GridPane.add(b1,2,0);
        GridPane.add(b6,2,1);
        GridPane.add(b7,2,2);
        GridPane.setAlignment(Pos.CENTER);
        
        HPane.getChildren().addAll(listLabel);
        HPane.setAlignment(Pos.CENTER);
        mainPane.setCenter(GridPane);
        mainPane.setTop(HPane);
        mainPane.setRight(list);
    }
    
    public void ButtonAction(){
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        b1.setOnAction(event ->{
            VBox secondPane = new VBox();
            Label lNumberOfGuests = new Label("Number of Guests");
            TextField txNumberOfGuests = new TextField("Enter the number of guests");
            secondPane.getChildren().add(lNumberOfGuests);
            secondPane.setPadding(new Insets(10,10,10,10));
            secondPane.getChildren().add(txNumberOfGuests);
            Stage secondStage = new Stage();
            Scene secondScene = new Scene(secondPane,100,100);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
    }

    @Override
    public void start(Stage stage) throws Exception {
        waitingList.offer("Brandon Hulbert");
        waitingList.offer("Cullen Campbell");
        oList.add(waitingList.poll());
        oList.add(waitingList.poll());
        setButtonSize();
        setButtonPosition();
        Scene scene = new Scene(mainPane,700,700);
        //scene.getStylesheets().add("StyleSheet.css");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
    
}
