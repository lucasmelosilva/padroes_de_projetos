package factoryMethod;

public abstract class FactoryMethod {
    Veiculo carro;
    public FactoryMethod(String tipo) {
        this.carro = this.getCarro(tipo);
    }

    public abstract Veiculo getCarro(String tipo);

    public void buscaCliente() {
        this.carro.buscarClient();
    }
}
