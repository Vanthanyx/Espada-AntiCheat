package tk.vanthanyx.espada;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ModInitializer;
import tk.vanthanyx.espada.init.Systems;

public class Espada implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Espada");

	@Override
	public void onInitialize() {

		Systems.Initialize();

		LOGGER.info("Client Initialized");
	}
}
