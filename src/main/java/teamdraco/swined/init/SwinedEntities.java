package teamdraco.swined.init;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamdraco.swined.Swined;
import teamdraco.swined.common.entities.HogRiderEntity;

public class SwinedEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Swined.MOD_ID);

    public static final RegistryObject<EntityType<HogRiderEntity>> HOG_RIDER = create("hog_rider", EntityType.Builder.of(HogRiderEntity::new, MobCategory.MONSTER).canSpawnFarFromPlayer().sized(0.6F, 1.95F).clientTrackingRange(8));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return ENTITIES.register(name, () -> builder.build(Swined.MOD_ID + "." + name));
    }
}
