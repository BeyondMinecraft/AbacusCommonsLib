package gregory.abc;
import gregory.abc.utility.GabcFilePaths;
import java.io.File;


/**
 * <h2>GabcStatic</h2>
 * A class of static fields and methods.
 * <p/>
 * This class is for the static-initialization fields and methods that are relevant to the mod main class and across the
 * other mod-management classes. For the most part, they are the {@link String} fields, {@link File} paths, et cetera,
 * that are of use to one or more classes in the mod.
 * @author Gregory
 * @see #modAbbr modAbbr
 * @see #modDeps modDeps
 * @see #modName modName
 * @see #modVer1 modVer1
 * @see #modVer2 modVer2
 * @see #soundpacksPath soundpacksPath
 * @see #MaidSoundsStatic() MaidSoundsStatic()
 * @see #initialize() initialize()
 */
public class GabcStatic {
  // Notice: the public static String fields MUST be declared with the values in the same lines, not static initialized!

  /**
   * The static "modId" descriptor.
   * <p/>
   * Used throughout a mod. Should be the same as found in the {@code mcmod.info} file.
   */
  public static final String modAbbr = "gabc"; // NOI18N
  /**
   * Your mod dependencies.
   * <p/>
   * Should be the same as found in the {@code mcmod.info} file.
   */
  public static final String modDeps = "befor-all"; // NOI18N
  /**
   * Your "mod name" title.
   * <p/>
   * This is the more proper, full title, Should be the same as found in the {@code mcmod.info} file.
   */
  public static final String modName = "Gregory-AbacusCommonsLib"; // NOI18N
  /**
   * A static name for file paths.
   */
  public static final String modPath = "Abacus"; // NOI18N
  /**
   * The version of Minecraft expected. Should be the same as found in the {@code mcmod.info} file.
   */
  public static final String modVer1 = "1.7.10"; // NOI18N
  /**
   * The version of this mod. Should be the same as found in the {@code mcmod.info} file.
   */
  public static final String modVer2 = "0.0.1a"; // NOI18N

  /**
   * A private constructor.
   */
  private GabcStatic() {
  }

  protected static void initialize() {
    if(!GabcFilePaths.mcMods.exists() || !GabcFilePaths.mcMods.isDirectory() || GabcFilePaths.mcMods.mkdir()) {
      //TODO: Warn that the mods directory cannot be made....
    }
    // Additional initialization may occur here....
  }
}
