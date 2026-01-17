package example.content.blocks;

import javax.swing.DropMode;

import example.content.RMBlocks;
import example.content.RMItems;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.entities.Effect;
import mindustry.game.Team;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.blocks.production.Drill;

public class ProductionBlock {
  public static Drill platinumExtractor;
  public static Drill uraniumExtractor;

  public static Block leaf;

  public static void load() {
    uraniumExtractor = new Drill("uranium-extractor") {
      {
        localizedName = "Uranium Extracter";
        description = "Extraxts Uranium";
        health = 100;
        drillTime = 100f;
        drillEffect = Fx.smoke;
        drillEffectChance = 0.5f;
        drillEffectRnd = 2;
        buildCostMultiplier = 1.0f;
        category = Category.production;
        tier = 4;
        size = 1;

        // consumesLiquid();
        requirements(Category.production,
            ItemStack.with(
                Items.thorium, 80

            ));
        consumeLiquid(Liquids.water, 5f);
        consumePower(5f);

      }
    };

    /*
     * platinumExtractor = new Drill("platinum-extractor") {
     * {
     * localizedName = "Platinum Extractor";
     * description = "Extracts Platinum";
     * health = 100;
     * drillTime = 30f;
     * drillEffect = Fx.fuelburn;
     * drillEffectRnd = 2;
     * drillEffectChance = 0.1f;
     * buildCostMultiplier = 1.0f;
     * 
     * category = Category.production;
     * tier = 1;
     * // canPlaceOn(, Team.all, 0);
     * 
     * @Override
     * public boolean canMine(Tile tile) {
     * return tile != null && tile.drop() ==
     * }
     * 
     * size = 1;
     * consumesPower = true;
     * requirements(Category.production,
     * new ItemStack[] { new ItemStack(Items.titanium, 5), new
     * ItemStack(Items.copper, 10)
     * });
     * 
     * }
     * };
     */
    // DropMode = DropMode.INSERT_COLS;
    /*
     * Drill = new Drill(){{
     * description
     * }}
     */
  }

  /*
   * public static void load() {
   * leaf = new Block("leaf-block") {
   * {
   * localizedName = "Leaf Block";
   * variants = 1;
   * scaledHealth = 20;
   * health = -1;
   * category = Category.crafting;
   * description = "A leaf block.";
   * placeablePlayer = true;
   * 
   * 
   * // Category. foo = new ();
   * 
   * }
   * };
   * 
   * }
   * // Block("leaf-block");
   */
}
