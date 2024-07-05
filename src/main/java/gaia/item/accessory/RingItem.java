package gaia.item.accessory;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;
import java.util.function.Supplier;

public class RingItem extends AbstractAccessoryItem {
	private final List<Supplier<MobEffectInstance>> mobEffects;

	public RingItem(Properties properties, List<Supplier<MobEffectInstance>> mobEffects) {
		super(properties.durability(1));
		this.mobEffects = mobEffects;
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(stack, context, list, flag);
		list.add(Component.translatable("text.grimoireofgaia.ring.tag").withStyle(ChatFormatting.YELLOW));

		if (Screen.hasShiftDown()) {
			for (Supplier<MobEffectInstance> effect : mobEffects) {
				list.add(Component.translatable(effect.get().getDescriptionId()).withStyle(ChatFormatting.GRAY));
			}
		} else {
			list.add(Component.translatable("text.grimoireofgaia.hold_shift").withStyle(ChatFormatting.ITALIC));
		}
	}

	@Override
	public boolean isModifier() {
		return true;
	}

	@Override
	public void doEffect(LivingEntity player, ItemStack stack) {
		for (Supplier<MobEffectInstance> effect : mobEffects) {
			player.addEffect(effect.get());
		}
	}

	@Override
	public void applyModifier(LivingEntity player, ItemStack stack) {
	}

	@Override
	public void removeModifier(LivingEntity player, ItemStack stack) {
	}
}
