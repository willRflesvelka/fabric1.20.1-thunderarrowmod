package com.github.willrflesvelka.thunderarrowmod.item;

import com.github.willrflesvelka.thunderarrowmod.ThunderArrowMod;
import com.github.willrflesvelka.thunderarrowmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup THUNDERARROW_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThunderArrowMod.MOD_ID, "thunderarrow"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thunderarrow"))
                    .icon(() -> new ItemStack(ModItems.THUNDERARROW)).entries((displayContext, entries) -> {
                        // ここにアイテムを追加していく
                        entries.add(ModItems.THUNDERARROW);
                        entries.add(ModItems.SAPPHIRE);

                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        ThunderArrowMod.LOGGER.info("Registering Item Groups for " + ThunderArrowMod.MOD_ID);
    }
}
