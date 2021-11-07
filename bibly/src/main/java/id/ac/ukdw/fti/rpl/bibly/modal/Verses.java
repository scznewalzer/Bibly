package id.ac.ukdw.fti.rpl.bibly.modal;

public class Verses {
    private int verseId;
    private String verse;
    private String events;
    private String place;
    private String verseText;

    public void setVerseId(int verseId) {
       this.verseId = verseId;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }
    public void setEvents(String events) {
        events = events;
    }
    public void setPlace(String place) {
        place = place;
    }

    public void setVerseText(String verseText) {
        this.verseText = verseText;
    }

    public int getVerseId() {
        return this.verseId;
    }

    public String getVerse() {
        return this.verse;
    }
    public String getEvents() {
        return this.events;
    }
    public String getPlace() {
        return this.place;
    }

    public String getVerseText() {
        return this.verseText;
    }
    
}
