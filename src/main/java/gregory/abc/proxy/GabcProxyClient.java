package gregory.abc.proxy;
import gregory.abc.events.GabcSubscribeEvents;
import net.minecraftforge.common.MinecraftForge;


/**
 *
 * @author Gregory
 */
public class GabcProxyClient extends GabcProxy {
  protected GabcSubscribeEvents subscribeEvents;

  {
    subscribeEvents = new GabcSubscribeEvents();
  }

  @Override
  public void registerEvents() {
    MinecraftForge.EVENT_BUS.register(subscribeEvents);
  }

  @Override
  public void registerRendering() {
  }
}
