package example;

import arc.*;
import arc.flabel.effects.WaveEffect;
import arc.scene.event.EventListener;
import arc.util.*;
import example.content.RMBlocks;
import example.content.RMItems;
import mindustry.*;
import mindustry.content.*;
import mindustry.core.NetServer.ChatFormatter;
import mindustry.game.EventType;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.world.Block;

public class ExampleJavaMod extends Mod {

  public ExampleJavaMod() {
    Log.info("Loaded ExampleJavaMod constructor.");
    Events.on(PlayerChatEvent.class, e -> {
      Player player = e.player;
      player.sendMessage(e.message);
      /*
       * BaseDialog dialog = new BaseDialog("Message");
       * dialog.cont.add(e.message);
       * dialog.cont.button("Dismiss", dialog::hide).size(100f, 50f);
       */
    });
  }

  //
  //
  //
  //

  // Events.on(ClientLoadEvent.class, e -> {
  // show dialog upon startup
  // Time.runTask(10f, () -> {
  // BaseDialog dialog = new BaseDialog("frog");
  // dialog.cont.add("behold").row();
  // mod sprites are prefixed with the mod name (this mod is called
  // 'example-java-mod' in its config)
  // dialog.cont.image(Core.atlas.find("frog")).pad(20f).row();
  // dialog.cont.button("I see", dialog::hide).size(100f, 50f);

  /*
   * dialog.show();
   * 
   * });
   */

  /*
   * Events.on(BlockBuildEndEvent.class, e -> {
   * Time.runTask(10f, () -> {
   * 
   * BaseDialog dialog = new BaseDialog("Block Placed");
   * dialog.cont.add("You have placed a block").row();
   * 
   * dialog.cont.button("Dissmiss.", dialog::hide).size(100f, 50f);
   * dialog.show();
   * 
   * });
   * });
   * // registerClientComman/CommandHan/r handler);
   * 
   * };
   */

  // Events

  // Show a popup when you place a block

  // Events.on(BlockBuild)

  @Override
  public void loadContent() {

    Log.info("Loading some example content.");
    RMItems.load();
    RMBlocks.load();
    // Blocks.load();

  }

}
/*
 * 
 * public class ExampleJavaMod extends Mod{
 * 
 * public ExampleJavaMod(){
 * Log.info("Loaded ExampleJavaMod constructor.");
 * 
 * //listen for game load event
 * Events.on(ClientLoadEvent.class, e -> {
 * //show dialog upon startup
 * Time.runTask(10f, () -> {
 * BaseDialog dialog = new BaseDialog("frog");
 * dialog.cont.add("behold").row();
 * //mod sprites are prefixed with the mod name (this mod is called
 * 'example-java-mod' in its config)
 * dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
 * dialog.cont.button("I see", dialog::hide).size(100f, 50f);
 * dialog.show();
 * });
 * });
 * }
 * 
 * @Override
 * public void loadContent(){
 * Log.info("Loading some example content.");
 */

/* >>>>>>> */
