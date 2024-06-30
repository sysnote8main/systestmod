package com.sysnote8.systestmod.manager;

import com.sysnote8.systestmod.block.HelloWorldMachineBlock;
import com.sysnote8.systestmod.util.STUtil;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockManager {
    public static HelloWorldMachineBlock HELLO_WORLD_MACHINE_BLOCK = new HelloWorldMachineBlock();

    public static void init() {
        registerBlockAndItem(STUtil.id("helloworld_machine_block"), HELLO_WORLD_MACHINE_BLOCK);
    }

    private static void registerBlockAndItem(Identifier identifier, Block block) {
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
    }
}
