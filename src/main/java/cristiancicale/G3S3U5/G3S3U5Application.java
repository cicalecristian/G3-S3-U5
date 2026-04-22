package cristiancicale.G3S3U5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class G3S3U5Application {

    public static void main(String[] args) {
        SpringApplication.run(G3S3U5Application.class, args);

        // Adapter

//        Info info = new Info();
//        info.setNome("Mario");
//        info.setCognome("Rossi");
//        info.setDataDiNascita(new Date(90, 0, 1)); // 1 Gennaio 1990
//
//        DataSource adapter = new InfoAdapter(info);
//
//        UserData userData = new UserData();
//        userData.getData(adapter);
//
//        userData.stampa();

        // Composite

//        Pagina p1 = new Pagina(1);
//        Pagina p2 = new Pagina(2);
//        Pagina p3 = new Pagina(3);
//
//        Sezione sottoSezione = new Sezione("Sottosezione 1");
//        sottoSezione.aggiungiElemento(p2);
//        sottoSezione.aggiungiElemento(p3);
//
//        Sezione sezione = new Sezione("Sezione 1");
//        sezione.aggiungiElemento(p1);
//        sezione.aggiungiElemento(sottoSezione);
//
//        Libro libro = new Libro("Design Patterns", 29.99);
//        libro.aggiungiAutore("Gamma");
//        libro.aggiungiAutore("GoF");
//
//        libro.aggiungiElemento(sezione);
//
//        libro.stampa();
//
//        System.out.println("Totale pagine: " + libro.getNumeroTotalePagine());

        // Chain

//        Ufficiale tenente = new Tenente();
//        Ufficiale capitano = new Capitano();
//        Ufficiale maggiore = new Maggiore();
//        Ufficiale colonnello = new Colonnello();
//        Ufficiale generale = new Generale();
//
//        tenente.setSuperiore(capitano);
//        capitano.setSuperiore(maggiore);
//        maggiore.setSuperiore(colonnello);
//        colonnello.setSuperiore(generale);
//
//        int richiesta = 3000;
//        System.out.println("Richiesta: " + richiesta);
//
//        tenente.gestisciRichiesta(richiesta);
    }
}
