package tk.vanthanyx.espada.config;

public class EspadaTitleChangerConfig {
    @Config(config = "settings", category = "windowTitle", key = "includeAsterisk")
    public static boolean includeAsterisk = true;

    @Config(config = "settings", category = "windowTitle", key = "includeVersionNumber")
    public static boolean includeVersionNumber = true;

    @Config(config = "settings", category = "windowTitle", key = "includeNetworkStatus")
    public static boolean includeNetworkStatus = true;

    @Config(config = "settings", category = "windowTitle", key = "overrideMinecraftTitle")
    public static String overrideMinecraftTitle = null;

    @Config(config = "settings", category = "windowTitle", key = "overrideFullTitle", comment = "Sets Clients Window Title ( Overridden )")
    public static String overrideFullTitle = "Minecraft* 1.18.2 ( Espada )";
}