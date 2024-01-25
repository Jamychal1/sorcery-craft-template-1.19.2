package com.goat.primary;

import com.goat.core.interfaces.CECostItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CEBowStringItem extends CEBow implements CECostItem {
    public CEBowStringItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getProjectile() {
        return new ItemStack(Items.ARROW);
    }

    @Override
    public int getBaseCECost() {
        return 7;
    }

    protected boolean canAfford(PlayerEntity player, ItemStack stack) {
        return canAffordCE(player, stack);
    }

    protected void payAmmo(PlayerEntity player, ItemStack stack) {
        if (player != null) {
            spendMana(player, stack);
        }
    }

    public int pullTime() {
        return 18;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(getTooltipCE(stack));
    }
}
