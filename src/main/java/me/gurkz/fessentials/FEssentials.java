package me.gurkz.fessentials;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static me.gurkz.fessentials.utils.CommandUtils.registerCommands;

public class FEssentials implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fessentials");
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("FEssentials has initialized");
        registerCommands();
    }
}
