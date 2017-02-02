package be.vdab.restclients;

import java.math.BigDecimal;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
public class DummyKoersenClient implements KoersenClient {

    @Override
    public BigDecimal getDollarKoers() {
        return BigDecimal.valueOf(1.5);
    }
}
