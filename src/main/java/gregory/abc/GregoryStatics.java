package gregory.abc;
import java.io.File;
import net.minecraft.client.Minecraft;


/**
 * A public singleton class with fields and methods for handling file references to various locations within Minecraft.
 * @author Gregory
 */
public class GregoryStatics {
  private static final GregoryStatics instance;
  public static final Minecraft minecraft;

  static {
    instance = new GregoryStatics();
    minecraft = Minecraft.getMinecraft();
  }

  private GregoryStatics() {
  }

  public File getSaveFileName(boolean create, int index, String name) {
    return null;
  }

  public static GregoryStatics getInstance() {
    return instance;
  }
}
