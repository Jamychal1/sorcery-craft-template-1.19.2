package com.goat.primary;

import com.goat.SorceryCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SORCERY = FabricItemGroupBuilder.build(new Identifier(SorceryCraft.MOD_ID, "sorcery"),
            () -> new ItemStack(ModItems.SIX_EYES));
}
