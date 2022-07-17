package MechanicalEra.content;

import arc.graphics.Color;
import mindustry.type.Liquid;

public class MechanicalEraLiquids {
    public static Liquid
    lubeOil;

public MechanicalEraLiquids() {

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
