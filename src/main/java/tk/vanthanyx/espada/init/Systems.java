package tk.vanthanyx.espada.init;

import tk.vanthanyx.espada.config.Configuration;
import tk.vanthanyx.espada.config.CacheGeneratorConfig;
import tk.vanthanyx.espada.config.EspadaTitleChangerConfig;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class Systems {

    public static final Item AUTH_KEY = new Item(
            new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.EPIC).fireproof());

    public static void Initialize() {
        new Configuration(EspadaTitleChangerConfig.class, "espada");
        new Configuration(CacheGeneratorConfig.class, "espada");
        Registry.register(Registry.ITEM, new Identifier("espada", "auth_key"), AUTH_KEY);
    }

}
