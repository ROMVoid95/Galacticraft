package team.galacticraft.galacticraft.common.api.event;

import me.shedaniel.architectury.event.Event;
import me.shedaniel.architectury.event.EventFactory;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import team.galacticraft.galacticraft.common.api.galaxies.CelestialBody;
import team.galacticraft.galacticraft.common.api.prefab.entity.EntitySpaceshipBase;

import java.util.Random;

public class GalacticraftEvents
{
    public static final Event<LivingEntityEvent> PRE_OXYGEN_SUFFOCATION_EVENT = EventFactory.createInteractionResult(LivingEntityEvent.class);
    public static final Event<LivingEntityEvent> OXYGEN_SUFFOCATION_EVENT = EventFactory.createInteractionResult(LivingEntityEvent.class);
    public static final Event<LivingEntityEvent> POST_OXYGEN_SUFFOCATION_EVENT = EventFactory.createInteractionResult(LivingEntityEvent.class);

    public static final Event<PopulateEvent> PRE_POPULATE_EVENT = EventFactory.createLoop(PopulateEvent.class);
    public static final Event<PopulateEvent> POPULATE_EVENT = EventFactory.createLoop(PopulateEvent.class);
    public static final Event<PopulateEvent> POST_POPULATE_EVENT = EventFactory.createLoop(PopulateEvent.class);

    public static final Event<LivingEntityEvent> PRE_ZERO_GRAVITY_EVENT = EventFactory.createInteractionResult(LivingEntityEvent.class);
    public static final Event<LivingEntityEvent> ZERO_GRAVITY_EVENT = EventFactory.createInteractionResult(LivingEntityEvent.class);
    public static final Event<LivingEntityEvent> POST_ZERO_GRAVITY_EVENT = EventFactory.createInteractionResult(LivingEntityEvent.class);

    public static final Event<RocketEvent> ROCKET_LAUNCH_EVENT = EventFactory.createLoop(RocketEvent.class);

    @FunctionalInterface
    public interface LivingEntityEvent
    {
        InteractionResult invoke(LivingEntity entity);
    }

    @FunctionalInterface
    public interface PopulateEvent
    {
        void invoke(Level world, Random rand, BlockPos pos);
    }

    @FunctionalInterface
    public interface RocketEvent
    {
        void invoke(EntitySpaceshipBase spaceshipBase);
    }

    @Environment(EnvType.CLIENT)
    public static class Client
    {
        public static final Event<CelestialBodTextureEvent> PRE_CELESTIAL_BODY_RENDER_EVENT = EventFactory.createInteractionResult(CelestialBodTextureEvent.class);
        public static final Event<CelestialBodyEvent> CELESTIAL_BODY_RENDER_EVENT = EventFactory.createLoop(CelestialBodyEvent.class);
        public static final Event<CelestialBodyEvent> POST_CELESTIAL_BODY_RENDER_EVENT = EventFactory.createLoop(CelestialBodyEvent.class);

        public static final Event<CelestialBodTextureEvent> PRE_CELESTIAL_RING_RENDER_EVENT = EventFactory.createInteractionResult(CelestialBodTextureEvent.class);
        public static final Event<CelestialBodyEvent> CELESTIAL_RING_RENDER_EVENT = EventFactory.createLoop(CelestialBodyEvent.class);
        public static final Event<CelestialBodyEvent> POST_CELESTIAL_RING_RENDER_EVENT = EventFactory.createLoop(CelestialBodyEvent.class);


        @FunctionalInterface
        public interface CelestialBodyEvent
        {
            void invoke(CelestialBody celestialBody);
        }

        @FunctionalInterface
        public interface CelestialBodTextureEvent
        {
            InteractionResult invoke(CelestialBody celestialBody, ResourceLocation texture, int size);
        }
    }
}
