package net.shontxi.UCDS_Multiverse.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shontxi.UCDS_Multiverse.UCDS_Multiverse;

import java.util.jar.Attributes;

public class ModItems {

    public static final DeferredRegister<Item>  ITEMS=

            DeferredRegister.create(ForgeRegistries.ITEMS, UCDS_Multiverse.MOD_ID);

    public static final RegistryObject<Item> NATUREGEM = ITEMS.register("naturgem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRICITYGEM = ITEMS.register("electricitygem",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
