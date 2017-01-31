package be.vdab;

import java.util.*;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 *
 */
public class HelpdeskMedewerkers {
    private final Properties medewerkers;
    // key = naam medewerker, value=intern telefoonnummer

    public HelpdeskMedewerkers(Properties medewerkers) {
        this.medewerkers = medewerkers;
    }

    @Override
    public String toString() {
        return medewerkers.toString();
    }
}
