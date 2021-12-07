package teamdraco.swined.client.renderer;

import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import teamdraco.swined.Swined;
import teamdraco.swined.common.entities.HogRiderEntity;

@OnlyIn(Dist.CLIENT)
public class HogRiderRenderer extends IllagerRenderer<HogRiderEntity> {
    private static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(new ResourceLocation(Swined.MOD_ID, "betta"), "main");
    private static final ResourceLocation HOG_RIDER = new ResourceLocation(Swined.MOD_ID, "textures/entity/hog_rider.png");

    public HogRiderRenderer(EntityRendererProvider.Context p_174354_) {
        super(p_174354_, new IllagerModel<>(p_174354_.bakeLayer(MODEL_LAYER)), 0.5F);
        this.addLayer(new ItemInHandLayer<>(this));
    }

    public ResourceLocation getTextureLocation(HogRiderEntity p_115720_) {
        return HOG_RIDER;
    }
}
