package flyWeight;

import java.util.Map;

public class SubstanciaComposta extends  Substancia {
    // Conjunto de elementos quimicos e respectivas quantidades de atomos
    private Map<ElementoQuimico, Integer> composicao;

    public SubstanciaComposta(String nome, Map<ElementoQuimico, Integer> composicao) {
        super(nome);
        this.composicao = composicao;
        System.out.println(this.toString());
    }

    public Map<ElementoQuimico, Integer> getComposicao() {
        return composicao;
    }

    public void setComposicao(Map<ElementoQuimico, Integer> composicao) {
        this.composicao = composicao;
    }

    @Override
    public String toString() {
        return "SubstanciaComposta{" +
                "composicao=" + composicao +
                '}';
    }
}
