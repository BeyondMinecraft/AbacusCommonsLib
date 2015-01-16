package net.minecraft;
import gregory.abc.utility.GabcFilePaths;
import java.io.File;
import java.util.Calendar;


/**
 * <h2>DebugMessage</h2>
 * A public utility class with fields and methods to manage the output of general debug messages to the client's chat.
 * @author Gregory
 */
public class DebugMessage {
  private final Calendar calendar = Calendar.getInstance();
  private File file;
  private String beginDateTime;
  protected MessagesPriority priority;

  /**
   * A public constructor to instantiate a new {@link DebugMessage} object.
   * @param mp the current message priority.
   */
  public DebugMessage(MessagesPriority mp) {
    priority = mp;
  }

  /**
   * A public method to handle a "debug" message.
   * <p/>
   * Output of messages are sent to both the chat stream AND the log file.
   * <p/>
   * If both parameter "b" AND "chat output" are true, the message will be shown in the player's chat stream.
   * <p/>
   * If both parameter "c" AND "enable logs" are true, the message will be logged out to the file output.
   * @param b A {@link Boolean} condition, representing whether to show in chat.
   * @param c A {@link Boolean} condition, representing whether to log the message.
   * @param i An {@link Integer} value, representing the message priority level.
   * @param s A {@link String} object, representing a short text to show in chat.
   * @param t A {@link String} array, representing a more complex debug message.
   */
  public void debug(boolean b, boolean c, int i, String s, String[] t) {
    if(b) {
    }
  }

  /**
   * A public method to handle a "debug" message.
   * <p/>
   * Output of messages are sent only to the log file. This is useful for logging messages while the mod is loading and
   * unloading; at such times, it makes little sense to send something to a chat stream which may or may not be active.
   * <p/>
   * If both parameter "b" AND "enable logs" are true, the message will be logged out to the file output.
   * @param b A {@link Boolean} condition, representing whether to log the message.
   * @param i An {@link Integer} value, representing the message priority level.
   * @param s A {@link String} array, representing a more complex debug message.
   */
  public void debug(boolean b, int i, String[] s) {
    if(b) {
    }
  }

  /**
   * @param s
   */
  public void setFile(String s) {
    beginDateTime = String.format("%s-%s-%s-%s%s",
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DATE),
        calendar.get(Calendar.HOUR),
        calendar.get(Calendar.MINUTE));
    file = new File(GabcFilePaths.mcLogs, String.format("%s_%s", s, beginDateTime));
  }


  public static enum MessagesPriority {
    /**
     * Message priority is 0. This shows everything.
     */
    mp0,
    /**
     * Message priority is 1. This shows most things.
     */
    mp1,
    /**
     * Message priority is 2. This shows fewer things.
     */
    mp2,
    /**
     * Message priority is 3. This shows only the "diagnostic" level messages.
     */
    mp3;
    /**
     */
    public final int rank;

    private MessagesPriority() {
      rank = ordinal();
    }
  }
}
