package micdoodle8.mods.galacticraft.planets.mars.blocks;

import micdoodle8.mods.galacticraft.core.*;
import micdoodle8.mods.galacticraft.core.items.ItemBlockDesc;
import micdoodle8.mods.galacticraft.core.tile.*;
import micdoodle8.mods.galacticraft.planets.mars.tile.*;
import micdoodle8.mods.galacticraft.planets.venus.blocks.VenusBlockNames;
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
public class MarsBlocks
{
    //    @ObjectHolder(MarsBlockNames.blockSludge) public static Block blockSludge; TODO liquids
    @ObjectHolder(MarsBlockNames.vine)
    public static Block vine;
    @ObjectHolder(MarsBlockNames.slimelingEggRed)
    public static Block slimelingEggRed;
    @ObjectHolder(MarsBlockNames.slimelingEggBlue)
    public static Block slimelingEggBlue;
    @ObjectHolder(MarsBlockNames.slimelingEggYellow)
    public static Block slimelingEggYellow;
    @ObjectHolder(MarsBlockNames.treasureChestTier2)
    public static Block treasureChestTier2;
    @ObjectHolder(MarsBlockNames.cryoChamber)
    public static Block cryoChamber;
    @ObjectHolder(MarsBlockNames.launchController)
    public static Block launchController;
    @ObjectHolder(MarsBlockNames.terraformer)
    public static Block terraformer;
    @ObjectHolder(MarsBlockNames.methaneSynthesizer)
    public static Block methaneSynthesizer;
    @ObjectHolder(MarsBlockNames.gasLiquefier)
    public static Block gasLiquefier;
    @ObjectHolder(MarsBlockNames.electrolyzer)
    public static Block electrolyzer;
    @ObjectHolder(MarsBlockNames.creeperEgg)
    public static Block creeperEgg;
    @ObjectHolder(MarsBlockNames.marsCobblestoneStairs)
    public static Block marsCobblestoneStairs;
    @ObjectHolder(MarsBlockNames.marsBricksStairs)
    public static Block marsBricksStairs;
    @ObjectHolder(MarsBlockNames.bossSpawner)
    public static Block bossSpawner;
    @ObjectHolder(MarsBlockNames.oreCopper)
    public static Block oreCopper;
    @ObjectHolder(MarsBlockNames.oreTin)
    public static Block oreTin;
    @ObjectHolder(MarsBlockNames.oreDesh)
    public static Block oreDesh;
    @ObjectHolder(MarsBlockNames.oreIron)
    public static Block oreIron;
    @ObjectHolder(MarsBlockNames.cobblestone)
    public static Block cobblestone;
    @ObjectHolder(MarsBlockNames.rockSurface)
    public static Block rockSurface;
    @ObjectHolder(MarsBlockNames.rockMiddle)
    public static Block rockMiddle;
    @ObjectHolder(MarsBlockNames.dungeonBrick)
    public static Block dungeonBrick;
    @ObjectHolder(MarsBlockNames.deshBlock)
    public static Block deshBlock;
    @ObjectHolder(MarsBlockNames.stone)
    public static Block stone;

    public static void registerBlocks(RegistryEvent.Register<Block> evt)
    {
        IForgeRegistry<Block> r = evt.getRegistry();

        Block.Properties builder = Block.Properties.of(Material.STONE);
        register(r, new BlockBasicMars(builder), MarsBlockNames.oreCopper);
        register(r, new BlockBasicMars(builder), MarsBlockNames.oreTin);
        register(r, new BlockBasicMars(builder), MarsBlockNames.oreDesh);
        register(r, new BlockBasicMars(builder), MarsBlockNames.oreIron);
        register(r, new BlockBasicMars(builder), MarsBlockNames.cobblestone);
        register(r, new BlockBasicMars(builder), MarsBlockNames.rockSurface);
        register(r, new BlockBasicMars(builder), MarsBlockNames.rockMiddle);
        register(r, new BlockBasicMars(builder), MarsBlockNames.stone);

        builder = builder.strength(5.0F, 20.0F);
        register(r, new BlockBasicMars(builder), MarsBlockNames.deshBlock);

        builder = builder.strength(5.0F, 60.0F).randomTicks();
        register(r, new BlockBasicMars(builder), MarsBlockNames.dungeonBrick);

        builder = Block.Properties.of(Material.REPLACEABLE_PLANT).noCollission().lightLevel(15).randomTicks().strength(0.2F).sound(SoundType.GRASS).noDrops();
        register(r, new BlockCavernousVine(builder), MarsBlockNames.vine);

        builder = Block.Properties.of(Material.STONE);
        register(r, new BlockSlimelingEgg(builder), MarsBlockNames.slimelingEggRed);
        register(r, new BlockSlimelingEgg(builder), MarsBlockNames.slimelingEggBlue);
        register(r, new BlockSlimelingEgg(builder), MarsBlockNames.slimelingEggYellow);

        builder = Block.Properties.of(Material.STONE).strength(100000.0F).sound(SoundType.STONE).lightLevel(13);
        register(r, new BlockTier2TreasureChest(builder), MarsBlockNames.treasureChestTier2);

        builder = Block.Properties.of(Material.METAL).sound(SoundType.METAL);
        register(r, new BlockCryoChamber(builder), MarsBlockNames.cryoChamber);
        register(r, new BlockLaunchController(builder), MarsBlockNames.launchController);
        register(r, new BlockTerraformer(builder), MarsBlockNames.terraformer);
        register(r, new BlockMethaneSynthesizer(builder), MarsBlockNames.methaneSynthesizer);
        register(r, new BlockGasLiquefier(builder), MarsBlockNames.gasLiquefier);
        register(r, new BlockElectrolyzer(builder.randomTicks()), MarsBlockNames.electrolyzer);

        builder = Block.Properties.of(Material.STONE).strength(3.0F, 9.0F);
        register(r, new BlockCreeperEgg(builder), MarsBlockNames.creeperEgg);

        builder = Block.Properties.of(Material.STONE).strength(1000000.0F).noDrops();
        register(r, new BlockBossSpawnerMars(builder), MarsBlockNames.bossSpawner);

//        register(r, new BlockStairsGC(builder), MarsBlockNames.marsCobblestoneStairs);
//        register(r, new BlockStairsGC(builder), MarsBlockNames.marsBricksStairs); TODO

//        MarsBlocks.marsBlock = new BlockBasicMars("mars").setHardness(2.2F);
//        MarsBlocks.vine = new BlockCavernousVine("cavern_vines").setHardness(0.1F);
//        MarsBlocks.rock = new BlockSlimelingEgg("slimeling_egg").setHardness(0.75F);
//        MarsBlocks.treasureChestTier2 = new BlockTier2TreasureChest("treasure_t2");
//        MarsBlocks.machine = new BlockMachineMars("mars_machine").setHardness(1.8F);
//        MarsBlocks.machineT2 = new BlockMachineMarsT2("mars_machine_t2").setHardness(1.8F);
//        MarsBlocks.creeperEgg = new BlockCreeperEgg("creeper_egg").setHardness(-1.0F);
//        MarsBlocks.bossSpawner = new BlockBossSpawnerMars("boss_spawner_mars");
//        MarsBlocks.marsCobblestoneStairs = new BlockStairsGC("mars_stairs_cobblestone", marsBlock.getDefaultState().with(BlockBasicMars.BASIC_TYPE, BlockBasicMars.EnumBlockBasic.COBBLESTONE)).setHardness(1.5F);
//        MarsBlocks.marsBricksStairs = new BlockStairsGC("mars_stairs_brick", marsBlock.getDefaultState().with(BlockBasicMars.BASIC_TYPE, BlockBasicMars.EnumBlockBasic.DUNGEON_BRICK)).setHardness(4.0F);

        GCBlocks.hiddenBlocks.add(MarsBlocks.bossSpawner);

//        MarsBlocks.registerBlocks();
//        MarsBlocks.setHarvestLevels();
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, String name)
    {
        GCBlocks.register(reg, thing, new ResourceLocation(Constants.MOD_ID_PLANETS, name));
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, ResourceLocation name, IForgeRegistryEntry<V> thing)
    {
        GCBlocks.register(reg, name, thing);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> evt)
    {
        IForgeRegistry<Item> r = evt.getRegistry();
        Item.Properties props = GCItems.defaultBuilder().tab(GalacticraftCore.galacticraftBlocksTab);
        register(r, Registry.BLOCK.getKey(oreCopper), new BlockItem(oreCopper, props));
        register(r, Registry.BLOCK.getKey(oreTin), new BlockItem(oreTin, props));
        register(r, Registry.BLOCK.getKey(oreDesh), new BlockItem(oreDesh, props));
        register(r, Registry.BLOCK.getKey(oreIron), new BlockItem(oreIron, props));
        register(r, Registry.BLOCK.getKey(cobblestone), new BlockItem(cobblestone, props));
        register(r, Registry.BLOCK.getKey(rockSurface), new BlockItem(rockSurface, props));
        register(r, Registry.BLOCK.getKey(rockMiddle), new BlockItem(rockMiddle, props));
        register(r, Registry.BLOCK.getKey(stone), new BlockItem(stone, props));
        register(r, Registry.BLOCK.getKey(deshBlock), new BlockItem(deshBlock, props));
        register(r, Registry.BLOCK.getKey(dungeonBrick), new BlockItem(dungeonBrick, props));
        register(r, Registry.BLOCK.getKey(vine), new ItemBlockDesc(vine, props));
        register(r, Registry.BLOCK.getKey(slimelingEggRed), new ItemBlockDesc(slimelingEggRed, props));
        register(r, Registry.BLOCK.getKey(slimelingEggBlue), new ItemBlockDesc(slimelingEggBlue, props));
        register(r, Registry.BLOCK.getKey(slimelingEggYellow), new ItemBlockDesc(slimelingEggYellow, props));
        register(r, Registry.BLOCK.getKey(treasureChestTier2), new ItemBlockDesc(treasureChestTier2, props));
        register(r, Registry.BLOCK.getKey(cryoChamber), new ItemBlockDesc(cryoChamber, props));
        register(r, Registry.BLOCK.getKey(launchController), new ItemBlockDesc(launchController, props));
        register(r, Registry.BLOCK.getKey(terraformer), new ItemBlockDesc(terraformer, props));
        register(r, Registry.BLOCK.getKey(methaneSynthesizer), new ItemBlockDesc(methaneSynthesizer, props));
        register(r, Registry.BLOCK.getKey(gasLiquefier), new ItemBlockDesc(gasLiquefier, props));
        register(r, Registry.BLOCK.getKey(electrolyzer), new ItemBlockDesc(electrolyzer, props));
        register(r, Registry.BLOCK.getKey(creeperEgg), new ItemBlockDesc(creeperEgg, props));
        register(r, Registry.BLOCK.getKey(bossSpawner), new BlockItem(bossSpawner, props.tab(null)));
    }

//    public static void setHarvestLevels()
//    {
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 1, 0); //Copper ore
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 1, 1); //Tin ore
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 3, 2); //Desh ore
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 1, 3); //Iron ore
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 0, 4); //Cobblestone
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 3, 7); //Dungeon brick
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 0, 8); //Decoration block
//        setHarvestLevel(MarsBlocks.marsBlock, "pickaxe", 1, 9); //Stone
//        setHarvestLevel(MarsBlocks.marsBlock, "shovel", 0, 5); //Top dirt
//        setHarvestLevel(MarsBlocks.marsBlock, "shovel", 0, 6); //Dirt
//        setHarvestLevel(MarsBlocks.rock, "pickaxe", 3);
////        setHarvestLevel(MarsBlocks.marsCobblestoneStairs, "pickaxe", 0);
////        setHarvestLevel(MarsBlocks.marsBricksStairs, "pickaxe", 3);
//    }

//    public static void registerBlocks()
//    {
//        registerBlock(MarsBlocks.treasureChestTier2, ItemBlockDesc.class);
//        registerBlock(MarsBlocks.marsBlock, ItemBlockMars.class);
//        registerBlock(MarsBlocks.vine, ItemBlockDesc.class);
//        registerBlock(MarsBlocks.rock, ItemBlockEgg.class);
//        registerBlock(MarsBlocks.creeperEgg, ItemBlockDesc.class);
//        registerBlock(MarsBlocks.machine, ItemBlockMachine.class);
//        registerBlock(MarsBlocks.machineT2, ItemBlockMachine.class);
//        registerBlock(MarsBlocks.bossSpawner, ItemBlockGC.class);
//        registerBlock(MarsBlocks.marsCobblestoneStairs, ItemBlockGC.class);
//        registerBlock(MarsBlocks.marsBricksStairs, ItemBlockGC.class);
//    }

//    public static void oreDictRegistration()
//    {
//        OreDictionary.registerOre("oreCopper", new ItemStack(MarsBlocks.marsBlock, 1, 0));
//        OreDictionary.registerOre("oreTin", new ItemStack(MarsBlocks.marsBlock, 1, 1));
//        OreDictionary.registerOre("oreIron", new ItemStack(MarsBlocks.marsBlock, 1, 3));
//        OreDictionary.registerOre("oreDesh", new ItemStack(MarsBlocks.marsBlock, 1, 2));
//        OreDictionary.registerOre("blockDesh", new ItemStack(MarsBlocks.marsBlock, 1, 8));
//    } TODO

    @SubscribeEvent
    public static void initTileEntities(RegistryEvent.Register<BlockEntityType<?>> evt)
    {
        IForgeRegistry<BlockEntityType<?>> r = evt.getRegistry();

        register(r, BlockEntityType.Builder.of(TileEntityCryogenicChamber::new, cryoChamber).build(null), MarsBlockNames.cryoChamber);
        register(r, BlockEntityType.Builder.of(TileEntityDungeonSpawnerMars::new, bossSpawner).build(null), MarsBlockNames.bossSpawner);
        register(r, BlockEntityType.Builder.of(TileEntityElectrolyzer::new, electrolyzer).build(null), MarsBlockNames.electrolyzer);
        register(r, BlockEntityType.Builder.of(TileEntityGasLiquefier::new, gasLiquefier).build(null), MarsBlockNames.gasLiquefier);
        register(r, BlockEntityType.Builder.of(TileEntityLaunchController::new, launchController).build(null), MarsBlockNames.launchController);
        register(r, BlockEntityType.Builder.of(TileEntityMethaneSynthesizer::new, methaneSynthesizer).build(null), MarsBlockNames.methaneSynthesizer);
        register(r, BlockEntityType.Builder.of(TileEntitySlimelingEgg::new, slimelingEggRed, slimelingEggBlue, slimelingEggYellow).build(null), MarsBlockNames.slimelingEgg);
        register(r, BlockEntityType.Builder.of(TileEntityTerraformer::new, terraformer).build(null), MarsBlockNames.terraformer);
        register(r, BlockEntityType.Builder.of(TileEntityTreasureChestMars::new, treasureChestTier2).build(null), MarsBlockNames.treasureChestTier2);
    }
}
