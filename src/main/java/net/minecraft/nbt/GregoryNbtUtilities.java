package net.minecraft.nbt;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * A public utility class with methods for managing the instance of an {@link NBTTagCompound}-based compressed datafile.
 * @author Gregory
 * @see #NbtFileUtils()GregoryNbtUtilities()
 * @see #fromFile(File,String) fromFile(File,String)
 * @see #toFile(File,NBTTagCompound) toFile(File,NBTTagCompound)
 */
public class GregoryNbtUtilities {
  private static final GregoryNbtUtilities instance;
  private final Map<String, GregoryNbtEntry> nbtEntry;

  static {
    instance = new GregoryNbtUtilities();
  }

  {
    nbtEntry = new ConcurrentHashMap<>(0);
  }

  /**
   * A private constructor to instantiate a {@link NbtFileUtils} object.<p/>
   * Currently, goes nothing, does nothing...
   */
  private GregoryNbtUtilities() {
  }

  /**
   * A public getter method to obtain a reference to an {@link GregoryNbtEntry} object.
   * @param s A {@link String} object, representing the object name.
   * @return A {@link GregoryNbtEntry} object.
   */
  public GregoryNbtEntry getNbtEntry(String s) {
    return nbtEntry.containsKey(s) ? nbtEntry.get(s) : null;
  }

  public boolean contains(String s) {
    return !nbtEntry.isEmpty() && nbtEntry.containsKey(s);
  }

  /**
   * A public setter method to set a reference to a new NBT entry object.<p/>
   * If an object does not already exist, it will be added to the mapping.
   * If an object already exists but the parameter {@code b} is true, the new mapping will overwrite the old.
   * @param s A {@link String} object, representing the object name.
   * @param e A {@link GregoryNbtEntry} object, representing a new entry.
   * @param b A {@link Boolean} condition, representing whether to overwrite existing entries.
   */
  public void setNbtEntry(String s, GregoryNbtEntry e, boolean b) {
    if(!nbtEntry.containsKey(s)) {
      nbtEntry.put(s, e);
    } else if(nbtEntry.containsKey(s) && b) {
      nbtEntry.replace(s, e);
    }
  }

  /**
   * A public static method to obtain a tagged compound from a compressed-stream file.
   * @deprecated Please use the non-static methods instead; instantiate this class from your mod main class,
   * then use the getter and setter for handling references to the entry. Candidate for removal.
   * @param f A {@link File} object, representing the file containing tagged data.
   * @param s A {@link String} object, representing the main tag name to return.
   * @return An {@link NBTTagCompound} object.
   * @throws IOException In case the file is not readable.
   */
  @Deprecated
  public static NBTTagCompound fromFile(File f, String s) throws IOException {
    return CompressedStreamTools.read(f).getCompoundTag(s);
  }

  /**
   * A public static method to create a compressed-stream file containing the specified tagged compound.<p/>
   * @deprecated Please use the non-static methods instead; instantiate this class from your mod main class,
   * then use the getter and setter for handling references to the entry. Candidate for removal.
   * @param f A {@link File} object, representing the file containing tagged data.
   * @param t An {@link NBTTagCompound} object, representing the outer data tag.
   * @throws IOException In case the file is not writable.
   */
  @Deprecated
  public static void toFile(File f, NBTTagCompound t) throws IOException {
    CompressedStreamTools.write(t, f);
  }

  public static GregoryNbtUtilities getInstance() {
    return instance;
  }
}
