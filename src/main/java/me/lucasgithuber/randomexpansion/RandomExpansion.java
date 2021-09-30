package me.lucasgithuber.randomexpansion;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.listeners.entity.MobDropListener;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class RandomExpansion extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        ItemStack itemGroupItem = new CustomItemStack(Material.WARPED_WART_BLOCK, "&aRandom Expansion", "", "&a> Click to open");

        NamespacedKey itemGroupId = new NamespacedKey(this, "Random_Category");
        ItemGroup itemGroup = new ItemGroup(itemGroupId, itemGroupItem);

        SlimefunItemStack slimefunItem = new SlimefunItemStack("MONSTER_SCALE", Material.PHANTOM_MEMBRANE, "&4Monster scale", "&cDropped By The Monster Under The Bed");

        ItemStack[] recipe = { null, null, null, new ItemStack(Material.PHANTOM_MEMBRANE), null, null, null, null, null };

        SlimefunItem MONSTER_SCALE = new SlimefunItem(itemGroup, slimefunItem, RecipeType.MOB_DROP, recipe);
        MONSTER_SCALE.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}
