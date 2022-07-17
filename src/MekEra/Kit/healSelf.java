package MekEra.Kit;

import MekEra.world.blocks.defense.MekWall;

public class healSelf extends KitBase<MekWall.MekWallBuild>{
    @Override
    public void onUpdate(MekWall.MekWallBuild b) {
        float damage = 0f;
        b.handleDamage(damage);
    }
}
