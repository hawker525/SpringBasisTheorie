package be.vdab.converters;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 *
 */
public class StringToDateConverter implements Converter<String, Date> {

    private static final String DATUM_FORMAT= "yyyy-MM-dd";

    @Override
    public Date convert(String s) {
        SimpleDateFormat format = new SimpleDateFormat(DATUM_FORMAT);
        try {
            return format.parse(s);
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
