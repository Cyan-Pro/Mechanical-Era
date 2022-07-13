package MechanicalEra.content;

import mindustry.ctype.ContentList;
import mindustry.world.Block;

public class MechanicalEraBlocks implements ContentList {
    public static Block
    bb;
    @Override
    public void load() {
        bb = new Block("bb");
    }
}
