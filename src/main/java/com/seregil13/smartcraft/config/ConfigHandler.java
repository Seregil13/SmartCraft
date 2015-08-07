package com.seregil13.smartcraft.config;

import com.seregil13.smartcraft.util.Log;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Alec on 12/6/2014.
 */
public class ConfigHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try {
            /*  Load the config file    */
            configuration.load();

            /*  Read properties from config file    */
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value.").getBoolean(true);

        } catch (RuntimeException e) {
            Log.error("Couldn't load configuration file.");
        } finally {
            configuration.save();
        }
    }
}
