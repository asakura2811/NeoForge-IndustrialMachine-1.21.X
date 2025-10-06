package io.github.asakura2811.industrialmachine.compat;

import io.github.asakura2811.industrialmachine.IndustrialMachine;
import io.github.asakura2811.industrialmachine.block.ModBlocks;
import io.github.asakura2811.industrialmachine.recipe.CrusherRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class CrusherRecipeCategory implements IRecipeCategory<CrusherRecipe> {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(IndustrialMachine.MOD_ID, "crusher");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(IndustrialMachine.MOD_ID,
            "textures/gui/crusher_gui.png");

    public static final RecipeType<CrusherRecipe> CRUSHER_RECIPE_RECIPE_TYPE =
            new RecipeType<>(UID, CrusherRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public CrusherRecipeCategory(IGuiHelper helper) {
        //The background is an image with the crusher_gui cropped out.
        this.background = helper.createDrawable(TEXTURE,16, 16, 155, 54);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.CRUSHER));
    }

    @Override
    public RecipeType<CrusherRecipe> getRecipeType() {
        return CRUSHER_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.industrialmachine.crusher");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CrusherRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 41, 19).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 87, 19).addItemStack(recipe.getResultItem(null));
    }
}