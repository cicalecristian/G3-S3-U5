package cristiancicale.G3S3U5.composite;

public class Pagina implements ElementoLibro {

    private int numero;

    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    public void stampa() {
        System.out.println("Stampo pagina: " + numero);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
