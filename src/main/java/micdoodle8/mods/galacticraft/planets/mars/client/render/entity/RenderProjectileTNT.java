package micdoodle8.mods.galacticraft.planets.mars.client.render.entity;
//
//import com.mojang.blaze3d.platform.GlStateManager;
//import micdoodle8.mods.galacticraft.planets.mars.entities.EntityProjectileTNT;
//import net.minecraft.block.Blocks;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.BlockRendererDispatcher;
//import net.minecraft.client.renderer.entity.EntityRenderer;
//import net.minecraft.client.renderer.entity.EntityRendererManager;
//import net.minecraft.client.renderer.texture.AtlasTexture;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//@OnlyIn(Dist.CLIENT)
//public class RenderProjectileTNT extends EntityRenderer<EntityProjectileTNT>
//{
//    public RenderProjectileTNT(EntityRendererManager renderManager)
//    {
//        super(renderManager);
//        this.shadowSize = 0.5F;
//    }
//
//    @Override
//    public void doRender(EntityProjectileTNT entity, double x, double y, double z, float par8, float partialTicks)
//    {
//        BlockRendererDispatcher blockrendererdispatcher = Minecraft.getInstance().getBlockRendererDispatcher();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef((float) x, (float) y + 0.5F, (float) z);
//
//        float f2 = (1.0F - ((float) entity.ticksExisted - partialTicks + 1.0F) / 100.0F) * 0.1F;
//        this.bindEntityTexture(entity);
//        GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
//        blockrendererdispatcher.renderBlockBrightness(Blocks.TNT.getDefaultState(), entity.getBrightness());
//        GlStateManager.translatef(0.0F, 0.0F, 1.0F);
//
//        if (entity.ticksExisted % 2 == 0)
//        {
//            GlStateManager.disableTexture();
//            GlStateManager.disableLighting();
//            GlStateManager.enableBlend();
//            GlStateManager.blendFunc(770, 772);
//            GlStateManager.color4f(1.0F, 1.0F, 1.0F, f2);
//            GlStateManager.polygonOffset(-3.0F, -3.0F);
//            GlStateManager.enablePolygonOffset();
//            blockrendererdispatcher.renderBlockBrightness(Blocks.TNT.getDefaultState(), 0.2F);
//            GlStateManager.polygonOffset(0.0F, 0.0F);
//            GlStateManager.disablePolygonOffset();
//            GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
//            GlStateManager.disableBlend();
//            GlStateManager.enableLighting();
//            GlStateManager.enableTexture();
//        }
//
//        GlStateManager.popMatrix();
//        super.doRender(entity, x, y, z, par8, partialTicks);
//    }
//
//    @Override
//    protected ResourceLocation getEntityTexture(EntityProjectileTNT entity)
//    {
//        return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
//    }
//}
