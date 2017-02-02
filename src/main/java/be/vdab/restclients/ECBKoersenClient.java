package be.vdab.restclients;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
public class ECBKoersenClient implements KoersenClient{
    private final URL url;

    public ECBKoersenClient(URL url) {
        this.url = url;
    }

    @Override
    public BigDecimal getDollarKoers() {
        try (Scanner xmlScanner = new Scanner(url.openStream())) {
            String regel;
            // regel per regel lezen tot we een regel vinden die USD bevat:
            while ( ! (regel = xmlScanner.nextLine()).contains("USD"));
            try (Scanner regelScanner=new Scanner(regel)) { // in die regel zelf lezen
                regelScanner.findInLine("rate='"); // tekens overslaan tot en met rate='
                regelScanner.useDelimiter("'"); // volgende leesoperatie stopt bij '
                return new BigDecimal(regelScanner.next());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
