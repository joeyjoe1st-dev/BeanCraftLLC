package net.mcreator.beancraft.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class FalseBeanGrassBlockBlock extends Block {
	public FalseBeanGrassBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}