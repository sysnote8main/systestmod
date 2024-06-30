package com.sysnote8.systestmod.client.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HelloWorldGui extends LightweightGuiDescription {
    public HelloWorldGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);
        root.setInsets(Insets.ROOT_PANEL);

        WSprite icon = new WSprite(Identifier.ofVanilla("textures/item/redstone.png"));
        root.add(icon, 0, 2, 1, 1);

        WButton btn = new WButton(Text.translatable("gui.hw.test"));
        root.add(btn, 0, 3, 4, 1);

        WLabel label = new WLabel(Text.literal("Hello World!"), 0xFFFFFF);
        root.add(label, 0, 4, 2, 1);

        root.validate(this);
    }
}
