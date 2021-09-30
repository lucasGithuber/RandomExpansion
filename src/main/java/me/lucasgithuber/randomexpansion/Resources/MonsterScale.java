package me.lucasgithuber.randomexpansion.Resources;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
final class monsterscale {
    public static final SlimefunItemStack MONSTER_SCALE = new SlimefunItemStack(
            "MONSTER_SCALE",
            Material.PHANTOM_MEMBRANE,
            "&4Monster Scale ",
            "&eDropped By The Monster Under The Bed"
    );

    public class MonsterScale {
        ItemStack[] recipe = {null, null, null, new ItemStack(Material.PHANTOM_MEMBRANE), null, null, null, null, null};
    }
}