package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class Exemplo1 {
    public static void main(String[] args) {
        SubstanciaSimples s1 = new SubstanciaSimples("Oxigênio",
                new ElementoQuimico("O", "Oxigênio"), 2);
        SubstanciaSimples s2 = new SubstanciaSimples("Ozônio",
                new ElementoQuimico("O", "Oxigênio"), 3);

        Map<ElementoQuimico, Integer> composicaoAgua = new HashMap<>();
        composicaoAgua.put(new ElementoQuimico("H", "Hidrogênio"), 2);
        composicaoAgua.put(new ElementoQuimico("O", "Oxigênio"), 1);

        SubstanciaComposta s3 = new SubstanciaComposta("Agua", composicaoAgua);
    }
}
