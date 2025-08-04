package mrshaini.villagerdiscount;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("VillagerDiscount plugin enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("VillagerDiscount plugin disabled");
    }
}
