package com.kevun1.solpotato.client;

import com.kevun1.solpotato.SOLPotato;
import com.kevun1.solpotato.item.foodcontainer.FoodContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ContainerScreenRegistry {

    @SubscribeEvent
    public static void onContainerRegistry(final RegistryEvent.Register<MenuType<?>> event) {
        IForgeRegistry<MenuType<?>> registry = event.getRegistry();

        registry.register(IForgeMenuType.create(((windowId, inv, data) ->
                new FoodContainer(windowId, inv, inv.player))).setRegistryName("food_container"));
    }

    @ObjectHolder(SOLPotato.MOD_ID + ":food_container")
    public static MenuType<FoodContainer> food_container;
}
