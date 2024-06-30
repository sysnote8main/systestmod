package com.sysnote8.systestmod.manager;

import com.sysnote8.systestmod.block.entity.HelloWorldBlockEntity;
import com.sysnote8.systestmod.util.STUtil;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockEntityManager {
    public static BlockEntityType<HelloWorldBlockEntity> HELLOWORLD_MACHINE_ENTITY;

    public static void init() {
        HELLOWORLD_MACHINE_ENTITY = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                STUtil.id("helloworld_machine_block_entity"),
                BlockEntityType.Builder.create(HelloWorldBlockEntity::new, BlockManager.HELLO_WORLD_MACHINE_BLOCK).build()
        );
    }
}
