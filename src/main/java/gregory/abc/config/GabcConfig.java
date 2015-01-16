package gregory.abc.config;
import gregory.abc.utility.config.IGregoryConfigMinecraft;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraftforge.common.config.Configuration;


/**
 *
 * @author Gregory
 */
public class GabcConfig extends IGregoryConfigMinecraft {
  /** An instance of this class. Both this and the constructor are private for a reason, you know... */
  private static final GabcConfig instance;

  static {
    instance = new GabcConfig();
  }

  //TODO: Your configuration fields can go here.
  // They can be public, so that they can be accessed directly; or they can be private, so that you can use getter and
  // setter methods to pull or push the values.

  private GabcConfig() {
  }

  @Override
  protected void initConfigGlobal() {
    if(configGlobal == null && fileGlobal != null) { // A safeguard
      configGlobal = new Configuration(fileGlobal);
    }
  }

  @Override
  protected void initConfigWorld() {
    if(configWorld == null && fileWorld != null) { // A safeguard
      configWorld = new Configuration(fileWorld);
    }
  }

  @Override
  protected void initConfigWorldZ() {
    if(configWorldZ == null && fileWorldZ != null) { // A safeguard
      configWorldZ = new Configuration(fileWorldZ);
    }
  }

  @Override
  protected void quitConfigGlobal() {
    if(configGlobal != null) { // A safeguard
      configGlobal = null;
    }
  }

  @Override
  protected void quitConfigWorld() {
    if(configGlobal != null) { // A safeguard
      configGlobal = null;
    }
  }

  @Override
  protected void quitConfigWorldZ() {
    if(configWorldZ != null) { // A safeguard
      configWorldZ = null;
    }
  }

  @Override
  public void baselineInitialization(File f, String s) {
    fileGlobal = new File(f, s);
    if(!fileGlobal.exists()) {
      try {
        fileGlobal.createNewFile();
      } catch(IOException ex) {
        Logger.getLogger(GabcConfig.class.getName()).log(Level.SEVERE,
                                                         "Critical! Config file cannot be created!",
                                                         ex);
      }
    }
  }

  @Override
  public void loadConfigGlobal() {
    initConfigGlobal(); // A safeguard to ensure the config object exists
    configGlobal.load();

    //TODO: Add the code that loads globally-applicable information.
    // This is where configGlobal.get(...) obtains your global config fields.

    quitConfigGlobal(); // A safeguard to ensure the config object is closed.
  }

  @Override
  public void loadConfigWorld() {
    initConfigWorld(); // A safeguard to ensure the config object exists
    configWorld.load();

    //TODO: Add the code that loads per-world-applicable information.
    // This is where configWorld.get(...) obtains your world config fields.

    quitConfigWorld(); // A safeguard to ensure the config object is closed.
  }

  @Override
  public void loadConfigWorldZ() {
    initConfigWorldZ(); // A safeguard to ensure the config object exists
    configWorldZ.load();

    //TODO: Add the code that loads per-dimension-applicable information.
    // This is where configWorldZ.get(...) obtains your dimension config fields.

    quitConfigWorldZ(); // A safeguard to ensure the config object is closed.
  }

  @Override
  public void saveConfigGlobal() {
    initConfigGlobal();
    configGlobal.save();
    quitConfigGlobal(); // Optional, to release memory no longer needed.
  }

  @Override
  public void saveConfigWorld() {
    initConfigWorld();
    configWorld.save();
    quitConfigWorld(); // Optional, to release memory no longer needed.
  }

  @Override
  public void saveConfigWorldZ() {
    initConfigWorldZ();
    configWorldZ.save();
    quitConfigWorldZ(); // Optional; to release memory no longer needed.
  }

  @Override
  public void setConfigWorld(File f) {
    fileWorld = f;
    //TODO: Perhaps, check to see if it exists?
  }

  @Override
  public void setConfigWorldZ(File f) {
    fileWorldZ = f;
    //TODO: Perhaps, check to see if it exists?
  }

  /**
   * A public getter method to obtain the default instance of GabcConfig.
   * In this manner, both the class field and class constructor should remain private.<p/>
   * In your main mod class, in the method with the {@link FMLPreInitializationEvent}, after first calling this static
   * method to obtain the configuration object, next call the {@link #baselineInitialization(File,File) baselineInitialization(File,File)}
   * method, with appropriate configuration file references.
   * @return A {@link GabcConfig} instance.
   */
  public static GabcConfig getInstance() {
    return instance;
  }
}
