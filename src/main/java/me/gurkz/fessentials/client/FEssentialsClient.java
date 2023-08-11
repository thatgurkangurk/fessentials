package me.gurkz.fessentials.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FEssentialsClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fessentials");
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        LOGGER.warn("This mod is not intended for use on the client. If you are playing singleplayer, you can ignore this.");
    }
}
