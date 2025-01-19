package flyWeight;

public class SubstanciaSimples extends Substancia {
    private int atomos;
    private ElementoQuimico elementoQuimico;

    public SubstanciaSimples(String nome, ElementoQuimico elementoQuimico, int atomos) {
        super(nome);
        this.elementoQuimico = elementoQuimico;
        this.atomos = atomos;
        System.out.println(this.toString());
    }

    public int getAtomos() {
        return atomos;
    }

    public void setAtomos(int atomos) {
        this.atomos = atomos;
    }

    public ElementoQuimico getElementoQuimico() {
        return elementoQuimico;
    }

    public void setElementoQuimico(ElementoQuimico elementoQuimico) {
        this.elementoQuimico = elementoQuimico;
    }

    @Override
    public String toString() {
        return "SubstanciaSimples{" +
                "atomos=" + atomos +
                ", elementoQuimico=" + elementoQuimico +
                ", tipo=" + SubstanciaSimples.class.getSimpleName() +
                '}';
    }
}
