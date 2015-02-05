package net.minecraft.client.renderer;


/**
 * A public utility class with static references that are of use to model rendering.
 * @author Gregory
 * @see #degFactor degFactor
 * @see #radFactor radFactor
 * @see #RotXYZ RotXYZ
 * @see #RotXZY RotXZY
 * @see #RotYXZ RotYXZ
 * @see #RotYZX RotYZX
 * @see #RotZXY RotZXY
 * @see #RotZYX RotZYX
 */
public interface ModelRendererStatics {
  // Conversion factors for degrees and radians:
  /**
   * The constant used for the degree factor. It equates to the following mathematical computation:
   * <pre>Math.PI / 180.0F</pre> to give the approximated result of: <pre>0.01745329251994329576923690768489F</pre>
   * @see #radFactor radFactor
   */
  public static final float degFactor = 0.01745329251994329576923690768489F;
  /**
   * The constant used for the radian factor. It equates to the following mathematical computation:
   * <pre>180.0F / Math.PI</pre> to give the approximated result of: <pre>57.295779513082320876798154814105F</pre>
   * @see #degFactor degFactor
   */
  public static final float radFactor = 57.295779513082320876798154814105F;

  // Axial Rotation Priorities:
  /**
   * A public static final declaration of an axial rotation priority, in the order of XYZ.
   */
  public static final int RotXYZ = 0;
  /**
   * A public static final declaration of an axial rotation priority, in the order of XZY.
   */
  public static final int RotXZY = 1;
  /**
   * A public static final declaration of an axial rotation priority, in the order of YXZ.
   */
  public static final int RotYXZ = 2;
  /**
   * A public static final declaration of an axial rotation priority, in the order of YZX.
   */
  public static final int RotYZX = 3;
  /**
   * A public static final declaration of an axial rotation priority, in the order of ZXY.
   */
  public static final int RotZXY = 4;
  /**
   * A public static final declaration of an axial rotation priority, in the order of ZYX.
   */
  public static final int RotZYX = 5;
}
