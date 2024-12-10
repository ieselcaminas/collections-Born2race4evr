import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagramas {

    public static void main(String[] args) throws IOException{

        int min_size = 5;

        BufferedReader reader = new BufferedReader(new FileReader("files/spanish.dict."));

        String line;

        List<String>palabras = new ArrayList<>();

        Map<String, List<String>> mapa = new HashMap<>();

        while ((line = reader.readLine())!= null) {
            anagrama(line, mapa, palabras);

        }
        reader.close();

        for (String llave:mapa.keySet()){
            if (mapa.get(llave).size() >= min_size) {
                System.out.println(llave + mapa.get(llave));
            }
        }
    }

    public static void anagrama (String line,Map<String,List<String>>mapa,List<String>palabras) {

        char[] caracteres = line.toCharArray();

        Arrays.sort(caracteres);

        String palabraOrdenada = new String(caracteres);

        if (!mapa.containsKey(palabraOrdenada)){

            palabras = new ArrayList<>();
            palabras.add(line);
            mapa.put(palabraOrdenada,palabras);

        }

        else {

            palabras = mapa.get(palabraOrdenada);
            palabras.add(line);
            mapa.put(palabraOrdenada,palabras);

        }
    }
}
