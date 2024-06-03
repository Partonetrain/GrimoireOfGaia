package gaia.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class GaiaFoods {
	public static final FoodProperties TAPROOT = (new FoodProperties.Builder()).nutrition(0).saturationModifier(0).build();
	public static final FoodProperties MEAT = (new FoodProperties.Builder()).nutrition(6).saturationModifier(1.2F).build();
	public static final FoodProperties ROTTEN_HEART = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.0F).alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 10 * 20, 0), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.HUNGER, 30 * 20, 0), 0.8F).build();

	public static final FoodProperties GOLDEN_APPLY_PIE = (new FoodProperties.Builder()).nutrition(12).saturationModifier(0.8F).alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 4), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).build();

	public static final FoodProperties GOLDEN_APPLY_PIE_SLICE = (new FoodProperties.Builder()).nutrition(12).saturationModifier(0.8F).alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 80, 4), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 0), 1.0F)
			.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 0), 1.0F).build();

	public static final FoodProperties HONEYDEW = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10 * 20, 0), 0.2F)
			.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 10 * 20, 0), 0.2F).build();

	public static final FoodProperties NETHER_WART_JAM = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.4F).alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30 * 20, 0), 0.4F)
			.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 30 * 20, 0), 0.4F).build();

	public static final FoodProperties WITHERED_BRAIN = (new FoodProperties.Builder()).nutrition(8).saturationModifier(0.8F)
			.effect(() -> new MobEffectInstance(MobEffects.WITHER, 10 * 20, 0), 0.6F).build();
	public static final FoodProperties MONSTER_FEED = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2F).build();
	public static final FoodProperties PREMIUM_MONSTER_FEED = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.6F).build();
	public static final FoodProperties MANDRAKE = (new FoodProperties.Builder()).nutrition(0).saturationModifier(0.0F).alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 20 * 20, 0), 0.8F).build();
}
