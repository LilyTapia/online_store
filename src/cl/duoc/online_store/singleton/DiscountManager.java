package cl.duoc.online_store.singleton;

import cl.duoc.online_store.components.Component;
import cl.duoc.online_store.decorators.Decorator;

public class DiscountManager extends Decorator {

    // Instancia única de DiscountManager, declarada como privada, estatica y final.
    private static DiscountManager instance;

    // Constructor privado para impedir instanciación desde fuera de la clase.
    private DiscountManager(Component component) {
        // para inicialización de recursos si es necesario.
        super(component);
    }

    // Método estático para obtener la instancia única de DiscountManager.
    public static DiscountManager getInstance(Component component) {
        if (instance == null) {
            instance = new DiscountManager(component);
        } else {
            // Si ya existe una instancia, actualizamos el componente envuelto
            instance.component = component;
        }

        return instance;
    }

    @Override
    public double getPrice() {
        // Aquí puedes implementar la lógica específica de descuento
        return component.getPrice();  // Modifica esta línea si necesitas aplicar un descuento adicional
    }

    @Override
    public String toString() {
        return component.getName() + " con gestión de descuento aplicada - $" + getPrice();
    }
}
