package micdoodle8.mods.galacticraft.core.blocks;

import micdoodle8.mods.galacticraft.api.block.IPartialSealableBlock;
import micdoodle8.mods.galacticraft.core.GCBlocks;
import micdoodle8.mods.galacticraft.core.tile.IMultiBlock;
import micdoodle8.mods.galacticraft.core.tile.TileEntityBuggyFueler;
import micdoodle8.mods.galacticraft.core.tile.TileEntityLandingPad;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import javax.annotation.Nullable;

public class BlockPadFull extends BlockAdvancedTile implements IPartialSealableBlock
{
//    public static final EnumProperty<EnumLandingPadFullType> PAD_TYPE = EnumProperty.create("type", EnumLandingPadFullType.class);
    private final VoxelShape AABB = Shapes.box(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D);

//    public enum EnumLandingPadFullType implements IStringSerializable
//    {
//        ROCKET_PAD(0, "rocket"),
//        BUGGY_PAD(1, "buggy");
//
//        private final int meta;
//        private final String name;
//
//        EnumLandingPadFullType(int meta, String name)
//        {
//            this.meta = meta;
//            this.name = name;
//        }
//
//        public int getMeta()
//        {
//            return this.meta;
//        }
//
//        private final static EnumLandingPadFullType[] values = values();
//
//        public static EnumLandingPadFullType byMetadata(int meta)
//        {
//            return values[meta % values.length];
//        }
//
//        @Override
//        public String getName()
//        {
//            return this.name;
//        }
//    }

    public BlockPadFull(Properties builder)
    {
        super(builder);
//        this.maxY = 0.25F;
    }

//    @Override
//    public int damageDropped(BlockState state)
//    {
//        return getMetaFromState(state);
//    }

//    @Override
//    public int quantityDropped(Random par1Random)
//    {
//        return 9;
//    } TODO Landing pad drops

    @Override
    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving)
    {
        final BlockEntity var9 = worldIn.getBlockEntity(pos);

        if (var9 instanceof IMultiBlock)
        {
            ((IMultiBlock) var9).onDestroy(var9);
        }

        super.onRemove(state, worldIn, pos, newState, isMoving);
    }

//    @Override
//    public Item getItemDropped(BlockState state, Random rand, int fortune)
//    {
//        return Item.getItemFromBlock(GCBlocks.landingPad);
//    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context)
    {
        return this.AABB;
    }

//    @Override
//    public AxisAlignedBB getBoundingBox(BlockState blockState, IBlockReader worldIn, BlockPos pos)
//    {
////        switch (getMetaFromState(blockState))
////        {
////        case 0:
////            return VoxelShapes.create(pos.getX() + this.minX, pos.getY() + this.minY, pos.getZ() + this.minZ,
////                    pos.getX() + this.maxX, pos.getY() + this.maxY, pos.getZ() + this.maxZ); TODO
////        case 2:
////            return VoxelShapes.create(pos.getX() + this.minX, pos.getY() + this.minY, pos.getZ() + this.minZ,
////                    pos.getX() + this.maxX, pos.getY() + this.maxY, pos.getZ() + this.maxZ);
////        default:
////        }
//        return this.AABB;
//    }

//    @Override
//    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
//    {
//        for (int x2 = -1; x2 < 2; ++x2)
//        {
//            for (int z2 = -1; z2 < 2; ++z2)
//            {
//                if (!super.canPlaceBlockAt(worldIn, new BlockPos(pos.getX() + x2, pos.getY(), pos.getZ() + z2)))
//                {
//                    return false;
//                }
//            }
//
//        }
//
//        return true;
//    }

    @Nullable
    @Override
    public BlockEntity createTileEntity(BlockState state, BlockGetter world)
    {
        return this == GCBlocks.landingPadFull ? new TileEntityLandingPad() : new TileEntityBuggyFueler();
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Override
    public void neighborChanged(BlockState state, Level worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving)
    {
        worldIn.sendBlockUpdated(pos, state, state, 3);
    }

//    @Override
//    public boolean isOpaqueCube(BlockState state)
//    {
//        return false;
//    }
//
//    @Override
//    public boolean isFullCube(BlockState state)
//    {
//        return false;
//    }

//    @Override
//    public BlockFaceShape getBlockFaceShape(IBlockReader worldIn, BlockState state, BlockPos pos, Direction face)
//    {
//        return BlockFaceShape.UNDEFINED;
//    }

//    @OnlyIn(Dist.CLIENT)
//    @Override
//    public boolean shouldSideBeRendered(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side)
//    {
//        return true;
//    }

    @Override
    public boolean isSealed(Level worldIn, BlockPos pos, Direction direction)
    {
        return direction == Direction.UP;
    }

    @Override
    public ItemStack getPickBlock(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player)
    {
        return new ItemStack(Item.byBlock(GCBlocks.landingPad), 1);
    }

//    @Override
//    public BlockState getStateFromMeta(int meta)
//    {
//        return this.getDefaultState().with(PAD_TYPE, EnumLandingPadFullType.byMetadata(meta));
//    }

//    @Override
//    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
//    {
//        builder.add(PAD_TYPE);
//    }
}
