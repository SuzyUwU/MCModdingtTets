package org.example.test.test2.ModItems;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.example.test.test2.Test2;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Test2.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("diamond_dagger",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().alwaysEat().nutrition(1).saturationMod(2f).build())));

    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("yomama",
            () -> new BlockItem(Blocks.EXAMPLE_BLOCK.get(), new Item.Properties()));
}
