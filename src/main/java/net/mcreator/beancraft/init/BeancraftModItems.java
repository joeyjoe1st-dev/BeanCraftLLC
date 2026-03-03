/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.beancraft.item.BeanSeedItemItem;
import net.mcreator.beancraft.item.BeanItem;
import net.mcreator.beancraft.item.BeanDimensionItem;
import net.mcreator.beancraft.BeancraftMod;

import java.util.function.Function;

public class BeancraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BeancraftMod.MODID);
	public static final DeferredItem<Item> BEANGRASS;
	public static final DeferredItem<Item> DIRT;
	public static final DeferredItem<Item> BEAN_TRADE_STATION;
	public static final DeferredItem<Item> BEAN_SEED_ITEM;
	public static final DeferredItem<Item> BEAN_SEED_STAGE_0;
	public static final DeferredItem<Item> BEAN_SEED_STAGE_3;
	public static final DeferredItem<Item> BEAN_SEED_STAGE_2;
	public static final DeferredItem<Item> BEAN;
	public static final DeferredItem<Item> BEAN_SEED_STAGE_1;
	public static final DeferredItem<Item> STOVE;
	public static final DeferredItem<Item> BEAN_DIMENSION;
	static {
		BEANGRASS = block(BeancraftModBlocks.BEANGRASS);
		DIRT = block(BeancraftModBlocks.DIRT);
		BEAN_TRADE_STATION = block(BeancraftModBlocks.BEAN_TRADE_STATION);
		BEAN_SEED_ITEM = register("bean_seed_item", BeanSeedItemItem::new);
		BEAN_SEED_STAGE_0 = block(BeancraftModBlocks.BEAN_SEED_STAGE_0);
		BEAN_SEED_STAGE_3 = block(BeancraftModBlocks.BEAN_SEED_STAGE_3);
		BEAN_SEED_STAGE_2 = block(BeancraftModBlocks.BEAN_SEED_STAGE_2);
		BEAN = register("bean", BeanItem::new);
		BEAN_SEED_STAGE_1 = block(BeancraftModBlocks.BEAN_SEED_STAGE_1);
		STOVE = block(BeancraftModBlocks.STOVE);
		BEAN_DIMENSION = register("bean_dimension", BeanDimensionItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}