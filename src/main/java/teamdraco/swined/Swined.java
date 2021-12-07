package teamdraco.swined;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import teamdraco.swined.common.entities.HogRiderEntity;
import teamdraco.swined.init.SwinedEntities;
import teamdraco.swined.init.SwinedItems;

@Mod(Swined.MOD_ID)
public class Swined {
    public static final String MOD_ID = "swined";
    public final static CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.PORKCHOP);
        }
    };

    public Swined() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SwinedItems.ITEMS.register(bus);
        SwinedEntities.ENTITIES.register(bus);

        bus.addListener(this::registerAttributes);
    }

    private void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(SwinedEntities.HOG_RIDER.get(), HogRiderEntity.createAttributes().build());
    }
}
