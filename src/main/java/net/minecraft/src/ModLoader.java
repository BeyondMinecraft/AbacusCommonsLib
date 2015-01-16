package net.minecraft.src;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.logging.Logger;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.Achievement;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.biome.BiomeGenBase;


/**
 * Do not depend on this class or its methods; I am only creating this as a way to point the old ModLoader usages toward
 * the newer Forge usages of functionality.
 * @author Gregory
 */
public class ModLoader {
  private ModLoader() {
  }

  /**
   *
   * @param t A {@link TextureManager} object, representing ... something.
   * @param s A {@link String} object, representing the image URL.
   * @return null
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static BufferedImage loadImage(TextureManager t, String s) {
    return null;
  }

  /**
   * @return
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static List<BaseMod> getLoadedMods() {
    return null;
  }

  /**
   * @return
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static Logger getLogger() {
    return null;
  }

  /**
   *
   * @return null
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static MinecraftServer getMinecraftServerInstance() {
    return null;
  }

  /**
   *
   * @param c a class
   * @param o an object
   * @param s
   * @return null
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static Object getPrivateValue(Class<?> c, Object o, String s) {
    return null;
  }

  /**
   *
   * @param s
   * @return false
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static boolean isModLoaded(String s) {
    return false;
  }

  /**
   *
   * @param s
   * @return 0
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static int addArmor(String s) {
    return 0;
  }

  /**
   *
   * @param s
   * @param t
   * @return 0
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static int addOverride(String s, String t) {
    return 0;
  }

  /**
   *
   * @return 0
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static int getUniqueEntityId() {
    return 0;
  }

  /**
   *
   * @param a
   * @param s
   * @param t
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addAchievementDesc(Achievement a, String s, String t) {
  }

  /**
   *
   * @param c
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addCommand(ICommand c) {
  }

  /**
   * @param mod
   * @param entityclass
   * @param defaultId
   * @param trackingRange
   * @param updateFrequency
   * @param sendVelocityUpdate
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addEntityTracker(BaseMod mod, Class<? extends Entity> entityclass, int defaultId, int trackingRange, int updateFrequency, boolean sendVelocityUpdate) {
  }

  /**
   *
   * @param s
   * @param t
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addLocalization(String s, String t) {
  }

  /**
   *
   * @param s
   * @param t
   * @param u
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addLocalization(String s, String t, String u) {
  }

  /**
   *
   * @param b
   * @param s
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addName(Block b, String s) {
  }
  /**
   *
   * @param i
   * @param s
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addName(Item i, String s) {
  }

  /**
   *
   * @param b
   * @param s
   * @param t
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addName(Block b, String s, String t) {
  }

  /**
   *
   * @param i
   * @param s
   * @param t
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addName(Item i, String s, String t) {
  }

  /**
   *
   * @param is
   * @param os
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addRecipe(ItemStack is, Object[] os) {
  }

  /**
   *
   * @param is
   * @param os
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addShapelessRecipe(ItemStack is, Object[] os) {
  }

  /**
   *
   * @param c entity class
   * @param i spawn-weight
   * @param j min group size
   * @param k max group size
   * @param e creature type
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addSpawn(Class<? extends Entity> c, int i, int j, int k, EnumCreatureType e) {
  }

  /**
   *
   * @param c entity class
   * @param i spawn-weight
   * @param j min group size
   * @param k max group size
   * @param e creature type
   * @param b biomes spawnable
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void addSpawn(Class<? extends Entity> c, int i, int j, int k, EnumCreatureType e, BiomeGenBase[] b) {
  }

  /**
   *
   * @param pcp
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void clientSendPacket(Packet250CustomPayload pcp) {
  }

  /**
   *
   * @param ep
   * @param gs
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void openGUI(EntityPlayer ep, GuiScreen gs) {
  }

  /**
   *
   * @param b block
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerBlock(Block b) {
  }

  /**
   *
   * @param b block
   * @param c a class
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerBlock(Block b, Class<Item> c) {
  }

  /**
   *
   * @param b the base mod
   * @param i container id
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerContainerID(BaseMod b, int i) {
  }

  /**
   * @param aClass
   * @param name
   * @param ID
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerEntityID(Class<? extends Entity> aClass, String name, int ID) {
  }

  /**
   * @param entityclass
   * @param entityName
   * @param defaultId
   * @param pEggColor1
   * @param pEggColor2
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerEntityID(Class<? extends Entity> entityclass, String entityName, int defaultId, int pEggColor1, int pEggColor2) {
  }

  /**
   * @param bm
   * @param kb
   * @param b
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerKey(BaseMod bm, KeyBinding kb, boolean b) {
  }

  /**
   *
   * @param b the base mod
   * @param s channel name
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerPacketChannel(BaseMod b, String s) {
  }

  /**
   *
   * @param c a TileEntity class
   * @param s
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void registerTileEntity(Class<TileEntity> c, String s) {
  }

  /**
   *
   * @param e server-side player entity
   * @param c container
   * @param i container id
   * @param j entity id
   * @param k something
   * @param l something
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void serverOpenWindow(EntityPlayerMP e, Container c, int i, int j, int k, int l) {
  }

  /**
   *
   * @param nsh
   * @param pcp
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void serverSendPacket(NetServerHandler nsh, Packet250CustomPayload pcp) {
  }

  /**
   *
   * @param bm the base mod
   * @param b1
   * @param b2
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void setInGameHook(BaseMod bm, boolean b1, boolean b2) {
  }

  /**
   *
   * @param c a class
   * @param o an object
   * @param s
   * @param o1
   * @deprecated This is merely a marker method for the original; do not depend upon this.
   */
  @Deprecated
  public static void setPrivateValue(Class<?> c, Object o, Object s, Object o1) {
  }
}
//  public static void addOverride(String s, String t) {
//  }
