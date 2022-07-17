package MechanicalEra.content;

import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.blocks.production.Drill;

public class MechanicalEraBlocks {
    public static Block
    //crafting
    greenhouse,blastFurnace,humidifier,compressionEngine,sieve,filterTower,differentialCentrifuge,
    plateCuttingMachine,
    //defense
    plasticWall,plasticWallLarge,iceWall,iceWallLarge,sandWall,sandWallLarge,steelFrame,
    //production
    surfaceExtractor;
    public MechanicalEraBlocks() {

    }
    public static void load() {
        //region defense
        int MechHealthMultiplier = 6;

        plasticWall = new Wall("plastic-wall"){{
            requirements(Category.defense, ItemStack.with(MechanicalEraItems.plastic, 6));
            health = 90 * MechHealthMultiplier;
        }};
        plasticWallLarge = new Wall("plastic-wall-large"){{
            requirements(Category.defense, ItemStack.mult(plasticWall.requirements, 4));
            health = 90 * 4 * MechHealthMultiplier;
            size = 2;
        }};
        iceWall = new Wall("ice-wall"){{
            requirements(Category.defense, ItemStack.with(MechanicalEraItems.ice, 6));
            health = 50 * MechHealthMultiplier;
        }};
        iceWallLarge = new Wall("ice-wall-large"){{
            requirements(Category.defense, ItemStack.mult(iceWall.requirements, 4));
            health = 50 * 4 * MechHealthMultiplier;
            size = 2;
        }};
        sandWall = new Wall("sand-wall"){{
            requirements(Category.defense, ItemStack.with(Items.sand, 6));
            health = 70 * MechHealthMultiplier;
        }};
        sandWallLarge = new Wall("sand-wall-large"){{
            requirements(Category.defense, ItemStack.mult(sandWall.requirements, 4));
            health = 70 * 4 * MechHealthMultiplier;
            size = 2;
        }};
        steelFrame = new Wall("steel-frame"){{
            requirements(Category.defense, ItemStack.with(MechanicalEraItems.highCarbonSteel, 6,MechanicalEraItems.strongAdhesive, 4));
            health = 200 * MechHealthMultiplier * 3;
            size = 2;
        }};

        //endregion defense
        //region crafting

        greenhouse = new AttributeCrafter("greenhouse"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 30, Items.metaglass, 50,MechanicalEraItems.soil, 20));
            outputItem = new ItemStack(MechanicalEraItems.wood, 4);
            craftTime = 120f;
            size = 2;
            hasLiquids = true;
            itemCapacity = 40;
            boostScale = 0.1f;
            ambientSound = Sounds.respawn;
            ambientSoundVolume = 0.005f;

            consumeItems(ItemStack.with(MechanicalEraItems.seeds, 6));
            consumeLiquid(Liquids.water, 0.1f);
        }};
        //TODO
        blastFurnace = new AttributeCrafter("blast-furnace"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};

        //endregion crafting
        //region production

        surfaceExtractor = new Drill("surface-extractor"){{
            requirements(Category.production, ItemStack.with(Items.copper, 30,Items.lead, 20,Items.graphite, 25));
            tier = 2;
            drillTime = 450;
            size = 2;

            consumeLiquid(MechanicalEraLiquids.lubeOil, 0.05f).boost();
            consumeLiquid(Liquids.water, 0.05f).boost();
        }};
        //endregion production
    }
}
