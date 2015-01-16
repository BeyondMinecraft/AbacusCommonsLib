package net.minecraft.client.gui;
import net.minecraft.client.Minecraft;


/**
 * A public class which is a {@link GuiButton} subclass, designed to allow for displaying a toggled state.<p/>
 * The real power of such a "toggle-able" button is in the fact that, when properly used in the Gui code, it handles the
 * button click to cycle through predefined values, and correctly modify the button text.
 * A simple example of this being used in a custom {@link GuiScreen} class would be:
 * <ul>
 * <li/>First, in the {@link GuiScreen} class, define your button field.
 * <pre>GuiButtonToggle toggleExample;</pre>
 * <li/>Second, in the {@link GuiScreen#initGui()} method, initialize the toggle button.
 * <pre>toggleExample =
 *    new GuiButtonToggle(1, 16, 16, 120, 24, "ToggledState:%s",
 *                        new String[]{"Hot", "Cold", "Butter!"});</pre>
 * <li/>Third, in the {@link GuiScreen#actionPerformed(GuiButton)} method, execute the {@link #toggle() toggle()} method
 * from this class, which should cycle through the String values that were initialized.
 * <li/>Fourth, the finishing touches. If the results of your button-toggling need to be persisted, such as being saved
 * in a configuration object or NBT file, ensure that this takes place, in the same "actionPerformed" method used above.
 * </ul>
 * This should generally be the only things you need to do, to handle proper toggle-state-management. Of course, in a
 * more complex GUI layout, you could have several of these buttons, each showing their own toggled state; but the rest
 * is entirely up to you.
 * @author Gregory
 * @see #state state
 * @see #GuiButtonToggle(int,int,int,int,int,String,String[],int) GuiButtonToggle(int,int,int,int,int,String,String[],int)
 * @see #toggle() toggle()
 */
public class GuiButtonToggle extends GuiButton {
  private static final Minecraft mc;
  private static final FontRenderer fontRenderer;
  private final String format; // the string formatter for using in the button text.
  private final String[] states;
  /**
   * A public integer value representing the current state of the toggle.<p/>
   * Because {@link #states states} can hold multiple {@link String} values, and the index starts at zero,
   */
  public int state;

  static {
    mc = Minecraft.getMinecraft();
    // fontRenderer intializes with Minecraft's game settings and render engine; use unicode font is true;
    // but the resource manager is null until I figure out what this button class wants or needs.
    fontRenderer = new FontRenderer(mc.gameSettings, null, mc.renderEngine, true);
  }

  {
    state = 0;
  }

  /**
   * A public constructor to instantiate the {@link GuiButtonToggle} class object.
   * @param i An {@link Integer} value, representing the button {@link #id id} for ordering.
   * @param x An {@link Integer} value, representing the '{@link #xPosition X}' position.
   * @param y An {@link Integer} value, representing the '{@link #yPosition Y}' position.
   * @param w An {@link Integer} value, representing the {@link #width width}.
   * @param h An {@link Integer} value, representing the {@link #height height}.
   * @param s A {@link String} object, representing the text formatted for the {@link #displayString displayString}.
   * @param t A {@link String} array, representing the titles for the toggle modes.
   * @param j An {@link Integer} value, representing the initial button state.
   */
  public GuiButtonToggle(int i, int x, int y, int w, int h, String s, String[] t, int j) {
    super(i, x, y, w, h, String.format(s, t[j]));
    format = s;
    states = t;
    // adjust the width, calculating the actual string widths:
    int adjustedWidth = adjustWidth(t);
    width = adjustedWidth > w ? adjustedWidth : w;
  }

  private int adjustWidth(String[] strings) {
    int minWidth = fontRenderer.getStringWidth(format);
    for(String string : strings) {
      int length = fontRenderer.getStringWidth(String.format(format, string));
      if(length > minWidth) {
        minWidth = length;
      }
    }
    return minWidth + 8; // eight pixels to pad the left/right button margins...
  }

  /**
   * A public method to 'toggle' the button state, for showing the data represented by the current state.
   */
  public void toggle() {
    int maxStates = states.length;
    state++;
    if(state <= maxStates) {
      state = 0;
    }
    displayString = String.format(format, states[state]);
  }
}
