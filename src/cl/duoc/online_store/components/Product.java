package cl.duoc.online_store.components;

public class Product implements Component {

    private String name;
    private double price;
    private double discountPercentage;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discountPercentage = 0.0;  // Inicialmente, no hay descuento aplicado
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price * (1 - discountPercentage / 100);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return name + " - $" + getPrice() + " (Descuento aplicado: " + discountPercentage + "%)";
    }
}
