package ficheros;

import com.opencsv.CSVReader;
import modelos.*;

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


    public static List<Personaje> leerFicheroPersonajes() throws IOException{

        List<Personaje> miLista = new ArrayList<>();
        CSVReader reader = null;

        try {
            reader= new CSVReader(new FileReader("C:\\Users\\daw20\\Desktop\\proyectoLeagueOfLegends1\\src\\main\\java\\archivos\\personajes.csv"),SEPARATOR,QUOTE);
            String[] nextLine = null;
            int count = 0;

            while((nextLine = reader.readNext()) != null){

                if (count >0){
                    String[] valores = nextLine;
                    Personaje p1 = new Personaje();
                    p1.setId(Integer.parseInt(valores[0]));
                    p1.setNombre(valores[1]);
                    p1.setFechaCreacion(LocalDate.parse(valores[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    p1.setAtaqueBase(Double.parseDouble(valores[3]));
                    p1.setDefensaBase(Double.parseDouble(valores[4]));
                    p1.setVidaBase(Double.parseDouble(valores[5]));
                    p1.setManaBase(Double.parseDouble(valores[6]));
                    p1.setRegion(Region.valueOf(valores[7]));
                    p1.setNivel(1);
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


    public static List<Personaje> leerYAprenderHabilidades() throws IOException{
        List<Personaje> listaPersonajes = new ArrayList<>();

        try{
            listaPersonajes = leerFicheroPersonajes();
        }catch (Exception e){
            throw e;
        }



        List<Habilidad> listaHabilidades = new ArrayList<>();
        CSVReader miReaderHabilidades = null;

        try{
            miReaderHabilidades = new CSVReader(new FileReader("C:\\Users\\daw20\\Desktop\\proyectoLeagueOfLegends1\\src\\main\\java\\archivos\\habilidades.csv"),
                    SEPARATOR,QUOTE);

            String[] siguienteLinea = null;
            int contador = 0;

            while ((siguienteLinea = miReaderHabilidades.readNext()) != null){

                if (contador > 0){


                String[] valores = siguienteLinea;
                Habilidad miHabilidad1 = new Habilidad();
                miHabilidad1.setId(Integer.parseInt(valores[0]));
                miHabilidad1.setNombre(valores[2]);
                miHabilidad1.setDanioBase(Double.parseDouble(valores[3]));
                miHabilidad1.setCosteMana(Double.parseDouble(valores[4]));
                miHabilidad1.setTipoHabilidad(TipoHabilidad.valueOf(valores[5]));
                listaHabilidades.add(miHabilidad1);

                List<Habilidad> nuevaListaHabilidades = new ArrayList<>();
                nuevaListaHabilidades.add(miHabilidad1);


                for (Personaje p : listaPersonajes){
                    if (Integer.parseInt(valores[1]) == p.getId()){
                        if (p.getHabilidades() != null){
                            List<Habilidad> hP = new ArrayList<>();

                            for (Habilidad h : p.getHabilidades()){
                                hP.add(h);
                            }
                            hP.add(miHabilidad1);
                            p.setHabilidades(hP);


                        }else {
                            p.setHabilidades(nuevaListaHabilidades);
                        }
                    }
                }

                nuevaListaHabilidades = null;
            }
                contador++;
            }


        }catch (Exception e){
            throw e;
        }




    return listaPersonajes;

    }




    public static List<Item> leerItems() throws IOException{

        List<Item> listaItem = new ArrayList<>();
        CSVReader miReader = null;

        try{
            miReader = new CSVReader(new FileReader("C:\\Users\\daw20\\Desktop\\proyectoLeagueOfLegends1\\src\\main\\java\\archivos\\items.csv.csv"),SEPARATOR,QUOTE);
            String [] linea = null;
            int contador = 0;

            while ((linea = miReader.readNext()) != null){
                if (contador >0){
                    String [] valores = linea;
                    Item miItem = new Item();
                    miItem.setId(Integer.parseInt(valores[0]));
                    miItem.setNombre(valores[1]);
                    miItem.setAumentoDanio(Double.parseDouble(valores[2]));
                    miItem.setAumentoDefensa(Double.parseDouble(valores[3]));
                    miItem.setAumentoSalud(Double.parseDouble(valores[4]));
                    miItem.setAumentoMana(Double.parseDouble(valores[5]));
                    listaItem.add(miItem);
                }
                contador++;
            }
        }catch (Exception e){
            throw e;
        }
        return listaItem;
    }











}
