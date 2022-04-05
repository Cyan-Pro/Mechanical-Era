package MechanicalEra.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Liquid;

public class MechanicalEraLiquids implements ContentList {
    public static Liquid
    liquid_ethylene,taintedWater;

    @Override
    public void load() {

        liquid_ethylene = new Liquid("liquid_ethylene", Color.valueOf("#ffefd5")){{
            heatCapacity = 0.6f;
            temperature = 0.3f;
            flammability = 0.4f;
            lightColor = Color.valueOf("#ffefd5");
            barColor = Color.valueOf("#ffefd5");
        }};
        taintedWater = new Liquid("tainted_water", Color.valueOf("#")){{
        }};
    }
}
