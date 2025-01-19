package flyWeight;

public abstract class Substancia {
    private String nome;

    public Substancia(String nome) {
        this.nome = nome;
//        System.out.println("\n"+ this.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
