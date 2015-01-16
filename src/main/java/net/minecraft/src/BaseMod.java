package net.minecraft.src;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;


/**
 *
 * @author Gregory
 */
abstract public class BaseMod {
  abstract public GuiContainer getContainerGUI(EntityClientPlayerMP var1, int var2, int var3, int var4, int var5);

  abstract public String getName();

  abstract public String getPriorities();

  abstract public String getVersion();

  abstract public boolean onTickInGame(float f, Minecraft m);

  abstract public void addRenderer(Map<Class<? extends Entity>, Render> m);

  abstract public void clientConnect(NetClientHandler var1);

  abstract public void clientCustomPayload(NetClientHandler var1, Packet250CustomPayload var2);

  abstract public void clientDisconnect(NetClientHandler var1);

  abstract public void load();

  abstract public void modsLoaded();

  abstract public void sendToClient(NetServerHandler pHandler, byte[] pData);

  abstract public void serverCustomPayload(NetServerHandler var1, Packet250CustomPayload var2);
}
