package cristiancicale.G3S3U5.chain;

public abstract class Ufficiale {

    protected Ufficiale superiore;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public abstract int getStipendio();

    public abstract String getGrado();

    public void gestisciRichiesta(int importo) {
        if (getStipendio() >= importo) {
            System.out.println(getGrado() + " (stipendio: " + getStipendio() + ")");
        }

        if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
