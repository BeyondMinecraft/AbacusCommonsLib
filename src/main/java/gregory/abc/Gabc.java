package gregory.abc;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import gregory.abc.config.GabcConfig;
import gregory.abc.proxy.GabcProxy;
import gregory.abc.utility.GabcFilePaths;
import java.io.File;
import net.minecraft.client.Minecraft;


/**
 * This is the main class and entry point for my "Commons" library.
 * Any other mod may use it as a dependency, if they wish to do so.<p/>
 * The {@link Mod} parameters (any annotation parameter, really) refer to "static final" fields to simplify declaration;
 * this way, I only need to declared them once throughout a mod&hellip;
 * @author Gregory
 */
@Mod(acceptedMinecraftVersions="1.7.10-10.13.2.1230",
     canBeDeactivated=false,
     modid=Gabc.modAbbr,
     name=Gabc.modName,
     useMetadata=true,
     version=Gabc.modVers)
public class Gabc {
  /**
   * The mod abbreviation (a "{@link Mod#modid()}") is declared here.
   */
  protected static final String modAbbr = "abacus"; // NOI18N
  /**
   * The mod name could theoretically change, but only infrequently.
   */
  protected static final String modName = "Gregory-AbacusCommonsLib"; // NOI18N
  /**
   * The mod version may increment with each release; it needs to be declared only once in the mod&hellip;.
   */
  protected static final String modVers = "0.0.1"; // NOI18N
  @Instance(Gabc.modAbbr)
  public static Gabc instance;
  public static GabcConfig config;
  @SidedProxy(clientSide="gregory.abc.proxy.GabcProxyClient", // NOI18N
              serverSide="gregory.abc.proxy.GabcProxyCommon") // NOI18N
  public static GabcProxy proxy;

  @EventHandler
  public void before(FMLPreInitializationEvent event) {
    // Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry.
    config = GabcConfig.getInstance();
    config.baselineInitialization(GabcFilePaths.mcConfig, "Gregory-AbacusCommonsLib.cfg");
    config.loadConfigGlobal();
  }

  @EventHandler
  public void during(FMLInitializationEvent event) {
    // Do your mod setup. Build whatever data structures you care about. Register recipes, send FMLInterModComms messages to other mods.
  }

  @EventHandler
  public void finish(FMLPostInitializationEvent event) {
    // Handle interaction with other mods, complete your setup based on
    // Usually left blank, or not declared; could be used to interact with other mods already loaded...
  }

  public File getMinecraftDataPath() {
    return Minecraft.getMinecraft().mcDataDir;
  }

  public File getMinecraftWorldBase() {
    return new File(getMinecraftDataPath(), Minecraft.getMinecraft().theWorld.getWorldInfo().getWorldName());
  }
}
