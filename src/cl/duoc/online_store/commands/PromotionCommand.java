package cl.duoc.online_store.commands;

import cl.duoc.online_store.components.Component;
import cl.duoc.online_store.decorators.PromotionDecorator;

public class PromotionCommand implements Command {

    private Component product;
    private double promotionAmount;

    public PromotionCommand(Component product, double promotionAmount) {
        this.product = product;
        this.promotionAmount = promotionAmount;
    }

    @Override
    public void ejecutar() {
        Component promotionalProduct = new PromotionDecorator(product, promotionAmount);
        System.out.println("Producto con promoción aplicada: " + promotionalProduct);
    }
}
