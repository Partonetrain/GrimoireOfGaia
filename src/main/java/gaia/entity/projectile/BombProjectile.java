package gaia.entity.projectile;

import gaia.registry.GaiaRegistry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class BombProjectile extends ThrowableItemProjectile {
	public BombProjectile(EntityType<? extends BombProjectile> entityType, Level level) {
		super(entityType, level);
	}

	public BombProjectile(Level level, LivingEntity livingEntity) {
		super(GaiaRegistry.BOMB.get(), livingEntity, level);
	}

	public BombProjectile(Level level, double accelX, double accelY, double accelZ) {
		super(GaiaRegistry.BOMB.get(), accelX, accelY, accelZ, level);
	}

	@Override
	public Item getDefaultItem() {
		return GaiaRegistry.PROJECTILE_WEB.get();
	}

	public void handleEntityEvent(byte id) {
		if (id == 3) {
			for (int i = 0; i < 8; ++i) {
				this.level().addParticle(ParticleTypes.LARGE_SMOKE, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	@Override
	protected void onHitEntity(EntityHitResult hitResult) {
		Entity entity = hitResult.getEntity();
		if (entity != null) {
			if (getOwner() instanceof LivingEntity shooter) {
				entity.hurt(damageSources().magic(), (float) (shooter.getAttribute(Attributes.ATTACK_DAMAGE).getValue() / 2));
			}
			entity.hurt(damageSources().thrown(this, this.getOwner()), (float) 2);
		}
	}

	@Override
	protected void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		this.level().explode(this, this.getX(), this.getY(), this.getZ(), 1.5F, Level.ExplosionInteraction.NONE);
	}

	@Override
	protected void onHit(HitResult result) {
		super.onHit(result);
		if (!this.level().isClientSide) {
			this.level().broadcastEntityEvent(this, (byte) 3);
			this.discard();
		}
	}
}
