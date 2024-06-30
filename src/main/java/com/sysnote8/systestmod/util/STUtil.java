package com.sysnote8.systestmod.util;

import com.sysnote8.systestmod.Tags;
import net.minecraft.util.Identifier;

public class STUtil {
    public static Identifier id(String path) {
        return Identifier.of(Tags.MOD_ID, path);
    }
}
