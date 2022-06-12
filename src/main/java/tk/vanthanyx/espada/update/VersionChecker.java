package tk.vanthanyx.espada.update;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import tk.vanthanyx.espada.Espada;

public class VersionChecker {
    public static String versionURL = "https://raw.githubusercontent.com/Vanthanyx/Espada-AntiCheat/main/version-number.txt";

    public static String getVersion() {
        String currentVersion = "0.1.1";
        String versionNumber = null;
        try {
            final URL url = new URL(versionURL);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputText = bufferedReader.readLine();

            String[] rawString = inputText.split("=");
            versionNumber = rawString[1];
            Espada.LOGGER.info("Version Number {}", versionNumber);

            if (currentVersion == versionNumber) {
                Espada.LOGGER.info("Espada Up To Date");
            } else {
                Espada.LOGGER.error("Espada Outdated");
            }
        
        }catch (Exception exception){
            Espada.LOGGER.error("Error Retrieving Version Number");
        }
        return versionNumber;
    }
}
