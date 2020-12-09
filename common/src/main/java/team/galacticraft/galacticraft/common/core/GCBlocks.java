package team.galacticraft.galacticraft.common.core;

import team.galacticraft.galacticraft.core.blocks.*;
import team.galacticraft.galacticraft.core.items.ItemBlockDesc;
import team.galacticraft.galacticraft.core.items.ItemBlockWallOrFloorDesc;
import team.galacticraft.galacticraft.core.tile.*;
import team.galacticraft.galacticraft.planets.venus.blocks.BlockDungeonBrick;
import net.minecraft.core.Registry;
import net.minecraft.item.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.ObjectHolder;

import java.util.*;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID_CORE, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Constants.MOD_ID_CORE)
public class GCBlocks
{
    public static final Block breatheableAir = new BlockBreathableAir(Block.Properties.of(Material.AIR).noCollission().noDrops().strength(0.0F, 10000.0F));
    public static final Block brightAir = new BlockBrightAir(Block.Properties.copy(breatheableAir).lightLevel(15));
    public static final Block brightBreatheableAir = new BlockBrightBreathableAir(Block.Properties.copy(brightAir));

    public static final Block arcLamp = new BlockArcLamp(Block.Properties.of(Material.GLASS).strength(0.1F).sound(SoundType.METAL).lightLevel(13));

    public static final Block treasureChestTier1 = new BlockTier1TreasureChest(Block.Properties.of(Material.STONE).strength(100000.0F).sound(SoundType.STONE).lightLevel(13));

    public static final Block landingPad = new BlockPad(Block.Properties.of(Material.METAL).strength(1.0F, 10.0F).sound(SoundType.METAL));
    public static final Block buggyPad = new BlockPad(Block.Properties.copy(landingPad));
    public static final Block landingPadFull = new BlockPadFull(Block.Properties.copy(landingPad));
    public static final Block buggyPadFull = new BlockPadFull(Block.Properties.copy(landingPad));

    public static final Block unlitTorch = new BlockUnlitTorch(Block.Properties.of(Material.DECORATION).noCollission().strength(0.0F).lightLevel(3).sound(SoundType.WOOD));
    public static final Block unlitTorchWall = new BlockUnlitTorchWall(Block.Properties.copy(unlitTorch));
    public static final Block unlitTorchLit = new BlockUnlitTorch(Block.Properties.copy(unlitTorch).lightLevel(14));
    public static final Block unlitTorchWallLit = new BlockUnlitTorchWall(Block.Properties.copy(unlitTorch).lightLevel(14));
    public static final Block glowstoneTorch = new BlockGlowstoneTorch(Block.Properties.copy(unlitTorch).lightLevel(12));
    public static final Block glowstoneTorchWall = new BlockGlowstoneTorchWall(Block.Properties.copy(unlitTorch).lightLevel(12));

    public static final Block oxygenDistributor = new BlockOxygenDistributor(Block.Properties.of(Material.STONE).strength(1.0F).sound(SoundType.METAL));
    public static final Block oxygenCollector = new BlockOxygenCollector(Block.Properties.copy(oxygenDistributor));
    public static final Block nasaWorkbench = new BlockNasaWorkbench(Block.Properties.copy(oxygenDistributor));
    public static final Block airLockFrame = new BlockAirLockFrame(Block.Properties.copy(oxygenDistributor));
    public static final Block airLockController = new BlockAirLockController(Block.Properties.copy(oxygenDistributor));
    public static final Block ingotCompressor = new BlockIngotCompressor(Block.Properties.copy(oxygenDistributor));
    public static final Block ingotCompressorElectric = new BlockIngotCompressorElectric(Block.Properties.copy(oxygenDistributor));
    public static final Block ingotCompressorElectricAdvanced = new BlockIngotCompressorElectricAdvanced(Block.Properties.copy(oxygenDistributor));
    public static final Block coalGenerator = new BlockCoalGenerator(Block.Properties.copy(oxygenDistributor));
    public static final Block circuitFabricator = new BlockCircuitFabricator(Block.Properties.copy(oxygenDistributor));
    public static final Block oxygenStorageModule = new BlockOxygenStorageModule(Block.Properties.copy(oxygenDistributor));
    public static final Block deconstructor = new BlockDeconstructor(Block.Properties.copy(oxygenDistributor));
    public static final Block painter = new BlockPainter(Block.Properties.copy(oxygenDistributor));
    public static final Block crafting = new BlockCrafting(Block.Properties.copy(oxygenDistributor));
    public static final Block refinery = new BlockRefinery(Block.Properties.copy(oxygenDistributor));
    public static final Block fuelLoader = new BlockFuelLoader(Block.Properties.copy(oxygenDistributor));
    public static final Block oxygenCompressor = new BlockOxygenCompressor(Block.Properties.copy(oxygenDistributor));
    public static final Block oxygenDecompressor = new BlockOxygenCompressor(Block.Properties.copy(oxygenDistributor));
    public static final Block oxygenSealer = new BlockOxygenSealer(Block.Properties.copy(oxygenDistributor));
    public static final Block oxygenDetector = new BlockOxygenDetector(Block.Properties.copy(oxygenDistributor));
    public static final Block cargoLoader = new BlockCargoLoader(Block.Properties.copy(oxygenDistributor));
    public static final Block cargoUnloader = new BlockCargoUnloader(Block.Properties.copy(oxygenDistributor));
    public static final Block solarPanel = new BlockSolar(Block.Properties.copy(oxygenDistributor));
    public static final Block solarPanelAdvanced = new BlockSolarAdvanced(Block.Properties.copy(oxygenDistributor));
//    public static final Block radioTelescope = new BlockDish(Block.Properties.from(oxygenDistributor));
    public static final Block storageModule = new BlockEnergyStorageModule(Block.Properties.copy(oxygenDistributor));
    public static final Block storageCluster = new BlockEnergyStorageCluster(Block.Properties.copy(oxygenDistributor));
    public static final Block furnaceElectric = new BlockFurnaceElectric(Block.Properties.copy(oxygenDistributor));
    public static final Block furanceArc = new BlockFurnaceArc(Block.Properties.copy(oxygenDistributor));
//    public static final Block panelLighting = new BlockPanelLighting(Block.Properties.from(oxygenDistributor));
//    public static final Block spinThruster = new BlockSpinThruster(Block.Properties.from(oxygenDistributor));
    public static final Block telemetry = new BlockTelemetry(Block.Properties.copy(oxygenDistributor));
    public static final Block concealedRedstone = new BlockConcealedRedstone(Block.Properties.copy(oxygenDistributor));
    public static final Block concealedRepeater = new BlockConcealedRepeater(Block.Properties.copy(oxygenDistributor));
    public static final Block concealedDetector = new BlockConcealedDetector(Block.Properties.copy(oxygenDistributor));

    public static final Block airLockSeal = new BlockAirLockWall(Block.Properties.copy(oxygenDistributor).strength(1000.0F).randomTicks());

    public static final Block fluidPipe = new BlockFluidPipe(Block.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS), BlockFluidPipe.EnumPipeMode.NORMAL);
    public static final Block fluidPipePull = new BlockFluidPipe(Block.Properties.copy(fluidPipe), BlockFluidPipe.EnumPipeMode.PULL);

    public static final Block fallenMeteor = new BlockFallenMeteor(Block.Properties.of(Material.STONE).strength(40.0F).sound(SoundType.STONE));
//    public static final Block spaceGlassVanilla = new BlockSpaceGlass(builder, GlassType.VANILLA, GlassFrame.PLAIN, null);
//    public static final Block spaceGlassClear = new BlockSpaceGlass(builder, GlassType.CLEAR, GlassFrame.PLAIN, null);
//    public static final Block spaceGlassTinVanilla = new BlockSpaceGlass(builder, GlassType.VANILLA, GlassFrame.TIN_DECO, GCBlocks.spaceGlassVanilla);
//    public static final Block spaceGlassTinClear = new BlockSpaceGlass(builder, GlassType.CLEAR, GlassFrame.TIN_DECO, GCBlocks.spaceGlassClear);
//    public static final Block spaceGlassStrong = new BlockSpaceGlass(builder, GlassType.STRONG, GlassFrame.PLAIN, null);
//    public static final Block spaceGlassTinStrong = new BlockSpaceGlass(builder, GlassType.STRONG, GlassFrame.TIN_DECO, GCBlocks.spaceGlassStrong);

    public static final Block spaceStationBase = new BlockSpaceStationBase(Block.Properties.of(Material.STONE).strength(-1.0F, 3600000.0F).noDrops());

    public static final Block fakeBlock = new BlockMulti(Block.Properties.of(Material.METAL).strength(1.0F, 3600000.0F).sound(SoundType.METAL).noOcclusion());

//    public static final Block sealableBlock = new BlockEnclosed(builder);

    public static final Block parachest = new BlockParaChest(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD));

    public static final Block aluminumWire = new BlockAluminumWire(Block.Properties.of(Material.WOOL).strength(0.2F).sound(SoundType.WOOL));
    public static final Block aluminumWireHeavy = new BlockAluminumWire(Block.Properties.copy(aluminumWire));
    public static final Block aluminumWireSwitchable = new BlockAluminumWire(Block.Properties.copy(aluminumWire));
    public static final Block aluminumWireSwitchableHeavy = new BlockAluminumWire(Block.Properties.copy(aluminumWire));
//    public static final Block blockMoon = new BlockBasicMoon(builder);

    public static final Block cheeseBlock = new BlockCheese(Block.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL));

    public static final Block screen = new BlockScreen(Block.Properties.of(Material.DECORATION).strength(1.0F).sound(SoundType.STONE));

    public static final Block fluidTank = new BlockFluidTank(Block.Properties.of(Material.GLASS).strength(3.0F, 8.0F).sound(SoundType.GLASS));

    public static final Block bossSpawner = new BlockBossSpawner(Block.Properties.of(Material.STONE).strength(1000000.0F).noDrops());

//    public static final Block slabGCHalf = new BlockSlabGC(builder);
//    public static final Block slabGCDouble = new BlockDoubleSlabGC(builder);

//    public static final Block tinStairs1 = new BlockStairsGC(builder);
//    public static final Block tinStairs2 = new BlockStairsGC(builder);
//    public static final Block moonStoneStairs = new BlockStairsGC(builder);
//    public static final Block moonBricksStairs = new BlockStairsGC(builder);

//    public static final Block wallGC = new BlockWallGC(builder);

    public static final Block platform = new BlockPlatform(Block.Properties.of(Material.METAL).strength(1.0F, 10.0F).sound(SoundType.METAL));

    public static final Block emergencyBox = new BlockEmergencyBox(Block.Properties.of(Material.METAL).strength(4.0F, 70.0F).lightLevel(15).sound(SoundType.METAL));
    public static final Block emergencyBoxKit = new BlockEmergencyBoxKit(Block.Properties.copy(emergencyBox));

    public static final Block oreCopper = new OreBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE));
    public static final Block oreTin = new OreBlock(Block.Properties.copy(oreCopper));
    public static final Block oreAluminum = new OreBlock(Block.Properties.copy(oreCopper));
    public static final Block oreSilicon = new OreBlock(Block.Properties.copy(oreCopper));
    public static final Block oreCopperMoon = new OreBlock(Block.Properties.copy(oreCopper));
    public static final Block oreTinMoon = new OreBlock(Block.Properties.copy(oreCopper));
    public static final Block oreCheeseMoon = new OreBlock(Block.Properties.copy(oreCopper));
    public static final Block oreSapphire = new OreBlock(Block.Properties.copy(oreCopper));
//    public static final Block oreMeteoricIron = new OreBlock(Block.Properties.from(oreCopper));

    public static final Block moonDirt = new BlockSimple(Block.Properties.of(Material.STONE).sound(SoundType.STONE));
    public static final Block moonStone = new BlockSimple(Block.Properties.copy(moonDirt));
    public static final Block moonTurf = new BlockSimple(Block.Properties.copy(moonDirt));
    public static final Block moonDungeonBrick = new BlockDungeonBrick(Block.Properties.copy(moonDirt));

    public static final Block decoBlock0 = new DecoBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE));
    public static final Block decoBlock1 = new DecoBlock(Block.Properties.copy(decoBlock0));
    public static final Block decoBlockCopper = new DecoBlock(Block.Properties.copy(decoBlock0));
    public static final Block decoBlockTin = new DecoBlock(Block.Properties.copy(decoBlock0));
    public static final Block decoBlockAluminum = new DecoBlock(Block.Properties.copy(decoBlock0));
    public static final Block decoBlockMeteorIron = new DecoBlock(Block.Properties.copy(decoBlock0));
    public static final Block decoBlockSilicon = new DecoBlock(Block.Properties.copy(decoBlock0));
//    public static final Block grating = new BlockGrating(builder);
//    public static final Block gratingWater = new BlockGrating(builder);
//    public static final Block gratingLava = new BlockGrating(builder);

//    public static final Block breatheableAir = null;
//    public static final Block brightAir = null;
//    public static final Block brightBreatheableAir = null;
//    public static final Block brightLamp = null;
//    public static final Block treasureChestTier1 = null;
//    public static final Block landingPad = null;
//    public static final Block unlitTorch = null;
//    public static final Block unlitTorchLit = null;
//    public static final Block oxygenDistributor = null;
//    public static final Block oxygenPipe = null;
//    public static final Block oxygenPipePull = null;
//    public static final Block oxygenCollector = null;
//    public static final Block oxygenCompressor = null;
//    public static final Block oxygenSealer = null;
//    public static final Block oxygenDetector = null;
//    public static final Block nasaWorkbench = null;
//    public static final Block fallenMeteor = null;
//    public static final Block basicBlock = null;
//    public static final Block airLockFrame = null;
//    public static final Block airLockSeal = null;
//    public static BlockSpaceGlass spaceGlassClear;
//    public static BlockSpaceGlass spaceGlassVanilla;
//    public static BlockSpaceGlass spaceGlassStrong;
//    public static BlockSpaceGlass spaceGlassTinClear;
//    public static BlockSpaceGlass spaceGlassTinVanilla;
//    public static BlockSpaceGlass spaceGlassTinStrong;
//    public static final Block crafting = null;
//    public static final Block crudeOil = null;
//    public static final Block fuel = null;
//    public static final Block refinery = null;
//    public static final Block fuelLoader = null;
//    public static final Block landingPadFull = null;
//    public static final Block spaceStationBase = null;
//    public static final Block fakeBlock = null;
//    public static final Block sealableBlock = null;
//    public static final Block cargoLoader = null;
//    public static final Block parachest = null;
//    public static final Block solarPanel = null;
//    public static final Block radioTelescope = null;
//    public static final Block machineBase = null;
//    public static final Block machineBase2 = null;
//    public static final Block machineBase3 = null;
//    public static final Block machineBase4 = null;
//    public static final Block machineTiered = null;
//    public static final Block aluminumWire = null;
//    public static final Block panelLighting = null;
//    public static final Block glowstoneTorch = null;
//    public static final Block blockMoon = null;
//    public static final Block cheeseBlock = null;
//    public static final Block spinThruster = null;
//    public static final Block screen = null;
//    public static final Block telemetry = null;
//    public static final Block fluidTank = null;
//    public static final Block bossSpawner = null;
//    public static final Block slabGCHalf = null;
//    public static final Block slabGCDouble = null;
//    public static final Block tinStairs1 = null;
//    public static final Block tinStairs2 = null;
//    public static final Block moonStoneStairs = null;
//    public static final Block moonBricksStairs = null;
//    public static final Block wallGC = null;
//    public static final Block concealedRedstone = null;
//    public static final Block concealedRepeater_Powered = null;
//    public static final Block concealedRepeater_Unpowered = null;
//    public static final Block concealedDetector = null;
//    public static final Block platform = null;
//    public static final Block emergencyBox = null;
//    public static final Block grating = null;
//    public static final Block gratingWater = null;
//    public static final Block gratingLava = null;

//    public static final Material machine = new Material.Builder(MaterialColor.IRON).build();

    public static ArrayList<Block> hiddenBlocks = new ArrayList<Block>();
    public static ArrayList<Block> otherModTorchesLit = new ArrayList<Block>();
    public static ArrayList<Block> otherModTorchesUnlit = new ArrayList<Block>();

    public static HashMap<Block, Block> itemChanges = new HashMap<>(4, 1.0F);

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, ResourceLocation name)
    {
        reg.register(thing.setRegistryName(name));
        if (thing instanceof BlockItem)
        {
            GalacticraftCore.blocksList.add(name);
        }
        else if (thing instanceof Item)
        {
            GalacticraftCore.itemList.add(name);
        }
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, String name)
    {
        ResourceLocation location = new ResourceLocation(Constants.MOD_ID_CORE, name);
        register(reg, thing, location);
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, String name, IForgeRegistryEntry<V> thing) {
        ResourceLocation location = new ResourceLocation(Constants.MOD_ID_CORE, name);
        register(reg, thing, location);
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, ResourceLocation name, IForgeRegistryEntry<V> thing) {
        register(reg, thing, name);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> evt)
    {
        IForgeRegistry<Block> r = evt.getRegistry();
        register(r, GCBlockNames.breatheableAir, breatheableAir);
        register(r, GCBlockNames.brightAir, brightAir);
        register(r, GCBlockNames.brightBreatheableAir, brightBreatheableAir);
        register(r, GCBlockNames.arcLamp, arcLamp);
        register(r, GCBlockNames.treasureChestTier1, treasureChestTier1);
        register(r, GCBlockNames.landingPad, landingPad);
        register(r, GCBlockNames.buggyPad, buggyPad);
        register(r, GCBlockNames.landingPadFull, landingPadFull);
        register(r, GCBlockNames.buggyPadFull, buggyPadFull);
        register(r, GCBlockNames.unlitTorch, unlitTorch);
        register(r, GCBlockNames.unlitTorchWall, unlitTorchWall);
        register(r, GCBlockNames.unlitTorchLit, unlitTorchLit);
        register(r, GCBlockNames.unlitTorchWallLit, unlitTorchWallLit);
        register(r, GCBlockNames.glowstoneTorch, glowstoneTorch);
        register(r, GCBlockNames.glowstoneTorchWall, glowstoneTorchWall);
        register(r, GCBlockNames.oxygenDistributor, oxygenDistributor);
        register(r, GCBlockNames.oxygenCollector, oxygenCollector);
        register(r, GCBlockNames.nasaWorkbench, nasaWorkbench);
        register(r, GCBlockNames.airLockFrame, airLockFrame);
        register(r, GCBlockNames.airLockController, airLockController);
        register(r, GCBlockNames.ingotCompressor, ingotCompressor);
        register(r, GCBlockNames.ingotCompressorElectric, ingotCompressorElectric);
        register(r, GCBlockNames.ingotCompressorElectricAdvanced, ingotCompressorElectricAdvanced);
        register(r, GCBlockNames.coalGenerator, coalGenerator);
        register(r, GCBlockNames.circuitFabricator, circuitFabricator);
        register(r, GCBlockNames.oxygenStorageModule, oxygenStorageModule);
        register(r, GCBlockNames.deconstructor, deconstructor);
        register(r, GCBlockNames.painter, painter);
        register(r, GCBlockNames.crafting, crafting);
        register(r, GCBlockNames.refinery, refinery);
        register(r, GCBlockNames.fuelLoader, fuelLoader);
        register(r, GCBlockNames.oxygenCompressor, oxygenCompressor);
        register(r, GCBlockNames.oxygenDecompressor, oxygenDecompressor);
        register(r, GCBlockNames.oxygenSealer, oxygenSealer);
        register(r, GCBlockNames.oxygenDetector, oxygenDetector);
        register(r, GCBlockNames.cargoLoader, cargoLoader);
        register(r, GCBlockNames.cargoUnloader, cargoUnloader);
        register(r, GCBlockNames.solarPanel, solarPanel);
        register(r, GCBlockNames.solarPanelAdvanced, solarPanelAdvanced);
//        register(r, BlockNames.radioTelescope, radioTelescope);
        register(r, GCBlockNames.energyStorage, storageModule);
        register(r, GCBlockNames.energyCluster, storageCluster);
        register(r, GCBlockNames.furnaceElectric, furnaceElectric);
        register(r, GCBlockNames.furanceArc, furanceArc);
//        register(r, BlockNames.panelLighting, panelLighting);
//        register(r, BlockNames.spinThruster, spinThruster);
        register(r, GCBlockNames.telemetry, telemetry);
        register(r, GCBlockNames.concealedRedstone, concealedRedstone);
        register(r, GCBlockNames.concealedRepeater, concealedRepeater);
        register(r, GCBlockNames.concealedDetector, concealedDetector);
        register(r, GCBlockNames.airLockSeal, airLockSeal);
        register(r, GCBlockNames.fluidPipe, fluidPipe);
        register(r, GCBlockNames.fluidPipePull, fluidPipePull);
        register(r, GCBlockNames.fallenMeteor, fallenMeteor);
//        register(r, BlockNames.spaceGlassVanilla, spaceGlassVanilla);
//        register(r, BlockNames.spaceGlassClear, spaceGlassClear);
//        register(r, BlockNames.spaceGlassTinVanilla, spaceGlassTinVanilla);
//        register(r, BlockNames.spaceGlassTinClear, spaceGlassTinClear);
//        register(r, BlockNames.spaceGlassStrong, spaceGlassStrong);
//        register(r, BlockNames.spaceGlassTinStrong, spaceGlassTinStrong);
        register(r, GCBlockNames.spaceStationBase, spaceStationBase);
        register(r, GCBlockNames.fakeBlock, fakeBlock);
//        register(r, BlockNames.sealableBlock, sealableBlock);
        register(r, GCBlockNames.parachest, parachest);
        register(r, GCBlockNames.aluminumWire, aluminumWire);
        register(r, GCBlockNames.aluminumWireHeavy, aluminumWireHeavy);
        register(r, GCBlockNames.aluminumWireSwitchable, aluminumWireSwitchable);
        register(r, GCBlockNames.aluminumWireSwitchableHeavy, aluminumWireSwitchableHeavy);
        register(r, GCBlockNames.cheeseBlock, cheeseBlock);
        register(r, GCBlockNames.screen, screen);
        register(r, GCBlockNames.fluidTank, fluidTank);
        register(r, GCBlockNames.bossSpawner, bossSpawner);
//        register(r, BlockNames.slabGCHalf, slabGCHalf);
//        register(r, BlockNames.slabGCDouble, slabGCDouble);
//        register(r, BlockNames.tinStairs1, tinStairs1);
//        register(r, BlockNames.tinStairs2, tinStairs2);
//        register(r, BlockNames.moonStoneStairs, moonStoneStairs);
//        register(r, BlockNames.moonBricksStairs, moonBricksStairs);
//        register(r, BlockNames.wallGC, wallGC);
        register(r, GCBlockNames.platform, platform);
        register(r, GCBlockNames.emergencyBox, emergencyBox);
        register(r, GCBlockNames.emergencyBoxKit, emergencyBoxKit);
        register(r, GCBlockNames.oreCopper, oreCopper);
        register(r, GCBlockNames.oreTin, oreTin);
        register(r, GCBlockNames.oreAluminum, oreAluminum);
        register(r, GCBlockNames.oreSilicon, oreSilicon);
        register(r, GCBlockNames.oreCopperMoon, oreCopperMoon);
        register(r, GCBlockNames.oreTinMoon, oreTinMoon);
        register(r, GCBlockNames.oreCheeseMoon, oreCheeseMoon);
        register(r, GCBlockNames.oreSapphire, oreSapphire);
//        register(r, BlockNames.oreMeteoricIron, oreMeteoricIron);
        register(r, GCBlockNames.moonDirt, moonDirt);
        register(r, GCBlockNames.moonStone, moonStone);
        register(r, GCBlockNames.moonTurf, moonTurf);
        register(r, GCBlockNames.moonDungeonBrick, moonDungeonBrick);
        register(r, GCBlockNames.decoBlock0, decoBlock0);
        register(r, GCBlockNames.decoBlock1, decoBlock1);
        register(r, GCBlockNames.decoBlockCopper, decoBlockCopper);
        register(r, GCBlockNames.decoBlockTin, decoBlockTin);
        register(r, GCBlockNames.decoBlockAluminum, decoBlockAluminum);
        register(r, GCBlockNames.decoBlockMeteorIron, decoBlockMeteorIron);
        register(r, GCBlockNames.decoBlockSilicon, decoBlockSilicon);
//        register(r, BlockNames.grating, grating);
//        register(r, BlockNames.gratingWater, gratingWater);
//        register(r, BlockNames.gratingLava, gratingLava);

//        register(r, new BlockGrating(builder), BlockNames.grating); TODO
//        register(r, new BlockGrating(builder), BlockNames.gratingWater);
//        register(r, new BlockGrating(builder), BlockNames.gratingLava);

//        GCBlocks.breatheableAir = new BlockBreathableAir("breatheable_air");
//        GCBlocks.brightAir = new BlockBrightAir("bright_air");
//        GCBlocks.brightBreatheableAir = new BlockBrightBreathableAir("bright_breathable_air");
//        GCBlocks.brightLamp = new BlockBrightLamp("arclamp");
//        GCBlocks.treasureChestTier1 = new BlockTier1TreasureChest("treasure_chest");
//        GCBlocks.landingPad = new BlockLandingPad("landing_pad");
//        GCBlocks.landingPadFull = new BlockLandingPadFull("landing_pad_full");
//        GCBlocks.unlitTorch = new BlockUnlitTorch(false, "unlit_torch");
//        GCBlocks.unlitTorchLit = new BlockUnlitTorch(true, "unlit_torch_lit");
//        GCBlocks.oxygenDistributor = new BlockOxygenDistributor("distributor");
//        GCBlocks.oxygenPipe = new BlockFluidPipe("fluid_pipe", BlockFluidPipe.EnumPipeMode.NORMAL);
//        GCBlocks.oxygenPipePull = new BlockFluidPipe("fluid_pipe_pull", BlockFluidPipe.EnumPipeMode.PULL);
//        GCBlocks.oxygenCollector = new BlockOxygenCollector("collector");
//        GCBlocks.nasaWorkbench = new BlockNasaWorkbench("rocket_workbench");
//        GCBlocks.fallenMeteor = new BlockFallenMeteor("fallen_meteor");
//        GCBlocks.basicBlock = new BlockBasic("basic_block_core");
//        GCBlocks.airLockFrame = new BlockAirLockFrame("air_lock_frame");
//        GCBlocks.airLockSeal = new BlockAirLockWall("air_lock_seal");
//        //These glass types have to be registered as 6 separate blocks, (a) to allow different coloring of each one and (b) because the Forge MultiLayer custom model does not allow for different textures to be set for different variants
//        GCBlocks.spaceGlassVanilla = new BlockSpaceGlass("space_glass_vanilla", GlassType.VANILLA, GlassFrame.PLAIN, null).setHardness(0.3F).setResistance(3F);
//        GCBlocks.spaceGlassClear = new BlockSpaceGlass("space_glass_clear", GlassType.CLEAR, GlassFrame.PLAIN, null).setHardness(0.3F).setResistance(3F);
//        GCBlocks.spaceGlassStrong = new BlockSpaceGlass("space_glass_strong", GlassType.STRONG, GlassFrame.PLAIN, null).setHardness(4F).setResistance(35F);
//        GCBlocks.spaceGlassTinVanilla = new BlockSpaceGlass("space_glass_vanilla_tin", GlassType.VANILLA, GlassFrame.TIN_DECO, GCBlocks.spaceGlassVanilla).setHardness(0.3F).setResistance(4F);
//        GCBlocks.spaceGlassTinClear = new BlockSpaceGlass("space_glass_clear_tin", GlassType.CLEAR, GlassFrame.TIN_DECO, GCBlocks.spaceGlassClear).setHardness(0.3F).setResistance(4F);
//        GCBlocks.spaceGlassTinStrong = new BlockSpaceGlass("space_glass_strong_tin", GlassType.STRONG, GlassFrame.TIN_DECO, GCBlocks.spaceGlassStrong).setHardness(4F).setResistance(35F);
//        GCBlocks.crafting = new BlockCrafting("magnetic_table");
//        GCBlocks.refinery = new BlockRefinery("refinery");
//        GCBlocks.oxygenCompressor = new BlockOxygenCompressor(false, "oxygen_compressor");
//        GCBlocks.fuelLoader = new BlockFuelLoader("fuel_loader");
//        GCBlocks.spaceStationBase = new BlockSpaceStationBase("space_station_base");
//        GCBlocks.fakeBlock = new BlockMulti("block_multi");
//        GCBlocks.oxygenSealer = new BlockOxygenSealer("sealer");
//        GCBlocks.sealableBlock = new BlockEnclosed("enclosed");
//        GCBlocks.oxygenDetector = new BlockOxygenDetector("oxygen_detector");
//        GCBlocks.cargoLoader = new BlockCargoLoader("cargo");
//        GCBlocks.parachest = new BlockParaChest("parachest");
//        GCBlocks.solarPanel = new BlockSolar("solar");
//        GCBlocks.radioTelescope = new BlockDish("dishbase");
//        GCBlocks.machineBase = new BlockMachine("machine");
//        GCBlocks.machineBase2 = new BlockMachine2("machine2");
//        GCBlocks.machineBase3 = new BlockMachine3("machine3");
//        GCBlocks.machineBase4 = new BlockMachine4("machine4");
//        GCBlocks.machineTiered = new BlockMachineTiered("machine_tiered");
//        GCBlocks.aluminumWire = new BlockAluminumWire("aluminum_wire");
//        GCBlocks.panelLighting = new BlockPanelLighting("panel_lighting");
//        GCBlocks.glowstoneTorch = new BlockGlowstoneTorch("glowstone_torch");
//        GCBlocks.blockMoon = new BlockBasicMoon("basic_block_moon");
//        GCBlocks.cheeseBlock = new BlockCheese("cheese");
//        GCBlocks.spinThruster = new BlockSpinThruster("spin_thruster");
//        GCBlocks.screen = new BlockScreen("view_screen");
//        GCBlocks.telemetry = new BlockTelemetry("telemetry");
//        GCBlocks.fluidTank = new BlockFluidTank("fluid_tank");
//        GCBlocks.bossSpawner = new BlockBossSpawner("boss_spawner");
//        GCBlocks.slabGCHalf = new BlockSlabGC("slab_gc_half", Material.ROCK);
//        GCBlocks.slabGCDouble = new BlockDoubleSlabGC("slab_gc_double", Material.ROCK);
//        GCBlocks.tinStairs1 = new BlockStairsGC("tin_stairs_1", basicBlock.getDefaultState().with(BlockBasic.BASIC_TYPE, BlockBasic.EnumBlockBasic.ALUMINUM_DECORATION_BLOCK_0)).setHardness(2.0F);
//        GCBlocks.tinStairs2 = new BlockStairsGC("tin_stairs_2", basicBlock.getDefaultState().with(BlockBasic.BASIC_TYPE, BlockBasic.EnumBlockBasic.ALUMINUM_DECORATION_BLOCK_1)).setHardness(2.0F);
//        GCBlocks.moonStoneStairs = new BlockStairsGC("moon_stairs_stone", blockMoon.getDefaultState().with(BlockBasicMoon.BASIC_TYPE_MOON, BlockBasicMoon.EnumBlockBasicMoon.MOON_STONE)).setHardness(1.5F);
//        GCBlocks.moonBricksStairs = new BlockStairsGC("moon_stairs_brick", blockMoon.getDefaultState().with(BlockBasicMoon.BASIC_TYPE_MOON, BlockBasicMoon.EnumBlockBasicMoon.MOON_DUNGEON_BRICK)).setHardness(4.0F);
//        GCBlocks.wallGC = new BlockWallGC("wall_gc");
//        GCBlocks.concealedRedstone = new BlockConcealedRedstone("concealed_redstone");
//        GCBlocks.concealedRepeater_Powered = new BlockConcealedRepeater("concealed_repeater_pow", true);
//        GCBlocks.concealedRepeater_Unpowered = new BlockConcealedRepeater("concealed_repeater", false);
//        GCBlocks.concealedDetector = new BlockConcealedDetector("concealed_detector");
//        GCBlocks.platform = new BlockPlatform("platform");
//        GCBlocks.emergencyBox = new BlockEmergencyBox("emergency_box");
//        GCBlocks.grating = new BlockGrating("grating", ConfigManagerCore.allowLiquidGratings.get() ? Material.CARPET : Material.IRON);
//        GCBlocks.gratingWater = new BlockGrating("grating1", Material.WATER);
//        GCBlocks.gratingLava = new BlockGrating("grating2", Material.LAVA).setLightLevel(1.0F);

        // Hide certain items from NEI
        GCBlocks.hiddenBlocks.add(GCBlocks.airLockSeal);
        GCBlocks.hiddenBlocks.add(GCBlocks.fluidPipePull);
        GCBlocks.hiddenBlocks.add(GCBlocks.unlitTorch);
        GCBlocks.hiddenBlocks.add(GCBlocks.unlitTorchLit);
        GCBlocks.hiddenBlocks.add(GCBlocks.landingPadFull);
        GCBlocks.hiddenBlocks.add(GCBlocks.spaceStationBase);
        GCBlocks.hiddenBlocks.add(GCBlocks.bossSpawner);
//        GCBlocks.hiddenBlocks.add(GCBlocks.slabGCDouble);

        // Register blocks before register ores, so that the ItemStack picks up the correct item
//        GCBlocks.registerBlocks();
//        GCBlocks.setHarvestLevels();

        BlockUnlitTorch.register((BlockUnlitTorch) GCBlocks.unlitTorch, (BlockUnlitTorch) GCBlocks.unlitTorchLit, Blocks.TORCH);
        BlockUnlitTorchWall.register((BlockUnlitTorchWall) GCBlocks.unlitTorchWall, (BlockUnlitTorchWall) GCBlocks.unlitTorchWallLit, Blocks.WALL_TORCH);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> evt)
    {
        IForgeRegistry<Item> r = evt.getRegistry();
        Item.Properties props = GCItems.defaultBuilder().tab(GalacticraftCore.galacticraftBlocksTab);
        register(r, Registry.BLOCK.getKey(arcLamp), new BlockItem(arcLamp, props));
        register(r, Registry.BLOCK.getKey(treasureChestTier1), new ItemBlockDesc(treasureChestTier1, props));
        register(r, Registry.BLOCK.getKey(landingPad), new BlockItem(landingPad, props));
        register(r, Registry.BLOCK.getKey(buggyPad), new BlockItem(buggyPad, props));
        register(r, Registry.BLOCK.getKey(glowstoneTorch), new ItemBlockWallOrFloorDesc(glowstoneTorch, glowstoneTorchWall, props));
        register(r, Registry.BLOCK.getKey(oxygenDistributor), new ItemBlockDesc(oxygenDistributor, props));
        register(r, Registry.BLOCK.getKey(oxygenCollector), new ItemBlockDesc(oxygenCollector, props));
        register(r, Registry.BLOCK.getKey(nasaWorkbench), new BlockItem(nasaWorkbench, props));
        register(r, Registry.BLOCK.getKey(airLockFrame), new BlockItem(airLockFrame, props));
        register(r, Registry.BLOCK.getKey(airLockController), new BlockItem(airLockController, props));
        register(r, Registry.BLOCK.getKey(ingotCompressor), new BlockItem(ingotCompressor, props));
        register(r, Registry.BLOCK.getKey(ingotCompressorElectric), new BlockItem(ingotCompressorElectric, props));
        register(r, Registry.BLOCK.getKey(ingotCompressorElectricAdvanced), new BlockItem(ingotCompressorElectricAdvanced, props));
        register(r, Registry.BLOCK.getKey(coalGenerator), new BlockItem(coalGenerator, props));
        register(r, Registry.BLOCK.getKey(circuitFabricator), new BlockItem(circuitFabricator, props));
        register(r, Registry.BLOCK.getKey(oxygenStorageModule), new BlockItem(oxygenStorageModule, props));
        register(r, Registry.BLOCK.getKey(deconstructor), new BlockItem(deconstructor, props));
        register(r, Registry.BLOCK.getKey(painter), new BlockItem(painter, props));
        register(r, Registry.BLOCK.getKey(crafting), new ItemBlockDesc(crafting, props));
        register(r, Registry.BLOCK.getKey(refinery), new ItemBlockDesc(refinery, props));
        register(r, Registry.BLOCK.getKey(fuelLoader), new ItemBlockDesc(fuelLoader, props));
        register(r, Registry.BLOCK.getKey(oxygenCompressor), new ItemBlockDesc(oxygenCompressor, props));
        register(r, Registry.BLOCK.getKey(oxygenDecompressor), new ItemBlockDesc(oxygenDecompressor, props));
        register(r, Registry.BLOCK.getKey(oxygenSealer), new ItemBlockDesc(oxygenSealer, props));
        register(r, Registry.BLOCK.getKey(oxygenDetector), new ItemBlockDesc(oxygenDetector, props));
        register(r, Registry.BLOCK.getKey(cargoLoader), new ItemBlockDesc(cargoLoader, props));
        register(r, Registry.BLOCK.getKey(cargoUnloader), new ItemBlockDesc(cargoUnloader, props));
        register(r, Registry.BLOCK.getKey(solarPanel), new ItemBlockDesc(solarPanel, props));
        register(r, Registry.BLOCK.getKey(solarPanelAdvanced), new ItemBlockDesc(solarPanelAdvanced, props));
        register(r, Registry.BLOCK.getKey(storageModule), new ItemBlockDesc(storageModule, props));
        register(r, Registry.BLOCK.getKey(storageCluster), new ItemBlockDesc(storageCluster, props));
        register(r, Registry.BLOCK.getKey(furnaceElectric), new ItemBlockDesc(furnaceElectric, props));
        register(r, Registry.BLOCK.getKey(furanceArc), new ItemBlockDesc(furanceArc, props));
        register(r, Registry.BLOCK.getKey(telemetry), new ItemBlockDesc(telemetry, props));
        register(r, Registry.BLOCK.getKey(concealedRedstone), new BlockItem(concealedRedstone, props));
        register(r, Registry.BLOCK.getKey(concealedRepeater), new BlockItem(concealedRepeater, props));
        register(r, Registry.BLOCK.getKey(concealedDetector), new BlockItem(concealedDetector, props));
        register(r, Registry.BLOCK.getKey(fluidPipe), new ItemBlockDesc(fluidPipe, props));
        register(r, Registry.BLOCK.getKey(fluidPipePull), new ItemBlockDesc(fluidPipePull, props));
        register(r, Registry.BLOCK.getKey(fallenMeteor), new ItemBlockDesc(fallenMeteor, props));
        register(r, Registry.BLOCK.getKey(parachest), new ItemBlockDesc(parachest, props));
        register(r, Registry.BLOCK.getKey(aluminumWire), new BlockItem(aluminumWire, props));
        register(r, Registry.BLOCK.getKey(aluminumWireHeavy), new BlockItem(aluminumWireHeavy, props));
        register(r, Registry.BLOCK.getKey(aluminumWireSwitchable), new BlockItem(aluminumWireSwitchable, props));
        register(r, Registry.BLOCK.getKey(aluminumWireSwitchableHeavy), new BlockItem(aluminumWireSwitchableHeavy, props));
        register(r, Registry.BLOCK.getKey(cheeseBlock), new BlockItem(cheeseBlock, props));
        register(r, Registry.BLOCK.getKey(screen), new ItemBlockDesc(screen, props));
        register(r, Registry.BLOCK.getKey(fluidTank), new ItemBlockDesc(fluidTank, props));
        register(r, Registry.BLOCK.getKey(emergencyBox), new BlockItem(emergencyBox, props));
        register(r, Registry.BLOCK.getKey(emergencyBoxKit), new BlockItem(emergencyBoxKit, props));
        register(r, Registry.BLOCK.getKey(oreCopper), new BlockItem(oreCopper, props));
        register(r, Registry.BLOCK.getKey(oreTin), new BlockItem(oreTin, props));
        register(r, Registry.BLOCK.getKey(oreAluminum), new BlockItem(oreAluminum, props));
        register(r, Registry.BLOCK.getKey(oreSilicon), new BlockItem(oreSilicon, props));
        register(r, Registry.BLOCK.getKey(oreCopperMoon), new BlockItem(oreCopperMoon, props));
        register(r, Registry.BLOCK.getKey(oreTinMoon), new BlockItem(oreTinMoon, props));
        register(r, Registry.BLOCK.getKey(oreCheeseMoon), new BlockItem(oreCheeseMoon, props));
        register(r, Registry.BLOCK.getKey(oreSapphire), new BlockItem(oreSapphire, props));
        register(r, Registry.BLOCK.getKey(moonDirt), new BlockItem(moonDirt, props));
        register(r, Registry.BLOCK.getKey(moonStone), new BlockItem(moonStone, props));
        register(r, Registry.BLOCK.getKey(moonTurf), new BlockItem(moonTurf, props));
        register(r, Registry.BLOCK.getKey(moonDungeonBrick), new BlockItem(moonDungeonBrick, props));
        register(r, Registry.BLOCK.getKey(decoBlock0), new BlockItem(decoBlock0, props));
        register(r, Registry.BLOCK.getKey(decoBlock1), new BlockItem(decoBlock1, props));
        register(r, Registry.BLOCK.getKey(decoBlockCopper), new BlockItem(decoBlockCopper, props));
        register(r, Registry.BLOCK.getKey(decoBlockTin), new BlockItem(decoBlockTin, props));
        register(r, Registry.BLOCK.getKey(decoBlockAluminum), new BlockItem(decoBlockAluminum, props));
        register(r, Registry.BLOCK.getKey(decoBlockMeteorIron), new BlockItem(decoBlockMeteorIron, props));
        register(r, Registry.BLOCK.getKey(decoBlockSilicon), new BlockItem(decoBlockSilicon, props));
        register(r, Registry.BLOCK.getKey(platform), new ItemBlockDesc(platform, props));
        props = props.tab(null);
        register(r, Registry.BLOCK.getKey(airLockSeal), new BlockItem(airLockSeal, props));
        register(r, Registry.BLOCK.getKey(unlitTorch), new ItemBlockWallOrFloorDesc(unlitTorch, unlitTorchWall, props));
        register(r, Registry.BLOCK.getKey(unlitTorchLit), new ItemBlockWallOrFloorDesc(unlitTorchLit, unlitTorchWallLit, props));
    }

    public static void oreDictRegistrations()
    {
        // TODO
//        OreDictionary.registerOre("oreCopper", new ItemStack(GCBlocks.basicBlock, 1, 5));
//        OreDictionary.registerOre("oreCopper", new ItemStack(GCBlocks.blockMoon, 1, 0));
//        OreDictionary.registerOre("oreTin", new ItemStack(GCBlocks.basicBlock, 1, 6));
//        OreDictionary.registerOre("oreTin", new ItemStack(GCBlocks.blockMoon, 1, 1));
//        OreDictionary.registerOre("oreAluminum", new ItemStack(GCBlocks.basicBlock, 1, 7));
//        OreDictionary.registerOre("oreAluminium", new ItemStack(GCBlocks.basicBlock, 1, 7));
//        OreDictionary.registerOre("oreNaturalAluminum", new ItemStack(GCBlocks.basicBlock, 1, 7));
//        OreDictionary.registerOre("oreSilicon", new ItemStack(GCBlocks.basicBlock, 1, 8));
//        OreDictionary.registerOre("oreCheese", new ItemStack(GCBlocks.blockMoon, 1, 2));
//
//        OreDictionary.registerOre("blockCopper", new ItemStack(GCBlocks.basicBlock, 1, 9));
//        OreDictionary.registerOre("blockTin", new ItemStack(GCBlocks.basicBlock, 1, 10));
//        OreDictionary.registerOre("blockAluminum", new ItemStack(GCBlocks.basicBlock, 1, 11));
//        OreDictionary.registerOre("blockAluminium", new ItemStack(GCBlocks.basicBlock, 1, 11));
//        OreDictionary.registerOre("blockSilicon", new ItemStack(GCBlocks.basicBlock, 1, 13));
//
//        OreDictionary.registerOre("turfMoon", new ItemStack(GCBlocks.blockMoon, 1, EnumBlockBasicMoon.MOON_TURF.getMeta()));
    }

//    private static void setHarvestLevel(Block block, String toolClass, int level, int meta)
//    {
//        block.setHarvestLevel(toolClass, level, block.getStateFromMeta(meta));
//    }

//    public static void doOtherModsTorches(IForgeRegistry<Block> registry)
//    {
//        BlockUnlitTorch torch;
//        BlockUnlitTorch torchLit;
//
//        if (CompatibilityManager.isTConstructLoaded)
//        {
//            Block modTorch = null;
//            try
//            {
//                //tconstruct.world.TinkerWorld.stoneTorch
//                Class clazz = Class.forName("slimeknights.tconstruct.gadgets.TinkerGadgets");
//                modTorch = (Block) clazz.getDeclaredField("stoneTorch").get(null);
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//
//            if (modTorch != null)
//            {
//                torch = new BlockUnlitTorch(false, "unlit_torch_stone");
//                torchLit = new BlockUnlitTorch(true, "unlit_torch_stone_lit");
//                GCBlocks.hiddenBlocks.add(torch);
//                GCBlocks.hiddenBlocks.add(torchLit);
//                GCBlocks.otherModTorchesUnlit.add(torch);
//                GCBlocks.otherModTorchesLit.add(torchLit);
//                registerBlock(torch, ItemBlockGC.class);
//                registerBlock(torchLit, ItemBlockGC.class);
//                registry.register(torch);
//                registry.register(torchLit);
//                BlockUnlitTorch.register(torch, torchLit, modTorch);
//                GCLog.info("Galacticraft: activating Tinker's Construct compatibility.");
//            }
//        }
//    } TODO

//    public static void registerFuel()
//    {
//        GCBlocks.fuel = new BlockFluidGC(GCFluids.fluidFuel, "fuel");
//        ((BlockFluidGC) GCBlocks.fuel).setQuantaPerBlock(3);
//        GCBlocks.fuel.setUnlocalizedName("fuel");
//        GCBlocks.registerBlock(GCBlocks.fuel, ItemBlockGC.class);
//    }
//
//    public static void registerOil()
//    {
//        GCBlocks.crudeOil = new BlockFluidGC(GCFluids.fluidOil, "oil");
//        ((BlockFluidGC) GCBlocks.crudeOil).setQuantaPerBlock(3);
//        GCBlocks.crudeOil.setUnlocalizedName("crude_oil_still");
//        GCBlocks.registerBlock(GCBlocks.crudeOil, ItemBlockGC.class);
//    } TODO

//    public static void setHarvestLevels()
//    {
//        setHarvestLevel(GCBlocks.basicBlock, "pickaxe", 1, 5); //Copper ore
//        setHarvestLevel(GCBlocks.basicBlock, "pickaxe", 1, 6); //Tin ore
//        setHarvestLevel(GCBlocks.basicBlock, "pickaxe", 1, 7); //Aluminium ore
//        setHarvestLevel(GCBlocks.basicBlock, "pickaxe", 2, 8); //Silicon ore
//        setHarvestLevel(GCBlocks.fallenMeteor, "pickaxe", 3, 0);
//        setHarvestLevel(GCBlocks.blockMoon, "pickaxe", 1, 0); //Copper ore
//        setHarvestLevel(GCBlocks.blockMoon, "pickaxe", 1, 1); //Tin ore
//        setHarvestLevel(GCBlocks.blockMoon, "pickaxe", 1, 2); //Cheese ore
//        setHarvestLevel(GCBlocks.blockMoon, "shovel", 0, 3); //Moon dirt
//        setHarvestLevel(GCBlocks.blockMoon, "pickaxe", 0, 4); //Moon rock
//
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 1, 0);
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 1, 1);
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 1, 2);
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 3, 3);
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 1, 4);
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 3, 5);
//        setHarvestLevel(GCBlocks.slabGCHalf, "pickaxe", 1, 6);
//
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 1, 0);
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 1, 1);
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 1, 2);
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 3, 3);
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 1, 4);
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 3, 5);
//        setHarvestLevel(GCBlocks.slabGCDouble, "pickaxe", 1, 6);
//
//        setHarvestLevel(GCBlocks.tinStairs1, "pickaxe", 1, 0);
//        setHarvestLevel(GCBlocks.tinStairs1, "pickaxe", 1, 0);
//
//        setHarvestLevel(GCBlocks.moonStoneStairs, "pickaxe", 1, 0);
//        setHarvestLevel(GCBlocks.moonBricksStairs, "pickaxe", 3, 0);
//
//        setHarvestLevel(GCBlocks.wallGC, "pickaxe", 1, 0);
//        setHarvestLevel(GCBlocks.wallGC, "pickaxe", 1, 1);
//        setHarvestLevel(GCBlocks.wallGC, "pickaxe", 1, 2);
//        setHarvestLevel(GCBlocks.wallGC, "pickaxe", 3, 3);
//        setHarvestLevel(GCBlocks.wallGC, "pickaxe", 0, 4);
//        setHarvestLevel(GCBlocks.wallGC, "pickaxe", 3, 5);
//
//        setHarvestLevel(GCBlocks.wallGC, "shovel", 0, 5);
//
//        setHarvestLevel(GCBlocks.blockMoon, "pickaxe", 3, 14); //Moon dungeon brick (actually unharvestable)
//    } TODO

//    public static void registerBlock(Block block, Class<? extends BlockItem> itemClass, Object... itemCtorArgs)
//    {
//        String name = block.getUnlocalizedName().substring(5);
//        if (block.getRegistryName() == null)
//        {
//            block.setRegistryName(name);
//        }
//        GCCoreUtil.registerGalacticraftBlock(name, block);
//
//        if (itemClass != null)
//        {
//            BlockItem item = null;
//            Class<?>[] ctorArgClasses = new Class<?>[itemCtorArgs.length + 1];
//            ctorArgClasses[0] = Block.class;
//            for (int idx = 1; idx < ctorArgClasses.length; idx++)
//            {
//                ctorArgClasses[idx] = itemCtorArgs[idx - 1].getClass();
//            }
//
//            try
//            {
//                Constructor<? extends BlockItem> constructor = itemClass.getConstructor(ctorArgClasses);
//                item = constructor.newInstance(ObjectArrays.concat(block, itemCtorArgs));
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//
//            if (item != null)
//            {
//                GCCoreUtil.registerGalacticraftItem(name, item);
//                if (item.getRegistryName() == null)
//                {
//                    item.setRegistryName(name);
//                }
//            }
//        }
//    }

//    public static void registerBlocks(IForgeRegistry<Block> registry)
//    {
//        for (Block block : GalacticraftCore.blocksList)
//        {
//            registry.register(block);
//        }
//
//        //Complete registration of various types of torches
//        BlockUnlitTorch.register((BlockUnlitTorch) GCBlocks.unlitTorch, (BlockUnlitTorch) GCBlocks.unlitTorchLit, Blocks.TORCH);
//    }

//    public static void registerBlocks()
//    {
//        registerBlock(GCBlocks.landingPad, ItemBlockLandingPad.class);
//        registerBlock(GCBlocks.landingPadFull, ItemBlockGC.class);
//        registerBlock(GCBlocks.unlitTorch, ItemBlockGC.class);
//        registerBlock(GCBlocks.unlitTorchLit, ItemBlockGC.class);
//        registerBlock(GCBlocks.breatheableAir, null);
//        registerBlock(GCBlocks.brightAir, null);
//        registerBlock(GCBlocks.brightBreatheableAir, null);
//        registerBlock(GCBlocks.oxygenDistributor, ItemBlockDesc.class);
//        registerBlock(GCBlocks.oxygenCollector, ItemBlockDesc.class);
//        registerBlock(GCBlocks.oxygenCompressor, ItemBlockOxygenCompressor.class);
//        registerBlock(GCBlocks.oxygenSealer, ItemBlockDesc.class);
//        registerBlock(GCBlocks.oxygenDetector, ItemBlockDesc.class);
//        registerBlock(GCBlocks.aluminumWire, ItemBlockAluminumWire.class);
//        registerBlock(GCBlocks.oxygenPipe, ItemBlockDesc.class);
//        registerBlock(GCBlocks.oxygenPipePull, ItemBlockDesc.class);
//        registerBlock(GCBlocks.refinery, ItemBlockDesc.class);
//        registerBlock(GCBlocks.fuelLoader, ItemBlockDesc.class);
//        registerBlock(GCBlocks.cargoLoader, ItemBlockCargoLoader.class);
//        registerBlock(GCBlocks.nasaWorkbench, ItemBlockNasaWorkbench.class);
//        registerBlock(GCBlocks.basicBlock, ItemBlockBase.class);
//        registerBlock(GCBlocks.airLockFrame, ItemBlockAirLock.class);
//        registerBlock(GCBlocks.airLockSeal, ItemBlockGC.class);
//        registerBlock(GCBlocks.spaceGlassClear, ItemBlockGlassGC.class);
//        registerBlock(GCBlocks.spaceGlassVanilla, ItemBlockGlassGC.class);
//        registerBlock(GCBlocks.spaceGlassStrong, ItemBlockGlassGC.class);
//        registerBlock(GCBlocks.spaceGlassTinClear, null);  //The corresponding item is already registered
//        registerBlock(GCBlocks.spaceGlassTinVanilla, null);  //The corresponding item is already registered
//        registerBlock(GCBlocks.spaceGlassTinStrong, null);  //The corresponding item is already registered
//        registerBlock(GCBlocks.crafting, ItemBlockDesc.class);
//        registerBlock(GCBlocks.sealableBlock, ItemBlockEnclosed.class);
//        registerBlock(GCBlocks.spaceStationBase, ItemBlockGC.class);
//        registerBlock(GCBlocks.fakeBlock, null);
//        registerBlock(GCBlocks.parachest, ItemBlockDesc.class);
//        registerBlock(GCBlocks.solarPanel, ItemBlockSolar.class);
//        registerBlock(GCBlocks.radioTelescope, ItemBlockGC.class);
//        registerBlock(GCBlocks.machineBase, ItemBlockMachine.class);
//        registerBlock(GCBlocks.machineBase2, ItemBlockMachine.class);
//        registerBlock(GCBlocks.machineBase3, ItemBlockMachine.class);
//        registerBlock(GCBlocks.machineTiered, ItemBlockMachine.class);
//        registerBlock(GCBlocks.machineBase4, ItemBlockMachine.class);
//        registerBlock(GCBlocks.panelLighting, ItemBlockPanel.class);
//        registerBlock(GCBlocks.glowstoneTorch, ItemBlockDesc.class);
//        registerBlock(GCBlocks.fallenMeteor, ItemBlockDesc.class);
//        registerBlock(GCBlocks.blockMoon, ItemBlockMoon.class);
//        registerBlock(GCBlocks.cheeseBlock, ItemBlockCheese.class);
//        registerBlock(GCBlocks.spinThruster, ItemBlockThruster.class);
//        registerBlock(GCBlocks.screen, ItemBlockDesc.class);
//        registerBlock(GCBlocks.telemetry, ItemBlockDesc.class);
//        registerBlock(GCBlocks.brightLamp, ItemBlockArclamp.class);
//        registerBlock(GCBlocks.treasureChestTier1, ItemBlockDesc.class);
//        registerBlock(GCBlocks.fluidTank, ItemBlockDesc.class);
//        registerBlock(GCBlocks.bossSpawner, ItemBlockGC.class);
//        registerBlock(GCBlocks.tinStairs1, ItemBlockGC.class);
//        registerBlock(GCBlocks.tinStairs2, ItemBlockGC.class);
//        registerBlock(GCBlocks.moonStoneStairs, ItemBlockGC.class);
//        registerBlock(GCBlocks.moonBricksStairs, ItemBlockGC.class);
//        registerBlock(GCBlocks.wallGC, ItemBlockWallGC.class);
//        registerBlock(GCBlocks.slabGCHalf, ItemBlockSlabGC.class, GCBlocks.slabGCHalf, GCBlocks.slabGCDouble);
//        registerBlock(GCBlocks.slabGCDouble, ItemBlockSlabGC.class, GCBlocks.slabGCHalf, GCBlocks.slabGCDouble);
//        registerBlock(GCBlocks.concealedRedstone, ItemBlockGC.class);
//        registerBlock(GCBlocks.concealedRepeater_Powered, ItemBlockGC.class);
//        registerBlock(GCBlocks.concealedRepeater_Unpowered, ItemBlockGC.class);
//        registerBlock(GCBlocks.concealedDetector, ItemBlockCreativeGC.class);
//        registerBlock(GCBlocks.platform, ItemBlockDesc.class);
//        registerBlock(GCBlocks.emergencyBox, ItemBlockEmergencyBox.class);
//        registerBlock(GCBlocks.grating, ItemBlockGC.class);
//        registerBlock(GCBlocks.gratingWater, null);
//        registerBlock(GCBlocks.gratingLava, null);
////        GCCoreUtil.sortBlock(GCBlocks.aluminumWire, 0, new StackSorted(GCBlocks.landingPad, 1));
////        GCCoreUtil.sortBlock(GCBlocks.aluminumWire, 1, new StackSorted(GCBlocks.aluminumWire, 0));
////        GCCoreUtil.sortBlock(GCBlocks.oxygenPipe, 0, new StackSorted(GCBlocks.aluminumWire, 1));
//    }

    @SubscribeEvent
    public static void initTileEntities(RegistryEvent.Register<BlockEntityType<?>> evt)
    {
        IForgeRegistry<BlockEntityType<?>> r = evt.getRegistry();

        register(r, BlockEntityType.Builder.of(TileEntityTreasureChest::new, treasureChestTier1).build(null), GCBlockNames.treasureChestTier1);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenDistributor::new, oxygenDistributor).build(null), GCBlockNames.oxygenDistributor);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenCollector::new, oxygenCollector).build(null), GCBlockNames.oxygenCollector);
        register(r, BlockEntityType.Builder.of(TileEntityFluidPipe::new, fluidPipe).build(null), GCBlockNames.fluidPipe);
        register(r, BlockEntityType.Builder.of(TileEntityAirLock::new, airLockFrame).build(null), GCBlockNames.airLockFrame);
        register(r, BlockEntityType.Builder.of(TileEntityRefinery::new, refinery).build(null), GCBlockNames.refinery);
        register(r, BlockEntityType.Builder.of(TileEntityNasaWorkbench::new, nasaWorkbench).build(null), GCBlockNames.nasaWorkbench);
        register(r, BlockEntityType.Builder.of(TileEntityDeconstructor::new, deconstructor).build(null), GCBlockNames.deconstructor);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenCompressor::new, oxygenCompressor).build(null), GCBlockNames.oxygenCompressor);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenDecompressor::new, oxygenDecompressor).build(null), GCBlockNames.oxygenDecompressor);
        register(r, BlockEntityType.Builder.of(TileEntityFuelLoader::new, fuelLoader).build(null), GCBlockNames.fuelLoader);
        register(r, BlockEntityType.Builder.of(TileEntityLandingPadSingle::new, landingPad).build(null), GCBlockNames.landingPad);
        register(r, BlockEntityType.Builder.of(TileEntityLandingPad::new, landingPadFull).build(null), GCBlockNames.landingPadFull);
        register(r, BlockEntityType.Builder.of(TileEntitySpaceStationBase::new, spaceStationBase).build(null), GCBlockNames.spaceStationBase);
        register(r, BlockEntityType.Builder.of(TileEntityFake::new, fakeBlock).build(null), GCBlockNames.fakeBlock);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenSealer::new, oxygenSealer).build(null), GCBlockNames.oxygenSealer);
        register(r, BlockEntityType.Builder.of(TileEntityDungeonSpawner::new, bossSpawner).build(null), GCBlockNames.bossSpawner);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenDetector::new, oxygenDetector).build(null), GCBlockNames.oxygenDetector);
        register(r, BlockEntityType.Builder.of(TileEntityBuggyFueler::new, buggyPadFull).build(null), GCBlockNames.buggyPadFull);
        register(r, BlockEntityType.Builder.of(TileEntityBuggyFuelerSingle::new, buggyPad).build(null), GCBlockNames.buggyPad);
        register(r, BlockEntityType.Builder.of(TileEntityCargoLoader::new, cargoLoader).build(null), GCBlockNames.cargoLoader);
        register(r, BlockEntityType.Builder.of(TileEntityCargoUnloader::new, cargoUnloader).build(null), GCBlockNames.cargoUnloader);
        register(r, BlockEntityType.Builder.of(TileEntityParaChest::new, parachest).build(null), GCBlockNames.parachest);
        register(r, BlockEntityType.Builder.of(TileEntitySolar.TileEntitySolarT1::new, solarPanel).build(null), GCBlockNames.solarPanel);
        register(r, BlockEntityType.Builder.of(TileEntitySolar.TileEntitySolarT2::new, solarPanelAdvanced).build(null), GCBlockNames.solarPanelAdvanced);
//        register(r, TileEntityType.Builder.create(TileEntityDish::new, radioTelescope).build(null), BlockNames.radioTelescope);
        register(r, BlockEntityType.Builder.of(TileEntityCrafting::new, crafting).build(null), GCBlockNames.crafting);
        register(r, BlockEntityType.Builder.of(TileEntityEnergyStorageModule.TileEntityEnergyStorageModuleT1::new, storageModule).build(null), GCBlockNames.energyStorage);
        register(r, BlockEntityType.Builder.of(TileEntityEnergyStorageModule.TileEntityEnergyStorageModuleT2::new, storageCluster).build(null), GCBlockNames.energyCluster);
        register(r, BlockEntityType.Builder.of(TileEntityCoalGenerator::new, coalGenerator).build(null), GCBlockNames.coalGenerator);
        register(r, BlockEntityType.Builder.of(TileEntityElectricFurnace.TileEntityElectricFurnaceT1::new, furnaceElectric).build(null), GCBlockNames.furnaceElectric);
        register(r, BlockEntityType.Builder.of(TileEntityElectricFurnace.TileEntityElectricFurnaceT2::new, furanceArc).build(null), GCBlockNames.furanceArc);
        register(r, BlockEntityType.Builder.of(TileEntityAluminumWire.TileEntityAluminumWireT1::new, aluminumWire).build(null), GCBlockNames.aluminumWire);
        register(r, BlockEntityType.Builder.of(TileEntityAluminumWire.TileEntityAluminumWireT2::new, aluminumWireHeavy).build(null), GCBlockNames.aluminumWireHeavy);
        register(r, BlockEntityType.Builder.of(TileEntityAluminumWireSwitch.TileEntityAluminumWireSwitchableT1::new, aluminumWireSwitchable).build(null), GCBlockNames.aluminumWireSwitchable);
        register(r, BlockEntityType.Builder.of(TileEntityAluminumWireSwitch.TileEntityAluminumWireSwitchableT2::new, aluminumWireSwitchableHeavy).build(null), GCBlockNames.aluminumWireSwitchableHeavy);
//        register(r, TileEntityType.Builder.create(TileEntityAluminumWireSwitch::new, "GC Switchable Aluminum Wire").build(null));
        register(r, BlockEntityType.Builder.of(TileEntityFallenMeteor::new, fallenMeteor).build(null), GCBlockNames.fallenMeteor);
        register(r, BlockEntityType.Builder.of(TileEntityIngotCompressor::new, ingotCompressor).build(null), GCBlockNames.ingotCompressor);
        register(r, BlockEntityType.Builder.of(TileEntityElectricIngotCompressor.TileEntityElectricIngotCompressorT1::new, ingotCompressorElectric).build(null), GCBlockNames.ingotCompressorElectric);
        register(r, BlockEntityType.Builder.of(TileEntityElectricIngotCompressor.TileEntityElectricIngotCompressorT2::new, ingotCompressorElectricAdvanced).build(null), GCBlockNames.ingotCompressorElectricAdvanced);
        register(r, BlockEntityType.Builder.of(TileEntityCircuitFabricator::new, circuitFabricator).build(null), GCBlockNames.circuitFabricator);
        register(r, BlockEntityType.Builder.of(TileEntityAirLockController::new, airLockController).build(null), GCBlockNames.airLockController);
        register(r, BlockEntityType.Builder.of(TileEntityOxygenStorageModule::new, oxygenStorageModule).build(null), GCBlockNames.oxygenStorageModule);
//        register(r, TileEntityType.Builder.create(TileEntityThruster::new, spinThruster).build(null), BlockNames.spinThruster);
        register(r, BlockEntityType.Builder.of(TileEntityArclamp::new, arcLamp).build(null), GCBlockNames.arcLamp);
        register(r, BlockEntityType.Builder.of(TileEntityScreen::new, screen).build(null), GCBlockNames.screen);
//        register(r, TileEntityType.Builder.create(TileEntityPanelLight::new, panelLighting).build(null), BlockNames.panelLighting);
        register(r, BlockEntityType.Builder.of(TileEntityTelemetry::new, telemetry).build(null), GCBlockNames.telemetry);
        register(r, BlockEntityType.Builder.of(TileEntityPainter::new, painter).build(null), GCBlockNames.painter);
        register(r, BlockEntityType.Builder.of(TileEntityFluidTank::new, fluidTank).build(null), GCBlockNames.fluidTank);
        register(r, BlockEntityType.Builder.of(TileEntityPlayerDetector::new, concealedDetector).build(null), GCBlockNames.concealedDetector);
        register(r, BlockEntityType.Builder.of(TileEntityPlatform::new, platform).build(null), GCBlockNames.platform);
        register(r, BlockEntityType.Builder.of(TileEntityEmergencyBox::new, emergencyBox, emergencyBoxKit).build(null), GCBlockNames.emergencyBox);
//        register(r, TileEntityType.Builder.create(TileEntityNull::new, "GC Null Tile").build(null));
    }
}
