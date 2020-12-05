package team.galacticraft.galacticraft.common;

import me.shedaniel.architectury.ExpectPlatform;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.chunk.LevelChunk;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GalacticraftCommon
{
    public static List<Biome> biomesList = new ArrayList<>();
    /**
     * @param registry Cannot be null on fabric
     */
    @ExpectPlatform
    public static <T> ResourceLocation getResource(T object, Registry<T> registry)
    {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean chunkLoaded(LevelChunk chunk)
    {
        throw new AssertionError();
    }
}
