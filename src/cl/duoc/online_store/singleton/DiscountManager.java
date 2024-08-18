package cl.duoc.online_store.singleton;

import cl.duoc.online_store.components.Product;
import cl.duoc.online_store.decorators.Decorator;

public class DiscountManager extends Decorator {

    private static DiscountManager instance;

    private DiscountManager(Product product) {
        super(product);
    }

    public static DiscountManager getInstance(Product product) {
        if (instance == null) {
            instance = new DiscountManager(product);
        } else {
            instance.component = product;
        }
        return instance;
    }

    @Override
    public double getPrice() {
        return component.getPrice();
    }

    @Override
    public String toString() {
        return component.getName() + " con gestión de descuento aplicada - $" + getPrice();
    }
}
