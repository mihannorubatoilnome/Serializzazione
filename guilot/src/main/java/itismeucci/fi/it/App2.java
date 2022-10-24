package itismeucci.fi.it;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {

    public static void main(String[] args) {

        // Deserializzazione
        try {
            // XML file
            File file = new File("guilot/Classe.xml");
            XmlMapper xmlMapper = new XmlMapper();
            Classe value = xmlMapper.readValue(file, Classe.class);
            System.out.println("---------------XML---------------");
            System.out.println("Classe: " + value.getNumero() + "-" + value.getSezione() + "\n" + "Aula: " + value.getAula());

            // XML string
            XmlMapper Mapper = new XmlMapper();
            Classe value1 = Mapper.readValue("Classe><numero>5</numero><sezione>CIA</sezione><aula>4TC-PT</aula><list><list><nome>Edmard</nome><cognome>Guilot</cognome><dataNascita>61002543600000</dataNascita></list><list><nome>Filippo Giulio</nome><cognome>Lulli III D'Aragosta</cognome><dataNascita>61014895200000</dataNascita></list><list><nome>Giacomo</nome><cognome>Meratti</cognome><dataNascita>61061986800000</dataNascita></list><list><nome>Federico</nome><cognome>Borrometi</cognome><dataNascita>61059222000000</dataNascita></list></list></Classe>", Classe.class);
            System.out.println("Classe: " + value1.getNumero() + "-" + value1.getSezione() + "\n" + "Aula: " + value1.getAula());

            // JSON file
            File file1 = new File("guilot/Classe.json");
            ObjectMapper objectMapper = new ObjectMapper();
            Classe c = objectMapper.readValue(file1, Classe.class);
            System.out.println("---------------JSON---------------");
            System.out.println("Classe: " + c.getNumero() + "-" + c.getSezione() + "\n" + "Aula: " + c.getAula());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
