package gaia.item.fuel;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GigaGearItem extends FuelItem {
	public GigaGearItem(Properties properties) {
		super(properties, 1240000);
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(stack, context, list, flag);
		list.add(Component.translatable("text.grimoireofgaia.giga_gear.desc").withStyle(ChatFormatting.GRAY));
	}
}
