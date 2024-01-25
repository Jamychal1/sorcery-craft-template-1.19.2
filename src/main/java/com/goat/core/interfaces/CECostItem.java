package com.goat.core.interfaces;

import com.goat.core.initializers.cca.EntityComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Vanishable;
import net.minecraft.text.Text;

public interface CECostItem extends Vanishable {
    int getBaseCECost();

    default int getCECost(ItemStack stack) {
        int cost = getBaseCECost();

        return cost;
    }

    default boolean canAffordCE(PlayerEntity player, ItemStack stack) {
        if (player != null)
            return EntityComponents.CURSED_ENERGY.get(player).canAfford(getCECost(stack));
        return false;
    }
    default Text getTooltipCE(ItemStack stack) {
        return Text.translatable("tooltip.dndreams.mana_cost", "§d" + getCECost(stack));
    }
    default void spendMana(PlayerEntity player, ItemStack stack) {
        if (canAffordCE(player, stack))
            EntityComponents.CURSED_ENERGY.get(player).useCE(getCECost(stack));
    }

}
