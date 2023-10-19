package org.example.commands;

import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.arguments.ArgumentString;
import net.minestom.server.command.builder.arguments.ArgumentType;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.Entity;
import net.minestom.server.entity.LivingEntity;
import net.minestom.server.entity.Player;
import net.minestom.server.instance.Chunk;
import net.minestom.server.instance.Instance;
import net.minestom.server.instance.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.Locale;

public class TestCommand extends Command {

    private Instance instance;
    public TestCommand() {
        super("bed");
        // Callback executed if the argument has been wrongly used
        setDefaultExecutor((sender, context) -> {
            sender.sendMessage("Usage: /bed <place>");
        });

        var numberArgument = ArgumentType.String("place");

        numberArgument.setCallback((sender, exception) -> {
            final String input = exception.getInput();
            sender.sendMessage("The place " + input + " is invalid!");
        });

        addSyntax((sender, context) -> {
            final String number = context.get(numberArgument);
            if (number.equals("place")) {
                Player player = (Player) sender;
                Pos pos = player.getPosition().add(new Pos(player.getPosition().blockX() + 1,player.getPosition().blockY()
                        ,player.getPosition().blockZ()));
                instance = player.getInstance();
                Block block = Block.BLACK_BED;
                instance.setBlock(pos, block);
            } else {
                sender.sendMessage("Sorry , but you write bad parametr");
            }
        },numberArgument);
    }

}