package com.example;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {

public static final Logger LOGGER = LoggerFactory.getLogger("carbon"); // Using "carbon" as the mod ID

@Override
public void onInitialize() {
    LOGGER.info("Accelerating Minecraft with Carbon!");
    // Add your mod's initialization code here
    
   }
}
