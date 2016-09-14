/**
 * Created by Erik on 14-9-2016.
 */
public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString(){
        switch(this){
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "acoustic";
        }
    }
}
