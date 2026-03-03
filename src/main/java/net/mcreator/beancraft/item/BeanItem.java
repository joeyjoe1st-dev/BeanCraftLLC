package net.mcreator.beancraft.item;

public class BeanItem extends Item {
	public BeanItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}