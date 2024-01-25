package com.goat.primary;

import com.goat.SorceryCraft;
import com.goat.core.interfaces.CECostItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item GRADE_UP = registerItem("grade_up",
            new Item(new FabricItemSettings().group(ModItemGroup.SORCERY)));
    public static final Item SIX_EYES = registerItem("six_eyes",
            new Item(new FabricItemSettings().group(ModItemGroup.SORCERY)));
    public static final Item REVERSE_CT = registerItem("reverse_ct",
            new Item(new FabricItemSettings().group(ModItemGroup.SORCERY)));

    public static final Item TEST_TOOL = registerItem("test_tool", new CEBow(new FabricItemSettings().group(ModItemGroup.SORCERY)) {
        @Override
        public int pullTime() {
            return 1;
        }

        @Override
        public ItemStack getProjectile() {
            return null;
        }

        @Override
        protected boolean canAfford(PlayerEntity player, ItemStack stack) {
            return false;
        }

        @Override
        protected void payAmmo(PlayerEntity player, ItemStack stack) {

        }
    });


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.REGISTRIES.ITEM, new Identifier(SorceryCraft.MOD_ID, name), item);
    }


    public static void registerModItems() {
        SorceryCraft.LOGGER.debug("Registering Mod Items for " + SorceryCraft.MOD_ID);

    }
}
