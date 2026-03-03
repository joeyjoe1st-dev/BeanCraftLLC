package net.mcreator.beancraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BeanItem extends Item {
	public BeanItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}