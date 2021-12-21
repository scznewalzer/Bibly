package id.ac.ukdw.fti.rpl.bibly;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import id.ac.ukdw.fti.rpl.bibly.database.Database;
import id.ac.ukdw.fti.rpl.bibly.modal.Verse;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FXMLController implements Initializable {

    @FXML
    private TableView<Verse> tableVerses;

    @FXML
    private TableColumn<Verse, Integer> verseIdColumn;

    @FXML
    private TableColumn<Verse, String> verseColumn;

    @FXML
    private TableColumn<Verse, String> eventsColumn;

    @FXML
    private TableColumn<Verse, String> verseTextColumn;

    @FXML
    private TableColumn<Verse, String> placesColumn;

    @FXML
    void moveToPencarian(ActionEvent moveToPencarian) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pencarian.fxml"));
        Stage stage = new Stage(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        scene.setRoot(root);
        stage.setTitle("Pencarian Event & Place");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Verse> verses = Database.instance.getAllVerse();
        verseIdColumn.setCellValueFactory(new PropertyValueFactory<Verse, Integer>("verseId"));
        verseColumn.setCellValueFactory(new PropertyValueFactory<Verse, String>("verse"));
        eventsColumn.setCellValueFactory(new PropertyValueFactory<Verse, String>("eventsDescribed"));
        verseTextColumn.setCellValueFactory(new PropertyValueFactory<Verse, String>("verseText"));
        placesColumn.setCellValueFactory(new PropertyValueFactory<Verse, String>("places"));
        tableVerses.setItems(verses);
    }
}
