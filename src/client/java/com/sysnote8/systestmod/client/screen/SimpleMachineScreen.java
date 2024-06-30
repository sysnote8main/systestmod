package com.sysnote8.systestmod.client.screen;

import com.sysnote8.systestmod.gui.SimpleMachineGui;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class SimpleMachineScreen extends CottonInventoryScreen<SimpleMachineGui> {
    public SimpleMachineScreen(SimpleMachineGui description, PlayerEntity player, Text title) {
        super(description, player, title);
    }
}
