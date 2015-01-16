package net.minecraft.client.gui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.IIcon;


/**
 * A public utility class with fields and methods for taking the place of the original {@code GuiButtonNextPage} which
 * seems to have disappeared recently in Minecraft.
 * @author Gregory
 */
public class GuiButtonPages extends GuiButton {
  //TODO: Come back to retrofit this class to display a paging arrow instead of text.
  /**
   * A public constructor to instantiate a new {@link GuiButtonPages} object, with no text but an arrow.<p/>
   * Use this constructor if you simply want to use the default width (20) and height (20);
   * use the other constructor if you have a specific width and height for the button.
   * @param i An {@link Integer} value, representing the numeric identifier for the button.
   * @param x An {@link Integer} value, representing the 'X' coordinate within the screen.
   * @param y An {@link Integer} value, representing the 'Y' coordinate within the screen.
   * @param b A {@link Boolean} condition, representing if the button pages back or next.
   */
  public GuiButtonPages(int i, int x, int y, boolean b) {
    this(i, x, y, 20, 20, b);
  }

  /**
   * A public constructor to instantiate a new {@link GuiButtonPages} object, with no text but an arrow.<p/>
   * Use this constructor if you have a specific width and height for the button;
   * use the other constructor if you simply want to use the default width (20) and height (20);
   * @param i An {@link Integer} value, representing the numeric identifier for the button.
   * @param x An {@link Integer} value, representing the 'X' coordinate within the screen.
   * @param y An {@link Integer} value, representing the 'Y' coordinate within the screen.
   * @param w An {@link Integer} value, representing the button width.
   * @param h An {@link Integer} value, representing the button height.
   * @param b A {@link Boolean} condition, representing if the button pages back or next.
   */
  public GuiButtonPages(int i, int x, int y, int w, int h, boolean b) {
    super(i, x, y, w, h, "");
  }

  @Override
  protected void drawGradientRect(int par1, int par2, int par3, int par4, int par5, int par6) {
    super.drawGradientRect(par1, par2, par3, par4, par5, par6); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  protected void drawHorizontalLine(int arg0, int arg1, int arg2, int arg3) {
    super.drawHorizontalLine(arg0, arg1, arg2, arg3); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  protected void drawVerticalLine(int arg0, int arg1, int arg2, int arg3) {
    super.drawVerticalLine(arg0, arg1, arg2, arg3); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean func_146115_a() {
    return super.func_146115_a(); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void drawButton(Minecraft p_146112_1_, int p_146112_2_, int p_146112_3_) {
    super.drawButton(p_146112_1_, p_146112_2_, p_146112_3_); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void drawCenteredString(FontRenderer par1FontRenderer, String par2Str, int par3, int par4, int par5) {
    super.drawCenteredString(par1FontRenderer, par2Str, par3, par4, par5); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void drawString(FontRenderer par1FontRenderer, String par2Str, int par3, int par4, int par5) {
    super.drawString(par1FontRenderer, par2Str, par3, par4, par5); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6) {
    super.drawTexturedModalRect(par1, par2, par3, par4, par5, par6); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void drawTexturedModelRectFromIcon(int arg0, int arg1, IIcon arg2, int arg3, int arg4) {
    super.drawTexturedModelRectFromIcon(arg0, arg1, arg2, arg3, arg4); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void func_146111_b(int p_146111_1_, int p_146111_2_) {
    super.func_146111_b(p_146111_1_, p_146111_2_); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void func_146113_a(SoundHandler p_146113_1_) {
    super.func_146113_a(p_146113_1_); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void mouseReleased(int p_146118_1_, int p_146118_2_) {
    super.mouseReleased(p_146118_1_, p_146118_2_); //To change body of generated methods, choose Tools | Templates.
  }
}
