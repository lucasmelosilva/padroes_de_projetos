package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class Exemplo2 {
    public static void main(String[] args) {
        ElementoQuimicoFactory factory = new ElementoQuimicoFactory();
        SubstanciaSimples s1 = new SubstanciaSimples("Oxigênio",
                factory.criarElemento("O", "Oxigênio"), 2);
        SubstanciaSimples s2 = new SubstanciaSimples("Ozônio",
                factory.criarElemento("O", "Oxigênio"), 3);

        Map<ElementoQuimico, Integer> composicaoAgua = new HashMap<>();
        composicaoAgua.put(factory.criarElemento("H", "Hidrogenio"), 2);
        composicaoAgua.put(factory.criarElemento("O", "Oxigênio"), 1);

        SubstanciaComposta s3 = new SubstanciaComposta("Agua", composicaoAgua);
    }
}
