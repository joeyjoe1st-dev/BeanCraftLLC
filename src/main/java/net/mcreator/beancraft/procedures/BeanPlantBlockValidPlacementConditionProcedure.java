package net.mcreator.beancraft.procedures;

import net.neoforged.bus.api.Event;

public class BeanPlantBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y + 0.5, z)) >= 8 && (world.getBlockState(BlockPos.containing(x, y - (-1), z))).is(BlockTags.create(ResourceLocation.parse("crops:farmland")))) {
			return true;
		}
		return false;
	}
}