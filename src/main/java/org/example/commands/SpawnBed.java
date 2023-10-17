package org.example.commands;

import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.arguments.ArgumentType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SpawnBed extends Command {

    public SpawnBed() {
        super("bed place");

        setDefaultExecutor((sender, context) -> {
            sender.sendMessage("Usage command: /bed place");
        });

        var badPlace = ArgumentType.String("bed place");
        addSyntax((sender, context) ->{
            sender.sendMessage("Make bad");
        },badPlace);

        badPlace.setCallback((sender, exception) -> {
           String input = exception.getInput();
           sender.sendMessage("Sorry , but you not have write" +input+" argument.");
        });
    }

}
