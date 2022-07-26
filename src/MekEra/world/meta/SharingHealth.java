package MekEra.world.meta;

import MekEra.world.blocks.defense.MekWall;
import mindustry.gen.Building;

public class SharingHealth extends Base<MekWall.MekWallBuild> {
    @Override
    public void onUpdate(MekWall.MekWallBuild b) {
        for (Building other : b.proximity) {
            // 如果other的享元方块 和 b的享元方块 不一样，则跳过
            if (other.block != b.block)
                continue;
            // 获得b的生命值
            float thisH = b.health;
            // 获取other的生命值
            float otherH = other.health;
            // 如果 b的生命值 大于 other的生命值 且
            // b的生命值 大于 1 —— 防止因为生命值传递而死
            // other的生命值 小于 其最大生命值
            if (thisH > otherH && thisH > 1 && otherH < other.maxHealth){
                // 传递生命值
                other.health += 1;
                b.health -= 1;
            }
        }
    }
}
