package inheritance;

import lombok.Data;

@Data
public abstract class Instrument {
    private String serialNumber;
    private double price;

    public Instrument(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }
}
