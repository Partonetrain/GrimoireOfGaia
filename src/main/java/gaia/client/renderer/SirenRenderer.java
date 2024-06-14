package gaia.client.renderer;

import gaia.GrimoireOfGaia;
import gaia.client.ClientHandler;
import gaia.client.model.SirenModel;
import gaia.entity.Siren;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

public class SirenRenderer extends MobRenderer<Siren, SirenModel> {
	public static final ResourceLocation[] SIREN_LOCATIONS = new ResourceLocation[]{
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/siren/siren.png"),
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/siren/siren_halloween.png")};

	public SirenRenderer(Context context) {
		super(context, new SirenModel(context.bakeLayer(ClientHandler.SIREN)), ClientHandler.smallShadow);
		this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
		this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(Siren shaman) {
		return SIREN_LOCATIONS[shaman.getVariant()];
	}
}
