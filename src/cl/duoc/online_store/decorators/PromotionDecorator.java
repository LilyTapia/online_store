package cl.duoc.online_store.decorators;

import cl.duoc.online_store.components.Component;

public class PromotionDecorator extends Decorator{

    private double promotionAmount;

    public PromotionDecorator(Component component, double promotionAmount) {
        super(component);
        this.promotionAmount = promotionAmount;
    }

    @Override
    public double getPrice() {
        return component.getPrice() - promotionAmount;
    }

    @Override
    public String toString() {
        return component.getName() + " con promoción especial - $" + getPrice();
    }
}
