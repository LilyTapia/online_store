package cl.duoc.online_store;

import cl.duoc.online_store.components.Product;

public class DiscountManager {

    // Instancia única de DiscountManager, declarada como privada, estatica y final.
    private static final DiscountManager instance = new DiscountManager();

    // Constructor privado para impedir instanciación desde fuera de la clase.
    private DiscountManager() {
        // para inicialización de recursos si es necesario.
    }

    // Método estático para obtener la instancia única de DiscountManager.
    public static DiscountManager getInstance() {
        return instance;
    }

    // Lógica para aplicar descuentos
    public void applyDiscount(Product product) {
        // Implementación de la lógica de descuentos
        System.out.println("Descuento aplicado al producto: " + product.getName());
    }
}
