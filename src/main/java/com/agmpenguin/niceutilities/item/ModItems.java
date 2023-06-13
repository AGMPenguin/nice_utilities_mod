package com.agmpenguin.niceutilities.item;

import com.agmpenguin.niceutilities.NiceUtilities;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NiceUtilities.MOD_ID);

    public static final RegistryObject<Item> test = createItem("test");

    public static final RegistryObject<ArmorItem> test2 = ITEMS.register("test2", () -> new ArmorItem(ArmorMaterials.))

    private static RegistryObject<Item> createItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    private static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /*
    private static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
     */
}
