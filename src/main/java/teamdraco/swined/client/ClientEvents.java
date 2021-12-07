package teamdraco.swined.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamdraco.swined.Swined;
import teamdraco.swined.client.renderer.HogRiderRenderer;
import teamdraco.swined.init.SwinedEntities;

@Mod.EventBusSubscriber(modid = Swined.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(SwinedEntities.HOG_RIDER.get(), HogRiderRenderer::new);
    }

}