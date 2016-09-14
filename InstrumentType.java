/**
 * Created by Erik on 14-9-2016.
 */
public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;
    public String toString() {
        switch(this) {
            case GUITAR: return "Guitar";
            case BANJO: return "Banjo";
            case DOBRO: return "Dobro";
            case FIDDLE: return "Fiddle";
            case BASS: return "Bass";
            case MANDOLIN: return "Mandolin";
            default: return "Unspecifed";
        }
    }
}
