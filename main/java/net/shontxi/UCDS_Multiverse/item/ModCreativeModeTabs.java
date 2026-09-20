package net.shontxi.UCDS_Multiverse.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shontxi.UCDS_Multiverse.UCDS_Multiverse;
import net.shontxi.UCDS_Multiverse.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UCDS_Multiverse.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UCDS_POWERS_TAB = CREATIVE_MODE_TABS.register("ucds_powers_tab",
            () ->   CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELECTRICITYGEM.get()))
                    .title(Component.translatable("Poderes de UCDS"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ELECTRICITYGEM.get());
                        output.accept(ModItems.NATUREGEM.get());


                    }) .build());




    public static final RegistryObject<CreativeModeTab> UCDS_BLOCKS_TAB = CREATIVE_MODE_TABS.register("ucds_blocks_tab",
            () ->   CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.INHIBIDOR.get()))
                    .withTabsBefore(UCDS_POWERS_TAB.getId())
                    .title(Component.translatable("Bloques de UCDS"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.INHIBIDOR.get());


                    }) .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
