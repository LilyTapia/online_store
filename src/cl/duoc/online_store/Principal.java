package cl.duoc.online_store;

import cl.duoc.online_store.commands.Command;
import cl.duoc.online_store.commands.DiscountCommand;
import cl.duoc.online_store.commands.Invoker;
import cl.duoc.online_store.commands.PromotionCommand;
import cl.duoc.online_store.components.Product;
import cl.duoc.online_store.singleton.DiscountManager;

public class Principal {

    public static void main(String[] args) {

        // Crear un producto
        Product product = new Product("Camisa", 15990.0);

        // Obtener la instancia única de DiscountManager
        DiscountManager discountManager = DiscountManager.getInstance(product);

        // Crear comandos de descuento y promoción
        Command discountCommand = new DiscountCommand(product, 10.0);  // 10% de descuento
        Command promotionCommand = new PromotionCommand(discountManager, 1000.0);  // Promoción de $1000

        // Crear un invoker
        Invoker invoker = new Invoker();

        // Añadir comandos al invoker
        invoker.addCommand(discountCommand);
        invoker.addCommand(promotionCommand);

        // Ejecutar todos los comandos
        invoker.ejecutarComandos();
    }
}
