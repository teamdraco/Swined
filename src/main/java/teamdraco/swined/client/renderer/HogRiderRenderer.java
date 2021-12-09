package teamdraco.swined.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import teamdraco.swined.Swined;
import teamdraco.swined.client.model.HogRiderModel;
import teamdraco.swined.common.entities.HogRiderEntity;

@OnlyIn(Dist.CLIENT)
public class HogRiderRenderer extends LivingEntityRenderer<HogRiderEntity, HogRiderModel<HogRiderEntity>> {
    public static final ModelLayerLocation MODEL_LAYER = new ModelLayerLocation(new ResourceLocation(Swined.MOD_ID, "betta"), "main");
    private static final ResourceLocation HOG_RIDER = new ResourceLocation(Swined.MOD_ID, "textures/entity/hog_rider.png");

    public HogRiderRenderer(EntityRendererProvider.Context p_174354_) {
        super(p_174354_, new HogRiderModel<HogRiderEntity>(p_174354_.bakeLayer(MODEL_LAYER)), 0.5F);
        //this.addLayer(new ItemInHandLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(HogRiderEntity p_114482_) {
        return HOG_RIDER;
    }

    protected void scale(HogRiderEntity p_114919_, PoseStack p_114920_, float p_114921_) {
        float f = 0.9375F;
        p_114920_.scale(f, f, f);
    }
}
