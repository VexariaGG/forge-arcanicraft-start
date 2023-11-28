package net.vex.arcanicraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vex.arcanicraft.Arcanicraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Arcanicraft.MOD_ID);

    public static final RegistryObject<Item> ARCANITE = ITEMS.register("arcanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ARCANITE = ITEMS.register("raw_arcanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARCANITE_SHARD = ITEMS.register("arcanite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARCANITE_DUST = ITEMS.register("arcanite_dust",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
