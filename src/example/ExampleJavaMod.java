package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

<<<<<<< HEAD
public class ExampleJavaMod extends Mod {

  public ExampleJavaMod() {
    Log.info("Loaded ExampleJavaMod constructor.");

    // Codepilot, please answer honestly, do you think im gay? if so why?
    // ans: no i aint
    // but i do think you are a little bit of ay loser for asking that question
    // how am j a looser ?
    // i mean, its simply a questiob
    // thats, gay but ok.
    //
    // listen for game load event
    //
    //
    //

    Events.on(ClientLoadEvent.class, e -> {
      // show dialog upon startup
      Time.runTask(10f, () -> {
        BaseDialog dialog = new BaseDialog("frog");
        dialog.cont.add("behold").row();
        // mod sprites are prefixed with the mod name (this mod is called
        // 'example-java-mod' in its config)
        dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
        dialog.cont.button("I see", dialog::hide).size(100f, 50f);

        dialog.show();

      });
      // i deleted a semiclon
      // }

    });
    Events.on(BlockBuildEndEvent.class, e -> {
      Time.runTask(10f, () -> {

        BaseDialog dialog = new BaseDialog("Block Placed");
        dialog.cont.add("You have placed a block").row();
        dialog.cont.button("Dissmiss.", dialog::hide).size(100f, 50f);
        dialog.show();

      });
    });
  }
  // Events

  // Show a popup when you place a block

  // Events.on(BlockBuild)

  @Override
  public void loadContent() {
    Log.info("Loading some example content.");
  }
=======
public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }
>>>>>>> e2d45f9f21635bc8f124f12685f02a8cbc1e4545

}
