package MechanicalEra;

import MechanicalEra.content.MechanicalEraBlocks;
import MechanicalEra.content.MechanicalEraItems;
import MechanicalEra.content.MechanicalEraLiquids;
import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.ctype.ContentList;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

public class MechanicalEra extends Mod{
    public static MechanicalEraItems modItems;
    public static MechanicalEraLiquids modLiquids;
    public static MechanicalEraBlocks modBlocks;
    public static final ContentList[] modContents = {
            modItems = new MechanicalEraItems(),
            modLiquids = new MechanicalEraLiquids(),
            modBlocks = new MechanicalEraBlocks(),
    };
    public MechanicalEra(){
        Log.info("Loaded MechanicalEra constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("别玩了");
                dialog.cont.add("哥们你二臂啊一个劲玩游戏").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("别玩了")).pad(20f).row();
                dialog.cont.button("好的先生", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some MechanicalEra content.");
        for (ContentList content : modContents) {
            content.load();
        }
    }

}
