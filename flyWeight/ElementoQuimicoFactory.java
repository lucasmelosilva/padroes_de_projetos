package flyWeight;

import java.util.Map;

public class ElementoQuimicoFactory {
    private Map<String, ElementoQuimico> elementos;

    public ElementoQuimico criarElemento(String simbolo, String nome) {
        ElementoQuimico elemento = elementos.get(simbolo);
        if (elemento == null) {
            elemento = new ElementoQuimico(simbolo, nome);
            elementos.put(simbolo, elemento);
        }
        return elemento;
    }
}
