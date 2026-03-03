/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.beancraft.block.DirtBlock;
import net.mcreator.beancraft.block.DIMENSIONTESTPortalBlock;
import net.mcreator.beancraft.block.BeangrassBlock;
import net.mcreator.beancraft.BeancraftMod;

import java.util.function.Function;

public class BeancraftModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BeancraftMod.MODID);
	public static final DeferredBlock<Block> DIMENSIONTEST_PORTAL;
	public static final DeferredBlock<Block> BEANGRASS;
	public static final DeferredBlock<Block> DIRT;
	static {
		DIMENSIONTEST_PORTAL = register("dimensiontest_portal", DIMENSIONTESTPortalBlock::new);
		BEANGRASS = register("beangrass", BeangrassBlock::new);
		DIRT = register("dirt", DirtBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}