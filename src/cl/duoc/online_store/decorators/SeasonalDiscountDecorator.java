package cl.duoc.online_store.decorators;

import cl.duoc.online_store.components.Component;

public class SeasonalDiscountDecorator extends Decorator {

    private double discountPercentage;

    public SeasonalDiscountDecorator(Component component, double discountPercentage) {
        super(component);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return component.getPrice() * (1 - discountPercentage / 100);
    }

    @Override
    public String toString() {
        return component.getName() + " con descuento de temporada - $" + getPrice();
    }
}
