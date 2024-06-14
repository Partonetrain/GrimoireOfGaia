package gaia.client.renderer;

import gaia.GrimoireOfGaia;
import gaia.client.ClientHandler;
import gaia.client.model.KoboldModel;
import gaia.entity.Kobold;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

public class KoboldRenderer extends MobRenderer<Kobold, KoboldModel> {
	public static final ResourceLocation[] KOBOLD_LOCATIONS = new ResourceLocation[]{
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/kobold/kobold01.png"),
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/kobold/kobold02.png")};

	public KoboldRenderer(Context context) {
		super(context, new KoboldModel(context.bakeLayer(ClientHandler.KOBOLD)), ClientHandler.smallShadow);
		this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
		this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(Kobold kobold) {
		return KOBOLD_LOCATIONS[kobold.getVariant()];
	}
}
