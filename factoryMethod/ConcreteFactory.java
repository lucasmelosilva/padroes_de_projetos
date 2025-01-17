package factoryMethod;

public class ConcreteFactory extends FactoryMethod {
    public ConcreteFactory(String tipo) {
        super(tipo);
    }

    public Veiculo getCarro(String tipo) {
        Veiculo geraCarro = null;
        if (tipo.equals("luxo")) {
            geraCarro = new CarroLuxo();
        }

        if (tipo.equals("popular")) {
            geraCarro = new CarroPopular();
        }

        if (tipo.equals("moto-luxo")) {
            geraCarro = new MotoLuxo();
        }

        if (tipo.equals("moto-popular")) {
            geraCarro = new MotoPopular();
        }
        return geraCarro;
    }
}
