package net.furizalex.leafgrave.datagen;

import net.furizalex.leafgrave.LeafGrave;
import net.furizalex.leafgrave.block.ModBlocks;
import net.furizalex.leafgrave.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POISY_BONE_BLOCK.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', ModItems.POISY_WOOD.get())
                .define('B', Items.BONE_BLOCK)
                .unlockedBy(getHasName(ModItems.POISY_WOOD.get()), has(ModItems.POISY_WOOD.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAFYARD_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', ModItems.BURNT_POISY_WOOD.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.LEAFYARD_SWORD.get()), has(ModItems.LEAFYARD_SWORD.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLOOM_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', ModItems.STRIPPED_GLOOMWOOD.get())
                .define('B', Items.IRON_INGOT)
                .unlockedBy(getHasName(ModItems.GLOOM_SWORD.get()), has(ModItems.GLOOM_SWORD.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLOOM_BOW.get())
                .pattern(" AC")
                .pattern("A B")
                .pattern(" AC")
                .define('A', ModItems.STRIPPED_GLOOMWOOD.get())
                .define('B', Items.STRING)
                .define('C', Items.GOLD_INGOT)
                .unlockedBy(getHasName(ModItems.GLOOM_BOW.get()), has(ModItems.GLOOM_BOW.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POISY_DAGGER.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', ModItems.POISY_WOOD.get())
                .define('B', Items.STICK)
                .unlockedBy(getHasName(ModItems.POISY_DAGGER.get()), has(ModItems.POISY_DAGGER.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STRIPPED_GLOOMWOOD.get(), 1)
                .requires(ModItems.GLOOMWOOD.get())
                .requires(Items.IRON_INGOT)
                .unlockedBy(getHasName(ModItems.STRIPPED_GLOOMWOOD.get()), has(ModItems.STRIPPED_GLOOMWOOD.get()))
                .save(pRecipeOutput, LeafGrave.MOD_ID + ":gloomwood_from_strippedgloomwood");
    }
}
