package MekEra.world.blocks.defense;

import MekEra.Kit.KitBase;
import mindustry.world.blocks.defense.Wall;

public class MekWall extends Wall {

    public KitBase<MekWallBuild> component;

    public MekWall(String name) {
        super(name);
        update = true;
    }
    public class MekWallBuild extends WallBuild {

        @Override
        public void updateTile() {
            if (component != null) {
                component.onUpdate(this);
            }
        }
    }

}
