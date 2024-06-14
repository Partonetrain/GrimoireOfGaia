package gaia.client.renderer;

import gaia.GrimoireOfGaia;
import gaia.client.ClientHandler;
import gaia.client.model.MummyModel;
import gaia.entity.Mummy;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;

public class MummyRenderer extends MobRenderer<Mummy, MummyModel> {
	public static final ResourceLocation[] MUMMY_LOCATIONS = new ResourceLocation[]{
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/mummy/mummy.png")
	};

	public MummyRenderer(Context context) {
		super(context, new MummyModel(context.bakeLayer(ClientHandler.MUMMY)), ClientHandler.medShadow);
		this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
		this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(Mummy mummy) {
		return MUMMY_LOCATIONS[mummy.getVariant()];
	}
}
