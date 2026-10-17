package dev.apextransit;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public final class ApexTransit implements ModInitializer {
    public static final String MOD_ID = "apextransit";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Apex Transit initializing. Vehicle systems are being built.");
    }
}
