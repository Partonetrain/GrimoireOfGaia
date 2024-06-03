package gaia.util;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;

import java.util.Collections;
import java.util.List;

public class LootHelper {
	public static List<ItemStack> getStacksFromTable(ServerLevel level, LootParams.Builder lootContext,
	                                                 LootContextParamSet paramSet, ResourceKey<LootTable> tableKey, int maxStacks) {
		LootTable loottable = level.getServer().reloadableRegistries().getLootTable(tableKey);
		LootParams lootParams = lootContext.create(paramSet);
		List<ItemStack> stacks = loottable.getRandomItems(lootParams);
		Collections.shuffle(stacks);

		int max = Math.min(maxStacks, stacks.size());
		return stacks.subList(0, max);
	}

}
