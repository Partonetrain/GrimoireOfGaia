package gaia.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import gaia.GrimoireOfGaia;
import gaia.client.ClientHandler;
import gaia.client.model.SporelingModel;
import gaia.entity.Sporeling;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.resources.ResourceLocation;

public class SporelingRenderer extends MobRenderer<Sporeling, SporelingModel> {
	public static final ResourceLocation[] SPORELING_LOCATIONS = new ResourceLocation[]{
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/sporeling/sporeling01.png"),
			ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, "textures/entity/sporeling/sporeling02.png")};

	public SporelingRenderer(Context context) {
		super(context, new SporelingModel(context.bakeLayer(ClientHandler.SPORELING)), ClientHandler.tinyShadow);
		this.addLayer(new CustomHeadLayer<>(this, context.getModelSet(), context.getItemInHandRenderer()));
	}

	@Override
	protected void scale(Sporeling sporeling, PoseStack poseStack, float partialTick) {
		super.scale(sporeling, poseStack, partialTick);
		poseStack.scale(0.5F, 0.5F, 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(Sporeling sporeling) {
		return SPORELING_LOCATIONS[sporeling.getVariant()];
	}
}
