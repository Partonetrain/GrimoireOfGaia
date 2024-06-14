package gaia.client.renderer;

import gaia.GrimoireOfGaia;
import gaia.client.ClientHandler;
import gaia.client.model.AntWorkerModel;
import gaia.entity.AntWorker;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

public class AntWorkerRenderer extends GaiaBabyMobRenderer<AntWorker, AntWorkerModel> {
	public static final ResourceLocation[] ANUBIS_LOCATIONS = new ResourceLocation[]{
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/ant/ant01.png"),
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/ant/ant02.png")
	};

	public AntWorkerRenderer(Context context) {
		super(context, new AntWorkerModel(context.bakeLayer(ClientHandler.ANT_WORKER)), ClientHandler.medShadow);
		this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
		this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(AntWorker antworker) {
		return ANUBIS_LOCATIONS[antworker.getVariant()];
	}
}
