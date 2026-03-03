package net.mcreator.beancraft.procedures;

import net.neoforged.bus.api.Event;

public class BeanPlantGrowthTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		stage0 = BeancraftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState();
		stage1 = BeancraftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState();
		stage2 = BeancraftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState();
		stage3 = BeancraftModItems.DELETED_MOD_ELEMENT.get().defaultBlockState();
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "GrowthTime") <= 0) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))) == stage0 && stage1.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage1, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == stage1 && stage2.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage2, 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))) == stage2 && stage3.canSurvive(world, BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), stage3, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("GrowthTime", 0);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("GrowthTime", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "GrowthTime") - 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}