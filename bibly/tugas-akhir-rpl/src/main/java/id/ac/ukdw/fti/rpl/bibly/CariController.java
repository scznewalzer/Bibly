package id.ac.ukdw.fti.rpl.bibly;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class CariController implements Initializable {

    @FXML
    private Button eventsButtonSearch;

    @FXML
    private ListView<?> eventsResult;

    @FXML
    private Button placesButtonSearch;

    @FXML
    private ListView<?> placesResult;

    @FXML
    private TextField searchFieldEvents;

    @FXML
    private TextField searchFieldPlaces;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

}

