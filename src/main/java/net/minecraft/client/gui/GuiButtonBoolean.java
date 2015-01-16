package net.minecraft.client.gui;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


@SideOnly(Side.CLIENT)
public class GuiButtonBoolean extends GuiButton {
  private String format;
  private final ResourceLocation resloc = new ResourceLocation("/gui/gui.png"); // used in drawButton(Minecraft,int,int)

  {
    width = 200;
    height = 20;
    visible = true;
  }

  /**
   * A public constructor to instantiate an object of the {@link GuiButtonBoolean} class.
   * @param i An {@link Integer} value, representing the ordinal identifier.
   * @param x An {@link Integer} value, representing the 'X' coordinate.
   * @param y An {@link Integer} value, representing the 'Y' coordinate.
   * @param s A {@link String} object, representing the text to be displayed.
   * @param b A {@link Boolean} condition, representing the initial state.
   */
  public GuiButtonBoolean(int i, int x, int y, String s, boolean b) {
    this(i, x, y, 200, 20, s, b);
  }

  /**
   * A public constructor to instantiate an object of the {@link GuiButtonBoolean} class.
   * @param i An {@link Integer} value, representing the ordinal identifier.
   * @param x An {@link Integer} value, representing the 'X' coordinate.
   * @param y An {@link Integer} value, representing the 'Y' coordinate.
   * @param w An {@link Integer} value, representing the button width.
   * @param h An {@link Integer} value, representing the button height.
   * @param s A {@link String} object, representing the text to be displayed.
   * @param b A {@link Boolean} condition, representing the initial state.
   */
  public GuiButtonBoolean(int i, int x, int y, int w, int h, String s, boolean b) {
    super(i, x, y, w, h, s);
    format = s;
    enabled = b;
    setDisplayString();
  }

  @Override
  public boolean func_146115_a() {
    return field_146123_n;
  }

  @Override
  public boolean mousePressed(Minecraft m, int x, int y) {
    return enabled && visible
        && x >= xPosition && x < xPosition + width
        && y >= yPosition && y < yPosition + height;
  }

  @Override
  public int getHoverState(boolean b) {
    byte b0 = 1;
    if(!enabled) {
      b0 = 0;
    } else if(b) {
      b0 = 2;
    }
    return b0;
  }

  @Override
  public void drawButton(Minecraft m, int x, int y) {
    if(visible) {
      FontRenderer fr = m.fontRenderer;
//    GL11.glBindTexture(GL11.GL_TEXTURE_2D, m.renderEngine.getTexture(resloc));//m.getTextureManager().bindTexture(field_110332_a);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      field_146123_n = x >= xPosition && x < xPosition + width && y >= yPosition && y < yPosition + height;
      int k = getHoverState(field_146123_n);
      drawTexturedModalRect(xPosition, yPosition, 0, 46 + k * 20, width / 2, height);
      drawTexturedModalRect(xPosition + width / 2, yPosition, 200 - width / 2, 46 + k * 20, width / 2, height);
      mouseDragged(m, x, y);
      int l = 14737632;
      if(!enabled) {
        l = -6250336;
      } else if(field_146123_n) {
        l = 16777120;
      }
      drawCenteredString(fr, displayString, xPosition + width / 2, yPosition + (height - 8) / 2, l);
    }
  }

  private void setDisplayString() {
    displayString = String.format(format, enabled ? "ON" : "OFF");
  }

  public boolean toggleState() {
    enabled = !enabled;
    setDisplayString();
    return enabled;
  }

  public void toggleBooleanState(boolean b) {
    //TODO: Do these boolean states need to be localized?
    displayString = b ? "On" : "Off";
  }
}
