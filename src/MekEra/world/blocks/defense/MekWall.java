package MekEra.world.blocks.defense;

import MekEra.world.meta.Base;
import mindustry.world.blocks.defense.Wall;

public class MekWall extends Wall {

    public Base<MekWallBuild> kit;

    public MekWall(String name) {
        super(name);
        update = true;
    }
    public class MekWallBuild extends WallBuild {

        @Override
        public void updateTile() {
            if (kit != null) {
                kit.onUpdate(this);
            }
        }
    }

}
