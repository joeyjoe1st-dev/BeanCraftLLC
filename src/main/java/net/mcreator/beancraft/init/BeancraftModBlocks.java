/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.beancraft.block.StoveBlock;
import net.mcreator.beancraft.block.DirtBlock;
import net.mcreator.beancraft.block.BeangrassBlock;
import net.mcreator.beancraft.block.BeanTradeStationBlock;
import net.mcreator.beancraft.BeancraftMod;

import java.util.function.Function;

public class BeancraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BeancraftMod.MODID);
	public static final DeferredBlock<Block> BEANGRASS;
	public static final DeferredBlock<Block> DIRT;
	public static final DeferredBlock<Block> BEAN_TRADE_STATION;
	public static final DeferredBlock<Block> STOVE;
	static {
		BEANGRASS = register("beangrass", BeangrassBlock::new);
		DIRT = register("dirt", DirtBlock::new);
		BEAN_TRADE_STATION = register("bean_trade_station", BeanTradeStationBlock::new);
		STOVE = register("stove", StoveBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}