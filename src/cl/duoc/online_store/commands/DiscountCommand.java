package cl.duoc.online_store.commands;

import cl.duoc.online_store.components.Product;

public class DiscountCommand implements Command {

    private final Product product;
    private final double discountPercentage;

    public DiscountCommand(Product product, double discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void ejecutar() {
        product.applyDiscount(discountPercentage);
        System.out.println("Producto con descuento aplicado: " + product);
    }
}
