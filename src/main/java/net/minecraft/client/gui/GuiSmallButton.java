package net.minecraft.client.gui;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.GameSettings.Options;


/**
 *
 * @author Gregory <gregory.cheyney@gmail.com>
 */
@SideOnly(Side.CLIENT)
public class GuiSmallButton extends GuiButton {
  private final Options field_73754_j;

  public GuiSmallButton(int p_i3057_1_, int p_i3057_2_, int p_i3057_3_, String p_i3057_4_) {
    this(p_i3057_1_, p_i3057_2_, p_i3057_3_, (Options)null, p_i3057_4_);
  }

  public GuiSmallButton(int p_i3058_1_, int p_i3058_2_, int p_i3058_3_, int p_i3058_4_, int p_i3058_5_, String p_i3058_6_) {
    super(p_i3058_1_, p_i3058_2_, p_i3058_3_, p_i3058_4_, p_i3058_5_, p_i3058_6_);
    field_73754_j = null;
  }

  public GuiSmallButton(int p_i3059_1_, int p_i3059_2_, int p_i3059_3_, Options p_i3059_4_, String p_i3059_5_) {
    super(p_i3059_1_, p_i3059_2_, p_i3059_3_, 150, 20, p_i3059_5_);
    field_73754_j = p_i3059_4_;
  }

  public Options func_73753_a() {
    return field_73754_j;
  }
}
