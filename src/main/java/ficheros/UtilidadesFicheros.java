package ficheros;

import com.opencsv.CSVReader;
import modelos.Personaje;
import modelos.Region;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesFicheros {

    public static final char SEPARATOR = ',';
    public static final char QUOTE = '"';



    public UtilidadesFicheros() {
    }


    public static List<Personaje> LeerFicheroPersonajes() throws IOException{

        List<Personaje> miLista = new ArrayList<>();
        CSVReader reader = null;

        try {
            reader= new CSVReader(new FileReader("C:\\Users\\NitroPC\\IdeaProjects\\proyectoLeagueOfLegends1\\src\\main\\java\\ficheros\\personajes.csv"),SEPARATOR,QUOTE);
            String[] nextLine = null;
            int count = 0;

            while((nextLine = reader.readNext()) != null){

                if (count >0){
                    String[] valores = nextLine;
                    Personaje p1 = new Personaje();
                    p1.setNombre(valores[1]);
                    p1.setFechaCreacion(LocalDate.parse(valores[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    p1.setAtaqueBase(Double.parseDouble(valores[3]));
                    p1.setDefensaBase(Double.parseDouble(valores[4]));
                    p1.setVidaBase(Double.parseDouble(valores[5]));
                    p1.setManaBase(Double.parseDouble(valores[6]));
                    p1.setRegion(Region.valueOf(valores[7]));
                    miLista.add(p1);
                }
                count++;

            }
        }catch (Exception e){
            throw e;
        }

        reader.close();

        return miLista;
    }
}
