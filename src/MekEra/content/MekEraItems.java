package MekEra.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class MekEraItems {
    public static Item
    plastic,wood,ice,aluminiumExtrudedSections,highCarbonSteel,soil;
    public MekEraItems() {

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
        soil = new Item("soil", Color.valueOf("#7F7D7F")){{
            cost = 1;
        }};
    }
}
