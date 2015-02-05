package net.minecraft.inventory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;


/**
 * A public utility class with fields and methods for managing the details of an equipment slot.
 * <p/>
 * Equipment, in this case, can mean the traditional armor (headgear, body armor, leggings, and boots), or can also mean
 * various tools and objects used to perform a task, such as a hoe to till ground.
 * @author Gregory
 * @see #slotType slotType
 * @see #parent parent
 * @see #entity entity
 */
public class SlotArmor extends Slot {
  /**
   * The parent class of this slot. The parent is a {@link Container} subclass instance.
   */
  public final ContainerPlayer parent;
  /**
   * The owning entity for this slot.
   */
  public final EntityTameable entity;
  /**
   * The equipment type that can be placed within this slot. Possible values are:
   * <pre>
   *    Id:  Equipment Type/Usage:
   *    ===  =====================
   *     0   head-armor: caps, helmets, etc.
   *     1   body-armor: chestplates, coats, robes, etc.
   *     2   legs-armor: leggings, pants
   *     3   foot-armor: boots
   *     4   knowledge items: books, certificates, paper, scrolls
   *     5   inventory items: backpacks, (ender)chests, etc.
   *     6   secondary tools: defensive/offensive gear, task tools
   *     7   mobility items: anything to ease movement or speed
   * </pre> Any other value will not currently be valid.
   */
  public final int slotType;

  /**
   * A public constructor to instantiate a {@link SlotArmor} object, representing an equipment slot.
   * @param cp A {@link ContainerPlayer} object, representing the parent container.
   * @param ii An {@link IInventory} object, representing the parent inventory.
   * @param in An {@link Integer} value, representing the slot's ordinal index.
   * @param ix An {@link Integer} value, representing the slot's X position.
   * @param iy An {@link Integer} value, representing the slot's Y position.
   * @param it An {@link Integer} value, representing the slot's armor type.
   */
  public SlotArmor(ContainerPlayer cp, IInventory ii, int in, int ix, int iy, int it) {
    this(cp, ii, in, ix, iy, it, null);
  }

  /**
   * A public constructor to instantiate a {@link SlotArmor} object, representing an equipment slot.
   * @param cp A {@link ContainerPlayer} object, representing the parent container.
   * @param ii An {@link IInventory} object, representing the parent inventory.
   * @param in An {@link Integer} value, representing the slot's ordinal index.
   * @param ix An {@link Integer} value, representing the slot's X position.
   * @param iy An {@link Integer} value, representing the slot's Y position.
   * @param it An {@link Integer} value, representing the slot's armor type.
   * @param e
   */
  public SlotArmor(ContainerPlayer cp, IInventory ii, int in, int ix, int iy, int it, EntityTameable e) {
    super(ii, in, ix, iy);
    parent = cp;
    slotType = it;
    entity = e;
  }

  @Override
  @SideOnly(Side.CLIENT)
  public IIcon getBackgroundIconIndex() {
    return ItemArmor.func_94602_b(slotType);
  }

  @Override
  public boolean canTakeStack(EntityPlayer ep) {
    return entity.isTamed()
        && entity.getOwner().equals(ep);
  }

  @Override
  public boolean isItemValid(ItemStack is) {
    if(is != null) { // only testing if we are sent a null item stack
      Item item = is.getItem();
      switch(slotNumber) { // slotNumber also depends upon slotType; these should match each other....
        // The first four slots are for equipable armors: helmets, chestplates, leggings, and boots; need some method-
        // ology to determine that only those items are in the correct slots.
        case 0: // for the head armor
        case 1: // for the body armor
        case 2: // for the legs armor
        case 3: // for the feet armor
          if(item instanceof ItemArmor) {
            ItemArmor armor = (ItemArmor)item;
            return armor.armorType == slotType && slotType == slotNumber;
          }
          break;
        case 4: // for the head: books, paper, something for learning/experience
          return isItemValid4(is);
        case 5: // for the body: inventory items - backpacks, ender chests, etc.
          return isItemValid5(is);
        case 6: // for the legs: secondary defensive/offensive equipment, such as bladed equipment...
          return isItemValid6(is);
        case 7: // for the feet: miscellaneous mobility/speed enhancements...
          return isItemValid7(is);
        default:// Any other slot; should not get here...
          break;
      }
      return item.isValidArmor(is, slotType, null);
      //TODO: The above last parameter was "parent.entity" but this errors as I have corrected the other class references.
    }
    return false;
  }

  @Override
  public int getSlotStackLimit() {
    return slotNumber < 4 ? 1 : 4;
  }

  /**
   * A protected getter method to get whether the item stack is valid for slot number four. Overriding classes should
   * get the base item from the item stack, then return whether the item matches the specific items allowed for this
   * specific slot.
   * @param is An {@link ItemStack} object, representing the item stack used.
   * @return A {@link Boolean} condition.
   * @see #slotType
   * @see #slotNumber
   */
  protected boolean isItemValid4(ItemStack is) {
    Item item = is.getItem();
    return item.equals(Items.book)
        || item.equals(Items.clock)
        || item.equals(Items.compass)
        || item.equals(Items.dye)
        || item.equals(Items.enchanted_book)
        || item.equals(Items.paper)
        || item.equals(Items.writable_book)
        || item.equals(Items.written_book);
  }

  /**
   * A protected getter method to get whether the item stack is valid for slot number 5. Overriding classes should get
   * the base item from the item stack, then return whether the item matches the specific items allowed for this
   * specific slot.
   * @param is An {@link ItemStack} object, representing the item stack used.
   * @return A {@link Boolean} condition.
   * @see #slotType
   * @see #slotNumber
   */
  protected boolean isItemValid5(ItemStack is) {
    Item item = is.getItem();
    return item.equals(Items.dye)
        || item.equals(Items.written_book);
  }

  /**
   * A protected getter method to get whether the item stack is valid for slot number 6. Overriding classes should get
   * the base item from the item stack, then return whether the item matches the specific items allowed for this
   * specific slot.
   * @param is An {@link ItemStack} object, representing the item stack used.
   * @return A {@link Boolean} condition.
   * @see #slotType
   * @see #slotNumber
   */
  protected boolean isItemValid6(ItemStack is) {
    Item item = is.getItem();
    return item.equals(Items.dye)
        || item.equals(Items.egg);
  }

  /**
   * A protected getter method to get whether the item stack is valid for slot number 7. Overriding classes should get
   * the base item from the item stack, then return whether the item matches the specific items allowed for this
   * specific slot.
   * @param is An {@link ItemStack} object, representing the item stack used.
   * @return A {@link Boolean} condition.
   * @see #slotType
   * @see #slotNumber
   */
  protected boolean isItemValid7(ItemStack is) {
    Item item = is.getItem();
    return item.equals(Items.blaze_powder)
        || item.equals(Items.glowstone_dust)
        || item.equals(Items.redstone);
  }
}
