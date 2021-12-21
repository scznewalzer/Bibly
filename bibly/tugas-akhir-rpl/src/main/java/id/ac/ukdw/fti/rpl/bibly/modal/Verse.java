package id.ac.ukdw.fti.rpl.bibly.modal;

public class Verse {
    private int verseId;
    private String verse;
    private String verseText;
    private String eventsDescribed;
    private String places;


    public void setVerseId(int verseId){
        this.verseId = verseId;
    }

    public void setVerse(String verse){
        this.verse = verse;
    }

    public void setVerseText(String verseText){
        this.verseText = verseText;
    }

    public void setEventsDescribed(String eventsDescribed){
        this.eventsDescribed = eventsDescribed;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public int getVerseId() {
        return this.verseId;
    }

    public String getVerse() {
        return this.verse;
    }

    public String getVerseText() {
        return this.verseText;
    } 

    public String getEventsDescribed() {
        return eventsDescribed;
    }

    public String getPlaces() {
        return places;
    }
}
