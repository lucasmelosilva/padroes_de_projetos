public class Singleton {
    private static Singleton isExists = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (isExists == null) isExists = new Singleton();
        return isExists;
    }
}
