package org.example.test.test2.ModItems;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.example.test.test2.Test2;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Test2.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("yomama",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
}
