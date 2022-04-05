package MechanicalEra.content;

import MechanicalEra.world.blocks.DrawLiquidProcessingPlant;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.BuildVisibility;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.with;

public class MechanicalEraBlocks implements ContentList {
    public static Block
    //Walls
    plasticWall,plasticWall_Large,
    //Production
    PetroleumCrackingPlant,EthylenePolymerizer,SupercriticalPhaseShifter,PurificationFactory;
    @Override
    public void load() {
        plasticWall = new Wall("plastic_wall_small"){{
           requirements(Category.defense, BuildVisibility.shown, ItemStack.with(MechanicalEraItems.plastic, 10 , Items.metaglass, 10));
           health = 100;
           size = 1;
           buildCostMultiplier = 1f;
        }};
        plasticWall_Large = new Wall("plastic_wall_large"){{
            requirements(Category.defense, BuildVisibility.shown, ItemStack.with(MechanicalEraItems.plastic, 40, Items.metaglass, 35, Items.graphite, 30));
            health = 400;
            size = 2;
            buildCostMultiplier = 1f;
        }};
        PetroleumCrackingPlant = new AttributeCrafter("petroleum_cracking_plant"){{
            requirements(Category.crafting, with(Items.copper, 150, Items.lead, 170, Items.silicon, 185, MechanicalEraItems.aluminium, 140,Items.plastanium, 80));
            outputLiquid = new LiquidStack(MechanicalEraLiquids.liquid_ethylene, 9f / 60f);
            craftTime = 100;
            size = 3;
            hasLiquids = true;
            hasPower = true;

            craftEffect = Fx.none;
            envRequired |= Env.groundOil;
            attribute = Attribute.oil;

            legacyReadWarmup = true;
            drawer = new DrawLiquidProcessingPlant();
            maxBoost = 2f;

            consumes.power(2f);
            consumes.liquid(Liquids.oil, 18f / 60f);
        }};
        EthylenePolymerizer = new GenericCrafter("ethylene_polymerizer"){{
            requirements(Category.crafting, with(Items.copper, 40, Items.lead, 50, Items.metaglass, 20, Items.silicon, 10, MechanicalEraItems.aluminium, 20));
            outputItem = new ItemStack(MechanicalEraItems.plastic, 2);
            craftTime = 100;
            size = 2;
            hasLiquids = true;
            hasPower = true;
            hasItems = true;

            craftEffect =Fx.cloudsmoke;
            consumes.power(3f);
            consumes.liquid(MechanicalEraLiquids.liquid_ethylene, 5f / 60f);
        }};
        PurificationFactory = new GenericCrafter("purification_factory"){{
            requirements(Category.crafting, with(Items.copper, 340, Items.titanium, 230,Items.silicon, 185, Items.plastanium, 190, Items.metaglass, 170, MechanicalEraItems.plastic, 210));
            outputLiquid = new LiquidStack(Liquids.water, 10f/ 60f);

        }};
    }
}
