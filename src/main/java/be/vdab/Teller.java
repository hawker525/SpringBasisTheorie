package be.vdab;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
public class Teller {
    private int teller;

    Teller() {
        System.out.println("Teller constructor, teller is " + teller);
    }

    public void verhoog() {
        ++teller;
        System.out.println("teller is verhoogd tot " + teller);
    }

}
