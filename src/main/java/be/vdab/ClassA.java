package be.vdab;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
public class ClassA implements InterfaceA{

    private String telefoonNrHelpDesk;
    private URL koersenURL;
    private Locale defaultTaalEnLand;
    private File importData;
    private BladRichtingInPrinter defaultBladRichting;
    private EMailAdres webMasterEMailAdres;
    private Date websiteGestart;

    public Date getWebsiteGestart() {
        return websiteGestart;
    }

    public void setWebsiteGestart(Date websiteGestart) {
        this.websiteGestart = websiteGestart;
    }

    public String getBoodschap() {
        return "ClassA object";
    }

    public String getTelefoonNrHelpDesk() {
        return telefoonNrHelpDesk;
    }

    public void setTelefoonNrHelpDesk(String telefoonNrHelpDesk) {
        this.telefoonNrHelpDesk = telefoonNrHelpDesk;
    }

    public URL getKoersenURL() {
        return koersenURL;
    }

    public void setKoersenURL(URL url) {
        this.koersenURL = url;
    }

    public Locale getDefaultTaalEnLand() {
        return defaultTaalEnLand;
    }

    public void setDefaultTaalEnLand(Locale defaultTaalEnLand) {
        this.defaultTaalEnLand = defaultTaalEnLand;
    }

    public File getImportData() {
        return importData;
    }

    public void setImportData(File importData) {
        this.importData = importData;
    }

    public BladRichtingInPrinter getDefaultBladRichting() {
        return defaultBladRichting;
    }

    public void setDefaultBladRichting(BladRichtingInPrinter defaultBladRichting) {
        this.defaultBladRichting = defaultBladRichting;
    }

    public EMailAdres getWebMasterEMailAdres() {
        return webMasterEMailAdres;
    }

    public void setWebMasterEMailAdres(EMailAdres webMasterEMailAdres) {
        this.webMasterEMailAdres = webMasterEMailAdres;
    }
}
