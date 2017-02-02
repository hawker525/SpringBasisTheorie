package be.vdab.gaming;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Maarten Westelinck on 2/02/2017 for SpringBasisTheorie.
 */
public class Spelletje {
    private int aantalVijanden;

    public int getAantalVijanden() {
        return aantalVijanden;
    }

    @Value("#{${minimumAantalVijanden} + new java.util.Random().nextInt(2)}")
    public void setAantalVijanden(int aantalVijanden) {
        this.aantalVijanden = aantalVijanden;
    }
}
