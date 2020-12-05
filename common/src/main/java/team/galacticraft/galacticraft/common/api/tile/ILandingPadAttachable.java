package team.galacticraft.galacticraft.common.api.tile;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;

/**
 * Implement into tile entities that can attack to landing pads. It is
 * recommended that you check if the landing pad at the provided coordinates is
 * valid for connection.
 */
public interface ILandingPadAttachable
{
    /**
     * Determines if this tile can connect to the landing pad at the provided
     * coordinates.
     *
     * @param world World the tiles are located in
     * @param pos   Coordinate the landing pad is located at
     * @return True if the block can attach to the landing pad, false if not
     */
    boolean canAttachToLandingPad(LevelReader world, BlockPos pos);
}
