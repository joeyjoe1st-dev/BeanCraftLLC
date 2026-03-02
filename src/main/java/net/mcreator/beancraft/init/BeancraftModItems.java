/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.beancraft.item.DIMENSIONTESTItem;
import net.mcreator.beancraft.BeancraftMod;

import java.util.function.Function;

public class BeancraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BeancraftMod.MODID);
	public static final DeferredItem<Item> DIMENSIONTEST;
	static {
		DIMENSIONTEST = register("dimensiontest", DIMENSIONTESTItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}