package example.content;

import java.security.Guard;

import arc.Core;
import arc.graphics.Texture;
import arc.graphics.g2d.TextureRegion;
import arc.struct.Seq;
import example.content.blocks.ProductionBlock;
import example.content.blocks.RMEnviroment;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.ctype.ContentType;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.Liquid;
import mindustry.ui.dialogs.GameOverDialog;
import mindustry.world.Tile;
import mindustry.world.Tiles;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.production.Drill;

public class RMBlocks {
  public static Drill skibidiDrill;
  public static Conveyor customConveyor;
  public static OreBlock platinum;

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
        size = 1;
        category = Category.distribution;

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
    skibidiDrill = new Drill("skibidi-drill") {
      {
        localizedName = "Skibidi Drill";
        requirements(Category.production,
            new ItemStack[] {
                new ItemStack(Items.titanium, 10),
                new ItemStack(Items.copper, 35),
                new ItemStack(Items.lead, 25) });
        // consumesLiquid(Liquids.water);
        consumePower(10f);
        consumeLiquid(Liquids.water, 0.05f).boost();

        size = 3;

        consumesPower = true;
        category = Category.production;
        health = 100;
        tier = 3;
        drillTime = 1f;
        drillEffect = Fx.explosion;
        drillEffectChance = 0.1f;
        drillEffectRnd = 2f;
        description = "General Caporal Commander of zimbabwe";
        hasLiquids = true;
        liquidCapacity = 1000f;

      }

    };
    platinum = new OreBlock("platinum-ore") {
      {
        size = 1;
        oreScale = 10f;
        playerUnmineable = true;
        oreDefault = true;
      }
    };
    ProductionBlock.load();
    RMEnviroment.load();

  };

}
