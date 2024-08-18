package cl.duoc.online_store.commands;

import cl.duoc.online_store.components.Component;
import cl.duoc.online_store.decorators.SeasonalDiscountDecorator;
import cl.duoc.online_store.commands.Command;

public class DiscountCommand implements Command {

    private Component product;
    private double discountPercentage;

    public DiscountCommand(Component product, double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void ejecutar() {
        Component discountedProduct = new SeasonalDiscountDecorator(product, discountPercentage);
        System.out.println("Producto con descuento aplicado: " + discountedProduct);
    }
}
