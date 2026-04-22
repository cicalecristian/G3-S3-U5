package cristiancicale.G3S3U5.adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

    public void stampa() {
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Età: " + eta);
    }
}
