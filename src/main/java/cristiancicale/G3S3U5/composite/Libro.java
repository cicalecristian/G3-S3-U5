package cristiancicale.G3S3U5.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String titolo;
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    private List<ElementoLibro> contenuto = new ArrayList<>();

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        contenuto.add(elemento);
    }

    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: " + prezzo);

        for (ElementoLibro e : contenuto) {
            e.stampa();
        }
    }

    public int getNumeroTotalePagine() {
        int totale = 0;
        for (ElementoLibro e : contenuto) {
            totale += e.getNumeroPagine();
        }
        return totale;
    }
}
