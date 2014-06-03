package negocio;

/**
 * Essa classe implementa o padrão de projeto Singleton.
 *
 * @author Luiz
 */
public class VendedorSingleton {

    private static VendedorSingleton instance = new VendedorSingleton();

    private VendedorSingleton() {
    }

    public static VendedorSingleton getInstance() {
        return instance;
    }

}