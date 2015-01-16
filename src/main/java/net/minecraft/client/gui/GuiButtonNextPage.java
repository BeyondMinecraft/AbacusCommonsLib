package net.minecraft.client.gui;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


/**
 * A copy of the "GuiButtonNextPage" that once was.
 * @author Gregory
 */
@SideOnly(Side.CLIENT)
public class GuiButtonNextPage extends GuiButton {
  /**
   * A private field for specifying whether this button points to the left (for false), or to the right (for true).
   * This controls whether this is a "Previous" or "Next" page button.
   */
  private final boolean nextPage;
  private final ResourceLocation location = new ResourceLocation("minecraft", "/gui/book.png");

  /**
   * A public constructor to instantiate a new {@link GuiButtonNextPage} object.<p/>
   * If the the boolean parameter is true, this button is for the 'next' page.
   * @param i An {@link Integer} value, representing the button number.
   * @param x An {@link Integer} value, representing the screen 'X' coordinate.
   * @param y An {@link Integer} value, representing the screen 'Y' coordinate.
   * @param b A {@link Boolean} condition, representing if it's the next button.
   */
  public GuiButtonNextPage(int i, int x, int y, boolean b) {
    super(i, x, y, 23, 13, "");
    nextPage = b;
  }

  @Override
  public void drawButton(Minecraft m, int x, int y) {
    if(visible) {
      boolean b = x >= xPosition && x < xPosition + width && y >= yPosition && y < yPosition + height;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      m.renderEngine.bindTexture(icons); // renderEngine.func_98187_b("/gui/book.png");
      int x1 = 0;
      int y1 = 192;
      if(b) {
        x1 += 23;
      }
      if(!nextPage) {
        y1 += 13;
      }
      drawTexturedModalRect(xPosition, yPosition, x1, y1, 23, 13);
    }
  }
}
