package be.vdab;

import java.util.regex.Pattern;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
public class EMailAdres {
    private final static Pattern REG_EXPR = Pattern.compile("^.+@.+\\.[a-z]+$");
    private final String adres;

    public EMailAdres(String adres) {
        if ( ! REG_EXPR.matcher(adres).matches()) {
            throw new IllegalArgumentException("Verkeerd emailadres:" + adres);
        }
        this.adres = adres;
    }

    @Override
    public String toString() {
        return adres;
    }
}
