package com.github.willrflesvelka.thunderarrowmod.item;

import com.github.willrflesvelka.thunderarrowmod.ThunderArrowMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 行を追加するとアイテムを追加できる
    public static final Item THUNDERARROW = registerItem("thunderarrow", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(THUNDERARROW);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ThunderArrowMod.MOD_ID, name),item);
    }

    public static void registerModItems(){
        ThunderArrowMod.LOGGER.info("Registering Mod Items for " + ThunderArrowMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        }
}
