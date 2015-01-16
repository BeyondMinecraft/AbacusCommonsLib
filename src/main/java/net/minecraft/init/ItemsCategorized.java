package net.minecraft.init;
import net.minecraft.item.Item;


/**
 *
 * @author Gregory <gregory.cheyney@gmail.com>
 */
public class ItemsCategorized {
  public static final Item[] consumable; // consumable items
  public static final Item[] materials1 = new Item[] { // raw materials
    Items.blaze_rod, Items.bone, Items.clay_ball, Items.coal, Items.diamond, Items.emerald, Items.ender_pearl,
    Items.feather, Items.flint, Items.ghast_tear, Items.glowstone_dust, Items.gold_ingot, Items.gold_nugget,
    Items.gunpowder, Items.iron_ingot, Items.leather, Items.magma_cream, Items.nether_star, Items.nether_wart,
    Items.quartz, Items.redstone, Items.slime_ball, Items.string
  };
  public static final Item[] materials2; // raw materials
  public static final Item[] items4; // head items - knowledge objects
  public static final Item[] items5; // body items - tools and weapons
  public static final Item[] items6; // legs items - secondary to above
  public static final Item[] items7; // feet items -
  public static final Item[] items_; // feet items

  static {
    // Things that might be alternatives of other items, using metadata:
    // charcoal, prismarine shard, prismarine crystals, rabbit hide, rabbit's foot,
    consumable = new Item[] {
      Items.apple, Items.baked_potato, Items.beef, Items.bread, Items.cake, Items.carrot, Items.chicken,
      Items.cooked_beef, Items.cooked_chicken, Items.cooked_fished, Items.cooked_porkchop, Items.cookie, Items.egg,
      Items.fish, Items.golden_apple, Items.golden_carrot, Items.melon, Items.melon_seeds, Items.milk_bucket,
      Items.mushroom_stew, Items.poisonous_potato, Items.porkchop, Items.potato, Items.pumpkin_pie, Items.pumpkin_seeds,
      Items.speckled_melon, Items.sugar, Items.water_bucket
    };
    materials2 = new Item[] { // manufactured products
    };
    items4 = new Item[] { // head wear
      Items.book, Items.enchanted_book, Items.experience_bottle, Items.paper, Items.writable_book, Items.written_book
    };
    items5 = new Item[] { // body wear
      Items.diamond_axe, Items.diamond_hoe, Items.diamond_pickaxe, Items.diamond_shovel, Items.diamond_sword,
      Items.golden_axe, Items.golden_hoe, Items.golden_pickaxe, Items.golden_shovel, Items.golden_sword,
      Items.iron_axe, Items.iron_hoe, Items.iron_pickaxe, Items.iron_shovel, Items.iron_sword,
      Items.stone_axe, Items.stone_hoe, Items.stone_pickaxe, Items.stone_shovel, Items.stone_sword,
      Items.wooden_axe, Items.wooden_hoe, Items.wooden_pickaxe, Items.wooden_shovel, Items.wooden_sword
    };
    items6 = new Item[] {};
    items7 = new Item[] {};
    items_ = new Item[] {
      Items.arrow, Items.bed, Items.blaze_powder, Items.boat, Items.bowl, Items.brewing_stand, Items.brick,
      Items.bucket, Items.carrot_on_a_stick, Items.cauldron, Items.chest_minecart, Items.clock,
      Items.command_block_minecart, Items.comparator, Items.compass, Items.diamond_horse_armor, Items.dye,
      Items.ender_eye, Items.fermented_spider_eye, Items.filled_map, Items.fire_charge, Items.firework_charge,
      Items.fireworks, Items.fishing_rod, Items.flint_and_steel, Items.furnace_minecart, Items.glass_bottle,
      Items.golden_horse_armor, Items.hopper_minecart, Items.iron_door, Items.iron_horse_armor, Items.lava_bucket,
      Items.lead, Items.map, Items.minecart, Items.name_tag, Items.netherbrick, Items.potionitem,
      Items.record_11, Items.record_13, Items.record_blocks, Items.record_cat, Items.record_chirp, Items.record_far,
      Items.record_mall, Items.record_mellohi, Items.record_stal, Items.record_strad, Items.record_wait,
      Items.record_ward, Items.reeds, Items.repeater, Items.rotten_flesh, Items.saddle, Items.shears, Items.sign,
      Items.skull, Items.snowball, Items.spawn_egg, Items.spider_eye, Items.stick, Items.tnt_minecart, Items.wheat,
      Items.wheat_seeds, Items.wooden_door
    };
  }

  private ItemsCategorized() {
  }

  public static boolean isConsumable(Item item) {
    for(Item i : consumable) {
      if(i.equals(item)) {
        return true;
      }
    }
    return false;
  }
  public static boolean isDecorative(Item item) {
    return item.equals(Items.flower_pot)
        || item.equals(Items.item_frame)
        || item.equals(Items.painting)
        ;
  }
}
