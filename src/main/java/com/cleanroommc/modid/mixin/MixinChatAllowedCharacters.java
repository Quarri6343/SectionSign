package com.cleanroommc.modid.mixin;

import net.minecraft.util.ChatAllowedCharacters;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ChatAllowedCharacters.class)
public abstract class MixinChatAllowedCharacters {

    /**
     * @author Quarri6343
     * @reason Katatsumuri.Panさんが欲しがってたから...
     */
    @Overwrite
    public static boolean isAllowedCharacter(char character)
    {
        return character >= ' ' && character != 127;
    }
}
