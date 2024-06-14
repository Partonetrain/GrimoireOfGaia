package gaia.client.renderer;

import gaia.GrimoireOfGaia;
import gaia.client.ClientHandler;
import gaia.client.model.DryadModel;
import gaia.entity.Dryad;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

public class DryadRenderer extends GaiaBabyMobRenderer<Dryad, DryadModel> {
	public static final ResourceLocation[] DRYAD_LOCATIONS = new ResourceLocation[]{
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/dryad/dryad01.png"),
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/dryad/dryad02.png")};

	public DryadRenderer(Context context) {
		super(context, new DryadModel(context.bakeLayer(ClientHandler.DRYAD)), ClientHandler.smallShadow);
		this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
		this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(Dryad dryad) {
		return DRYAD_LOCATIONS[dryad.getVariant()];
	}
}
