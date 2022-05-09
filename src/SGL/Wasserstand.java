package SGL;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private String Ort;
    private double messWert;
    private double messWertFuerAlarmierung;
    private int zeitpunkt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", Ort='" + Ort + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }
    
}
