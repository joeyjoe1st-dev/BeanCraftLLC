/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.beancraft.BeancraftMod;

public class BeancraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeancraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BEAN_CRAFT = REGISTRY.register("bean_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.beancraft.bean_craft")).icon(() -> new ItemStack(BeancraftModBlocks.BEANGRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BeancraftModBlocks.BEANGRASS.get().asItem());
				tabData.accept(BeancraftModBlocks.DIRT.get().asItem());
				tabData.accept(BeancraftModBlocks.BEAN_TRADE_STATION.get().asItem());
			}).withSearchBar().build());
}