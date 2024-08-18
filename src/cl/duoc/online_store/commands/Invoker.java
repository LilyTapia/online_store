package cl.duoc.online_store.commands;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void ejecutarComandos() {
        for (Command command : commandList) {
            command.ejecutar();
        }
        commandList.clear();  // Limpiar la lista después de ejecutar todos los comandos
    }
}
