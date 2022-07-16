package MechanicalEra.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Liquid;

public class MechanicalEraLiquids implements ContentList {
    public static Liquid
    lubeOil;

    @Override
    public void load() {

        lubeOil = new Liquid("lube-oil", Color.valueOf("#ffefd5")){{
            heatCapacity = 1.1f;
            temperature = 0.2f;
            flammability = 0.9f;
            lightColor = Color.valueOf("#ffefd5");
            barColor = Color.valueOf("#ffefd5");
            viscosity = 0.5f;
        }};
    }
}
