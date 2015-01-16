package gregory.abc.utility;


/**
 * A public utility class with static methods for obtaining a value constrained to some other value(s).
 * @author Gregory
 */
public class GabcConstrain {
  private GabcConstrain() {
  }

  /**
   * A public method to get whether a value is within a particular range.
   * @param val A {@link Byte} value, representing the value to be tested against.
   * @param max A {@link Byte} value, representing the maximum to be equal or less than.
   * @param min A {@link Byte} value, representing the minimum to be equal or more than.
   * @return A {@link Boolean} value.
   */
  public static boolean isByteInside(byte val, byte max, byte min) {
    return (val >= min) && (val <= max);
  }

  /**
   * A public method to get whether a value is within a particular range.
   * @param val A {@link Double} value, representing the value to be tested against.
   * @param max A {@link Double} value, representing the maximum to be equal or less than.
   * @param min A {@link Double} value, representing the minimum to be equal or more than.
   * @return A {@link Boolean} value.
   */
  public static boolean isDoubleInside(double val, double max, double min) {
    return (val >= min) && (val <= max);
  }

  /**
   * A public method to get whether a value is within a particular range.
   * @param val A {@link Float} value, representing the value to be tested against.
   * @param max A {@link Float} value, representing the maximum to be equal or less than.
   * @param min A {@link Float} value, representing the minimum to be equal or more than.
   * @return A {@link Boolean} value.
   */
  public static boolean isFloatInside(float val, float max, float min) {
    return (val >= min) && (val <= max);
  }

  /**
   * A public method to get whether a value is within a particular range.
   * @param val An {@link Integer} value, representing the value to be tested against.
   * @param max An {@link Integer} value, representing the maximum to be equal or less than.
   * @param min An {@link Integer} value, representing the minimum to be equal or more than.
   * @return A {@link Boolean} value.
   */
  public static boolean isIntegerInside(int val, int max, int min) {
    return (val >= min) && (val <= max);
  }

  /**
   * A public method to get whether a value is within a particular range.
   * @param val A {@link Long} value, representing the value to be tested against.
   * @param max A {@link Long} value, representing the maximum to be equal or less than.
   * @param min A {@link Long} value, representing the minimum to be equal or more than.
   * @return A {@link Boolean} value.
   */
  public static boolean isLongInside(long val, long max, long min) {
    return (val >= min) && (val <= max);
  }

  /**
   * A public method to get whether a value is within a particular range.
   * @param val A {@link Short} value, representing the value to be tested against.
   * @param max A {@link Short} value, representing the maximum to be equal or less than.
   * @param min A {@link Short} value, representing the minimum to be equal or more than.
   * @return A {@link Boolean} value.
   */
  public static boolean isShortInside(short val, short max, short min) {
    return (val >= min) && (val <= max);
  }

  /**
   * A public method to constrain a {@link Byte} value to maximum value.<p/>
   * The simple rule is that if {@code val} is more than {@code max}, this method will return {@code max},
   * or {@code val} otherwise.
   * @param val A {@link Byte} value, representing the value to be constrained.
   * @param max A {@link Byte} value, representing the maximum value to not be more than.
   * @return A {@link Byte} value.
   */
  public static byte constrainByteMax(byte val, byte max) {
    return (val > max) ? max : val;
  }

  /**
   * A public method to constrain a {@link Byte} value to minimum value.<p/>
   * The simple rule is that if {@code val} is less than {@code min}, this method will return {@code min},
   * or {@code val} otherwise.
   * @param val A {@link Byte} value, representing the value to be constrained.
   * @param min A {@link Byte} value, representing the minimum value to not be less than.
   * @return A {@link Byte} value.
   */
  public static byte constrainByteMin(byte val, byte min) {
    return (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Byte} value to outside a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return {@code max}.
   * <li>If {@code val} is less than {@code min}, this method will return {@code min}.
   * <li>Otherwise, this method will return {@code alt}, an alternate digit.</ul>
   * @param val A {@link Byte} value, representing the value to be constrained.
   * @param max A {@link Byte} value, representing the maximum value to not be more than.
   * @param min A {@link Byte} value, representing the minimum value to not be less than.
   * @param alt A {@link Byte} value, representing the digit to return if not outside the max/min ranges.
   * @return A {@link Byte} value.
   */
  public static byte constrainByteOuter(byte val, byte max, byte min, byte alt) {
    return (val > max) ? max : (val < min) ? min : alt;
  }

  /**
   * A public method to constrain a {@link Byte} value to a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return the result of {@link #constrainByteMax(byte, byte)}.
   * <li>If {@code val} is less than {@code min}, this method will return the result of {@link #constrainByteMin(byte, byte)}.
   * <li>Otherwise, this method will return {@code val}, not changed by any method.</ul>
   * @param val A {@link Byte} value, representing the value to be constrained.
   * @param max A {@link Byte} value, representing the maximum value to not be more than.
   * @param min A {@link Byte} value, representing the minimum value to not be less than.
   * @return A {@link Byte} value.
   */
  public static byte constrainByteRange(byte val, byte max, byte min) {
    return (val > max) ? max : (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Double} value to maximum value.<p/>
   * The simple rule is that if {@code val} is more than {@code max}, this method will return {@code max},
   * or {@code val} otherwise.
   * @param val A {@link Double} value, representing the value to be constrained.
   * @param max A {@link Double} value, representing the maximum value to not be more than.
   * @return A {@link Double} value.
   */
  public static double constrainDoubleMax(double val, double max) {
    return (val > max) ? max : val;
  }

  /**
   * A public method to constrain a {@link Double} value to minimum value.<p/>
   * The simple rule is that if {@code val} is less than {@code min}, this method will return {@code min},
   * or {@code val} otherwise.
   * @param val A {@link Double} value, representing the value to be constrained.
   * @param min A {@link Double} value, representing the minimum value to not be less than.
   * @return A {@link Double} value.
   */
  public static double constrainDoubleMin(double val, double min) {
    return (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Double} value to outside a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return {@code max}.
   * <li>If {@code val} is less than {@code min}, this method will return {@code min}.
   * <li>Otherwise, this method will return {@code alt}, an alternate digit.</ul>
   * @param val A {@link Double} value, representing the value to be constrained.
   * @param max A {@link Double} value, representing the maximum value to not be more than.
   * @param min A {@link Double} value, representing the minimum value to not be less than.
   * @param alt A {@link Double} value, representing a digit to return if not outside the max/min ranges.
   * @return A {@link Double} value.
   */
  public static double constrainDoubleOuter(double val, double max, double min, double alt) {
    return (val > max) ? max : (val < min) ? min : alt;
  }

  /**
   * A public method to constrain a {@link Double} value to a particular range of values.<p/>
   * The following rules apply:
   * <ul>
   * <li>If {@code val} is more than {@code max}, this method will return the result of {@link #constrainDoubleMax(double, double)}.
   * <li>If {@code val} is less than {@code min}, this method will return the result of {@link #constrainDoubleMin(double, double)}.
   * <li>Otherwise, this method will return {@code val}, not changed by any method.
   * </ul>
   * @param val A {@link Double} value, representing the value to be constrained.
   * @param max A {@link Double} value, representing the maximum value to not be more than.
   * @param min A {@link Double} value, representing the minimum value to not be less than.
   * @return A {@link Double} value.
   */
  public static double constrainDoubleRange(double val, double max, double min) {
    return (val > max) ? max : (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Float} value to maximum value.<p/>
   * The simple rule is that if {@code val} is more than {@code max}, this method will return {@code max},
   * or {@code val} otherwise.
   * @param val A {@link Float} value, representing the value to be constrained.
   * @param max A {@link Float} value, representing the maximum value to not be more than.
   * @return A {@link Float} value.
   */
  public static float constrainFloatMax(float val, float max) {
    return (val > max) ? max : val;
  }

  /**
   * A public method to constrain a {@link Float} value to minimum value.<p/>
   * The simple rule is that if {@code val} is less than {@code min}, this method will return {@code min},
   * or {@code val} otherwise.
   * @param val A {@link Float} value, representing the value to be constrained.
   * @param min A {@link Float} value, representing the minimum value to not be less than.
   * @return A {@link float} value.
   */
  public static float constrainFloatMin(float val, float min) {
    return (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Float} value to outside a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return {@code max}.
   * <li>If {@code val} is less than {@code min}, this method will return {@code min}.
   * <li>Otherwise, this method will return {@code alt}, an alternate digit.</ul>
   * @param val A {@link Float} value, representing the value to be constrained.
   * @param max A {@link Float} value, representing the maximum value to not be more than.
   * @param min A {@link Float} value, representing the minimum value to not be less than.
   * @param alt A {@link Float} value, representing the digit to return if not outside the max/min ranges.
   * @return A {@link Float} value.
   */
  public static float constrainFloatOuter(float val, float max, float min, float alt) {
    return (val > max) ? max : (val < min) ? min : alt;
  }

  /**
   * A public method to constrain a {@link Float} value to a particular range of values.<p/>
   * The following rules apply:
   * <ul>
   * <li>If {@code val} is more than {@code max}, this method will return the result of {@link #constrainFloatMax(float, float)}.
   * <li>If {@code val} is less than {@code min}, this method will return the result of {@link #constrainFloatMin(float, float)}.
   * <li>Otherwise, this method will return {@code val}, not changed by any method.
   * </ul>
   * @param val A {@link Float} value, representing the value to be constrained.
   * @param max A {@link Float} value, representing the maximum value to not be more than.
   * @param min A {@link Float} value, representing the minimum value to not be less than.
   * @return A {@link Float} value.
   */
  public static float constrainFloatRange(float val, float max, float min) {
    return (val > max) ? max : (val < min) ? min : val;
  }

  /**
   * A public method to constrain an {@link Integer} value to maximum value.<p/>
   * The simple rule is that if {@code val} is more than {@code max}, this method will return {@code max},
   * or {@code val} otherwise.
   * @param val An {@link Integer} value, representing the value to be constrained.
   * @param max An {@link Integer} value, representing the maximum value to not be more than.
   * @return An {@link Integer} value.
   */
  public static int constrainIntegerMax(int val, int max) {
    return (val > max) ? max : val;
  }

  /**
   * A public method to constrain an {@link Integer} value to minimum value.<p/>
   * The simple rule is that if {@code val} is less than {@code min}, this method will return {@code min},
   * or {@code val} otherwise.
   * @param val An {@link Integer} value, representing the value to be constrained.
   * @param min An {@link Integer} value, representing the minimum value to not be less than.
   * @return An {@link Integer} value.
   */
  public static int constrainIntegerMin(int val, int min) {
    return (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Integer} value to outside a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return {@code max}.
   * <li>If {@code val} is less than {@code min}, this method will return {@code min}.
   * <li>Otherwise, this method will return {@code alt}, an alternate digit.
   * </ul>
   * @param val An {@link Integer} value, representing the value to be constrained.
   * @param max An {@link Integer} value, representing the maximum value to not be more than.
   * @param min An {@link Integer} value, representing the minimum value to not be less than.
   * @param alt An {@link Integer} value, representing the digit to return if not outside the max/min ranges.
   * @return An {@link Integer} value.
   */
  public static int constrainIntegerOuter(int val, int max, int min, int alt) {
    return (val > max) ? max : (val < min) ? min : alt;
  }

  /**
   * A public method to constrain an {@link Integer} value to a particular range of values.<p/>
   * The following rules apply:
   * <ul>
   * <li>If {@code val} is more than {@code max}, this method will return the result of {@link #constrainIntegerMax(int, int)}.
   * <li>If {@code val} is less than {@code min}, this method will return the result of {@link #constrainIntegerMin(int, int)}.
   * <li>Otherwise, this method will return {@code val}, not changed by any method.
   * </ul>
   * @param val An {@link Integer} value, representing the value to be constrained.
   * @param max An {@link Integer} value, representing the maximum value to not be more than.
   * @param min An {@link Integer} value, representing the minimum value to not be less than.
   * @return An {@link Integer} value.
   */
  public static int constrainIntegerRange(int val, int max, int min) {
    return (val > max) ? max : (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Long} value to a maximum value.<p/>
   * The simple rule is that if {@code val} is more than {@code max}, this method will return {@code max},
   * or {@code val} otherwise.
   * @param val A {@link Long} value, representing the value to be constrained.
   * @param max A {@link Long} value, representing the maximum value to not be more than.
   * @return A {@link Long} value.
   */
  public static long constrainLongMax(long val, long max) {
    return (val > max) ? max : val;
  }

  /**
   * A public method to constrain a {@link Long} value to a minimum value.<p/>
   * The simple rule is that if {@code val} is less than {@code min}, this method will return {@code min},
   * or {@code val} otherwise.
   * @param val A {@link Long} value, representing the value to be constrained.
   * @param min A {@link Long} value, representing the minimum value to not be less than.
   * @return A {@link Long} value.
   */
  public static long constrainLongMin(long val, long min) {
    return (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Long} value to outside a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return {@code max}.
   * <li>If {@code val} is less than {@code min}, this method will return {@code min}.
   * <li>Otherwise, this method will return {@code alt}, an alternate digit.</ul>
   * @param val A {@link Long} value, representing the value to be constrained.
   * @param max A {@link Long} value, representing the maximum value to not be more than.
   * @param min A {@link Long} value, representing the minimum value to not be less than.
   * @param alt A {@link Long} value, representing the digit to return if not outside the max/min ranges.
   * @return A {@link Long} value.
   */
  public static long constrainLongOuter(long val, long max, long min, long alt) {
    return (val > max) ? max : (val < min) ? min : alt;
  }

  /**
   * A public method to constrain a {@link Long} value to a particular range of values.<p/>
   * The following rules apply:
   * <ul>
   * <li>If {@code val} is more than {@code max}, this method will return the result of {@link #constrainLongMax(long, long)}.
   * <li>If {@code val} is less than {@code min}, this method will return the result of {@link #constrainLongMin(long, long)}.
   * <li>Otherwise, this method will return {@code val}, not changed by any method.
   * </ul>
   * @param val A {@link Long} value, representing the value to be constrained.
   * @param max A {@link Long} value, representing the maximum value to not be more than.
   * @param min A {@link Long} value, representing the minimum value to not be less than.
   * @return A {@link Long} value.
   */
  public static long constrainLongRange(long val, long max, long min) {
    return (val > max) ? max : (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Short} value to a maximum value.<p/>
   * The simple rule is that if {@code val} is more than {@code max}, this method will return {@code max},
   * or {@code val} otherwise.
   * @param val A {@link Short} value, representing the value to be constrained.
   * @param max A {@link Short} value, representing the maximum value to not be more than.
   * @return A {@link Short} value.
   */
  public static short constrainShortMax(short val, short max) {
    return (val > max) ? max : val;
  }

  /**
   * A public method to constrain a {@link Short} value to a minimum value.<p/>
   * The simple rule is that if {@code val} is less than {@code min}, this method will return {@code min},
   * or {@code val} otherwise.
   * @param val A {@link Short} value, representing the value to be constrained.
   * @param min A {@link Short} value, representing the minimum value to not be less than.
   * @return A {@link Short} value.
   */
  public static short constrainShortMin(short val, short min) {
    return (val < min) ? min : val;
  }

  /**
   * A public method to constrain a {@link Short} value to outside a particular range of values.<p/>
   * The following rules apply:<ul>
   * <li>If {@code val} is more than {@code max}, this method will return {@code max}.
   * <li>If {@code val} is less than {@code min}, this method will return {@code min}.
   * <li>Otherwise, this method will return {@code alt}, an alternate digit.</ul>
   * @param val A {@link Short} value, representing the value to be constrained.
   * @param max A {@link Short} value, representing the maximum value to not be more than.
   * @param min A {@link Short} value, representing the minimum value to not be less than.
   * @param alt A {@link Short} value, representing the digit to return if not outside the max/min ranges.
   * @return A {@link Short} value.
   */
  public static short constrainShortOuter(short val, short max, short min, short alt) {
    return (val > max) ? max : (val < min) ? min : alt;
  }

  /**
   * A public method to constrain a {@link Short} value to a particular range of values.<p/>
   * The following rules apply:
   * <ul>
   * <li>If {@code val} is more than {@code max}, this method will return the result of {@link #constrainShortMax(short, short)}.
   * <li>If {@code val} is less than {@code min}, this method will return the result of {@link #constrainShortMin(short, short)}.
   * <li>Otherwise, this method will return {@code val}, not changed by any method.
   * </ul>
   * @param val A {@link Short} value, representing the value to be constrained.
   * @param max A {@link Short} value, representing the maximum value to not be more than.
   * @param min A {@link Short} value, representing the minimum value to not be less than.
   * @return A {@link Short} value.
   */
  public static short constrainShortRange(short val, short max, short min) {
    return (val > max) ? max : (val < min) ? min : val;
  }
}
