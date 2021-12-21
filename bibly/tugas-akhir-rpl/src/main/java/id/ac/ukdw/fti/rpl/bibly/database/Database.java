package id.ac.ukdw.fti.rpl.bibly.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import id.ac.ukdw.fti.rpl.bibly.modal.Verse;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Database {
    
    final private String url = "jdbc:sqlite:vizbible.db";
    final private String querySelect = "SELECT verseID, osisRef, verseText, eventsDescribed, places FROM verses";
    private Connection connection = null;
    public static Database instance = new Database();

    public Database() {
        try {
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public ObservableList<Verse> getAllVerse() {
        ObservableList<Verse> verses = FXCollections.observableArrayList();
        try {            
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(querySelect);
            while (result.next()) {
                Verse verse = new Verse();
                verse.setVerseId(result.getInt("verseID"));
                verse.setVerse(result.getString("osisRef"));
                verse.setVerseText(result.getString("verseText"));
                verse.setEventsDescribed(result.getString("eventsDescribed"));
                verse.setPlaces(result.getString("places"));
                verses.add(verse);
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
        return verses;
    }
}
