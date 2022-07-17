package MechanicalEra.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class MechanicalEraItems {
    public static Item
    plastic,wood,ice,aluminiumExtrudedSections,highCarbonSteel,springSteel,concrete,sawdust,soil,sporeCube,seeds,
    strongAdhesive,impurity;
    public MechanicalEraItems() {

    }
    public static void load() {
        plastic = new Item("plastic", Color.valueOf("#7F7D7F")){{
            cost = 0.6f;
            flammability = 0.65f;
        }};
        wood = new Item("wood", Color.valueOf("#7F7D7F")){{
            cost = 1.2f;
            flammability = 1f;
        }};
        ice = new Item("ice", Color.valueOf("#7F7D7F")){{
            hardness = 1;
            cost = 1;
        }};
        aluminiumExtrudedSections = new Item("aluminium_extruded_sections", Color.valueOf("#7F7D7F")){{
            cost = 0.9f;
        }};
        highCarbonSteel = new Item("high_carbon_steel", Color.valueOf("#7F7D7F")){{
            cost = 1.1f;
        }};
        springSteel = new Item("spring_steel", Color.valueOf("#7F7D7F")){{
            cost = 1;
        }};
        concrete = new Item("concrete", Color.valueOf("#7F7D7F")){{
           cost = 0.9f;
        }};
        sawdust = new Item("sawdust", Color.valueOf("#7F7D7F")){{
            cost = 1.2f;
            flammability = 1.1f;
        }};
        soil = new Item("soil", Color.valueOf("#7F7D7F")){{
            cost = 1;
        }};
        sporeCube = new Item("spore-cube", Color.valueOf("#7F7D7F")){{
            cost = 1;
            flammability = 1f;
        }};
        seeds = new Item("seeds", Color.valueOf("#7F7D7F")){{
            cost = 1;
        }};
        strongAdhesive = new Item("strong-adhesive"){{
            cost = 1;
            flammability = 0.7f;
        }};
        impurity = new Item("impurity", Color.valueOf("#7F7D7F")){{
            cost = 1.4f;
        }};
    }
}
