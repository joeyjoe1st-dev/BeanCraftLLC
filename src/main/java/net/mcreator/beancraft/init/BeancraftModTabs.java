/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beancraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.beancraft.BeancraftMod;

@EventBusSubscriber
public class BeancraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeancraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BEAN_CRAFT = REGISTRY.register("bean_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.beancraft.bean_craft")).icon(() -> new ItemStack(BeancraftModItems.DIMENSIONTEST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BeancraftModBlocks.BEANGRASS.get().asItem());
				tabData.accept(BeancraftModBlocks.DIRT.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BeancraftModItems.DIMENSIONTEST.get());
		}
	}
}