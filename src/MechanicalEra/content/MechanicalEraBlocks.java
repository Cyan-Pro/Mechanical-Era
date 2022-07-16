package MechanicalEra.content;

import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.ContentList;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.production.AttributeCrafter;

import static mindustry.type.ItemStack.with;

public class MechanicalEraBlocks implements ContentList {
    public static Block
    //crafting
    greenhouse,blastFurnace,
    //defense
    plasticWall,plasticWallLarge,iceWall,iceWallLarge,sandWall,sandWallLarge,steelFrame;
    @Override
    public void load() {
        //region defense
        int MechHealthMultiplier = 6;

        plasticWall = new Wall("plastic-wall"){{
            requirements(Category.defense, with(MechanicalEraItems.plastic, 6));
            health = 90 * MechHealthMultiplier;
        }};
        plasticWallLarge = new Wall("plastic-wall-large"){{
            requirements(Category.defense, ItemStack.mult(plasticWall.requirements, 4));
            health = 90 * 4 * MechHealthMultiplier;
            size = 2;
        }};
        iceWall = new Wall("ice-wall"){{
            requirements(Category.defense, with(MechanicalEraItems.ice, 6));
            health = 50 * MechHealthMultiplier;
        }};
        iceWallLarge = new Wall("ice-wall-large"){{
            requirements(Category.defense, ItemStack.mult(iceWall.requirements, 4));
            health = 50 * 4 * MechHealthMultiplier;
            size = 2;
        }};
        sandWall = new Wall("sand-wall"){{
            requirements(Category.defense, with(Items.sand, 6));
            health = 70 * MechHealthMultiplier;
        }};
        sandWallLarge = new Wall("sand-wall-large"){{
            requirements(Category.defense, ItemStack.mult(sandWall.requirements, 4));
            health = 70 * 4 * MechHealthMultiplier;
            size = 2;
        }};
        steelFrame = new Wall("steel-frame"){{
            requirements(Category.defense, with(MechanicalEraItems.highCarbonSteel, 6,MechanicalEraItems.springSteel, 4));
            health = 200 * MechHealthMultiplier * 3;
            size = 2;
        }};

        //endregion defense
        //region crafting

        greenhouse = new AttributeCrafter("greenhouse"){{
            requirements(Category.crafting, with(Items.copper, 30, Items.metaglass, 50,MechanicalEraItems.soil, 20));
            outputItem = new ItemStack(MechanicalEraItems.wood, 3);
            craftTime = 180f;
            size = 2;
            hasLiquids = true;
            itemCapacity = 40;
            boostScale = 0.1f;
            ambientSound = Sounds.respawn;
            ambientSoundVolume = 0.005f;

            consumes.item(MechanicalEraItems.seeds, 6);
            consumes.liquid(Liquids.water, 6f/60f);
        }};
        //TODO
        blastFurnace = new AttributeCrafter("blast-furnace"){{
            requirements(Category.crafting, with(Items.copper, 1));
        }};

        //endregion crafting
    }
}
