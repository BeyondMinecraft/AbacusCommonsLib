package net.minecraft.nbt;
import java.io.File;


/**
 *
 * @author Gregory
 */
public class GregoryNbtEntry {
  private File clientFile;
  private File serverFile;
  private GregoryNbtMode nbtMode;
  private NBTTagCompound clientTags;
  private NBTTagCompound serverTags;

  public GregoryNbtEntry(GregoryNbtMode mode) {
    nbtMode = mode;
  }

  public File getClientFile() {
    return clientFile;
  }

  public File getServerFile() {
    return serverFile;
  }

  public GregoryNbtMode getNbtMode() {
    return nbtMode;
  }

  public NBTTagCompound getClientTags() {
    return clientTags;
  }

  public NBTTagCompound getServerTags() {
    return serverTags;
  }

  public void setClientFile(File f) {
    clientFile = f;
  }

  public void setClientTags(NBTTagCompound nbttc) {
    clientTags = nbttc;
  }

  public void setNbtMode(GregoryNbtMode gnm) {
    nbtMode = gnm;
  }

  public void setServerFile(File f) {
    serverFile = f;
  }

  public void setServerTags(NBTTagCompound nbttc) {
    serverTags = nbttc;
  }
}
