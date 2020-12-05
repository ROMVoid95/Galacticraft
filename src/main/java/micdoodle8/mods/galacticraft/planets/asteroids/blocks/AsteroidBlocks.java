package micdoodle8.mods.galacticraft.planets.asteroids.blocks;

import micdoodle8.mods.galacticraft.core.Constants;
import micdoodle8.mods.galacticraft.core.GCBlocks;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.blocks.DecoBlock;
import micdoodle8.mods.galacticraft.core.items.IShiftDescription;
import micdoodle8.mods.galacticraft.core.items.ItemBlockDesc;
import micdoodle8.mods.galacticraft.planets.asteroids.tile.*;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlockNames;
import micdoodle8.mods.galacticraft.planets.mars.tile.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID_PLANETS, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Constants.MOD_ID_PLANETS)
public class AsteroidBlocks
{
    @ObjectHolder(AsteroidBlockNames.blockWalkway)
    public static Block blockWalkway;
    @ObjectHolder(AsteroidBlockNames.blockWalkwayFluid)
    public static Block blockWalkwayFluid;
    @ObjectHolder(AsteroidBlockNames.blockWalkwayWire)
    public static Block blockWalkwayWire;
    //	public static Block machineFrame;
    @ObjectHolder(AsteroidBlockNames.beamReflector)
    public static Block beamReflector;
    @ObjectHolder(AsteroidBlockNames.beamReceiver)
    public static Block beamReceiver;
    @ObjectHolder(AsteroidBlockNames.shortRangeTelepad)
    public static Block shortRangeTelepad;
    @ObjectHolder(AsteroidBlockNames.fakeTelepad)
    public static Block fakeTelepad;
    @ObjectHolder(AsteroidBlockNames.blockDenseIce)
    public static Block blockDenseIce;
    @ObjectHolder(AsteroidBlockNames.blockMinerBase)
    public static Block blockMinerBase;
    @ObjectHolder(AsteroidBlockNames.minerBaseFull)
    public static Block minerBaseFull;
    @ObjectHolder(AsteroidBlockNames.spaceWart)
    public static Block spaceWart;
    @ObjectHolder(AsteroidBlockNames.rock0)
    public static Block rock0;
    @ObjectHolder(AsteroidBlockNames.rock1)
    public static Block rock1;
    @ObjectHolder(AsteroidBlockNames.rock2)
    public static Block rock2;
    @ObjectHolder(AsteroidBlockNames.oreAluminum)
    public static Block oreAluminum;
    @ObjectHolder(AsteroidBlockNames.oreIlmenite)
    public static Block oreIlmenite;
    @ObjectHolder(AsteroidBlockNames.oreIron)
    public static Block oreIron;
    @ObjectHolder(AsteroidBlockNames.asteroidDeco)
    public static Block asteroidDeco;
    @ObjectHolder(AsteroidBlockNames.titaniumBlock)
    public static Block titaniumBlock;

    public static void registerBlocks(RegistryEvent.Register<Block> evt)
    {
        IForgeRegistry<Block> r = evt.getRegistry();

        Block.Properties builder = Block.Properties.of(Material.METAL).strength(1.0F).sound(SoundType.METAL);
        register(r, new BlockWalkway(builder), AsteroidBlockNames.blockWalkway);
        register(r, new BlockWalkway(builder), AsteroidBlockNames.blockWalkwayFluid);
        register(r, new BlockWalkway(builder), AsteroidBlockNames.blockWalkwayWire);

        builder = Block.Properties.of(Material.STONE).strength(3.0F);
        register(r, new BlockAsteroidRock(builder), AsteroidBlockNames.rock0);
        register(r, new BlockAsteroidRock(builder), AsteroidBlockNames.rock1);
        register(r, new BlockAsteroidRock(builder), AsteroidBlockNames.rock2);
        register(r, new OreBlockAsteroids(builder), AsteroidBlockNames.oreAluminum);
        register(r, new OreBlockAsteroids(builder), AsteroidBlockNames.oreIlmenite);
        register(r, new OreBlockAsteroids(builder), AsteroidBlockNames.oreIron);
        register(r, new DecoBlock(builder), AsteroidBlockNames.asteroidDeco);
        register(r, new DecoBlock(builder), AsteroidBlockNames.titaniumBlock);

        builder = Block.Properties.of(Material.METAL).sound(SoundType.METAL);
        register(r, new BlockBeamReflector(builder), AsteroidBlockNames.beamReflector);
        register(r, new BlockBeamReceiver(builder), AsteroidBlockNames.beamReceiver);

        builder = Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(3.0F);
        register(r, new BlockShortRangeTelepad(builder), AsteroidBlockNames.shortRangeTelepad);

        builder = Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(100000.0F);
        register(r, new BlockTelepadFake(builder), AsteroidBlockNames.fakeTelepad);

        builder = Block.Properties.of(Material.ICE).sound(SoundType.GLASS).strength(0.5F).friction(0.98F);
        register(r, new BlockIceAsteroids(builder), AsteroidBlockNames.blockDenseIce);

        builder = Block.Properties.of(Material.STONE).strength(3.0F).sound(SoundType.METAL).noOcclusion();
        register(r, new BlockMinerBase(builder), AsteroidBlockNames.blockMinerBase);
        builder = builder.strength(3.0F, 35.0F);
        register(r, new BlockMinerBaseFull(builder), AsteroidBlockNames.minerBaseFull);

        builder = Block.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.NETHER_WART);
        register(r, new BlockSpaceWart(builder), AsteroidBlockNames.spaceWart);
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, String name)
    {
        GCBlocks.register(reg, thing, new ResourceLocation(Constants.MOD_ID_PLANETS, name));
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, ResourceLocation name, IForgeRegistryEntry<V> thing)
    {
        if (Registry.BLOCK.getOptional(name).get() instanceof IShiftDescription && !(thing instanceof ItemBlockDesc)) {
            System.err.println("IShiftDescription block needs ItemBlockDesc registration!");
        }
        GCBlocks.register(reg, name, thing);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> evt)
    {
        IForgeRegistry<Item> r = evt.getRegistry();
        Item.Properties props = GCItems.defaultBuilder().tab(null);
        register(r, Registry.BLOCK.getKey(fakeTelepad), new BlockItem(fakeTelepad, props));
        register(r, Registry.BLOCK.getKey(minerBaseFull), new BlockItem(minerBaseFull, props));
        register(r, Registry.BLOCK.getKey(spaceWart), new BlockItem(spaceWart, props));
        props = GCItems.defaultBuilder().tab(GalacticraftCore.galacticraftBlocksTab);
        register(r, Registry.BLOCK.getKey(blockWalkway), new ItemBlockDesc(blockWalkway, props));
        register(r, Registry.BLOCK.getKey(blockWalkwayFluid), new ItemBlockDesc(blockWalkwayFluid, props));
        register(r, Registry.BLOCK.getKey(blockWalkwayWire), new ItemBlockDesc(blockWalkwayWire, props));
        register(r, Registry.BLOCK.getKey(rock0), new BlockItem(rock0, props));
        register(r, Registry.BLOCK.getKey(rock1), new BlockItem(rock1, props));
        register(r, Registry.BLOCK.getKey(rock2), new BlockItem(rock2, props));
        register(r, Registry.BLOCK.getKey(oreAluminum), new BlockItem(oreAluminum, props));
        register(r, Registry.BLOCK.getKey(oreIlmenite), new BlockItem(oreIlmenite, props));
        register(r, Registry.BLOCK.getKey(oreIron), new BlockItem(oreIron, props));
        register(r, Registry.BLOCK.getKey(asteroidDeco), new BlockItem(asteroidDeco, props));
        register(r, Registry.BLOCK.getKey(titaniumBlock), new BlockItem(titaniumBlock, props));
        register(r, Registry.BLOCK.getKey(beamReflector), new ItemBlockDesc(beamReflector, props));
        register(r, Registry.BLOCK.getKey(beamReceiver), new ItemBlockDesc(beamReceiver, props));
        register(r, Registry.BLOCK.getKey(shortRangeTelepad), new ItemBlockDesc(shortRangeTelepad, props));
        register(r, Registry.BLOCK.getKey(blockDenseIce), new BlockItem(blockDenseIce, props));
        register(r, Registry.BLOCK.getKey(blockMinerBase), new ItemBlockDesc(blockMinerBase, props));
    }

//    public static void registerBlocks()
//    {
//        registerBlock(AsteroidBlocks.blockBasic, ItemBlockAsteroids.class);
//        registerBlock(AsteroidBlocks.blockWalkway, ItemBlockWalkway.class);
//        registerBlock(AsteroidBlocks.beamReflector, ItemBlockDesc.class);
//        registerBlock(AsteroidBlocks.beamReceiver, ItemBlockDesc.class);
//        registerBlock(AsteroidBlocks.shortRangeTelepad, ItemBlockShortRangeTelepad.class);
//        registerBlock(AsteroidBlocks.fakeTelepad, null);
//        registerBlock(AsteroidBlocks.blockDenseIce, ItemBlockGC.class);
//        registerBlock(AsteroidBlocks.blockMinerBase, ItemBlockDesc.class);
//        registerBlock(AsteroidBlocks.minerBaseFull, null);
//        registerBlock(AsteroidBlocks.spaceWart, null);
//    }

//    public static void setHarvestLevels()
//    {
//        setHarvestLevel(AsteroidBlocks.blockBasic, "pickaxe", 0, 0);   //Rock
//        setHarvestLevel(AsteroidBlocks.blockBasic, "pickaxe", 0, 1);   //Rock
//        setHarvestLevel(AsteroidBlocks.blockBasic, "pickaxe", 0, 2);   //Rock
//        setHarvestLevel(AsteroidBlocks.blockBasic, "pickaxe", 2, 3);   //Aluminium
//        setHarvestLevel(AsteroidBlocks.blockBasic, "pickaxe", 3, 4);   //Ilmenite
//        setHarvestLevel(AsteroidBlocks.blockBasic, "pickaxe", 2, 5);   //Iron
//    }
//
//    public static void oreDictRegistration()
//    {
//        OreDictionary.registerOre("oreAluminum", new ItemStack(AsteroidBlocks.blockBasic, 1, 3));
//        OreDictionary.registerOre("oreAluminium", new ItemStack(AsteroidBlocks.blockBasic, 1, 3));
//        OreDictionary.registerOre("oreNaturalAluminum", new ItemStack(AsteroidBlocks.blockBasic, 1, 3));
//        OreDictionary.registerOre("oreIlmenite", new ItemStack(AsteroidBlocks.blockBasic, 1, 4));
//        OreDictionary.registerOre("oreIron", new ItemStack(AsteroidBlocks.blockBasic, 1, 5));
//
//        OreDictionary.registerOre("blockTitanium", new ItemStack(AsteroidBlocks.blockBasic, 1, 7));
//    }

    @SubscribeEvent
    public static void initTileEntities(RegistryEvent.Register<BlockEntityType<?>> evt)
    {
        IForgeRegistry<BlockEntityType<?>> r = evt.getRegistry();

        register(r, BlockEntityType.Builder.of(TileEntityBeamReceiver::new, beamReceiver).build(null), AsteroidBlockNames.beamReceiver);
        register(r, BlockEntityType.Builder.of(TileEntityBeamReflector::new, beamReflector).build(null), AsteroidBlockNames.beamReflector);
        register(r, BlockEntityType.Builder.of(TileEntityMinerBaseSingle::new, blockMinerBase).build(null), AsteroidBlockNames.blockMinerBase);
        register(r, BlockEntityType.Builder.of(TileEntityMinerBase::new, minerBaseFull).build(null), AsteroidBlockNames.minerBaseFull);
        register(r, BlockEntityType.Builder.of(TileEntityShortRangeTelepad::new, shortRangeTelepad).build(null), AsteroidBlockNames.shortRangeTelepad);
        register(r, BlockEntityType.Builder.of(TileEntityTelepadFake::new, fakeTelepad).build(null), AsteroidBlockNames.fakeTelepad);
    }
}
