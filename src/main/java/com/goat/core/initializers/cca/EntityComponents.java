package com.goat.core.initializers.cca;

import com.goat.SorceryCraft;
import com.goat.core.CursedEnergyComponent;
import com.goat.core.interfaces.CEComponentI;
import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class EntityComponents implements EntityComponentInitializer {
    public static final ComponentKey<CursedEnergyComponent> CURSED_ENERGY = ComponentRegistry.getOrCreate(new Identifier(SorceryCraft.MOD_ID, "CE"), CursedEnergyComponent.class);


    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(CURSED_ENERGY, CursedEnergyComponent::new, RespawnCopyStrategy.INVENTORY);

    }
}
