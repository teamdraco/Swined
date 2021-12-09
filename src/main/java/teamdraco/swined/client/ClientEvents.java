package teamdraco.swined.client;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import teamdraco.swined.Swined;
import teamdraco.swined.client.model.HogRiderModel;
import teamdraco.swined.client.renderer.HogRiderRenderer;
import teamdraco.swined.init.SwinedEntities;

@Mod.EventBusSubscriber(modid = Swined.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(SwinedEntities.HOG_RIDER.get(), HogRiderRenderer::new);
        ForgeHooksClient.registerLayerDefinition(HogRiderRenderer.MODEL_LAYER, HogRiderModel::createBodyLayer);
    }

}