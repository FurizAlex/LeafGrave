package net.furizalex.leafgrave.datagen;

import net.furizalex.leafgrave.LeafGrave;
import net.furizalex.leafgrave.item.ModItems;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LeafGrave.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.GLOOMWOOD.get());
        basicItem(ModItems.STRIPPED_GLOOMWOOD.get());
        basicItem(ModItems.POISY_WOOD.get());
        basicItem(ModItems.BURNT_POISY_WOOD.get());
        basicItem(ModItems.LEAFYARD_SWORD.get());
        basicItem(ModItems.GLOOM_SWORD.get());
        basicItem(ModItems.GLOOM_BOW.get());
        basicItem(ModItems.POISY_DAGGER.get());
        basicItem(ModItems.ENT_SPAWN_EGG.get());
        basicItem(ModItems.GHOULIGAR_SPAWN_EGG.get());
        basicItem(ModItems.PHANTOMKNIGHT_SPAWN_EGG.get());
    }
}
