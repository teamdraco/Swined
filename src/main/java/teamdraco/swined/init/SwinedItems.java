package teamdraco.swined.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamdraco.swined.Swined;

public class SwinedItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Swined.MOD_ID);

    public static final RegistryObject<Item> HOG_RIDER_SPAWN_EGG = ITEMS.register("hog_rider_spawn_egg", () -> new ForgeSpawnEggItem(SwinedEntities.HOG_RIDER, 0x5b5049, 0x7f8484, new Item.Properties().tab(Swined.GROUP)));
}
