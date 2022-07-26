package MekEra.content;

import MekEra.world.blocks.defense.MekWall;
import MekEra.world.meta.SharingHealth;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.production.*;

public class MekEraBlocks {
    public static Block
    //crafting
    greenhouse,blastFurnace,humidifier,compressionEngine,sieve,filterTower,differentialCentrifuge,
    plateCuttingMachine,
    //defense
    plasticWall,plasticWallLarge,iceWall,iceWallLarge,sandWall,sandWallLarge,steelFrame,
    //production
    surfaceExtractor;

    public static SharingHealth SharingHealth = new SharingHealth();

    public MekEraBlocks() {

    }
    public static void load() {
        //region defense
        int MechHealthMultiplier = 6;

        plasticWall = new MekWall("plastic-wall"){{
            requirements(Category.defense, ItemStack.with(MekEraItems.plastic, 6));
            health = 90 * MechHealthMultiplier;
            update = true;
            kit = SharingHealth;
        }};
        plasticWallLarge = new MekWall("plastic-wall-large"){{
            requirements(Category.defense, ItemStack.mult(plasticWall.requirements, 4));
            health = 90 * 4 * MechHealthMultiplier;
            size = 2;
            kit = SharingHealth;
        }};
        iceWall = new Wall("ice-wall"){{
            requirements(Category.defense, ItemStack.with(MekEraItems.ice, 6));
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
            requirements(Category.defense, ItemStack.with(MekEraItems.highCarbonSteel, 6,Items.titanium, 4));
            health = 200 * MechHealthMultiplier * 3;
            size = 2;
        }};

        //endregion defense
        //region crafting

        greenhouse = new AttributeCrafter("greenhouse"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 30,Items.titanium, 20, Items.metaglass, 50, MekEraItems.soil, 20));
            outputItem = new ItemStack(MekEraItems.wood, 4);
            craftTime = 120f;
            size = 2;
            hasLiquids = true;
            itemCapacity = 40;
            boostScale = 0.1f;
            ambientSound = Sounds.respawn;
            ambientSoundVolume = 0.005f;

            consumeLiquid(Liquids.water, 0.1f);
        }};
        //TODO
        blastFurnace = new AttributeCrafter("blast-furnace"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};
        humidifier = new GenericCrafter("humidifier"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 30,Items.lead, 40,Items.metaglass, 20));
            outputItem = new ItemStack(MekEraItems.soil, 3);
            craftTime = 90f;
            size = 2;
            hasLiquids = true;
            itemCapacity = 20;
            ambientSound = Sounds.hum;

            consumeLiquid(Liquids.water, 0.05f);
            consumeItems(ItemStack.with(Items.sand, 3));
        }};
        //TODO
        compressionEngine = new GenericCrafter("compression-engine"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};
        sieve = new GenericCrafter("sieve"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};
        filterTower = new GenericCrafter("filter-tower"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};
        differentialCentrifuge = new GenericCrafter("differential-centrifuge"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};
        plateCuttingMachine = new GenericCrafter("plate-cutting-machine"){{
            requirements(Category.crafting, ItemStack.with(Items.copper, 1));
        }};

        //endregion crafting
        //region production

        surfaceExtractor = new Drill("surface-extractor"){{
            requirements(Category.production, ItemStack.with(Items.copper, 30,Items.lead, 20,Items.graphite, 25));
            tier = 2;
            drillTime = 450;
            size = 2;

            consumeLiquid(MekEraLiquids.lubeOil, 0.05f).boost();
            consumeLiquid(Liquids.water, 0.05f).boost();
        }};
        //endregion production
    }
}
