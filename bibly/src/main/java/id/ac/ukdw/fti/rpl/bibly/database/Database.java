package id.ac.ukdw.fti.rpl.bibly.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import id.ac.ukdw.fti.rpl.bibly.modal.Verses;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Database {
    final String querySelect = "SELECT verseID, osisRef, eventsDescribed, place, verseText FROM verses";
    final String url = "jdbc:sqlite:vizbible.db";
    private ObservableList<Verses> verses = FXCollections.observableArrayList();
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

    public Connection openConnection() {
        return connection;
    }

    public ObservableList<Verses> getAllVerses() {
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(querySelect);
            while (result.next()) {
                Verses verse = new Verses();
                verse.setVerseId(result.getInt("verseID"));
                verse.setVerse(result.getString("osisRef"));
		verse.setEvents(result.getString("eventDescribed"));
                verse.setPlace(result.getString("place"));
                verse.setVerseText(result.getString("verseText"));
                verses.add(verse);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        return verses;
    }
    
}
