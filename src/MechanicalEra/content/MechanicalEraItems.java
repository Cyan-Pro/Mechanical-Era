package MechanicalEra.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class MechanicalEraItems implements ContentList {
    public static Item
    plastic,bamboo_chips,ice,aluminium_extruded_sections,high_carbon_steel,spring_steel,concrete,sawdust;
    @Override
    public void load() {
        plastic = new Item("plastic", Color.valueOf("#7F7D7F")){{
            cost = 0.6f;
            flammability = 0.15f;
        }};
        bamboo_chips = new Item("bamboo", Color.valueOf("#7F7D7F")){{
            cost = 1.2f;
            flammability = 0.1f;
        }};
        ice = new Item("ice", Color.valueOf("#7F7D7F")){{
            cost = 1;
        }};
        aluminium_extruded_sections = new Item("aluminium_extruded_sections", Color.valueOf("#7F7D7F")){{
            cost = 0.9f;
        }};
        high_carbon_steel = new Item("high_carbon_steel", Color.valueOf("#7F7D7F")){{
            cost = 1.1f;
        }};
        spring_steel = new Item("spring_steel", Color.valueOf("#7F7D7F")){{
            cost = 1;
        }};
        concrete = new Item("concrete", Color.valueOf("#7F7D7F")){{
           cost = 0.9f;
        }};
        sawdust = new Item("sawdust", Color.valueOf("#7F7D7F")){{
            cost = 1.2f;
            flammability = 0.2f;
        }};

    }
}
