package itismeucci.fi.it;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {

    public static void main(String[] args) {
        
        //Deserializzazione
        try{
            //XML
            File file = new File("guilot/Classe.xml");
            XmlMapper xmlMapper = new XmlMapper();
            Classe value = xmlMapper.readValue(file, Classe.class);
            System.out.println("---------------XML---------------");
            System.out.println("Classe: " + value.getNumero() + "-" + value.getSezione() + "\n" + "Aula: " + value.getAula());
            
            //JSON
            File file1 = new File("guilot/Classe.json");
            ObjectMapper objectMapper = new ObjectMapper();
            Classe c = objectMapper.readValue(file1, Classe.class);
            System.out.println("---------------JSON---------------");
            System.out.println("Classe: " + c.getNumero() + "-" + c.getSezione() + "\n" + "Aula: " + c.getAula());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
