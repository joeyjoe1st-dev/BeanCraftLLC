/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.beancraft.block.entity.BeanSeedStage3BlockEntity;
import net.mcreator.beancraft.block.entity.BeanSeedStage2BlockEntity;
import net.mcreator.beancraft.block.entity.BeanSeedStage1BlockEntity;
import net.mcreator.beancraft.block.entity.BeanSeedStage0BlockEntity;
import net.mcreator.beancraft.BeancraftMod;

@EventBusSubscriber
public class BeancraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BeancraftMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BeanSeedStage0BlockEntity>> BEAN_SEED_STAGE_0 = register("bean_seed_stage_0", BeancraftModBlocks.BEAN_SEED_STAGE_0, BeanSeedStage0BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BeanSeedStage3BlockEntity>> BEAN_SEED_STAGE_3 = register("bean_seed_stage_3", BeancraftModBlocks.BEAN_SEED_STAGE_3, BeanSeedStage3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BeanSeedStage2BlockEntity>> BEAN_SEED_STAGE_2 = register("bean_seed_stage_2", BeancraftModBlocks.BEAN_SEED_STAGE_2, BeanSeedStage2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BeanSeedStage1BlockEntity>> BEAN_SEED_STAGE_1 = register("bean_seed_stage_1", BeancraftModBlocks.BEAN_SEED_STAGE_1, BeanSeedStage1BlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BEAN_SEED_STAGE_0.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BEAN_SEED_STAGE_3.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BEAN_SEED_STAGE_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BEAN_SEED_STAGE_1.get(), SidedInvWrapper::new);
	}
}