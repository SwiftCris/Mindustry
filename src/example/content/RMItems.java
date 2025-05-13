package example.content;

import mindustry.type.Item;

public class RMItems {
  public static Item platinum;

  public static void load() {
    platinum = new Item("platinum") {
      {
        hardness = 1;
        radioactivity = 0.0001f;
        charge = 0;

      }
    };

  }
}
