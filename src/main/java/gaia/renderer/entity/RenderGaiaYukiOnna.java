package gaia.renderer.entity;

import gaia.GaiaReference;
import gaia.model.ModelGaiaYukiOnna;
import gaia.renderer.entity.layers.LayerGaiaHeldItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nonnull;

@SideOnly(Side.CLIENT)
public class RenderGaiaYukiOnna extends RenderLiving<EntityLiving> {

    private static final ResourceLocation texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/yuki_onna.png");
    static RenderManager rend = Minecraft.getMinecraft()
            .getRenderManager();

    public RenderGaiaYukiOnna(float shadowSize) {
        super(rend, new ModelGaiaYukiOnna(), shadowSize);
        this.addLayer(LayerGaiaHeldItem.Right(this, ModelGaiaYukiOnna.rightarm));
        this.addLayer(LayerGaiaHeldItem.Left(this, ModelGaiaYukiOnna.leftarm));
    }

    public void transformHeldFull3DItemLayer() {
        GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
    }

    protected ResourceLocation getEntityTexture(@Nonnull EntityLiving entity) {
        return texture;
    }
}
