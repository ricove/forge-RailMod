package net.ricove.railmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ricove.railmod.RailMod;

public class ModCreativeModClass {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RailMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAIL_TAB = CREATIVE_MODE_TABS.register("rail_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.rail_tab"))
                    .displayItems((itemDisplayParameters, output) ->{
                       output.accept(ModItems.SAPPHIRE.get());
                       output.accept(ModItems.RAW_SAPPHIRE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
