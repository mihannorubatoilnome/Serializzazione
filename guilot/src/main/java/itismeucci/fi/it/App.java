package itismeucci.fi.it;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App {
    public static void main(String[] args) {
        Alunno a1 = new Alunno("Edmard", "Guilot", new Date(2003, 1, 5));
        Alunno a2 = new Alunno("Filippo Giulio", "Lulli III D'Aragosta", new Date(2003, 5, 28));
        Alunno a3 = new Alunno("Giacomo", "Meratti", new Date(2004, 11, 24));
        Alunno a4 = new Alunno("Federico", "Borrometi", new Date(2004, 10, 22));

        ArrayList<Alunno> alunni = new ArrayList<>();
        alunni.add(a1);
        alunni.add(a2);
        alunni.add(a3);
        alunni.add(a4);

        Classe c1 = new Classe(5, "CIA", "4TC-PT", alunni);

        // Serializzazione
        try {
            //XML
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("Classe.xml"), c1);

            //JSON
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("guilot/Classe.json"), c1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
