package example.content;

import mindustry.type.Item;

public class RMItems {
  public static Item platinum;
  public static Item rawUranium;

  public static void load() {
    platinum = new Item("platinum") {
      {
        hardness = 1;
        radioactivity = 0.0001f;
        charge = 0;

      }
    };

    rawUranium = new Item("raw-uranium") {
      {
        hardness = 1;
        radioactivity = 0f;
        charge = 0;
      }
    };

  }
}
