package net.minecraft.util;


/**
 * A public interface to help in the usage of {@link StringTranslate} localization by providing one instance of
 * that class.<p/>
 * For some really stoooooooopid reason, the {@link StringTranslate#getInstance()} singleton getter method is not
 * properly public visibility. Now, that's just plain wrong, and it makes using it require this work-around&hellip;
 * @author Gregory
 */
public interface IStringTranslate {
  /**
   * The singleton instance of the {@link StringTranslate} class.<p/>
   * Again, I must say that it is extremely unfortunate that the {@code getInstance()} method is not public visibility.
   * In any case, it is probably better to use the Java {@link ResourceBundle} class instead, as much as possible.
   */
  public static final StringTranslate st = StringTranslate.getInstance();
}
