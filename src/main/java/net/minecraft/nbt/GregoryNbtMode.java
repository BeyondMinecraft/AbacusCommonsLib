package net.minecraft.nbt;


/**
 *
 * @author Gregory
 */
public enum GregoryNbtMode {
  /**
   * In a client-sided mode, only an {@link NBTTagCompound}-based entity will be loaded and managed on the client side.
   */
  clientSided,
  /**
   * In a homogeneous mode, both the {@link #clientSided client-sided} and {@link #serverSided server-sided} modes are
   * both valid.
   */
  homogeneous,
  /**
   * In a server-sided mode, only an {@link NBTTagCompound}-based entity will be loaded and managed on the server side.
   */
  serverSided;
}
