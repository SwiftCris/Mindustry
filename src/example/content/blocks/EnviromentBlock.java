package example.content.blocks;

import example.content.RMItems;
import mindustry.world.blocks.environment.OreBlock;

public class EnviromentBlock {
  public static OreBlock uraniumOre;

  public static void load() {
    uraniumOre = new OreBlock("uranium-ore") {
      {
        localizedName = "Uranium Ore";

        oreDefault = true;
        oreThreshold = 0.95f;
        oreScale = 20f;
        itemDrop = RMItems.rawUranium;
        mapColor.set(itemDrop.color);
        useColor = true;

      }
    };
  }
}
