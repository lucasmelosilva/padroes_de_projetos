package flyWeight;

public class ElementoQuimico {
    private String simbolo;
    private String nome;

    public ElementoQuimico(String nome, String simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
        System.out.println("\n" + this.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "ElementoQuimico{" +
                "nome='" + nome + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
