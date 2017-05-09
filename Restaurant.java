/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Restaurant extends Application {

    private final GridPane GridPane = new GridPane();
    private final Button b1 = new Button("Table #1");
    private final Button b2 = new Button("Table #2");
    private final Button b3 = new Button("Table #3");
    private final Button b4 = new Button("Table #4");
    private final Button b5 = new Button("Table #5");
    private final Button b6 = new Button("Table #6");
    private final Button b7 = new Button("Table #7");
    private final Button b8 = new Button("Table #8");
    private final Button b9 = new Button("Table #9");
    private final HBox HPane = new HBox();
    private final ObservableList<String> oList = FXCollections.observableArrayList();
    private final ListView<String> list = new ListView<>();
    private Queue<String> waitingList = new LinkedList<>();
    private final Label listLabel = new Label("SEATING AVAILABILITY");
    private final BorderPane mainPane = new BorderPane();
    private int nNumberOfGuests;
    private final Button bAddToWaitList = new Button("Add a guest to waiting list");
    private StoringGuestList collection = new StoringGuestList();
    private final Button bRelease1 = new Button("Release");
    private final Button bRelease2 = new Button("Release");
    private final Button bRelease3 = new Button("Release");
    private final Button bRelease4 = new Button("Release");
    private final Button bRelease5 = new Button("Release");
    private final Button bRelease6 = new Button("Release");
    private final Button bRelease7 = new Button("Release");
    private final Button bRelease8 = new Button("Release");
    private final Button bRelease9 = new Button("Release");
    private String sNametoRemove;

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void setButtonSize() {
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
        b1.setPrefSize(250, 250);
        b1.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));

        //tables for 6 people
        b6.setPrefSize(250, 250);
        b6.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b7.setPrefSize(250, 250);
        b7.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        //tables for 8 people
        b9.setPrefSize(250, 250);
        b9.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        b8.setPrefSize(250, 250);
        b8.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        bAddToWaitList.setPrefSize(200, 500);
        bAddToWaitList.setBackground(new Background(new BackgroundFill(Color.SILVER, null, null)));

    }

    public void setButtonPosition() {
        // mainPane.getChildren().add(listLabel);
        //mainPane.setPadding(new Insets(50, 0, 0, 0));
        list.setItems(oList);

        list.setPrefSize(400, 100);
        GridPane.setPadding(new Insets(20, 20, 20, 20));
        GridPane.setVgap(75);
        GridPane.setHgap(100);
        GridPane.add(b1, 0, 0);
        GridPane.add(b4, 0, 1);
        GridPane.add(b7, 0, 2);
        GridPane.add(b2, 1, 0);
        GridPane.add(b5, 1, 1);
        GridPane.add(b8, 1, 2);
        GridPane.add(b3, 2, 0);
        GridPane.add(b6, 2, 1);
        GridPane.add(b9, 2, 2);
        GridPane.setAlignment(Pos.CENTER);

        mainPane.setStyle("-fx-background-color: transparent;");
        HPane.getChildren().addAll(listLabel);
        HPane.setAlignment(Pos.CENTER);
        mainPane.setCenter(GridPane);
        mainPane.setTop(HPane);
        mainPane.setRight(list);
        mainPane.setLeft(bAddToWaitList);
    }

    public void releaseButtonAction() {

        bRelease1.setOnAction(eh -> {
            b1.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease1.setVisible(false);
        });

        bRelease2.setOnAction(eh -> {
            b2.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease2.setVisible(false);
        });

        bRelease3.setOnAction(eh -> {
            b3.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease3.setVisible(false);
        });

        bRelease4.setOnAction(eh -> {
            b4.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease4.setVisible(false);
        });

        bRelease5.setOnAction(eh -> {
            b5.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease5.setVisible(false);
        });

        bRelease6.setOnAction(eh -> {
            b6.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease6.setVisible(false);
        });

        bRelease7.setOnAction(eh -> {
            b7.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease7.setVisible(false);
        });

        bRelease8.setOnAction(eh -> {
            b8.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease8.setVisible(false);
        });
        bRelease9.setOnAction(eh -> {
            b9.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
            bRelease9.setVisible(false);
        });

    }

    public void ButtonAction() throws Exception {

        list.refresh();
        collection.readCollection2();
        list.refresh();
        bAddToWaitList.setOnAction(event -> {

            GridPane secondPane = new GridPane();
            TextField txNewGuest = new TextField();
            Button bSubmit = new Button("Submit Changes");
            txNewGuest.setAlignment(Pos.CENTER);
            bSubmit.setAlignment(Pos.CENTER);
            secondPane.add(txNewGuest, 0, 0);
            secondPane.add(bSubmit, 0, 1);
            Scene scene = new Scene(secondPane, 200, 200);
            Stage secondStage = new Stage();
            bSubmit.setOnAction(e -> {
                collection.addNameToList(txNewGuest.getText());
                oList.add(txNewGuest.getText());
                list.refresh();
                try {
                    collection.storeCollection();
                }
                catch (Exception ex) {
                    Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
                }
                secondStage.close();

            });

            secondStage.setScene(scene);
            secondStage.show();
        });

        b1.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 2);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b1);
            bRelease1.setVisible(true);
            GridPane.add(bRelease1, 0, 0);
        });
        b2.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 4);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }

            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b2);
            bRelease2.setVisible(true);
            GridPane.add(bRelease2, 1, 0);
        });
        b3.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 4);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b3);
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b3);
            bRelease3.setVisible(true);
            GridPane.add(bRelease3, 2, 0);
        });
        b4.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 4);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b4);
            bRelease3.setVisible(true);
            GridPane.add(bRelease4, 0, 1);
        });
        b5.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            guests.GuestNumberRange(1, 4);
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b5);
            bRelease5.setVisible(true);
            GridPane.add(bRelease5, 1, 1);
        });
        b6.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 6);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b6);
            bRelease6.setVisible(true);
            GridPane.add(bRelease6, 2, 1);
        });
        b7.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 6);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b7);
            bRelease7.setVisible(true);
            GridPane.add(bRelease7, 0, 2);
        });
        b8.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 8);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b8);
            bRelease8.setVisible(true);
            GridPane.add(bRelease8, 1, 2);
        });
        b9.setOnAction(event -> {
            NumberOfGuests guests = new NumberOfGuests(list);
            Stage secondStage = new Stage();
            sNametoRemove = list.getSelectionModel().getSelectedItem();
            guests.GuestNumberRange(1, 8);
            try {
                guests.start(secondStage);

            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            oList.remove(sNametoRemove);

            list.refresh();
            try {
                collection.storeCollection();
            }
            catch (Exception ex) {
                Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
            }
            guests.setMainPaneButton(b9);
            bRelease9.setVisible(true);
            GridPane.add(bRelease9, 2, 2);
        });
    }

    @Override
    public void start(Stage stage) throws Exception {

        collection.readCollection2();
        oList.addAll(collection.getGuestCollection());
        setButtonSize();
        setButtonPosition();
        ButtonAction();
        releaseButtonAction();
        Scene scene = new Scene(mainPane, 700, 700);
        //scene.getStylesheets().add("StyleSheet.css");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> {
            Platform.exit();
        });

    }

}
