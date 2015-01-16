package gregory.abc.events;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import gregory.abc.utility.GabcFilePaths;


/**
 *
 * @author Gregory
 */
public class GabcSubscribeEvents {
  @SubscribeEvent
  public void onPlayerEventPlayerLoggedInEvent(PlayerEvent.PlayerLoggedInEvent event) {
    GabcFilePaths.mcSavesCurrent = event.player.worldObj.getSaveHandler().getWorldDirectory();
  }

  @SubscribeEvent
  public void onPlayerEventPlayerLoggedOutEvent(PlayerEvent.PlayerLoggedOutEvent event) {
    GabcFilePaths.mcSavesCurrent = null;
  }
}
