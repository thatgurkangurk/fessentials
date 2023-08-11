package me.gurkz.fessentials.utils;

import me.gurkz.fessentials.command.FEssentialsCommand;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class CommandUtils {
    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(FEssentialsCommand::register);
    }
}
