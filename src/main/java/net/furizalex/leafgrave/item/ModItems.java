package net.furizalex.leafgrave.item;

import net.furizalex.leafgrave.LeafGrave;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LeafGrave.MOD_ID);

    public static final RegistryObject<Item> GLOOMWOOD = ITEMS.register("gloomwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_GLOOMWOOD = ITEMS.register("strippedgloomwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BURNT_POISY_WOOD = ITEMS.register("burnt_poisy_wood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISY_WOOD = ITEMS.register("poisywood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAFYARD_SWORD = ITEMS.register("leafyardsword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOOM_SWORD = ITEMS.register("gloomsword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOOM_BOW = ITEMS.register("gloombow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISY_DAGGER = ITEMS.register("poisydagger",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENT_SPAWN_EGG = ITEMS.register("ent_spawn_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GHOULIGAR_SPAWN_EGG = ITEMS.register("ghouligar_spawn_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHANTOMKNIGHT_SPAWN_EGG = ITEMS.register("phantomknight_spawn_egg",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
