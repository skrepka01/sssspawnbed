package org.example.register;

import net.minestom.server.MinecraftServer;
import net.minestom.server.command.builder.Command;
import org.example.commands.SpawnBed;

public class Registration extends Register{


    @Override
    public void registerCommands() {
        MinecraftServer.getCommandManager().register(new SpawnBed());
    }

    @Override
    public void registerBlocks() {

    }

    @Override
    public void Entity() {

    }
}
