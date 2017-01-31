package be.vdab;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTheorie.
 */
public class ClassB implements InterfaceB{

    private final String telefoonNrHelpDesk;
    private final int aantalPogingenUpdateKlant;

    public ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
        this.telefoonNrHelpDesk = telefoonNrHelpDesk;
        this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
    }

    public String getBoodschap() {
        return "ClassB object";
    }

    public String getTelefoonNrHelpDesk() {
        return telefoonNrHelpDesk;
    }

    public int getAantalPogingenUpdateKlant() {
        return aantalPogingenUpdateKlant;
    }
}
