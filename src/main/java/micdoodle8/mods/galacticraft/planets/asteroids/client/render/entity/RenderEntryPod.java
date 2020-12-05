package micdoodle8.mods.galacticraft.planets.asteroids.client.render.entity;
//
//import com.google.common.collect.ImmutableList;
//
//import micdoodle8.mods.galacticraft.core.util.ClientUtil;
//import micdoodle8.mods.galacticraft.planets.GalacticraftPlanets;
//import micdoodle8.mods.galacticraft.planets.asteroids.entities.EntityEntryPod;
//import net.minecraft.client.Minecraft;
//import com.mojang.blaze3d.platform.GlStateManager;
//import net.minecraft.client.renderer.RenderHelper;
//import net.minecraft.client.renderer.model.IBakedModel;
//import net.minecraft.client.renderer.culling.ICamera;
//import net.minecraft.client.renderer.entity.EntityRenderer;
//import net.minecraft.client.renderer.entity.EntityRendererManager;
//import net.minecraft.client.renderer.texture.AtlasTexture;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.math.AxisAlignedBB;
//
//import net.minecraftforge.client.model.ModelLoader;
//import org.lwjgl.opengl.GL11;
//
//public class RenderEntryPod extends EntityRenderer<EntityEntryPod>
//{
//    private static IBakedModel modelEntryPod;
//
//    public RenderEntryPod(EntityRendererManager manager)
//    {
//        super(manager);
//    }
//
//    public static void updateModels(ModelLoader modelLoader)
//    {
//        try
//        {
//            modelEntryPod = ClientUtil.modelFromOBJ(modelLoader, new ResourceLocation(GalacticraftPlanets.ASSET_PREFIX, "pod.obj"), ImmutableList.of("PodBody"));
//        }
//        catch (Exception e)
//        {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public void doRender(EntityEntryPod entity, double x, double y, double z, float entityYaw, float partialTicks)
//    {
//        float pitch = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
//        float yaw = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks;
//        GlStateManager.disableRescaleNormal();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef((float) x, (float) y, (float) z);
//        GlStateManager.rotatef(180.0F - entityYaw, 0.0F, 1.0F, 0.0F);
//        GlStateManager.rotatef(180.0F - pitch, 0.0F, 0.0F, 1.0F);
//        GlStateManager.rotatef(-yaw, 0.0F, 1.0F, 0.0F);
//
//        this.bindEntityTexture(entity);
//
//        if (Minecraft.isAmbientOcclusionEnabled())
//        {
//            GlStateManager.shadeModel(GL11.GL_SMOOTH);
//        }
//        else
//        {
//            GlStateManager.shadeModel(GL11.GL_FLAT);
//        }
//
//        GlStateManager.scalef(-1.0F, -1.0F, 1.0F);
//        GlStateManager.scalef(0.65F, 0.6F, 0.65F);
//        ClientUtil.drawBakedModel(modelEntryPod);
//        GlStateManager.popMatrix();
//        RenderHelper.enableStandardItemLighting();
//    }
//
//    @Override
//    protected ResourceLocation getEntityTexture(EntityEntryPod entity)
//    {
//        return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
//    }
//
//    @Override
//    public boolean shouldRender(EntityEntryPod lander, ICamera camera, double camX, double camY, double camZ)
//    {
//        AxisAlignedBB axisalignedbb = lander.getBoundingBox().grow(1D, 2D, 1D);
//        return lander.isInRangeToRender3d(camX, camY, camZ) && camera.isBoundingBoxInFrustum(axisalignedbb);
//    }
//}
