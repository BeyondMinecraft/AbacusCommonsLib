package gregory.abc.utility.config;
import java.io.File;
import net.minecraftforge.common.config.Configuration;


/**
 * A abstract public class that defines configuration fields and methods to handle loading and saving your settings.
 * <p/>
 * For each of the fields and methods that go with this interface definition, I have supplied some sample code to start.
 * Each method body can and should be customized to handle the configuration data that go with this class.
 * <p/>
 * Your configuration fields can be as simple or as complex as necessary, depending upon the number of fields required.
 * Simpler instances could use just a handful of fields, and more complex mod configurations could weigh in with dozens,
 * or even hundreds, of class fields. How far you take this is up to you.
 * <h3>Where to Start.</h3>
 * To begin with, if you make your configuration class use a static-initialization method and constructor (as I do), you
 * will have a private constructor, to which the following may be added:
 * <pre>
 *     // 1st, the global settings:
 *     MyModConfig.this.initConfigGlobal();
 *     MyModConfig.this.loadConfigGlobal();
 *     MyModConfig.this.saveConfigGlobal();
 *     // 2nd, the world settings:
 *     MyModConfig.this.initConfigWorld();
 *     MyModConfig.this.loadConfigWorld();
 *     MyModConfig.this.saveConfigWorld();
 *     // 3rd, the dimension settings:
 *     MyModConfig.this.initConfigWorldZ();
 *     MyModConfig.this.loadConfigWorldZ();
 *     MyModConfig.this.saveConfigWorldZ();
 *     // 4th, closing down the configuration objects:
 *     // (optional, but highly recommended to conserve memory usage)
 *     MyModConfig.this.quitConfigGlobal();
 *     MyModConfig.this.quitConfigWorld();
 *     MyModConfig.this.quitConfigWorldZ();
 * </pre> In the above sample, I use the sample class name of "MyModConfig"; in your case, replace those instances with
 * the name of your configuration class. The "quit" methods should ensure any open configuration files and objects are
 * closed or finalized, thereby releasing as much unused memory as possible, through Java garbage collection methods.
 * @author Gregory
 * @see #configGlobal configGlobal
 * @see #configWorld configWorld
 * @see #configWorldZ configWorldZ
 * @see #fileGlobal fileGlobal
 * @see #fileWorld fileWorld
 * @see #fileWorldZ fileWorldZ
 * @see #baselineInitialization(File,String) baselineInitialization(File,String)
 * @see #initConfigGlobal() initConfigGlobal()
 * @see #initConfigWorld() initConfigWorld()
 * @see #initConfigWorldZ() initConfigWorldZ()
 * @see #loadConfigGlobal() loadConfigGlobal()
 * @see #loadConfigWorld() loadConfigWorld()
 * @see #loadConfigWorldZ() loadConfigWorldZ()
 * @see #quitConfigGlobal() quitConfigGlobal()
 * @see #quitConfigWorld() quitConfigWorld()
 * @see #quitConfigWorldZ() quitConfigWorldZ()
 * @see #saveConfigGlobal() saveConfigGlobal()
 * @see #saveConfigWorld() saveConfigWorld()
 * @see #saveConfigWorldZ() saveConfigWorldZ()
 * @see #setConfigWorld(File) setConfigWorld(File)
 * @see #setConfigWorldZ(File) setConfigWorldZ(File)
 * @see Configuration Configuration
 * @see File File
 */
abstract public class IGregoryConfigMinecraft {
  /**
   * A public {@link Configuration} object that is useful for storing "global" configuration data.<p/>
   * Global data is generally anything that applies to the mod as a whole, across multiple world-saves. Such information
   * could be the integer overrides for blocks and items, or the defaults that help other mod aspects.
   * @see Configuration Configuration
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorld configWorld
   * @see #configWorldZ configWorldZ
   * @see #initConfigGlobal() initConfigGlobal()
   * @see #loadConfigGlobal() loadConfigGlobal()
   * @see #quitConfigGlobal() quitConfigGlobal()
   * @see #saveConfigGlobal() saveConfigGlobal()
   */
  protected Configuration configGlobal = null;
  /**
   * A public {@link Configuration} object that is useful for storing "world" configuration data.<p/>
   * World data is generally anything that applies to the specific, unique, world-save instance. Such information could
   * be the information which could change from one world-save to another; for instance, a "mini-map" mod which allows
   * storing "way-point" navigation or identifying friend-or-foe states across a whole server should save them here.<p/>
   * This way, you do not "pollute" other world-saves with irrelevant information that need not be loaded. (This can
   * save your sanity, and that of your mod users&hellip;)
   * @see Configuration Configuration
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   * @see #configWorldZ configWorldZ
   * @see #initConfigWorld() initConfigWorld()
   * @see #loadConfigWorld() loadConfigWorld()
   * @see #quitConfigWorld() quitConfigWorld()
   * @see #saveConfigWorld() saveConfigWorld()
   */
  protected Configuration configWorld = null;
  /**
   * A public {@link Configuration} object that is useful for storing "dimensional" configuration data.<p/>
   * Dimensional data is generally anything that applies to the specific in-game dimension a player is within. Such
   * information could be the information which could change from within one world-dimension instance; for instance, a
   * mod which may support adaptations based upon which specified dimension the player travels to.<p/>
   * This way, you do not "pollute" other world-saves with irrelevant information that need not be loaded. (This can
   * save your sanity, and that of your mod users&hellip;)
   * @see Configuration Configuration
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   * @see #configWorld configWorld
   * @see #initConfigWorldZ() initConfigWorldZ()
   * @see #loadConfigWorldZ() loadConfigWorldZ()
   * @see #quitConfigWorldZ() quitConfigWorldZ()
   * @see #saveConfigWorldZ() saveConfigWorldZ()
   */
  protected Configuration configWorldZ = null;
  /**
   * A public {@link File} object used as the location of the {@link Minecraft#mcDataDir Minecraft data directory}.
   * @see File File
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   */
  protected File fileGlobal;
  /**
   * A public {@link File} object used as the location of the {@link Minecraft#mcDataDir Minecraft data directory}.
   * @see File File
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorld configWorld
   */
  protected File fileWorld;
  /**
   * A public {@link File} object used as the location of the {@link Minecraft#mcDataDir Minecraft data directory}
   * .<p/>
   * This is useful for managing a per-dimension configuration only if a particular dimension has specific attributes
   * that do not relate to attributes of other dimensions. Generally, if you use the {@link SubscribeEvent} to handle
   * such things as when a player logs into or out of a particular world dimension, that subscribed method could call
   * the setter-method to set this file location, and then also call the method to load the configuration data from it.
   * @see File File
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorldZ configWorldZ
   */
  protected File fileWorldZ;

  /**
   * Initialize the {@link #configGlobal configGlobal} object in this method.<p/>
   * This method is protected; it should only be called from within this class itself, or others in the same package.
   * (Do not call directly; The configuration object generally has no need to be opened from anywhere else&hellip;.)
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *    if(configGlobal == null &amp;&amp; fileGlobal != null) { // A safeguard
   *      configGlobal = new Configuration(fileGlobal);
   *    }</pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   * @see #loadConfigGlobal() loadConfigGlobal()
   * @see #quitConfigGlobal() quitConfigGlobal()
   * @see #saveConfigGlobal() saveConfigGlobal()
   */
  abstract protected void initConfigGlobal();

  /**
   * Initialize the {@link #configWorld configWorld} object in this method.<p/>
   * This method is protected; it should only be called from within this class itself, or others in the same package.
   * (Do not call directly; The configuration object generally has no need to be opened from anywhere else&hellip;.)
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *    if(configWorld == null &amp;&amp; fileWorld != null) { // A safeguard
   *      configWorld = new Configuration(fileWorld);
   *    }</pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorld configWorld
   * @see #loadConfigWorld() loadConfigWorld()
   * @see #quitConfigWorld() quitConfigWorld()
   * @see #saveConfigWorld() saveConfigWorld()
   */
  abstract protected void initConfigWorld();

  /**
   * Initialize the {@link #configWorld configWorld} object in this method.<p/>
   * This method is protected; it should only be called from within this class itself, or others in the same package.
   * (Do not call directly; The configuration object generally has no need to be opened from anywhere else&hellip;.)
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *    if(configWorldZ == null &amp;&amp; fileWorldZ != null) { // A safeguard
   *      configWorldZ = new Configuration(fileWorldZ);
   *    }</pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorldZ configWorldZ
   */
  abstract protected void initConfigWorldZ();

  /**
   * Shut down the {@link #configGlobal configGlobal} object in this method.<p/>
   * This method is protected; it should only be called from within this class itself, or others in the same package.
   * (Do not call directly; The configuration object generally has no need to be closed from anywhere else&hellip;.)
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *    if(configGlobal != null) { // A safeguard
   *      configGlobal = null;
   *    }
   *    //TODO: Additional code for closing/finalizing global objects.</pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   * @see #initConfigGlobal() initConfigGlobal()
   * @see #loadConfigGlobal() loadConfigGlobal()
   * @see #saveConfigGlobal() saveConfigGlobal()
   */
  abstract protected void quitConfigGlobal();

  /**
   * Shut down the {@link #configWorld configWorld} object in this method.<p/>
   * This method is protected; it should only be called from within this class itself, or others in the same package.
   * (Do not call directly; The configuration object generally has no need to be closed from anywhere else&hellip;.)
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *    if(configWorld != null) { // A safeguard
   *      configWorld = null;
   *    }
   *    //TODO: Additional code for closing/finalizing per-world objects.</pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorld configWorld
   * @see #initConfigWorld() initConfigWorld()
   * @see #loadConfigWorld() loadConfigWorld()
   * @see #saveConfigWorld() saveConfigWorld()
   */
  abstract protected void quitConfigWorld();

  /**
   * Shut down the {@link #configWorldZ configWorldZ} object in this method.<p/>
   * This method is protected; it should only be called from within this class itself, or others in the same package.
   * (Do not call directly; the configuration object generally has no need to be closed from anywhere else&hellip;.)
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *    if(configWorldZ != null) { // A safeguard
   *      configWorldZ = null;
   *    }
   *    //TODO: Additional code for closing/finalizing per-dimension objects.</pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorldZ configWorldZ
   */
  abstract protected void quitConfigWorldZ();

  /**
   * A "helper" method for initializing the global configuration file.
   * <p/>
   * This method is useful when only globally-relevant configurations are necessary. Only one configurable object needs
   * to be loaded and maintained; the other file objects are left as {@code null} value, but can be set and loaded as
   * necessary. Also, the global configuration only should ever need to be loaded once per Minecraft playing session;
   * although it could be possible to retrofit your implementation of this class to be able to reload configurable data,
   * your code could be better written so that it is not necessary.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     fileGlobal = new File(f, s);
   *     if(!fileGlobal.exists()) {
   *       fileGlobal.createNewFile();
   *     }
   * </pre>
   * <p/>
   * Because of the "createNewFile()" method call above, you will either have to handle a thrown exception (by wrapping
   * the line in a try-catch block) or modify the method signature to throw the exception to the calling method, where
   * it can be handled externally. (I would prefer it handled within this configuration class via a try-catch; but it's
   * your coding methodology that matters.)
   * @param f The default path to find the {@link #configGlobal configGlobal} file.
   * @param s The filename of a suggested configuration object.
   * @see File File
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   */
  abstract public void baselineInitialization(File f, String s);

  /**
   * Load all information from the global configuration file.
   * <p/>
   * This method is public so that if the mod requires re-loading information (a kind of "reset") it retrieves a "last
   * known configuration" for global settings.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     initConfigGlobal(); // A safeguard to ensure the config object exists
   *     configGlobal.load();
   *
   *     //TODO: Add the code that loads globally-applicable information.
   *     // This is where configGlobal.get(...) obtains your global config fields.
   *
   *     saveConfigGlobal(); // Ensure the config object is saved after successfully loading.
   * </pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   * @see #initConfigGlobal() initConfigGlobal()
   * @see #quitConfigGlobal() quitConfigGlobal()
   * @see #saveConfigGlobal() saveConfigGlobal()
   */
  abstract public void loadConfigGlobal();

  /**
   * Load all information from the world configuration file.
   * <p/>
   * This method is public so that if the mod requires re-loading information (a kind of "reset") it retrieves a "last
   * known configuration" for world-specific settings.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     initConfigWorld(); // A safeguard to ensure the config object exists
   *     configWorld.load();
   *
   *     //TODO: Add the code that loads per-world-applicable information.
   *     // This is where configWorld.get(...) obtains your world config fields.
   *
   *     saveConfigWorld(); // Ensure the config object is saved after successfully loading.
   * </pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorld configWorld
   * @see #initConfigWorld() initConfigWorld()
   * @see #quitConfigWorld() quitConfigWorld()
   * @see #saveConfigWorld() saveConfigWorld()
   */
  abstract public void loadConfigWorld();

  /**
   * Load all information from the dimension configuration file.
   * <p/>
   * This method is public so that if the mod requires re-loading information (a kind of "reset"), it retrieves a "last
   * known configuration" for dimension-specific settings.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     initConfigWorldZ(); // A safeguard to ensure the config object exists
   *     configWorldZ.load();
   *
   *     //TODO: Add the code that loads per-dimension-applicable information.
   *     // This is where configWorldZ.get(...) obtains your dimension config fields.
   *
   *     saveConfigWorldZ(); // Ensure the config object is saved after successfully loading.
   * </pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorldZ configWorldZ
   */
  abstract public void loadConfigWorldZ();

  /**
   * Save all information to the global configuration file.
   * <p/>
   * This method is public so that if the mod requires re-saving global information (after a change), it is easy to do
   * so with a single method call.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     configGlobal.save();
   *     quitConfigGlobal(); // Optional; to release memory no longer needed.
   * </pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configGlobal configGlobal
   * @see #initConfigGlobal() initConfigGlobal()
   * @see #loadConfigGlobal() loadConfigGlobal()
   * @see #quitConfigGlobal() quitConfigGlobal()
   */
  abstract public void saveConfigGlobal();

  /**
   * Save all information to the world configuration file.
   * <p/>
   * This method is public so that if the mod requires re-saving any per-world information (after a change) it is easy
   * to do so with a single method call.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     configWorld.save();
   *     quitConfigWorld(); // Optional; to release memory no longer needed.
   * </pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorld configWorld
   * @see #initConfigWorld() initConfigWorld()
   * @see #loadConfigWorld() loadConfigWorld()
   * @see #quitConfigWorld() quitConfigWorld()
   */
  abstract public void saveConfigWorld();

  /**
   * Save all information to the dimension configuration file.
   * <p/>
   * This method is public so that if the mod requires re-saving any per-world information (after a change) it is easy
   * to do so with a single method call.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     configWorldZ.save();
   *     quitConfigWorldZ(); // Optional; to release memory no longer needed.
   * </pre>
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   * @see #configWorldZ configWorldZ
   */
  abstract public void saveConfigWorldZ();

  /**
   * Set the precise location of the {@link #configWorld configWorld} file object.
   * <p/>
   * That object allows for per-world configurations, such that a player can have specific settings for each world that
   * is being loaded; this makes some things, like radars that can set waypoints and death markers, more specific.
   * Initialization of the {@link #fileWorld fileWorld} (and any relevant file-checking) should go here.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     fileWorld = f;
   *     //TODO: Perhaps, check to see if it exists?
   * </pre>
   * @param f A {@link File} object, representing the world-specific configuration file.
   * @see File File
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   */
  abstract public void setConfigWorld(File f);

  /**
   * Set the precise location of the {@link #configWorldZ configWorldZ} file object.
   * <p/>
   * That object allows for per-dimension configurations, which is not necessary for most mods; however, in the offhand
   * chance a mod may want to allow configurations for things based upon the current dimension, initialization of the
   * {@link #fileWorldZ fileWorldZ} (and any relevant file-checking) should go here.
   * <p/>
   * Start with this template code, and modify it to suit your needs:
   * <pre>
   *     fileWorldZ = f;
   *     //TODO: Perhaps, check to see if it exists?
   * </pre>
   * @param f A {@link File} object, representing the dimension-specific configuration file.
   * @see File File
   * @see IGregoryConfigMinecraft IGregoryConfigMinecraft
   */
  abstract public void setConfigWorldZ(File f);
}
