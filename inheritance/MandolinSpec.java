package inheritance;

/**
 * Created by Erik on 14-9-2016.
 */
public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(builder,model,type,backWood,topWood);
        this.style = style;
    }

    public Style getStyle(){
        return style;
    }

    // Override the superclass matches()
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof MandolinSpec))
            return false;
        MandolinSpec spec = (MandolinSpec)otherSpec;
        if (style != spec.getStyle())
            return false;
        return true;
    }
}
