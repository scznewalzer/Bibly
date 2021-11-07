package id.ac.ukdw.fti.rpl.bibly;
import java.net.URL;
import java.util.ResourceBundle;

import id.ac.ukdw.fti.rpl.bibly.database.Database;
import id.ac.ukdw.fti.rpl.bibly.modal.Verses;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLController implements Initializable {

    private ObservableList<Verses> verses = FXCollections.observableArrayList();

    @FXML
    private TableView<Verses> tableVerses;

    @FXML
    private TableColumn<Verses, Integer> verseIdColumn;

    @FXML
    private TableColumn<Verses, String> verseColumn;


    @FXML
    private TableColumn<Verses, String> verseEventsColumn;


    @FXML
    private TableColumn<Verses, String> versePlacesColumn;

    @FXML
    private TableColumn<Verses, String> verseTextColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

        verses = Database.instance.getAllVerses();
        verseIdColumn.setCellValueFactory(new PropertyValueFactory<Verses, Integer>("verseId"));
        verseColumn.setCellValueFactory(new PropertyValueFactory<Verses, String>("verse"));
        verseEventsColumn.setCellValueFactory(new PropertyValueFactory<Verses, String>("events"));
        versePlacesColumn.setCellValueFactory(new PropertyValueFactory<Verses, String>("places"));
        verseTextColumn.setCellValueFactory(new PropertyValueFactory<Verses,String>("verseText"));
        tableVerses.setItems(verses);
    }

    
}

