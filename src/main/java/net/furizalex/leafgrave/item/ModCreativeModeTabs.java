package net.furizalex.leafgrave.item;

import net.furizalex.leafgrave.LeafGrave;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LeafGrave.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEAFGRAVE_TAB = CREATIVE_MODE_TABS.register("leafgrave_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEAFYARD_SWORD.get()))
                    .title(Component.translatable("creativetab.leafgrave.leafgrave_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModItems.GLOOMWOOD.get());
                        output.accept(ModItems.STRIPPED_GLOOMWOOD.get());
                        output.accept(ModItems.BURNT_POISY_WOOD.get());
                        output.accept(ModItems.POISY_WOOD.get());
                        output.accept(ModItems.LEAFYARD_SWORD.get());
                        output.accept(ModItems.GLOOM_SWORD.get());
                        output.accept(ModItems.GLOOM_BOW.get());
                        output.accept(ModItems.POISY_DAGGER.get());
                        output.accept(ModItems.ENT_SPAWN_EGG.get());
                        output.accept(ModItems.GHOULIGAR_SPAWN_EGG.get());
                        output.accept(ModItems.PHANTOMKNIGHT_SPAWN_EGG.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
