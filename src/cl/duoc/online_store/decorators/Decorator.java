package cl.duoc.online_store.decorators;

import cl.duoc.online_store.components.Component;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double getPrice() {
        return component.getPrice();
    }

    @Override
    public String getName() {
        return component.getName();
    }

}
