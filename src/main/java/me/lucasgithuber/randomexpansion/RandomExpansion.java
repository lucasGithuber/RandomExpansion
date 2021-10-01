package me.lucasgithuber.randomexpansion;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.lucasgithuber.randomexpansion.Resources.MONSTER_SCALE;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class RandomExpansion extends AbstractAddon {

    public RandomExpansion() {
        super("lucasGithuber", "RandomExpansion", "master", "auto-update");
    }

    @Override
    protected void enable() {
        setup();
    }

    @Override
    protected void disable() {
        // do cleanup if needed
    }

    public void setup() {
        ItemGroup category = new ItemGroup(RandomExpansion.createKey("&eRandom Expansion"), new CustomItemStack(Material.ACACIA_DOOR, "&6Èx Limus"), 6);

        SlimefunItemStack itemStack = new SlimefunItemStack("MONSTER_SCALE", Material.PHANTOM_MEMBRANE, "&4Monster Scale", "&4Dropped by the Monster Under The BeD");

        new MONSTER_SCALE(category, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]  {
                new ItemStack(Material.PHANTOM_MEMBRANE),null              ,null,
                null            ,             null                         ,null,
                null            ,             null                         ,null
        });
    }
}