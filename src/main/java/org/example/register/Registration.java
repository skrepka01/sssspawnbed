package org.example.register;

import net.minestom.server.MinecraftServer;
import net.minestom.server.command.builder.Command;
import org.example.commands.TestCommand;

public class Registration extends Register{


    @Override
    public void registerCommands() {
        MinecraftServer.getCommandManager().register(new TestCommand());
    }

    @Override
    public void registerBlocks() {

    }

    @Override
    public void Entity() {

    }
}
