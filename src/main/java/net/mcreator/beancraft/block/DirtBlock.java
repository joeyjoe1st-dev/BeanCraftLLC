package net.mcreator.beancraft.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class DirtBlock extends Block {
	public DirtBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.rooted_dirt.break")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.rooted_dirt.step")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.rooted_dirt.place")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.rooted_dirt.hit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.rooted_dirt.fall")))).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}