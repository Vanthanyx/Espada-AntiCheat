package tk.vanthanyx.espada.config;

public class CacheGeneratorConfig {
    @Config(config = "cache", category = "bootCache", key = "installComplete")
    public static boolean installComplete = true;

    @Config(config = "cache", category = "bootCache", key = "passedClientTest")
    public static boolean passedClientTest = true;

    @Config(config = "cache", category = "bootCache", key = "bypassClientTest", comment = "Dont You Dare")
    public static boolean bypassClientTest = false;
}
