package MechanicalEra.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class MechanicalEraItems implements ContentList {
    /**塑料*/
    public static Item plastic,
    /**镁条*/
    magnesium,
    /**铝条*/
    aluminium,
    /**混钢*/
    mixed_steel,
    /**防弹玻璃*/
    bulletproof_glass,
    /**钚*/
    plutonium,
    /**力场框架*/
    force_field_frame,
    /**反物质*/
    anti_matter,
    /**绝对晶体*/
    sub_zero_crystal;

    @Override
    public void load() {
        plastic = new Item("plastic", Color.valueOf("#7F7D7F")){{
            cost = 0.6f;
        }};
        magnesium = new Item("magnesium", Color.valueOf("#bbbbbb")){{
            cost = 0.8f;
            flammability = 0.25f;
        }};
        aluminium = new Item("aluminium", Color.valueOf("#cdd3d3")){{
            cost = 0.7f;
        }};
        mixed_steel = new Item("mixed_steel", Color.valueOf("#581d55")){{
            cost = 1;
        }};
        bulletproof_glass = new Item("bulletproof_glass", Color.valueOf("#e1f4fa")){{
            cost = 0.9f;
        }};
        plutonium = new Item("plutonium", Color.valueOf("#ced185")){{
            cost = 1.1f;
            radioactivity = 1.6f;
        }};
        force_field_frame = new Item("force_field_frame", Color.valueOf("#4a454f")){{
            cost = 1;
        }};
        anti_matter = new Item("anti_matter", Color.valueOf("#4a1770")){{
            cost = 1.2f;
            radioactivity = 3.4f;
            explosiveness = 1.4f;
        }};
        sub_zero_crystal = new Item("sub_zero_crystal", Color.valueOf("#494dd2")){{
            cost = 0.9f;
        }};
    }
}
