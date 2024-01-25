package com.goat.setup;

import com.goat.SorceryCraft;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModdedEffects {
    public static StatusEffect DOMAIN_HIT = register("domain_hit", new InstantModStatusEffect(StatusEffectCategory.HARMFUL, 0x7700e0));
    public static StatusEffect SUPPRESSED = register("suppressed", new ModStatusEffect(StatusEffectCategory.HARMFUL, 0));
    public static StatusEffect CE_REGEN = register("suppressed", new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0));
    public static StatusEffect CE_DRAIN = register("drain", new ModStatusEffect(StatusEffectCategory.HARMFUL, 5592405));
    public static StatusEffect REVERSE_CT = register("reverse_ct", new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0));
    public static StatusEffect SIX_EYES = register("six_eyes", new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x192225));

    private static StatusEffect register(String name, StatusEffect entry) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(SorceryCraft.MOD_ID, name), entry);
    }

    public static void registerEffects() {
        System.out.println("Registering effects for " + SorceryCraft.MOD_ID);
    }

}
