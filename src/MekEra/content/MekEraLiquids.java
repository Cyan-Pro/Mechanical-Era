package MekEra.content;

import arc.graphics.Color;
import mindustry.type.Liquid;

public class MekEraLiquids {
    public static Liquid
    lubeOil;

public MekEraLiquids() {

}
    public static void load() {

        lubeOil = new Liquid("lube-oil", Color.valueOf("#ffefd5")){{
            heatCapacity = 1.1f;
            temperature = 0.2f;
            flammability = 0.9f;
            lightColor = Color.valueOf("#ffefd5");
            barColor = Color.valueOf("#ffefd5");
            viscosity = 0.3f;
        }};
    }
}
