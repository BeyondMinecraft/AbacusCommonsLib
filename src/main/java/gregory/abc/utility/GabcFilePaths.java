package gregory.abc.utility;
import java.io.File;
import net.minecraft.client.Minecraft;


/**
 * GabcFilePaths
 * @author Gregory
 */
public class GabcFilePaths {
  /**
   * The base path for Minecraft's data folder; this will equate to "%appdata%/.minecraft" for most installations.<p/>
   * This is not meant to be used directly; but it is used to find the other file paths underneath the above path.
   * Consult the additional paths to see if they are useful to your mod.
   */
  public static final File mc;
  /**
   * The assets folder stores some legacy and current assets such as entity graphics.
   */
  public static final File mcAssets;
  /**
   * The config folder is for storing some mod configuration files.
   */
  public static final File mcConfig;
  /**
   * The crash-reports folder is the place where the Minecraft crash reports will be generated.
   */
  public static final File mcCrash;
  /**
   * The libraries folder contains the many Java class libraries and native libraries used for running Minecraft itself.
   */
  public static final File mcLibs;
  /**
   * The logs folder stores general logging files for reference in diagnosing problems.<p/>
   * While the initialization, execution, and closing of Minecraft and the mods may output quite a lot of information,
   * and specifically information that may not mean much to the common user, an availability of information can be quite
   * useful for figuring out what went wrong or is not acting as it should.
   * A patient reader may be able to discern whether a problem is in Minecraft itself or a specific mod,
   * just by reading through the most recent log file.
   */
  public static final File mcLogs;
  /**
   * The mods folder is the path where all Forge-based mods will be placed.
   * A developer should not need to access this folder for most reasons, because adding or deleting items from it would
   * potentially lead to a crash. However, it may be useful for determining whether a mod was installed correctly.
   * (For example, a developer whose mod requires a separate data archive can check in the pre-initialization method if
   * a user mistakenly put the archive into the mods folder; the developer can disable the mod or even warn the player,
   * when a world is selected to play in.)
   */
  public static final File mcMods;
  /**
   * The resourcepacks folder is meant to contain any resource packs, which may be used for providing additional assets.
   */
  public static final File mcResourcepacks;
  /**
   * The saves folder is where the generated worlds are stored, each with their own subset of data files.
   */
  public static final File mcSaves;
  /**
   * The versions folder stores the various client versions, so that a user may have multiple client versions from one
   * main client.
   */
  public static final File mcVers;
  /**
   * The current save folder is where the currently-active world is stored.<p/>
   * A mod may make use of this to, say, store NBT data files from their mod relevant to a particular world.<p/>
   * Configuration data is general enough to apply globally, so should not be found here.
   * However, it should also be noted that some configuration data <i>might</i> be relevant per-world, so in a few cases
   * this would be a valid use of the currently-loaded world's directory.
   */
  public static File mcSavesCurrent;

  static {
    mc = Minecraft.getMinecraft().mcDataDir;
    mcAssets = new File(mc, "assets");
    mcConfig = new File(mc, "config");
    mcCrash = new File(mc, "crash-reports");
    mcLibs = new File(mc, "libraries");
    mcLogs = new File(mc, "logs");
    mcMods = new File(mc, "mods");
    mcResourcepacks = new File(mc, "resourcepacks");
    mcSaves = new File(mc, "saves");
    mcVers = new File(mc, "versions");
  }

  private GabcFilePaths() {
  }
}
