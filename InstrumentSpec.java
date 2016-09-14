import java.util.Iterator;
import java.util.Map;

/**
 * Created by Erik on 14-9-2016.
 */
public class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        this.properties = properties;
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator();
             i.hasNext(); ) {
            String propertyName = (String)i.next();
            if (!properties.get(propertyName).equals(
                    otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }
}
