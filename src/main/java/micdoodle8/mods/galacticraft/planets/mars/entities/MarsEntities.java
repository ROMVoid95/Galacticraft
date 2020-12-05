package micdoodle8.mods.galacticraft.planets.mars.entities;

import micdoodle8.mods.galacticraft.core.Constants;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import static micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks.register;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID_PLANETS, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MarsEntities
{
//    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Constants.MOD_ID_PLANETS);

    public static final EntityType<EntityCargoRocket> CARGO_ROCKET = EntityType.Builder.of(EntityCargoRocket::new, MobCategory.MISC)
            .sized(0.98F, 2F)
            .fireImmune()
            .setUpdateInterval(1)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");
    public static final EntityType<EntityCreeperBoss> CREEPER_BOSS = EntityType.Builder.of(EntityCreeperBoss::new, MobCategory.MONSTER)
            .sized(2.0F, 7.0F)
            .fireImmune()
            .setUpdateInterval(10)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");
    public static final EntityType<EntityLandingBalloons> LANDING_BALLOONS = EntityType.Builder.of(EntityLandingBalloons::new, MobCategory.MISC)
            .sized(2.0F, 2.0F)
            .fireImmune()
            .setUpdateInterval(5)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");
    public static final EntityType<EntityProjectileTNT> PROJECTILE_TNT = EntityType.Builder.of(EntityProjectileTNT::new, MobCategory.MISC)
            .sized(1.0F, 1.0F)
            .fireImmune()
            .setUpdateInterval(1)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");
    public static final EntityType<EntitySlimeling> SLIMELING = EntityType.Builder.of(EntitySlimeling::new, MobCategory.CREATURE)
            .sized(0.45F, 0.7F)
            .setUpdateInterval(10)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");
    public static final EntityType<EntitySludgeling> SLUDGELING = EntityType.Builder.of(EntitySludgeling::new, MobCategory.MONSTER)
            .sized(0.3F, 0.2F)
            .setUpdateInterval(10)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");
    public static final EntityType<EntityTier2Rocket> ROCKET_T2 = EntityType.Builder.of(EntityTier2Rocket::new, MobCategory.MISC)
            .sized(1.2F, 4.5F)
            .fireImmune()
            .setUpdateInterval(1)
            .setTrackingRange(64)
            .setShouldReceiveVelocityUpdates(true)
            .build("");

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> evt) {
        IForgeRegistry<EntityType<?>> r = evt.getRegistry();
        register(r, CARGO_ROCKET, MarsEntityNames.CARGO_ROCKET);
        register(r, CREEPER_BOSS, MarsEntityNames.CREEPER_BOSS);
        register(r, LANDING_BALLOONS, MarsEntityNames.LANDING_BALLOONS);
        register(r, PROJECTILE_TNT, MarsEntityNames.PROJECTILE_TNT);
        register(r, SLIMELING, MarsEntityNames.SLIMELING);
        register(r, SLUDGELING, MarsEntityNames.SLUDGELING);
        register(r, ROCKET_T2, MarsEntityNames.ROCKET_T2);
    }
}
