package gregory.abc;


/**
 * A helper class to parse and obtain {@link String} instances of "versioned" information.
 * While most end-users may not think of data as versionable, the simple fact is that it is good practice to save data
 * along with the version of the program that stored it; this prevents or seriously reduces chances of data conflicts.
 * <p/>
 * String data obtained from this class will be in the format of "v1.2.3.4r1234", where:
 * <ul>
 * <li/>'v' is an indiscriminate character at the beginning of the version data. This can be omitted, if so desired;
 * see the {@link #getRawString(boolean, boolean, char) getRawString} method for more information.
 * <li/>'1': The major version of overarching features of a program that is released; it is based on new functionality
 * that changes or enhances the way it works.
 * <li/>'2': The minor version of incremental updates to above; previously-new "major version" features may be improved
 * in some way that may or may not be specifically noticeable.
 * <li/>'3': The patch version for released changes that adds no new features to the program, but is often incremented
 * to represent improvements such as bug-fixes or requested minor enhancements (visual or other).
 * <li/>'4': The build version of a program usually are only relevant to the developer who makes changes, compiles, runs
 * the program, and repeats the process until achieving the intended result. (When compiling and testing bug-fixes, it
 * is likely this number can increase rapidly, often many times in a development session.)
 * <li/>'r1234': The 'commit' instance from the developer's repository, so that if they need to switch to a
 * different code branch or 'roll back' to a specific edit-state, they know where exactly to go.
 * (Relevant only to developers; to the common user, this likely means even less than most of the above numbers.)
 * </ul>
 * Developers who make Minecraft mods based on the Forge APIs probably already have Configuration load and save support
 * for their mod. Assuming you already have the main mod class with a pre-init loader method:
 * <ol>
 * <li/>Add the following field to the main mod class:<br/>
 * <font color="blue">{@code public VersionObj version;}</font><br/>
 * (It doesn't require public visibility; I only declare it such, so that if other classes want access to it, they can.)
 * <li/>The first data you read in from {@code config} should be the value of the stored version from the configuration
 * data, if it exists.
 * <li/>Immediately after creating the {@code config} object and loading it, create an instance of this class.<br/>
 * <font color="blue">{@code version = new VersionObj(...);}</font><br/>
 * where the above ellipsis allows for you to use one of the parameterized constructors that fits your needs. It will
 * likely be a String because it is easily parsed in this class.
 * <li/>Now, if you've read in the version, the above constructor has likely parsed the data's version; you may compare
 * it against major, minor, patch, and build values for the mod itself. In as complex a branch of {@code if ... else if
 * ... else} testing, you may delegate to other methods within the class to handle updating from previous-version data.
 * </ol>
 * Note: this class does not read or write the versioned object; for such functionality, you may write your own.
 * Also, see http://www.codinghorror.com/blog/2007/02/whats-in-a-version-number-anyway.html for one guy's thoughts.
 * @author Gregory
 */
public class VersionObj implements Comparable<VersionObj> {
  /**
   * The "major version" subpart of the versioning data.
   * This represents
   */
  public int vMaj = 0;
  /**
   * The "minor version" subpart of the versioning data.
   */
  public int vMin = 0;
  /**
   * The "patch version" subpart of the versioning data.
   */
  public int vPat = 0;
  /**
   * The "build version" subpart of the versioning data.
   */
  public int vXyz = 0;
  /**
   *
   */
  public long commit = 0L;

  public VersionObj(String s) {
    parseString(s);
  }

  public VersionObj(int i, int j, int k, int l) {
    vMaj = i;
    vMin = j;
    vPat = k;
    vXyz = l;
    commit = 0L;
  }

  @Override
  public int compareTo(VersionObj o) {
    if(vMaj == o.vMaj && vMin == o.vMin && vPat == o.vPat && vXyz == o.vXyz) {
      return 0;
    } else {
      return -1;
    }
  }

  private void parseString(String s) {
    String s1 = s.trim().toLowerCase();
    if(s1.charAt(0) == 'v') {
      s1 = s1.substring(1).trim();
    }
    String s2 = s1.contains("r")
        ? s1.substring(0, s1.lastIndexOf('r') - 1)
        : s1;
    String[] ss = s2.split(".");
    vMaj = (ss.length >= 1) ? Integer.parseInt(ss[0]) : 0;
    vMin = (ss.length >= 2) ? Integer.parseInt(ss[1]) : 0;
    vPat = (ss.length >= 3) ? Integer.parseInt(ss[2]) : 0;
    vXyz = (ss.length >= 4) ? Integer.parseInt(ss[3]) : 0;
    commit = (ss.length >= 5) ? Long.parseLong(ss[4]) : 0L;
  }

  /**
   * A public getter method to obtain the "raw" {@link String} object from existing {@link Integer} values.
   * @param v Use the 'v' prefix on the returned data.
   * @param r Use the 'r' suffix along with repository's commit number for this version.
   * @param c Use the supplied character as the separator (typically, the "." period character).
   * @return
   */
  public String getRawString(boolean v, boolean r, char c) {
    String prefix = v ? "v" : "";
    String suffix = r ? "r" + String.valueOf(commit) : "";
    return prefix
        + String.valueOf(vMaj) + c + String.valueOf(vMin) + c + String.valueOf(vPat) + c + String.valueOf(vXyz)
        + suffix;
  }
}
