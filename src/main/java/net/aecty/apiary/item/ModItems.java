package net.aecty.apiary.item;

import net.aecty.apiary.Apiary;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.io.filefilter.RegexFileFilter;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Apiary.MOD_ID);

    public static final RegistryObject<Item> HONEY_DIAMOND = ITEMS.register("honey_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HONEY_INGOT = ITEMS.register("honey_ingot", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
