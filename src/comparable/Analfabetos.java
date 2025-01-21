package comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Analfabetos {
    public static void main(String[] args) throws IOException {

        String ruta = "/home/julpermaz/Baixades/illiterate.csv";
        BufferedReader reader = new BufferedReader(new FileReader(ruta));
        List<Pais> paises = new ArrayList<>();
        Pais pais;
        String line;
        String[] campos;
        reader.readLine();
        while ((line = reader.readLine())!= null) {
            campos = line.split(",");
            pais = new Pais(campos[5], Integer.parseInt(campos[8]));
            paises.add(pais);
        }

        paises.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
