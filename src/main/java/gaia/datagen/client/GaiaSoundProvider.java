package gaia.datagen.client;

import gaia.GrimoireOfGaia;
import gaia.datagen.client.helper.MobSoundHelper;
import gaia.registry.GaiaRegistry;
import gaia.registry.GaiaSounds;
import gaia.registry.helper.MobReg;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition.Sound;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

import java.util.List;

public class GaiaSoundProvider extends SoundDefinitionsProvider {

	public GaiaSoundProvider(PackOutput packOutput, ExistingFileHelper helper) {
		super(packOutput, GrimoireOfGaia.MOD_ID, helper);
	}

	@Override
	public void registerSounds() {
		this.add(GaiaSounds.BAG_OPEN, definition()
				.subtitle(modSubtitle(GaiaSounds.BAG_OPEN.getId()))
				.with(sound(modLoc("item/bag_open"))));

		this.add(GaiaSounds.BOOK_HIT, definition()
				.subtitle(modSubtitle(GaiaSounds.BOOK_HIT.getId()))
				.with(sound(modLoc("item/book_hit1")),
						sound(modLoc("item/book_hit2")),
						sound(modLoc("item/book_hit3")),
						sound(modLoc("item/book_hit4"))
				));

		this.add(GaiaSounds.METAL_BOOK_HIT, definition()
				.subtitle(modSubtitle(GaiaSounds.BOOK_HIT.getId()))
				.with(
						sound(ResourceLocation.parse("step/stone1")),
						sound(ResourceLocation.parse("step/stone2")),
						sound(ResourceLocation.parse("step/stone3")),
						sound(ResourceLocation.parse("step/stone4")),
						sound(ResourceLocation.parse("step/stone5")),
						sound(ResourceLocation.parse("step/stone6"))
				));

		this.add(GaiaSounds.BOX_OPEN, definition()
				.subtitle(modSubtitle(GaiaSounds.BOX_OPEN.getId()))
				.with(sound(modLoc("item/box_open1")),
						sound(modLoc("item/box_open2"))
				));

		this.add(GaiaSounds.CREEP_PRIMED, definition()
				.subtitle(modSubtitle(GaiaSounds.CREEP_PRIMED.getId()))
				.with(sound(ResourceLocation.parse("random/fuse"))));
		this.add(GaiaSounds.GOBLIN_FERAL_PRIMED, definition()
				.subtitle(modSubtitle(GaiaSounds.GOBLIN_FERAL_PRIMED.getId()))
				.with(sound(ResourceLocation.parse("random/fuse"))));
		this.add(GaiaSounds.GAIA_SHOOT, definition()
				.subtitle(modSubtitle(GaiaSounds.GAIA_SHOOT.getId()))
				.with(sound(ResourceLocation.parse("mob/ghast/fireball4"))));
		this.add(GaiaSounds.BOMB_THROW, definition()
				.subtitle(modSubtitle(GaiaSounds.BOMB_THROW.getId()))
				.with(sound(ResourceLocation.parse("mob/ghast/fireball4"))));
		this.add(GaiaSounds.MANDRAGORA_SCREAM, definition()
				.subtitle(modSubtitle(GaiaSounds.MANDRAGORA_SCREAM.getId()))
				.with(sound(modLoc("entity/mandragora/scream"))));
		this.add(GaiaSounds.ANT_HILL_DEATH, definition()
				.subtitle(modSubtitle(GaiaSounds.ANT_HILL_DEATH.getId()))
				.with(sound(modLoc("none"))));
		this.add(GaiaSounds.ENDER_EYE_SCREAM, definition()
				.subtitle(modSubtitle(GaiaSounds.ENDER_EYE_SCREAM.getId()))
				.with(
						sound(ResourceLocation.parse("mob/endermen/scream1")),
						sound(ResourceLocation.parse("mob/endermen/scream2")),
						sound(ResourceLocation.parse("mob/endermen/scream3")),
						sound(ResourceLocation.parse("mob/endermen/scream4"))
				));
		this.add(GaiaSounds.ENDER_EYE_TELEPORT, definition()
				.subtitle(modSubtitle(GaiaSounds.ENDER_EYE_TELEPORT.getId()))
				.with(
						sound(ResourceLocation.parse("mob/endermen/portal")),
						sound(ResourceLocation.parse("mob/endermen/portal2"))
				));
		this.add(GaiaSounds.ENDER_DRAGON_GIRL_SCREAM, definition()
				.subtitle(modSubtitle(GaiaSounds.ENDER_DRAGON_GIRL_SCREAM.getId()))
				.with(
						sound(ResourceLocation.parse("mob/endermen/scream1")),
						sound(ResourceLocation.parse("mob/endermen/scream2")),
						sound(ResourceLocation.parse("mob/endermen/scream3")),
						sound(ResourceLocation.parse("mob/endermen/scream4"))
				));
		this.add(GaiaSounds.ENDER_DRAGON_GIRL_TELEPORT, definition()
				.subtitle(modSubtitle(GaiaSounds.ENDER_DRAGON_GIRL_TELEPORT.getId()))
				.with(
						sound(ResourceLocation.parse("mob/endermen/portal")),
						sound(ResourceLocation.parse("mob/endermen/portal2"))
				));
		this.add(GaiaSounds.BEHENDER_SCREAM, definition()
				.subtitle(modSubtitle(GaiaSounds.BEHENDER_SCREAM.getId()))
				.with(
						sound(ResourceLocation.parse("mob/endermen/scream1")),
						sound(ResourceLocation.parse("mob/endermen/scream2")),
						sound(ResourceLocation.parse("mob/endermen/scream3")),
						sound(ResourceLocation.parse("mob/endermen/scream4"))
				));
		this.add(GaiaSounds.BEHENDER_TELEPORT, definition()
				.subtitle(modSubtitle(GaiaSounds.BEHENDER_TELEPORT.getId()))
				.with(
						sound(ResourceLocation.parse("mob/endermen/portal")),
						sound(ResourceLocation.parse("mob/endermen/portal2"))
				));

		this.generateMobSound();

		this.add(GaiaRegistry.COBBLE_GOLEM.getAttack(), definition()
				.subtitle(modSubtitle(GaiaRegistry.COBBLE_GOLEM.getAttack().getLocation()))
				.with(
						sound(ResourceLocation.parse("mob/irongolem/throw"))
				));
		this.add(GaiaRegistry.COBBLESTONE_GOLEM.getAttack(), definition()
				.subtitle(modSubtitle(GaiaRegistry.COBBLESTONE_GOLEM.getAttack().getLocation()))
				.with(
						sound(ResourceLocation.parse("mob/irongolem/throw"))
				));
	}

	public void generateMobSound() {
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ANT_WORKER).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ANT_SALVAGER)
				.withSay(sound(modLoc("entity/ant_salvager/say1")),
						sound(modLoc("entity/ant_salvager/say2")))
				.withHurt(sound(modLoc("entity/ant_salvager/hurt1")),
						sound(modLoc("entity/ant_salvager/hurt2")))
				.withDeath(sound(modLoc("entity/ant_salvager/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ANUBIS).withDefaults()
				.withSayMale(sound(modLoc("entity/anubis_male/say1")),
						sound(modLoc("entity/anubis_male/say2")),
						sound(modLoc("entity/anubis_male/say3")))
				.withHurtMale(sound(modLoc("entity/anubis_male/hurt1")),
						sound(modLoc("entity/anubis_male/hurt2")),
						sound(modLoc("entity/anubis_male/hurt3")))
				.withDeathMale(sound(modLoc("entity/anubis_male/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ARACHNE).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.BANSHEE).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.BEE).withDefaults()
				.withSay(sound(modLoc("entity/bee/say1")),
						sound(modLoc("entity/bee/say2")),
						sound(modLoc("entity/bee/say3")),
						sound(modLoc("entity/bee/say4")),
						sound(modLoc("entity/bee/say5")))
				.withHurt(sound(modLoc("entity/bee/hurt1")),
						sound(modLoc("entity/bee/hurt2")),
						sound(modLoc("entity/bee/hurt3")))
				.withDeath(sound(modLoc("entity/bee/death1")),
						sound(modLoc("entity/bee/death2"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.BEHENDER).withDefaults()
				.withSay(
						sound(ResourceLocation.parse("mob/endermen/idle1")),
						sound(ResourceLocation.parse("mob/endermen/idle2")),
						sound(ResourceLocation.parse("mob/endermen/idle3")),
						sound(ResourceLocation.parse("mob/endermen/idle4")),
						sound(ResourceLocation.parse("mob/endermen/idle5"))
				).withHurt(
						sound(ResourceLocation.parse("mob/endermen/hit1")),
						sound(ResourceLocation.parse("mob/endermen/hit2")),
						sound(ResourceLocation.parse("mob/endermen/hit3")),
						sound(ResourceLocation.parse("mob/endermen/hit4"))
				).withDeath(
						sound(ResourceLocation.parse("mob/endermen/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.BONE_KNIGHT)
				.withSay(
						sound(ResourceLocation.parse("mob/skeleton/say1")),
						sound(ResourceLocation.parse("mob/skeleton/say2")),
						sound(ResourceLocation.parse("mob/skeleton/say3"))
				)
				.withHurt(
						sound(ResourceLocation.parse("mob/skeleton/hurt1")),
						sound(ResourceLocation.parse("mob/skeleton/hurt2")),
						sound(ResourceLocation.parse("mob/skeleton/hurt3")),
						sound(ResourceLocation.parse("mob/skeleton/hurt4"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/skeleton/death"))
				).withStep(
						sound(ResourceLocation.parse("mob/skeleton/step1")),
						sound(ResourceLocation.parse("mob/skeleton/step2")),
						sound(ResourceLocation.parse("mob/skeleton/step3")),
						sound(ResourceLocation.parse("mob/skeleton/step4"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.CECAELIA).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.CENTAUR).withDefaults()
				.withSayMale(sound(modLoc("entity/centaur_male/say1")),
						sound(modLoc("entity/centaur_male/say2")),
						sound(modLoc("entity/centaur_male/say3")))
				.withHurtMale(sound(modLoc("entity/centaur_male/hurt1")),
						sound(modLoc("entity/centaur_male/hurt2")),
						sound(modLoc("entity/centaur_male/hurt3")))
				.withDeathMale(sound(modLoc("entity/centaur_male/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.CYCLOPS).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.CREEP)
				.withSay(
						sound(modLoc("none"))
				)
				.withHurt(
						sound(ResourceLocation.parse("mob/creeper/say1")),
						sound(ResourceLocation.parse("mob/creeper/say2")),
						sound(ResourceLocation.parse("mob/creeper/say3")),
						sound(ResourceLocation.parse("mob/creeper/say4"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/creeper/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.COBBLE_GOLEM)
				.withStep(
						sound(ResourceLocation.parse("mob/irongolem/walk1")),
						sound(ResourceLocation.parse("mob/irongolem/walk2")),
						sound(ResourceLocation.parse("mob/irongolem/walk3")),
						sound(ResourceLocation.parse("mob/irongolem/walk4"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/irongolem/death"))
				).build());

		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.COBBLESTONE_GOLEM)
				.withStep(
						sound(ResourceLocation.parse("mob/irongolem/walk1")),
						sound(ResourceLocation.parse("mob/irongolem/walk2")),
						sound(ResourceLocation.parse("mob/irongolem/walk3")),
						sound(ResourceLocation.parse("mob/irongolem/walk4"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/irongolem/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.DRYAD).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.DULLAHAN).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.DWARF).withDefaults()
				.withSay(
						sound(modLoc("entity/dwarf/say1")),
						sound(modLoc("entity/dwarf/say2"))
				).withHurt(
						sound(modLoc("entity/dwarf/hurt1")),
						sound(modLoc("entity/dwarf/hurt2"))
				).withDeath(
						sound(modLoc("entity/dwarf/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ENDER_EYE).withDefaults()
				.withSay(
						sound(ResourceLocation.parse("mob/endermen/idle1")),
						sound(ResourceLocation.parse("mob/endermen/idle2")),
						sound(ResourceLocation.parse("mob/endermen/idle3")),
						sound(ResourceLocation.parse("mob/endermen/idle4")),
						sound(ResourceLocation.parse("mob/endermen/idle5"))
				).withHurt(
						sound(ResourceLocation.parse("mob/endermen/hit1")),
						sound(ResourceLocation.parse("mob/endermen/hit2")),
						sound(ResourceLocation.parse("mob/endermen/hit3")),
						sound(ResourceLocation.parse("mob/endermen/hit4"))
				).withDeath(
						sound(ResourceLocation.parse("mob/endermen/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ENDER_DRAGON_GIRL).withDefaults()
				.withSay(
						sound(ResourceLocation.parse("mob/endermen/idle1")),
						sound(ResourceLocation.parse("mob/endermen/idle2")),
						sound(ResourceLocation.parse("mob/endermen/idle3")),
						sound(ResourceLocation.parse("mob/endermen/idle4")),
						sound(ResourceLocation.parse("mob/endermen/idle5"))
				).withHurt(
						sound(ResourceLocation.parse("mob/endermen/hit1")),
						sound(ResourceLocation.parse("mob/endermen/hit2")),
						sound(ResourceLocation.parse("mob/endermen/hit3")),
						sound(ResourceLocation.parse("mob/endermen/hit4"))
				).withDeath(
						sound(ResourceLocation.parse("mob/endermen/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.FLESH_LICH)
				.withSay(
						sound(ResourceLocation.parse("mob/zombie/say1")),
						sound(ResourceLocation.parse("mob/zombie/say2")),
						sound(ResourceLocation.parse("mob/zombie/say3"))
				)
				.withHurt(
						sound(ResourceLocation.parse("mob/zombie/hurt1")),
						sound(ResourceLocation.parse("mob/zombie/hurt2"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/zombie/death"))
				).withStep(
						sound(ResourceLocation.parse("mob/zombie/step1")),
						sound(ResourceLocation.parse("mob/zombie/step2")),
						sound(ResourceLocation.parse("mob/zombie/step3")),
						sound(ResourceLocation.parse("mob/zombie/step4")),
						sound(ResourceLocation.parse("mob/zombie/step5"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.GELATINOUS_SLIME).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.GOBLIN).withDefaults()
				.withSay(sound(modLoc("entity/goblin/say1")),
						sound(modLoc("entity/goblin/say2")))
				.withHurt(sound(modLoc("entity/goblin/hurt1")),
						sound(modLoc("entity/goblin/hurt2")))
				.withDeath(sound(modLoc("entity/goblin/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.GOBLIN_FERAL).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.GRYPHON).withDefaults()
				.withSay(sound(modLoc("entity/gryphon/say1")),
						sound(modLoc("entity/gryphon/say2")))
				.withHurt(sound(modLoc("entity/gryphon/hurt1")),
						sound(modLoc("entity/gryphon/hurt2")))
				.withDeath(sound(modLoc("entity/gryphon/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.HARPY).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.HUNTER).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.HORSE)
				.withSay(
						sound(ResourceLocation.parse("mob/horse/zombie/idle1")),
						sound(ResourceLocation.parse("mob/horse/zombie/idle2")),
						sound(ResourceLocation.parse("mob/horse/zombie/idle3"))
				)
				.withHurt(
						sound(ResourceLocation.parse("mob/horse/zombie/hit1")),
						sound(ResourceLocation.parse("mob/horse/zombie/hit2")),
						sound(ResourceLocation.parse("mob/horse/zombie/hit3")),
						sound(ResourceLocation.parse("mob/horse/zombie/hit4"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/horse/zombie/death"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.KOBOLD).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.MANDRAGORA).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.MATANGO).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.MERMAID).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.MINOTAUR).withDefaults()
				.withSay(sound(modLoc("entity/minotaur/say1")),
						sound(modLoc("entity/minotaur/say2")))
				.withHurt(sound(modLoc("entity/minotaur/hurt1")),
						sound(modLoc("entity/minotaur/hurt2")))
				.withStep(
						sound(ResourceLocation.parse("mob/irongolem/walk1")),
						sound(ResourceLocation.parse("mob/irongolem/walk2")),
						sound(ResourceLocation.parse("mob/irongolem/walk3")),
						sound(ResourceLocation.parse("mob/irongolem/walk4"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.MINOTAURUS).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.GRAVEMITE).withDefaults()
				.withSay(
						sound(ResourceLocation.parse("mob/silverfish/say1")),
						sound(ResourceLocation.parse("mob/silverfish/say2")),
						sound(ResourceLocation.parse("mob/silverfish/say3")),
						sound(ResourceLocation.parse("mob/silverfish/say4"))
				)
				.withHurt(
						sound(ResourceLocation.parse("mob/silverfish/hit1")),
						sound(ResourceLocation.parse("mob/silverfish/hit2")),
						sound(ResourceLocation.parse("mob/silverfish/hit3"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/silverfish/kill"))
				)
				.withStep(
						sound(ResourceLocation.parse("mob/silverfish/step1")),
						sound(ResourceLocation.parse("mob/silverfish/step2")),
						sound(ResourceLocation.parse("mob/silverfish/step3")),
						sound(ResourceLocation.parse("mob/silverfish/step4"))
				)
				.build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.MUMMY).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.NAGA).withDefaults()
				.withSay(sound(modLoc("entity/naga/say1")),
						sound(modLoc("entity/naga/say2")))
				.withHurt(sound(modLoc("entity/naga/hurt1")),
						sound(modLoc("entity/naga/hurt2")))
				.withDeath(sound(modLoc("entity/naga/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.NINE_TAILS).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ONI).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ORC).withDefaults()
				.withSay(sound(modLoc("entity/orc/say1")),
						sound(modLoc("entity/orc/say2")))
				.withHurt(sound(modLoc("entity/orc/hurt1")),
						sound(modLoc("entity/orc/hurt2")))
				.withDeath(sound(modLoc("entity/orc/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SATYRESS).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SHAMAN).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SHARKO).withDefaults()
				.withSay(sound(modLoc("entity/sharko/say1")),
						sound(modLoc("entity/sharko/say2")))
				.withHurt(sound(modLoc("entity/sharko/hurt1")),
						sound(modLoc("entity/sharko/hurt2")))
				.withDeath(sound(modLoc("entity/sharko/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SIREN).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SLUDGE_GIRL).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SPHINX).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SPORELING).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SPRIGGAN).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SUCCUBUS).withDefaults()
				.withSayMale(sound(modLoc("entity/succubus_male/say1")),
						sound(modLoc("entity/succubus_male/say2")),
						sound(modLoc("entity/succubus_male/say3")))
				.withHurtMale(sound(modLoc("entity/succubus_male/hurt1")),
						sound(modLoc("entity/succubus_male/hurt2")),
						sound(modLoc("entity/succubus_male/hurt3")))
				.withDeathMale(sound(modLoc("entity/succubus_male/death"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.TOAD).withDefaults()
				.withSay(sound(modLoc("entity/toad/say1"))).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.VALKYRIE).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.WERECAT).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.WITCH).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.WITHER_COW)
				.withSay(
						sound(ResourceLocation.parse("mob/cow/say1")),
						sound(ResourceLocation.parse("mob/cow/say2")),
						sound(ResourceLocation.parse("mob/cow/say3")),
						sound(ResourceLocation.parse("mob/cow/say4"))
				)
				.withHurt(
						sound(ResourceLocation.parse("mob/cow/hurt1")),
						sound(ResourceLocation.parse("mob/cow/hurt2")),
						sound(ResourceLocation.parse("mob/cow/hurt3"))
				)
				.withDeath(
						sound(ResourceLocation.parse("mob/cow/hurt1")),
						sound(ResourceLocation.parse("mob/cow/hurt2")),
						sound(ResourceLocation.parse("mob/cow/hurt3"))
				).build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.WIZARD_HARPY).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.YUKI_ONNA).withDefaults().build());

		//Merchant
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.TRADER).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.CREEPER_GIRL).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.ENDER_GIRL).withDefaults().build());
//		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.HOLSTAURUS).withDefaults().build());
		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.SLIME_GIRL).withDefaults().build());
//		this.setupMobSounds(new MobSoundHelper.Builder(GaiaRegistry.WERESHEEP).withDefaults().build());
	}

	public void setupMobSounds(MobSoundHelper helper) {
		MobReg<?> mobReg = helper.getMobReg();

		if (mobReg.getSay() != null) {
			List<Sound> sounds = helper.getSay().length > 0 ? List.of(helper.getSay()) : List.of(sound(modLoc("none")));
			this.add(mobReg.getSay(), definition()
					.subtitle(modSubtitle(mobReg.getSay().getLocation()))
					.with(sounds.toArray(new Sound[]{})));
		}

		if (mobReg.getHurt() != null) {
			List<Sound> sounds = helper.getHurt().length > 0 ? List.of(helper.getHurt()) : List.of(sound(modLoc("none")));
			this.add(mobReg.getHurt(), definition()
					.subtitle(modSubtitle(mobReg.getHurt().getLocation()))
					.with(sounds.toArray(new Sound[]{})));
		}

		if (mobReg.getDeath() != null) {
			List<Sound> sounds = helper.getDeath().length > 0 ? List.of(helper.getDeath()) : List.of(sound(modLoc("none")));
			this.add(mobReg.getDeath(), definition()
					.subtitle(modSubtitle(mobReg.getDeath().getLocation()))
					.with(sounds.toArray(new Sound[]{})));
		}

		if (mobReg.getStep() != null) {
			List<Sound> sounds = helper.getStep().length > 0 ? List.of(helper.getStep()) : List.of(sound(modLoc("none")));
			this.add(mobReg.getStep(), definition()
					.subtitle(modSubtitle(mobReg.getStep().getLocation()))
					.with(sounds.toArray(new Sound[]{})));
		}

		if (mobReg.hasGender()) {
			if (mobReg.getMaleSay() != null) {
				List<Sound> sounds = helper.getMaleSay().length > 0 ? List.of(helper.getMaleSay()) : List.of(sound(modLoc("none")));
				this.add(mobReg.getMaleSay(), definition()
						.subtitle(modSubtitle(mobReg.getMaleSay().getLocation()))
						.with(sounds.toArray(new Sound[]{})));
			}

			if (mobReg.getMaleHurt() != null) {
				List<Sound> sounds = helper.getMaleHurt().length > 0 ? List.of(helper.getMaleHurt()) : List.of(sound(modLoc("none")));
				this.add(mobReg.getMaleHurt(), definition()
						.subtitle(modSubtitle(mobReg.getMaleHurt().getLocation()))
						.with(sounds.toArray(new Sound[]{})));
			}

			if (mobReg.getMaleDeath() != null) {
				List<Sound> sounds = helper.getMaleDeath().length > 0 ? List.of(helper.getMaleDeath()) : List.of(sound(modLoc("none")));
				this.add(mobReg.getMaleDeath(), definition()
						.subtitle(modSubtitle(mobReg.getMaleDeath().getLocation()))
						.with(sounds.toArray(new Sound[]{})));
			}

			if (mobReg.getMaleStep() != null) {
				List<Sound> sounds = helper.getMaleStep().length > 0 ? List.of(helper.getMaleStep()) : List.of(sound(modLoc("none")));
				this.add(mobReg.getMaleStep(), definition()
						.subtitle(modSubtitle(mobReg.getMaleStep().getLocation()))
						.with(sounds.toArray(new Sound[]{})));
			}
		}
	}

	public String modSubtitle(ResourceLocation id) {
		return GrimoireOfGaia.MOD_ID + ".subtitle." + id.getPath();
	}

	public ResourceLocation modLoc(String name) {
		return ResourceLocation.fromNamespaceAndPath(GrimoireOfGaia.MOD_ID, name);
	}
}
