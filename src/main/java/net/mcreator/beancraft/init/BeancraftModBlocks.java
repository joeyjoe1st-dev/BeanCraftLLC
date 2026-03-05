/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.beancraft.block.*;
import net.mcreator.beancraft.BeancraftMod;

import java.util.function.Function;

public class BeancraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BeancraftMod.MODID);
	public static final DeferredBlock<Block> BEANGRASS;
	public static final DeferredBlock<Block> DIRT;
	public static final DeferredBlock<Block> BEAN_TRADE_STATION;
	public static final DeferredBlock<Block> BEAN_SEED_STAGE_0;
	public static final DeferredBlock<Block> BEAN_SEED_STAGE_3;
	public static final DeferredBlock<Block> BEAN_SEED_STAGE_2;
	public static final DeferredBlock<Block> BEAN_SEED_STAGE_1;
	public static final DeferredBlock<Block> STOVE;
	public static final DeferredBlock<Block> BEAN_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> SILVER_ORE;
	static {
		BEANGRASS = register("beangrass", BeangrassBlock::new);
		DIRT = register("dirt", DirtBlock::new);
		BEAN_TRADE_STATION = register("bean_trade_station", BeanTradeStationBlock::new);
		BEAN_SEED_STAGE_0 = register("bean_seed_stage_0", BeanSeedStage0Block::new);
		BEAN_SEED_STAGE_3 = register("bean_seed_stage_3", BeanSeedStage3Block::new);
		BEAN_SEED_STAGE_2 = register("bean_seed_stage_2", BeanSeedStage2Block::new);
		BEAN_SEED_STAGE_1 = register("bean_seed_stage_1", BeanSeedStage1Block::new);
		STOVE = register("stove", StoveBlock::new);
		BEAN_DIMENSION_PORTAL = register("bean_dimension_portal", BeanDimensionPortalBlock::new);
		SILVER_ORE = register("silver_ore", SilverOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}