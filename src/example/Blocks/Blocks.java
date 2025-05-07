package example.Blocks;

import java.security.Guard;

import arc.Core;
import arc.graphics.Texture;
import arc.graphics.g2d.TextureRegion;
import arc.struct.Seq;
import mindustry.content.Items;

import mindustry.ctype.ContentType;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.ui.dialogs.GameOverDialog;
import mindustry.world.blocks.distribution.Conveyor;

public class Blocks {

  public static Conveyor customConveyor;

  public static void load() {
    customConveyor = new Conveyor("custom-conveyor") {
      {
        localizedName = "Fast Conveyor";

        requirements(Category.distribution,
            new ItemStack[] {
                new ItemStack(Items.titanium, 5),
                new ItemStack(Items.lead, 10) });

        health = 10;
        speed = 99999f;
        displayedSpeed = speed * 100;
        // f name = "Fast Conveyor";
        //
        // localized
        description = "A fast conveyor";

        buildCostMultiplier = 1.0f;

        // e5ditorIcon = new TextureRegion(Core.atlas.find("resources/conveyor-belt"));

        /*
         * icons = new Texture[]{
         * 
         * Core.atlas.find("resources/conveyor-belt.png");
         * 
         * }
         */

      }

    };
  }

}
