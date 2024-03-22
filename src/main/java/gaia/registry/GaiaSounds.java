package gaia.registry;

import gaia.GrimoireOfGaia;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GaiaSounds {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, GrimoireOfGaia.MOD_ID);

	public static final DeferredHolder<SoundEvent, SoundEvent> BAG_OPEN = SOUND_EVENTS.register("bag_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "bag_open")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOK_HIT = SOUND_EVENTS.register("book_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "book_hit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> METAL_BOOK_HIT = SOUND_EVENTS.register("metal_book_hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "metal_book_hit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOX_OPEN = SOUND_EVENTS.register("box_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "box_open")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CREEP_PRIMED = SOUND_EVENTS.register("creep_primed", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "creep_primed")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GOBLIN_FERAL_PRIMED = SOUND_EVENTS.register("goblin_feral_primed", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "goblin_feral_primed")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GAIA_SHOOT = SOUND_EVENTS.register("gaia_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "gaia_shoot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ANT_HILL_DEATH = SOUND_EVENTS.register("ant_hill_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "ant_hill_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENDER_EYE_TELEPORT = SOUND_EVENTS.register("ender_eye_teleport", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "ender_eye_teleport")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENDER_EYE_SCREAM = SOUND_EVENTS.register("ender_eye_scream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "ender_eye_scream")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENDER_DRAGON_GIRL_TELEPORT = SOUND_EVENTS.register("ender_dragon_girl_teleport", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "ender_dragon_girl_teleport")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENDER_DRAGON_GIRL_SCREAM = SOUND_EVENTS.register("ender_dragon_girl_scream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "ender_dragon_girl_scream")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BEHENDER_TELEPORT = SOUND_EVENTS.register("behender_teleport", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "behender_teleport")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BEHENDER_SCREAM = SOUND_EVENTS.register("behender_scream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "behender_scream")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOMB_THROW = SOUND_EVENTS.register("bomb_throw", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "bomb_throw")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MANDRAGORA_SCREAM = SOUND_EVENTS.register("mandragora_scream", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(GrimoireOfGaia.MOD_ID, "mandragora_scream")));

}
