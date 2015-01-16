package gregory.abc.utility.config;


/**
 * This interface is used to provide predefined configuration-file section headings.
 * Use it as much or as little as you wish; the entries are meant to cover some common usages.
 * If you happen to think of a heading that may be of use to other mods, please, do not hesitate to make a suggestion;
 * I may deem it to be of worthwhile inclusion.<p/>
 * The entries generally follow many of the Minecraft internal package names, minus the 'net.minecraft.' at the start,
 * because the Minecraft packages are structured quite well, with similar classes arranged together.
 * @author Gregory
 */
public interface IConfigSection {
  /**
   * This defines a configuration section heading labeled "Block".<p/>
   * It is of use for defining a custom block's configurable attributes;
   * while 'blockId' values are not needed anymore, blocks may have other settings that can be configured.
   */
  public static final String BLOCK = "Block";
  /**
   * This defines a configuration section heading labeled "Client_".<p/>
   * It is a generic "catch-all" section heading for attributes that do not necessarily go within other client sections
   * ({@link #CLIENT_AUDIO CLIENT_AUDIO}, {@link #CLIENT_GUI CLIENT_GUI}, {@link #CLIENT_MODEL CLIENT_MODEL},
   * {@link #CLIENT_RENDERER CLIENT_RENDERER}, {@link #CLIENT_RESOURCES CLIENT_RESOURCES}, or
   * {@link #CLIENT_SETTINGS CLIENT_SETTINGS}).
   */
  public static final String CLIENT = "Client";
  /**
   * This defines a configuration section heading labeled "Client-Audio".<p/>
   * It is for settings dealing with music and sound effects that can be heard within the game.
   */
  public static final String CLIENT_AUDIO = "Client-Audio";
  /**
   * This defines a configuration section heading labeled "Client-GUI".<p/>
   * It is for configurable data and defaults for the visual controls and screens that can be used to display things.
   * For example, if a custom GUI class used customizable values in computing or displaying information from the world,
   * it may be defined in this section.
   */
  public static final String CLIENT_GUI = "Client-GUI";
  /**
   * This defines a configuration section heading labeled "Client-Model".<p/>
   * Java classes in the 'net.minecraft.client.model' package define the actual models for mobs and entities.
   * This section header is useful if &mdash; for example &mdash; a particular mob model could be resized or something.
   * It may be helpful to allow a configurable maximum and minimum size multiplier, as well as an average default size.
   */
  public static final String CLIENT_MODEL = "Client-Model";
  /**
   * This defines a configuration section heading labeled "Client-Renderer".<p/>
   * This is for configurable client-sided rendering configuration, and generally for mods that are only used in a
   * single-player game or where multi-player settings don't overlap.
   */
  public static final String CLIENT_RENDERER = "Client-Renderer";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String CLIENT_RESOURCES = "Client-Resources";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String CLIENT_SETTINGS = "Client-Settings";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String COMMAND = "Command";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENCHANTMENT = "Enchantment";
  /**
   * This defines a configuration section heading labeled "Entities".<p/>
   */
  public static final String ENTITY = "Entity";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_AI = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_BOSS = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_EFFECT = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_ITEM = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_MONSTER = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_PASSIVE = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_PLAYER = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ENTITY_PROJECTILE = "Entities";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String EVENT = "Event";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String INVENTORY = "Inventory";
  /**
   * This defines a configuration section heading labeled "Items".<p/>
   */
  public static final String ITEM = "Item-";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String ITEM_CRAFTING = "ItemCrafting";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String NBT = "NBT-Storage";
  /**
   * This defines a configuration section heading labeled "Network".<p/>
   */
  public static final String NETWORK = "Network";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String PATHFINDING = "Pathfinding";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String POTION = "Potion";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String SCOREBOARD = "Scoreboard";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String SERVER = "Server";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String STATS = "Statistics";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String TILEENTITY = "TileEntity";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String UTILITY = "Utility";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String VILLAGE = "Village";
  /**
   * This defines a configuration section heading labeled "World".<p/>
   * It is meant for configuration options used by world-generators, biome specification, and other attributes
   */
  public static final String WORLD = "World_";
  /**
   * This defines a configuration section heading labeled "".<p/>
   */
  public static final String WORLD_BIOME = "World-Biome";
  /**
   * This defines a configuration section heading labeled "WorldGen-".<p/>
   */
  public static final String WORLD_GEN_COMMON = "World-Gen_";
  /**
   * This defines a configuration section heading labeled "WorldGenFeature".<p/>
   */
  public static final String WORLD_GEN_FEATURE = "World-Gen-Feature";
  /**
   * This defines a configuration section heading labeled "WorldGenLayer".<p/>
   */
  public static final String WORLD_GEN_LAYER = "World-Gen-Layer";
  /**
   * This defines a configuration section heading labeled "WorldGenStructure".<p/>
   */
  public static final String WORLD_GEN_STRUCTURE = "World-Gen-Structure";
  /**
   * This defines a configuration section heading labeled "WorldStorage".<p/>
   */
  public static final String WORLD_STORAGE = "World-Storage";
}
