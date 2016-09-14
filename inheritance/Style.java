package inheritance;

/**
 * Created by Erik on 14-9-2016.
 */
public enum Style {
    A, B, C, D, E, F;

    public String toString(){
        switch(this){
            case A: return "A";
            case B: return "B";
            case C: return "C";
            case D: return "D";
            case E: return "E";
            case F: return "F";
            default: return "A";
        }
    }
}
